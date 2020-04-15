package com.ExceptionPropogation;
/*

Java Exception propagation
An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method,If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack.This is called exception propagation.*/
//this is an example of unchecked exception. by default unchecked exception are propagated
public class Example1 {

        void m(){
            int data=50/0;
        }
        void n(){
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

