import org.zeromq.ZMQ;
public class zmqClient {
public static void main(String[] args) {
ZMQ.Context c = ZMQ.context(1);
ZMQ.Socket s = c.socket(ZMQ.REQ);
s.connect ("tcp://localhost:5555");
s.send ("Hello", 0);

}
}