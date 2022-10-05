public class IfStatement {
    public static void main(String[] args) {

        boolean isMaxChamp = true;
        int titlesQuantity = 2;

        if (isMaxChamp) {
            titlesQuantity++;
            System.out.println("Max es campeón en 2022");
        } else {
            titlesQuantity--;
            System.out.println("Max ha perdido todas las carreras que quedaban, no será campeón");

        }
    }
}
