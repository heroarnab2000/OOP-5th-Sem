class myException extends Exception {
    myException() {
        super("Assignment is found but unreadable.");
    }
}

public class MyException {
    public static void main(String[] args) throws myException {
        throw new myException();
    }
}