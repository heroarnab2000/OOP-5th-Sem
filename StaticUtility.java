class StaticUtility  {
    
    
    static int b;

    static void check(int a)  {
        System.out.println("In static method check:\na = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a;
        a = 5; b = 10;
        System.out.println("After first initialisation:\na = " + a + ", b = " + b);
        a = 10; b = 5;
        System.out.println("After second initialisation:\na = " + a + ", b = " + b);
        check(a);
    }
}