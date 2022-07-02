import java.io.*;
class ExceptionHandling {
    public static void main(String args[]) {
        
        try {
            FileReader file = new FileReader("somefile.txt");
            System.out.println("Successful.");
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File not found.\nProgram Terminated");
        }

        try {
            System.out.println(250/0);
            System.out.println("Successful.");
        }

        catch (ArithmeticException e) {
            System.out.println("Division by zero not possible.\nProgram Terminated");
        }
    }
}