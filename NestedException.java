import java.util.Scanner;

class NestedException {

    public static void NestedExceptionTest() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = in.nextInt();
        int b = 20;

        try {
            float dy = b / a;
            System.out.println("dy = " +dy);

            System.out.println("Enter dx: ");
            float dx = in.nextInt();
            
            try {
                float slope = dy / dx;
                System.out.println("slope = " +slope);
            }

            catch(ArithmeticException e) {
                System.out.println("slope = Infinity");
            }
        }

        catch(ArithmeticException e) {
            System.out.println("b / a = UNDEFINED [MATH ERROR]");
        }

        finally {
            System.out.println("Here, the slope is guaranteed to be a non-zero number.\nThus the curve is never settled and has sharp edges at each oscillation");
        }

        in.close();

    }

    public static void main(String[] args) {

        NestedExceptionTest();

    }
}