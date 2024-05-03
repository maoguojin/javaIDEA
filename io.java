import java.io.File;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\alists\\Desktop\\新建 文本文档.txt");

        // 判断文件是否存在
        if (!file.exists()) {
            // 不存在则创建
           // file.createNewFile();
        }
        System.out.println("文件的绝对路径：" + file.getAbsolutePath());
        System.out.println("文件的大小：" + file.length());

        // 刪除文件
       // file.delete();
    }
}
