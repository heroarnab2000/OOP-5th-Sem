import java.util.Scanner;

class Students_of_Q1 {

    int id;
    String name;
    
    Students_of_Q1(int i, String n) {

        id = i;
        name = n;

    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        Students_of_Q1 a[] = new Students_of_Q1[5];
        
        for(int i = 0; i < a.length; i++) {

            a[i] = new Students_of_Q1(0, "");
            
            System.out.println("Enter ID of student " + (i + 1) + ": ");
            a[i].id = in.nextInt();
            
            System.out.println("Enter the Name of student " + (i + 1) + ": ");
            a[i].name = in.next();

        }

        System.out.println("\nStudent's Info:\n");

        for(int i = 0; i < a.length; i++) {

            System.out.println("ID of student " + (i + 1) +" is: "+a[i].id);
            System.out.println("Name of student " + (i + 1) + " is: " + a[i].name);
            System.out.println();

        }
        in.close();
    }
}