abstract class Bank {

    public void display(String BankName, String BranchName, String IFSC) {
        System.out.print("\nName of Bank: " +BankName);
        System.out.print("Name of the Branch: " +BranchName);
        System.out.print("IFSC Code: " +IFSC);
    }

    abstract void getROI();

}

class SBI extends Bank {

    void getROI() {
        System.out.println("\nIn SBI Bank:");
        double rate = 0.06;
        System.out.println("Interest after 1 term with principle FD Rs 50000 is Rs. " +(rate*50000));
    }
}

class PNB extends Bank {

    void getROI() {
        System.out.println("\nIn PNB Bank:");
        double rate = 0.07;
        System.out.println("Interest after 1 term with principle FD Rs 50000 is Rs. " +(rate*50000));
    }
}

class AXIS extends Bank {

    void getROI() {
        System.out.println("\nIn AXIS Bank:");
        double rate = 0.08;
        System.out.println("Interest after 1 term with principle FD Rs 50000 is Rs. " +(rate*50000));
    }
}

class HDFC extends Bank {

    void getROI() {
        System.out.println("\nIn HDFC Bank:");
        double rate = 0.09;
        System.out.println("Interest after 1 term with principle FD Rs 50000 is Rs. " +(rate*50000));
    }
}

class Banking {

    public static void main(String[] args) {
        
        SBI objSBI = new SBI();
        objSBI.display("State Bank Of India", "Budge Budge", "SBIN0002032");
        objSBI.getROI();

        PNB objPNB = new PNB();
        objPNB.display("Punjab National Bank Of India", "Budge Budge", "PNB000169");
        objPNB.getROI();

        AXIS objAXIS = new AXIS();
        objAXIS.display("AXIS Bank", "Budge Budge", "AXIS0000236");
        objAXIS.getROI();

        HDFC objHDFC = new HDFC();
        objHDFC.display("Housing Development Finance Corporation Limited", "Budge Budge", "HDFC0000108");
        objHDFC.getROI();

        System.out.println("As the interest from HDFC Bank is maximum after 1 term, the amount should be fixed in HDFC.");
    }
}