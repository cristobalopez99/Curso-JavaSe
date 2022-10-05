import java.util.Scanner;

public class DoWhileBucle {
    public static void main(String[] args) {
        int response = 0;
       do {
           System.out.println("Selecciona el número de la opcion que deseas");
           System.out.println("1. Movies");
           System.out.println("2. Series");
           System.out.println("3. Music");
           System.out.println("0. Exit");

           Scanner sc = new Scanner(System.in);
           response = Integer.valueOf(sc.nextLine());

           switch(response) {
               case 0:
                   System.out.println("Gracias por venir bro'");
                   break;
               case 1:
                   System.out.println("Movies");
                   break;
               case 2:
                   System.out.println("Series");
                   break;
               case 3:
                   System.out.println("Music");
                   break;
               default:
                   System.out.println("Selecciona una opcion correcta");

           }


       } while(response != 0);
        System.out.println("Se termino el programa");

    }
}
