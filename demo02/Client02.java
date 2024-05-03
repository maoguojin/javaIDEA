package demo02;



//TCP实现聊天：客户端2号
public class Client02 {
    public static void main(String[] args) {
//      开启线程，（Lambda线程体）
        new Thread(() -> {
            new ServerReceiver(2222).receive();
        }).start();

        new Thread(() -> {
            new ClientSend("localhost",4444,"Client02").send();
        }).start();
    }
}

