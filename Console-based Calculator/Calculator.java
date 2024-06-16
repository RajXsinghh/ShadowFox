import java.util.Scanner;

class A {

    Scanner s = new Scanner(System.in);
    double x;
    double y;

    public void add() {
        try {
            System.out.println("Enter 1st no. :");
            x = s.nextDouble();
            System.out.println("Enter 2nd no. :");
            y = s.nextDouble();

            System.out.println(x + y);
        } catch (Exception e) {

        }
    }

    public void subtract() {
        try {
            System.out.println("Enter 1st no. :" + x);
            x = s.nextDouble();
            System.out.println("Enter 2nd no. :" + y);
            y = s.nextDouble();

            System.out.println(x - y);
        } catch (Exception e) {

        }
    }

    public void multiply() {
        try {
            System.out.println("Enter 1st no. :" + x);
            x = s.nextDouble();
            System.out.println("Enter 2nd no. :" + y);
            y = s.nextDouble();

            System.out.println(x * y);
        } catch (Exception e) {

        }
    }

    public void divide() {
        try {
            System.out.println("Enter 1st no. :");
            x = s.nextDouble();
            System.out.println("Enter 2nd no. :");
            y = s.nextDouble();

            System.out.println("Answer is : "+x / y);
        } catch (Exception e) {

        }
    }

    public void sqroot() {
        try {
            System.out.println("Enter your no. :");
            x = s.nextDouble();

            System.out.println("Square root is :" + Math.sqrt(x));
        } catch (Exception e) {

        }
    }

    public void expo() {
        try {
            System.out.println("Enter a no. :");
            x = s.nextDouble();
            System.out.println("Enter the power :");
            y = s.nextDouble();

            System.out.println("Result :" + Math.pow(x, y));
        } catch (Exception e) {

        }

    }
}

class B {
    double x, y;

    public void temp() {
        try {
            try (Scanner s = new Scanner(System.in)) {
                System.out.println("Enter 1 for Celcius to Fahrenheit :");
                System.out.println("Enter 2 for Fahrenheit to Celcius :");

                int c = s.nextInt();

                switch (c) {

                    case 1:
                        System.out.println("Enter Celsius temperature :");
                        x = s.nextInt();
                        double z = (x * 9 / 5) + 32;
                        System.out.println("So Fahrenheit equal to :" + z);
                        break;

                    case 2:
                        System.out.println("Enter Fahrenheit temperature :");
                        y = s.nextInt();
                        double j = (y - 32) * 5 / 9;
                        System.out.println("So Celsius temperature :" + j);

                        break;
                }
            }
        } catch (Exception e) {

        }
    }
}

class C {

    int ruppee, dollar;

    public void currency() {

        try {
            System.out.println("Enter your choice :-");
            System.out.println(" Press 1 -Convert Ruppee to Dollar -");
            System.out.println("Press 2 -Convert Dollar to Ruppee -");
            try (Scanner sc = new Scanner(System.in)) {
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter ruppee amount : ");
                        int R = sc.nextInt();
                        int x = R / 82;
                        System.out.println("Dollar is :" + x);

                    case 2:
                        System.out.println("Enter dollar amount : ");
                        int D = sc.nextInt();
                        int y = D * 82;
                        System.out.println("Ruppee is :" + y);
                }
            }
        } catch (Exception e) {

        }

    }

}

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        while(true) {
        System.out.println("Enter 1 for Addition :");
        System.out.println("Enter 2 for Subtraction :");
        System.out.println("Enter 3 for Multiplication :");
        System.out.println("Enter 4 for Division :");
        System.out.println("Enter 5 for SquareRoot :");
        System.out.println("Enter 6 for Exponentiation :");
        System.out.println("Enter 7 for Temperator Conversion :");
        System.out.println("Enter 8 for currency exchange :");

        System.out.println("Enter no : ");

        A x=new A();
        B y=new B();
        C z=new C();
        int choice = sc.nextInt();

        switch(choice) {
            case 1: x.add();
            break;

            case 2: x.subtract();
            break;

            case 3: x.multiply();
            break;

            case 4: x.divide();
            break;
            
            case 5: x.sqroot();
            break;

            case 6: x.expo();
            break;

            case 7: y.temp();
            break;

            case 8: z.currency();
            break;

            default: System.out.println("Invalid choice choose correct no.");
                     break;
        } 
    
    }
   // sc.close();
    
}
}
