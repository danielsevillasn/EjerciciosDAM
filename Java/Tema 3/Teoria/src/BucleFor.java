public class BucleFor {
    public static void main(String[] args){
        for (int a = 1; a<10;a++ ){ //1 se inicializa la variable 2 lo repite hasta que se deja de cumplir la expresion indicada 3 atribuye cuanto suma o decrece la variable, en este caso 1
            System.out.println(a);
        }
        for (int a = 1; a<10;a = a+2 ){ 
            System.out.println(a);
        }
        for(int a = 1; a<=10;a++ ){ 
            System.out.println(a);
        }
        for(int a = 1; a>-5;a-- ){
            System.out.println(a);
        }
    }
}

