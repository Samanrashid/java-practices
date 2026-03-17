class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class addMethodOverloading {
    public static void main(String[] args) {

      Calculator cal = new Calculator();

        System.out.println("Sum of 2 numbers: " + cal.add(10, 20));
        System.out.println("Sum of 3 numbers: " + cal.add(10, 20, 30));
        System.out.println("Sum of double numbers: " + cal.add(2.5, 3.5));
    }
}