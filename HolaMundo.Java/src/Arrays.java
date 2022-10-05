public class Arrays {
    public static void main(String[] args) {

        String[] iosVersions = new String[16];
        String races[] = new String[24];

        String[][] cities = new String[24][2];

        int [][][] numbers = new int [2][2][2];
        int [][][][] pilots = new int [2][2][2][2];


        iosVersions[0] = "iOs1";
        iosVersions[1] = "iOs2";
        iosVersions[2] = "iOs3";
        iosVersions[3] = "iOs4";
        iosVersions[4] = "iOs5";

        for (int i = 0; i < iosVersions.length; i++) {
            System.out.println(iosVersions[i]);
        }

        System.out.println(iosVersions[0]);
        System.out.println(iosVersions[5]);

        cities[0][0] = "Bahrain";
        cities[0][1] = "Abu Dabhi";
        cities[1][0] = "Australia";
        cities[1][1] = "Spain";
        cities[2][0] = "Monaco";
        cities[2][1] = "Azerbaijan";
        cities[3][0] = "Hungary";
        cities[3][1] = "Belgium";

        System.out.println(cities[0][0]);
        System.out.println(cities[2][0]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);

            }
        }

        String [][][][] animals = new String [2][3][2][2];
        animals [1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();

        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[1][0][0][1]);

                    }

                }
            }

        }

    }
}
