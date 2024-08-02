

class Loop{
    public static void main (String[] args){
        int count;

        // for loop
        // for(count = 0; count<5; count+=1){
        //     System.out.println("new count: "+ count);
        // }
        // System.out.println("Done!");

        for (count =0; count <5;){
            if (count%2 == 0){
                System.out.println(count + " is even");
            }
            else{
                System.out.println(count + " is odd");

            }
            // System.out.println("new count" + count);
            count++;
        }
        System.out.println("Done!");

        // imporved gallon to liters converter

        double gallons;
        double liters;
        for(gallons =0; gallons<=5; gallons++ ){
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters");
        }
        


    }
}