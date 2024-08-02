class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello world!, welcome to basic mathematical calculations....");
        int a = 3;
        int b = 5;
        int sum = a+ b;
        int diff = a-b;
        double division = a/b;
        float modd = a%b;
        System.out.println(); //prints a single space line
        System.out.println("the value of a + b = "+ sum);
        System.out.println("the value of a / b = "+ division);
        System.out.println("the value of a - b = "+ diff);
        System.out.println("the value of a % b = "+ modd);
        System.out.println();

        System.out.println("converting gallons to liters...");
        // converting gallons to liter;
        double gallons;
        double liters;
        gallons= 10;
        liters = gallons * 3.7854;
        System.out.println(gallons + " gallons is " + liters + " liters");
        



    }
}

