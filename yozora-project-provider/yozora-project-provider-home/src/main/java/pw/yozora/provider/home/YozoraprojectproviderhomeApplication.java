package pw.yozora.provider.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：启动类
 *
 * @author ChenJianChuan
 * @date time
 */
@EnableEurekaClient
@SpringBootApplication
public class YozoraprojectproviderhomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(YozoraprojectproviderhomeApplication.class, args);
    }
}
