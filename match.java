import java.util.Scanner;

public class match {
    public static void main(String[] args) {
        while (true){
            System.out.println("请输入你的学号(十二位)");
            Scanner sc=new Scanner(System.in);
            String k=sc.nextLine();
            //   boolean flag=k.matches("[1-2][0-9]{11}");
            boolean flag=k.matches("abc");

            System.out.println(flag);
        }
    }
}
