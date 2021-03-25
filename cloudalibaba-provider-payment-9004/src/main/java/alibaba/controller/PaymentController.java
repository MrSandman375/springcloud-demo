package alibaba.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author Fan
 * @Date 2020/8/12
 * @Description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"fa1d587d-35cf-43a3-b7d7-77f1012157ac"));
        hashMap.put(2L,new Payment(2L,"dc37dbf4-7fa9-4c18-9ceb-f2a24d1b29e7"));
        hashMap.put(3L,new Payment(3L,"77a8f6cf-c4a6-4a8e-8663-77e3107fde8d"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort: "+serverPort,payment);
        return result;
    }
}
