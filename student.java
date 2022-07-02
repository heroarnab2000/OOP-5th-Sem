import java.util.Scanner;

class student {

    static int id, year;
    static String name, department;

    public static void insertinfo() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Student ID: ");
        id = in.nextInt();
        System.out.println("Enter the name of the Student: ");
        name = in.next();
        System.out.println("Enter the passing year: ");
        year = in.nextInt();
        System.out.println("Enter the department of the Student: ");
        department = in.next();
        
        in.close();

    }

    public static void displayinfo() {

        System.out.println("\n\nStudent's Info:\nID: " +id+ "\nName: " +name+ "\nDepartment: " +department+ "\nYear of Passing: " +year);

    }

    public static void main(String[] args) {

        insertinfo();
        displayinfo();

    }
}