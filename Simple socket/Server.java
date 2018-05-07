import java.io.*;
import java.net.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Calendar;


public class Server {
public static void main(String[] args){
try{
long start_time=  System.nanoTime()/1000;

ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection 

DataInputStream dis=new DataInputStream(s.getInputStream());

String	str=(String)dis.readUTF();

System.out.println("message= "+str);

ss.close();
long end_time=  System.nanoTime()/1000;

long excution_time= end_time - start_time;
String time= Long.toString(excution_time);
 System.out.println(" Time :  "+time);

}catch(Exception e){System.out.println(e);}
}
}
