
class ControlStatement{


    public static void main (String[] args){
        // int a, b, c;
        // a=10; b=6; c=2;
        
        // if(a < b){
        // System.out.println(a + " < " + b);
        // }
        // if(a <= b){
        // System.out.println(a + " <= " + b);
        // }
        // if(b > c){
        // System.out.println(b + " > "+ c);
        // }
        // if(b >= c){
        // System.out.println(b + " >= "+ c);
        // }
        // if (a==c){
        //     System.out.println(a +" == "+ c);
        // }
        // if (a!=c){
        //     System.out.println("not Equal");
        // }

        float studentA, studentB, studentC, studentD;
        studentA =50; studentB =80; studentC=90; studentD=50;
        float average = (studentA + studentB + studentC + studentD)/4;

        if (studentA > average){
            System.out.println("the Pass score A=  " + studentA);
        }
        if (studentB > average){
            System.out.println("the Pass score B=  " + studentB);
        }
        if (studentC > average){
            System.out.println("the Pass score C= " + studentC);
        }
        if (studentD > average){
            System.out.println("the Pass score D= " + studentD);
        }
        else{
            System.out.println("Failed");
        }

        System.out.println("the avarage score is "+average);
    
    }

   

    


}