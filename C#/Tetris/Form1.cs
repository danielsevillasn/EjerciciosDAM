using System;
using System.Drawing;
using System.Windows.Forms;

namespace TetrisWinForms
{
    public partial class Form1 : Form
    {
        // Dimensiones del tablero
        private const int Rows = 20;
        private const int Cols = 10;
        private const int CellSize = 30;

        // Estado del juego
        private int[,] grid = new int[Rows, Cols];

        // FIX CS0104: Especificar explícitamente System.Windows.Forms.Timer
        private System.Windows.Forms.Timer gameTimer = new System.Windows.Forms.Timer();
        private Random random = new Random();

        // Formas de las 7 piezas tradicionales (I, J, L, O, S, T, Z)
        private readonly int[][,] shapes = new int[][,]
        {
            new int[,] { { 1, 1, 1, 1 } },                            // I
            new int[,] { { 1, 0, 0 }, { 1, 1, 1 } },                  // J
            new int[,] { { 0, 0, 1 }, { 1, 1, 1 } },                  // L
            new int[,] { { 1, 1 }, { 1, 1 } },                        // O
            new int[,] { { 0, 1, 1 }, { 1, 1, 0 } },                  // S
            new int[,] { { 0, 1, 0 }, { 1, 1, 1 } },                  // T
            new int[,] { { 1, 1, 0 }, { 0, 1, 1 } }                   // Z
        };

        // Paleta de colores por pieza
        private readonly Color[] colors = new Color[]
        {
            Color.FromArgb(20, 20, 20), // Fondo
            Color.Cyan,                 // I
            Color.Blue,                 // J
            Color.Orange,               // L
            Color.Yellow,               // O
            Color.Green,                // S
            Color.Purple,               // T
            Color.Red                   // Z
        };

        // FIX CS8618: Marcar currentShape como nulo opcional (int[,]?)
        private int[,]? currentShape;
        private int currentShapeIndex;
        private int currentX, currentY;
        private int score = 0;
        private bool gameOver = false;

        public Form1()
        {
            InitializeComponent();

            this.ClientSize = new Size(Cols * CellSize + 160, Rows * CellSize);
            this.Text = "Tetris C# Windows Forms";
            this.DoubleBuffered = true;
            this.KeyPreview = true;

            this.KeyDown += Form1_KeyDown;
            this.Paint += Form1_Paint;

            gameTimer.Interval = 400;
            gameTimer.Tick += GameTimer_Tick;

            StartNewGame();
        }

        private void StartNewGame()
        {
            grid = new int[Rows, Cols];
            score = 0;
            gameOver = false;
            SpawnPiece();
            gameTimer.Start();
        }

        private void SpawnPiece()
        {
            currentShapeIndex = random.Next(shapes.Length);
            currentShape = (int[,])shapes[currentShapeIndex].Clone();
            currentY = 0;
            currentX = (Cols - currentShape.GetLength(1)) / 2;

            if (!CanMove(currentShape, currentX, currentY))
            {
                gameOver = true;
                gameTimer.Stop();
                MessageBox.Show($"¡Fin del juego!\nPuntuación total: {score}", "Tetris");
            }
        }

        private bool CanMove(int[,] shape, int targetX, int targetY)
        {
            int shapeRows = shape.GetLength(0);
            int shapeCols = shape.GetLength(1);

            for (int r = 0; r < shapeRows; r++)
            {
                for (int c = 0; c < shapeCols; c++)
                {
                    if (shape[r, c] != 0)
                    {
                        int newX = targetX + c;
                        int newY = targetY + r;

                        if (newX < 0 || newX >= Cols || newY >= Rows)
                            return false;

                        if (newY >= 0 && grid[newY, newX] != 0)
                            return false;
                    }
                }
            }
            return true;
        }

        private void MergePiece()
        {
            if (currentShape == null) return;

            int shapeRows = currentShape.GetLength(0);
            int shapeCols = currentShape.GetLength(1);

            for (int r = 0; r < shapeRows; r++)
            {
                for (int c = 0; c < shapeCols; c++)
                {
                    if (currentShape[r, c] != 0)
                    {
                        int boardY = currentY + r;
                        int boardX = currentX + c;
                        if (boardY >= 0)
                            grid[boardY, boardX] = currentShapeIndex + 1;
                    }
                }
            }

            ClearLines();
            SpawnPiece();
        }

        private void ClearLines()
        {
            int linesCleared = 0;

            for (int r = Rows - 1; r >= 0; r--)
            {
                bool lineFull = true;
                for (int c = 0; c < Cols; c++)
                {
                    if (grid[r, c] == 0)
                    {
                        lineFull = false;
                        break;
                    }
                }

                if (lineFull)
                {
                    linesCleared++;
                    for (int y = r; y > 0; y--)
                    {
                        for (int c = 0; c < Cols; c++)
                        {
                            grid[y, c] = grid[y - 1, c];
                        }
                    }
                    for (int c = 0; c < Cols; c++)
                    {
                        grid[0, c] = 0;
                    }
                    r++;
                }
            }

            if (linesCleared > 0)
            {
                score += linesCleared * 100;
            }
        }

        private int[,] RotateMatrix(int[,] matrix)
        {
            int rows = matrix.GetLength(0);
            int cols = matrix.GetLength(1);
            int[,] rotated = new int[cols, rows];

            for (int r = 0; r < rows; r++)
            {
                for (int c = 0; c < cols; c++)
                {
                    rotated[c, rows - 1 - r] = matrix[r, c];
                }
            }
            return rotated;
        }

        // FIX CS8622: Usar "object? sender" en lugar de "object sender"
        private void GameTimer_Tick(object? sender, EventArgs e)
        {
            if (currentShape != null && CanMove(currentShape, currentX, currentY + 1))
            {
                currentY++;
            }
            else
            {
                MergePiece();
            }
            Invalidate();
        }

        // FIX CS8622: Usar "object? sender"
        private void Form1_KeyDown(object? sender, KeyEventArgs e)
        {
            if (gameOver)
            {
                if (e.KeyCode == Keys.R) StartNewGame();
                return;
            }

            if (currentShape == null) return;

            switch (e.KeyCode)
            {
                case Keys.Left:
                    if (CanMove(currentShape, currentX - 1, currentY)) currentX--;
                    break;
                case Keys.Right:
                    if (CanMove(currentShape, currentX + 1, currentY)) currentX++;
                    break;
                case Keys.Down:
                    if (CanMove(currentShape, currentX, currentY + 1)) currentY++;
                    break;
                case Keys.Up:
                    int[,] rotated = RotateMatrix(currentShape);
                    if (CanMove(rotated, currentX, currentY)) currentShape = rotated;
                    break;
                case Keys.Space:
                    while (CanMove(currentShape, currentX, currentY + 1)) currentY++;
                    MergePiece();
                    break;
            }
            Invalidate();
        }

        // FIX CS8622: Usar "object? sender"
        private void Form1_Paint(object? sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;

            // 1. Dibujar el tablero
            for (int r = 0; r < Rows; r++)
            {
                for (int c = 0; c < Cols; c++)
                {
                    int colorIdx = grid[r, c];
                    Rectangle rect = new Rectangle(c * CellSize, r * CellSize, CellSize, CellSize);
                    using (Brush brush = new SolidBrush(colors[colorIdx]))
                    {
                        g.FillRectangle(brush, rect);
                    }
                    g.DrawRectangle(Pens.Gray, rect);
                }
            }

            // 2. Dibujar la pieza activa
            if (currentShape != null && !gameOver)
            {
                int shapeRows = currentShape.GetLength(0);
                int shapeCols = currentShape.GetLength(1);

                for (int r = 0; r < shapeRows; r++)
                {
                    for (int c = 0; c < shapeCols; c++)
                    {
                        if (currentShape[r, c] != 0)
                        {
                            Rectangle rect = new Rectangle((currentX + c) * CellSize, (currentY + r) * CellSize, CellSize, CellSize);
                            using (Brush brush = new SolidBrush(colors[currentShapeIndex + 1]))
                            {
                                g.FillRectangle(brush, rect);
                            }
                            g.DrawRectangle(Pens.White, rect);
                        }
                    }
                }
            }

            // 3. Panel lateral
            int sidebarX = Cols * CellSize + 20;
            g.DrawString($"Puntuación:\n{score}", new Font("Arial", 14, FontStyle.Bold), Brushes.Black, sidebarX, 20);

            string controls = "Controles:\n" +
                              "← / → : Mover\n" +
                              "↑ : Rotar\n" +
                              "↓ : Bajar paso\n" +
                              "Espacio : Caída rápida\n" +
                              "R : Reiniciar";
            g.DrawString(controls, new Font("Arial", 9), Brushes.DarkSlateGray, sidebarX, 100);
        }
    }
}
