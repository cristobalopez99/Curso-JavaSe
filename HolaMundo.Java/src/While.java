public class While {
    static boolean lightIsOn = false;

    public static void main(String[] args) {

        turnOnOffLight();

        while(lightIsOn) {
            printSOS();
        }

        int i = 1;
        while(lightIsOn){
            printSOS();
        }

    }
    public static void printSOS(){
        System.out.println("... ___ ...");
    }

    public static boolean turnOnOffLight(){
        lightIsOn = (lightIsOn)?false:true;

        if(lightIsOn){
            lightIsOn = false;
        }else {
            lightIsOn = true;
        }
        return lightIsOn;
    }

}




