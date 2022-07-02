class Sum {

    int x, y, z;

    Sum(int a, int b, int c) {

        x = a; y = b; z = c;

    }

    Sum(int a, int b) {

        x = a; y = b;

    }

    Sum() {

        System.out.println("Bucket is empty");

    }

    int display() {

        return (x + y + z);

    }

}

class Driver {

    public static void main(String[] args) {

        int sum;

        Sum ThreeVar = new Sum(10, 20, 30);
        Sum TwoVar = new Sum(10, 20);
        

        sum = ThreeVar.display();
        System.out.println("Sum of Three Variables(10, 20, 30) is " + sum);

        sum = TwoVar.display();
        System.out.println("Sum of Two Variables(10, 20) is " + sum);

        Sum ZeroVar = new Sum();
        
    }

}