package com.trycatch;

public class TryCatchExample4 {


        public static void main(String[] args) {

            try
            {
                int data1=50/0; //may throw exception

            }
            // handling the exception
            catch(Exception e)
            {
                // generating the exception in catch block
                int data2=50/0; //may throw exception

            }
            System.out.println("Rest of the output can be printed here");
        }

}
