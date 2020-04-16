public class DaemonThreadEx2 extends Thread {

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args){
        DaemonThreadEx2 t1=new DaemonThreadEx2();
        t1.start();
        // It will throw IllegalThreadStateException
        t1.setDaemon(true);
    }
}