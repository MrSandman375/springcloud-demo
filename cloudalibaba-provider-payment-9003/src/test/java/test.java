import java.util.UUID;

/**
 * @Author Fan
 * @Date 2020/8/12
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        for (int i = 0;i < 3; i++){
            String sample = UUID.randomUUID().toString();
            System.out.println(sample);
        }
    }
}
