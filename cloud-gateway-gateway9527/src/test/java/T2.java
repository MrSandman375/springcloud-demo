import java.time.ZonedDateTime;

/**
 * @Auther: nothingToSay
 * @Date: 2020/7/19
 * @Description: 时间生成
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();//默认时区
        System.out.println("当前时间是"+zonedDateTime);
    }
}
