class Employee {

    int Eid;
    String ename, dept;

    Employee(int id, String name, String d) {

        Eid = id;
        ename = name;
        dept = d;

    }
    public static void main(String args[]) {

        Employee e1 = new Employee(2001, "Tiyasha", "Accounts");
        Employee e2 = new Employee(2012, "Shounak", "Sales");
        Employee e3 = new Employee(2105, "Arijit", "Accounts");
        Employee e4 = new Employee(2053, "Prajeet", "HR");
        Employee e5 = new Employee(2020, "Madhu", "IT");

        System.out.println("ID: " + e1.Eid + "\tName: " + e1.ename + "\tDept: " + e1.dept);
        System.out.println("ID: " + e2.Eid + "\tName: " + e2.ename + "\tDept: " + e2.dept);
        System.out.println("ID: " + e3.Eid + "\tName: " + e3.ename + "\tDept: " + e3.dept);
        System.out.println("ID: " + e4.Eid + "\tName: " + e4.ename + "\tDept: " + e4.dept);
        System.out.println("ID: " + e5.Eid + "\tName: " + e5.ename + "\tDept: " + e5.dept);

    }
}