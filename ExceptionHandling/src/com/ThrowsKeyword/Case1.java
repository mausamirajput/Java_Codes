package com.ThrowsKeyword;

import java.io.IOException;

// this is case1 where you handle the exception, the code will be executed whether exception occurs during program or not
 class M {
    void method()throws IOException {
        throw new IOException("device error");
    }
}
public class Case1{
    public static void main(String args[]){
        try{
            M m=new M();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}
