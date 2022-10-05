public class DataTypes {
    public static void main(String[] args) {
        long cellNumber = 3005980935L;
        System.out.println(cellNumber);


        double nD = 123.64959849774545465876454;
        float nF = 123.649F;
        System.out.println(nD);
        System.out.println(nF);


        //Tipo de dato CHAR

        var salary = 15000; //Int
        var deducciones = salary*0.03;// double
        var totalSalary = salary - deducciones;

        System.out.println(totalSalary);
        System.out.println(salary);
        System.out.println(deducciones);

        var employeeName = "Cristobal Lopez";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY " + totalSalary);


    }
}
