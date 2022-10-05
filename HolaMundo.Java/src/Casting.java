public class Casting {
    public static void main(String[] args) {

        //En un año max gana 13 carreras
        //Cuantas carreas gano los primeros 6 meses

        double raceWins = 13.0/6.0;
        System.out.println(raceWins);

        //Estimacion

        int estimatedRaceWins = (int)  raceWins;
        System.out.println(estimatedRaceWins);

        //Exactitud

        int a = 13;
        int b = 6;
        System.out.println((double)a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);



    }




}
