import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        String reserve = stringBuilder.reverse().toString();
        if (reserve.equals(s)){
            System.out.printf("true");
            return;
        }
        System.out.printf("false");
        return;
    }
}
