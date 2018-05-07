import java.io.*;
import java.net.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Calendar;
import org.zeromq.ZMQ;

public class zmqServer {
public static void main(String[] args) {
long start_time=  System.nanoTime()/1000;
ZMQ.Context c = ZMQ.context(1);
ZMQ.Socket s = c.socket(ZMQ.REP);
s.bind ("tcp://*:5555");

System.out.println (new String(s.recv(0)));

long end_time=  System.nanoTime()/1000;

long excution_time= end_time - start_time;
String time= Long.toString(excution_time);
 System.out.println(" Time :  "+time);


}
}