import java.util.Scanner;

abstract class Employee_new {

    public void getInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of Employee: ");
        String name_mang = in.nextLine();
        System.out.print("Enter Employee_ID: ");
        int id_mang = in.nextInt();
        System.out.print("Enter Date Of Joining(DDMMYYYY): ");
        int dob_mang = in.nextInt();
        
        System.out.println();
        System.out.print("Enter name of Salesman: ");
        String name_sales = in.next();
        System.out.print("Enter Employee_ID: ");
        int id_sales = in.nextInt();
        System.out.print("Enter Date Of Joining(DDMMYYYY): ");
        int dob_sales = in.nextInt();

        in.close();
    }

    abstract void getSal();

}

class Manager extends Employee_new {
    
    void getSal() {
        int basic = 65000;
        double salary =  basic * 1.99;
        System.out.println("\nThe Basic pay of the Manager is: Rs. " +basic);
        System.out.println("The salary of the Manager is Rs. " +salary+ " with allowance of Rs. " +(0.99*basic));
    }
}

class Salesmen extends Employee_new {
    
    void getSal() {
        int basic = 15000;
        double salary =  basic * 1.85;
        System.out.println("\nThe Basic pay of the Salesman is: Rs. " +basic);
        System.out.println("The salary of the Salesman is Rs. " +salary+ " with allowance of Rs. " +(0.85*basic));
    }
}


class Salaries {

    public static void main(String[] args) {

        Manager obj1 = new Manager();
        obj1.getInfo();
        obj1.getSal();

        Salesmen obj2 = new Salesmen();
        obj2.getSal();

    }
}