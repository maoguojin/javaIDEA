import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.UUID;
import java.util.stream.LongStream;

public class yzm {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        Random random = new Random();
        LongStream longs = random.longs(6);
        long l = random.nextLong();
        System.out.println(l);
        System.out.println(longs.toString());
    }
}
