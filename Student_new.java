public class Student_new {

    String name = "Arnab Das";
    int s_id = 21;
    static String College_name = "St. Thomas' College of Engineering and Technology";

    public static void show() {
        System.out.println("Inside static method 'show':\nCollege name: " + College_name);
    }

    public void display() {
        Student_new obj = new Student_new();
        System.out.println("\nInside non-static method, display:");
        System.out.println("College name: " + College_name);
        System.out.println("name: " +obj.name+ "\nAnd s_id: " +obj.s_id);
    }

    public static void main(String[] args) {
        Student_new obj = new Student_new();
        obj.display();
        show();
    }
} 