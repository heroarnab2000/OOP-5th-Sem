class checkedUncheckedExcep {
    public static void main(String args[]) {

        FileReader file = new FileReader("somefile.txt"); // Checked Exception
        System.out.println("Successful.");

        System.out.println(250/0);                          // Unchecked Exception
        System.out.println("Successful");
    }
}