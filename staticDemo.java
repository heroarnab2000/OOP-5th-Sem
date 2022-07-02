public class staticDemo {
    static int a, b;
    
    static {
        a = 10;
        System.out.println("First static block been executed.\n");
    }
    
    static {
        b = 4 * a;
        System.out.println("Second static block been executed.\n");
    }
    
    public static void member(int k) {
        System.out.println("The value passed is: " +k+ "\nThe value of a is: "+a+"\n");
    }

    public static void main(String[] args) {
        member(45);
        System.out.println("Value of b: "+b+"\n");
    }
}