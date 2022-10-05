public class SwitchStatement {
    public static void main(String[] args) {

        String raceOrNoRace = "Lluvia";

        switch(raceOrNoRace) {
            case "Clear":
                System.out.println("Esta despejado, si se corre");
                break;
            case "Cloudy":
                System.out.println("Esta nublado, si se corre");
                break;
            case "Lluvia":
                System.out.println("Esta muy lluvioso, no se corre");
                break;
            default:
                System.out.println("Selecciona una de las opciones");
        }
    }
}
