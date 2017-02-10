package cn.itexplorer.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Title: xx</p>
 * <p>Describe: xxx</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email zhangyy@minstone.com.cn
 * @date 2017/2/10 15:01
 */

/**
 * 使用@SpringBootApplication注解声明为SpringBoot应用
 * 使用@ComponentScan注解声明需要扫描的包
 */
@SpringBootApplication
@ComponentScan("cn.itexplorer.demo.controller")
public class DemoApp {

    /**
     * 使用Main方法运行
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 使用SpringApplication中的run方法启动SpringBoot
         */
        SpringApplication.run(DemoApp.class,args);
    }
}
