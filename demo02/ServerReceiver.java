package demo02;



import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* 接收信息 */
public class ServerReceiver {
    //    初始化
    ServerSocket server =null;
    Socket socket = null;
    private final int Port;   //服务器端口号
    //    构造方法
    public ServerReceiver(int Port) {
        this.Port = Port;
    }

    /* 执行接收信息的功能 */
    public  void receive(){
        try {
//          阻塞式监听，会一直等待客户端连接
            server = new ServerSocket(Port);
            boolean flag = true;
            //          循环接收信息
            while (true) {
                socket = server.accept();//接受客户端的连接
                if (flag){
                    System.out.println("\033[1;93;45m" + "对方在线中"+"\033[m");//控制台输出颜色字体
                    flag=false;
                }
//              创建输入流，再将发送端的信息进行接收
                InputStream inputStream = socket.getInputStream();
                byte[] bytes = new byte[1024];
//              将字节流转化成字符流，并读取该数据
                int len = inputStream.read(bytes);
                String data = new String(bytes, 0, len);
                if (data.equals("End!")){
                    System.err.println("对方已离线");//显示对方已离线
                }
//               输出客户端发送过来的数据
                System.out.println("\033[1;94m" +data);//控制台输出颜色字体
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

