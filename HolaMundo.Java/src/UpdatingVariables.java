public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 20000;

        //como modificar el contenido de una variable
        salary = salary + 5000;
        System.out.println(salary);

        //Restando
        salary = salary - 1000;
        System.out.println(salary);

        //ejecutando varias operaciones

        salary = salary + (30*2) - 50;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Cristobal";
        employeeName = employeeName + " Lopez Arias";
        employeeName = "Rafael " + employeeName;
        System.out.println(employeeName);
    }
}
