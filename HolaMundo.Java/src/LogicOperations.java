public class LogicOperations {
    public static void main(String[] args) {

        int a = 7;
        int b = 2;

        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente de b ? -> " + (a != b));

        //operadores de relacion

        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es menor a b? -> " + (a < a));

        if (a == b) {
            System.out.println("a es igual a b");
        }else if(a != b){
            System.out.println("a es difrente a b");
        }else if(a > b){
            System.out.println("a es mayor a b");
        }else if(a < b){
            System.out.println("a es menor que b");
        }else if(a >= b){
            System.out.println("a es mayor o igual a b");
        }else if(a <= b){
            System.out.println("a es menor o igual a b");
        }
    }
}
