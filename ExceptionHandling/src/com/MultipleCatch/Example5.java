package com.MultipleCatch;

public class Example5 {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(Exception e){System.out.println("common task completed");}
        catch(ArithmeticException e){System.out.println("task1 is completed");} // here it will give error
        //error: exception ArithmeticException has already been caught
        // completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        // above error: exception ArrayIndexOutOfBoundsException has already been caught
        //n("task 2 completed");}
        System.out.println("rest of the code...");

        //the entire code will throw compile-time error
    }
}
