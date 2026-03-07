public class OrdenacionArrayDescendente {

    public static void main(String[] args) {
        int[] num = new int[6];
        int temp;
        boolean flag = true;
        num[0] = 50;
        num[1] = 26;
        num[2] = 7;
        num[3] = 9;
        num[4] = 15;
        num[5] = 27;

        System.out.println("Array original:");
        for (int n : num) {
            System.out.print(n + " ");
        }

        while (flag) {
            flag = false;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    flag = true;
                }
            }
        }
        
        System.out.println("\n\nArray ordenado:");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}