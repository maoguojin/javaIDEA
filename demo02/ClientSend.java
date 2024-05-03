package demo02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/* 发送信息 */
public class ClientSend {
    BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
    /* 初始化 */
    Socket socket =null;
    private final String LocalhostIP; //本地ip
    private final int Port;  //发送端口号
    private final String CyberName;//网名
    /* 构造方法 */
    public ClientSend(String LocalhostIP, int Port, String CyberName) {
        this.LocalhostIP = LocalhostIP;
        this.Port = Port;
        this.CyberName=CyberName;
    }
    /* 执行发送功能 */
    public void send() {
        try {
            //循环发送信息
            while (true) {
//              获取输入数据
                String data = reader.readLine();
//              与服务器进行连接
                socket = new Socket(InetAddress.getByName(LocalhostIP),Port);
//              创建输出流
                OutputStream os = socket.getOutputStream();
                if(data.equals("End!")){
                    os.write(data.getBytes());
                    break;
                }
//              将获取的数据转化为字节流，再将其发送给服务器端
                os.write((CyberName+":"+data).getBytes());
                os.flush();//清空缓冲区的数据
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

