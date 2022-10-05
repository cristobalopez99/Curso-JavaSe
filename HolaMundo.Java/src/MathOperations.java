public class MathOperations {
    public static void main(String[] args) {
        //para flotantes
        double x = 8.5;
        double y = 5.8;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(y));

        //Devuelve un numero elevado a otro x es el numero y Y es la potencia
        System.out.println(Math.pow(x,y));

        //Nos dice el numero mayor
        System.out.println(Math.max(x,y));

        //Nos dice la raiz cuadrada de un numero
        System.out.println(Math.sqrt(x));

        //Nos dice el area de un circulo pi *radio al cuadrado
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        System.out.println(Math.PI *4 * Math.pow(y,2));

        //Volimen de una esfera
        System.out.println((4/3) * Math.PI * Math.pow(y,3));



    }
}
