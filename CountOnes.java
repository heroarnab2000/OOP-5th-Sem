import java.util.Scanner;

class CountOnes {

    static int count = 0;
    
    public static int counter() {
        ++count;
        return (count);
    }

    public static void main(String[] args) {
        int digit;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        while(num != 0) {
            digit = num % 10;
            if(digit == 1) counter();
            num /= 10;
        }

        System.out.println("The occurence of '1' in the given number is: " +(counter()-1));
        in.close();
    }
}