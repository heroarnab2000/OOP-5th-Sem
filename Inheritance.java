class Country  {

    void nameOfCountry()  {
        System.out.println("Name of Country is India.");
    }
}

class State extends Country  {


    void nameOfState()  {
        System.out.println("Name of State is West Bengal.");
    }

}

class Capital extends State  {

    void nameOfCapital()  {
        System.out.println("Name of Capital is Kolkata.");
    }
}

class City extends State {

    void nameOfCity()  {
        System.out.println("Name of City is Kolkata.");
    }
}

class College extends City  {

    void nameOfCollege()  {
        System.out.println("Name of College is STCET.");
    }
}

class NotInherited  {

    void testing()  {
        System.out.println("Just a Method.");
    }
}

public class Inheritance {

    public static void main(String[] args)  {
        Capital obj1 = new Capital();
        College obj2 = new College();
        NotInherited obj3 = new NotInherited();

        obj1.nameOfCapital();
        obj1.nameOfState();
        obj1.nameOfCountry();
        System.out.println();

        obj2.nameOfCollege();
        obj2.nameOfCity();
        obj2.nameOfState();
        obj2.nameOfCountry();
        System.out.println();

        obj3.testing();
        System.out.println();
    }
}