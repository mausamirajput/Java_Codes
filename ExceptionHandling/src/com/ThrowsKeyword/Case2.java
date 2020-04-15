package com.ThrowsKeyword;
import java.io.IOException;

//case 2 : you declare the exception
/*A)In case you declare the exception, if exception does not occur, the code will be executed fine.
        B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.*/


class M1{
        void method()throws IOException {
            System.out.println("device operation performed");
        }
    }
   public  class Case2{
        public static void main(String args[])throws IOException{//declare exception
            M1 m1=new M1();
            m1.method();

            System.out.println("normal flow...");
        }
    }
