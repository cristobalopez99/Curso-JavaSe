public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        //Nos dice el area de un circulo pi *radio al cuadrado
        double area = circleArea(y);
        System.out.println(circleArea(y));

        //Area de una esfera
        sphereArea(y);

        //Volimen de una esfera
        sphereVolumen(y);



    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return Math.PI * 4 * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return Math.PI * (4/3) * Math.pow(r,3);
    }


    /**
     * Descipción: La funcion que especifica la moneda y convierte la cantidad de dinero a dolares
     * @param quantity cantidad de dinero
     * @param currency tipo de moneda (COP, MXN)
     *
     * */
    public static double convertToDolar(double quantity, String currency){
        switch ("currency"){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.0031;
                break;
        }
        return quantity;
    }
}

