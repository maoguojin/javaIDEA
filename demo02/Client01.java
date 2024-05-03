package demo02;

//TCP实现聊天：客户端1号
public class Client01 {
    public static void main(String[] args) {
//      开启线程，（Lambda线程体）
        new Thread(() -> {
            new ServerReceiver(4444).receive();
        }).start();

        new Thread(() -> {
            new ClientSend("localhost",2222,"Client01").send();
        }).start();
    }
}

