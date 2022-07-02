class Parent_new {
    public static void display() {
        System.out.println("This is a method call from parent.\n");
    }
}

class Child_new extends Parent_new {
    public static void display() {
        System.out.println("This is a method call from child.\n");
    }
}

public class Method_Hiding {
    public static void main(String[] args) {
        Parent_new.display();
        Child_new.display();
    }
}