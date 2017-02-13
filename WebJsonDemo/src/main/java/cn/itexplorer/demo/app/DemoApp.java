package cn.itexplorer.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Title: DemoApp</p>
 * <p>Describe: 默认启动方式</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email 1297321709@qq.com
 * @date 2017/2/13 9:04
 */
@ComponentScan("cn.itexplorer.demo.controller")
@SpringBootApplication
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class,args);
    }
}
