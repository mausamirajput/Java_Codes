package com.ExceptionPropogation;

//program for checked exceptions
public class Example2 {
    void m(){
        throw new java.io.IOException("device error");//checked exception //here it will throw compile time error
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        Example2 obj=new Example2();
        obj.p();
        System.out.println("normal flow");
    }
}
