package cn.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author laowang
 * @date 2018/11/29 10:37 AM
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer     // eureka注册中心
public class EurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class,args);
    }
}
