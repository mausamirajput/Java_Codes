package com.trycatch;

public class TryCatchEample2 {


        public static void main(String[] args) {
            try
            {
                int data=50/0; //may throw exception
            }
            // handling the exception by using Exception class
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("output after handling the exception using exception class");
        }

    }

