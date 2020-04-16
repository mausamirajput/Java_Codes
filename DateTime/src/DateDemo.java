import java.text.SimpleDateFormat;
import java.util.Date;
//getting current date and time
public class DateDemo {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();//getting current date and time
        // display time and date using toString()
        System.out.println(date.toString());

        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");//formatting and parsing date in a local-sensitive manner

        System.out.println("Current Date: " + ft.format(dNow));
    }
}