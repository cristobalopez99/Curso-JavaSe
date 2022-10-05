public class IncrementDecrement {
    public static void main(String[] args) {

        int marioLives = 8;
        marioLives = marioLives - 1; //7
        System.out.println(marioLives);

        marioLives--; //Decremento lives=6
        System.out.println(marioLives);

        marioLives++;//Incremento lives= 7
        System.out.println(marioLives);

        //prefija

        int present = 100 + ++marioLives;
        System.out.print(present);


    }
}
