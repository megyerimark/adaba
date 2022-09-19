import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Data data = new Data(new Mariadb());
        // data.connect();
        // // itt kérek adatokat!
        // data.close();
        ArrayList<Employee> employeeList= data.getEmployees();
        System.out.println(employeeList.get(1).city);
    }
}