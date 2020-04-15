class Employee {}
interface Interviewer {
    public void conductInterview();
}
class HRExecutive extends Employee implements Interviewer {
    String[] specialization;
    public void conductInterview() {
        System.out.println("HRExecutive - conducting interview");
    }
}
class Manager implements Interviewer{
    int teamSize;
    public void conductInterview() {
        System.out.println("Manager - conducting interview");
    }
}



public class CastingProgram {
    public static void main(String args[]) {
        Interviewer[] interviewers = new Interviewer[2]; //Array to store objects of classes that implement interface Interviewer
        interviewers[0] = new Manager(); //store object of Manager at array position 0

        interviewers[1] = new HRExecutive(); //Store object of HRExecutive at array position 1
        for (Interviewer interviewer : interviewers) {   //Loop through values of array interviewers
            if (interviewer instanceof Manager) { //If object referred to by interviewer is of class Manager, use casting to retrieve value for its teamSize
                int teamSize =((Manager)interviewer).teamSize;
                if (teamSize > 10) { //If interviewer’s teamSize > 10, call conductInterview
                    interviewer.conductInterview();
                } else {
                    System.out.println("Mgr can't " +
                            "interview with team size less than 10"); //If interviewer’s teamSize <= 10, print message
                }
            } else if (interviewer instanceof HRExecutive) { //Otherwise, if object stored is of class HRExecutive, call conductInterview method on object; no casting is required in this case
                interviewer.conductInterview();
            }
        }
    }
}