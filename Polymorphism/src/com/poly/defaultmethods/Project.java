package com.poly.defaultmethods;


interface Interviewer {
    default Object submitInterviewStatus() {
        System.out.println("Interviewer:Accept");
        return null;
    }
}
class Manager implements Interviewer {
    public String submitInterviewStatus() {
        System.out.println("Manager:Accept");
        return null;
    } }

public class Project {
    public static void main(String args[]) {
        Interviewer interviewer = new Manager();
        interviewer.submitInterviewStatus();
        Manager mgr = new Manager();
        mgr.submitInterviewStatus();
    }
}

