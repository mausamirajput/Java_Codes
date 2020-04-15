package com.ThrowsKeyword;

import java.io.IOException;

//example of how checked exception can be propagated using throws keyword
public class Example1 {

        void m()throws IOException {
            throw new IOException("device error");//checked exception
        }
        void n()throws IOException{
            m();
        }
        void p(){
            try{
                n();
            }catch(Exception e){System.out.println("exception handled");}
        }
        public static void main(String args[]){
            Example1 obj=new Example1();
            obj.p();
            System.out.println("normal flow...");
        }
    }
