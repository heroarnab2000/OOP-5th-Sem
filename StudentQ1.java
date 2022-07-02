class StudentQ1 {

    static int id;
    static String name;
    
    StudentQ1() {

        id = 122;
        name = "STCET student";

    }
    
    public static void main(String args[]) {

        StudentQ1 s1 = new StudentQ1();
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

    }
}