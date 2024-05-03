package day;

public class demo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            thread.threadPoolExecutor.submit(new threadinstance());
            System.out.println(i);
        }
    }
}
