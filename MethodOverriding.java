class Company  {

    void Address()  {
        System.out.println("The Headquarters is in Gobordanga.");
        System.out.println("Name of CEO is Arnab Das.");
    }

    void TypeOfCompany() {
        System.out.println("It is a B-2-C company");
    }
}

class Amazon  extends Company  {

    void Address()  {
        System.out.println("The Headquarters is in USA");
        System.out.println("The CEO is Jeff Bezos");
    }
}

class Flipkart extends Company  {

    void Address()  {
        System.out.println("The Headquarters is in Bangalore");
        System.out.println("The CEO is Kalyan Krishnamurthy");
    }
}

public class MethodOverriding  {

    public static void main(String[] args)  {

        Company obj1 = new Company();
        Amazon obj2 = new Amazon();
        Flipkart obj3 = new Flipkart();        

        System.out.println("Inside Company Class ::");
        obj1.Address();
        obj1.TypeOfCompany();

        System.out.println("\nInside Amazon Class ::");
        obj2.Address();
        obj2.TypeOfCompany();

        System.out.println("\nInside Flipkart Class ::");
        obj3.Address();
        obj3.TypeOfCompany();
    }
}