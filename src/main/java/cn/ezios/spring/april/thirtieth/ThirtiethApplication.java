package cn.ezios.spring.april.thirtieth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.ezios.spring.april.thirtieth.dao")
@SpringBootApplication
public class ThirtiethApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirtiethApplication.class, args);
    }

}
