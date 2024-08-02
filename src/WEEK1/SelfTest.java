class SelfTest{
    public static void main(String[] args) {
// question 1: The moon’s gravity is about 17 percent that of earth’s. Write a program that computes your 
// effective weight on the moon.

// recall that weight = mass * gravity
    // double gravity, weight, mass;
    // mass = 50;
    // gravity = 0.17;
    // weight = mass * gravity;
    // System.out.println("the weight on " + mass + "kg = "+ weight +"g" );

    //  question 2: Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet 
    // of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals 
    // approximately 39.37 inches.)

    double meters = 39.37;
    double inches;

    for (int counter = 1; counter <= 10; counter++) {
        inches = counter * meters;
        System.out.println(counter + "meters = " +inches + " inches");
    }



    

    }
}