class Parent  {

    int a, b;

    Parent(int i, int j)  {
        a = i;
        b = j;
    }

    Parent(Parent obj)  {
        this.a = obj.a;
        this.b = obj.b;
    }

    void show()  {
        System.out.println("In the Parent Class:\na = " + a + " , b = " + b);
    }
}

class Child extends Parent  {
    
    int c;

    Child(int i, int j, int k) {
        super(i, j);
        c = k;
    }

    void show()  {
        super.show();
        System.out.println("In the Child Class:\na = " + a + " , b = " + b + " , c = " + c);
    }

    public static void main(String[] args) {
        Child obj = new Child(5, 10, 15);
        obj.show();
    }

}