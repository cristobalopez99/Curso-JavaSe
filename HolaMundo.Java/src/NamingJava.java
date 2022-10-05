
            //Upper camel case porque es una clase
public class NamingJava {
    public static void main(String[] args) {

        int celphone = 3005980;
        int celPhone = 3584;
        System.out.println(celPhone);
        System.out.println(celphone);

        String $countryName = "Indonesia";
        String _escuderia = "RedBull";
        String currency$ = "COP";
        String escuderia_ = "Ferrari";

        System.out.println($countryName);
        System.out.println(_escuderia);
        System.out.println(currency$);
        System.out.println(escuderia_);

        //Variables constantes (QUe no cambian)

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        System.out.println(POSITION);
        System.out.println(MAX_WIDTH);
        System.out.println(MIN_WIDTH);

        //Lower camel case
        String driverFullName = "Max Emilian Verstappen";
        int  ageOfDriver = 25;
        System.out.println(driverFullName);
        System.out.println(ageOfDriver);




    }
}
