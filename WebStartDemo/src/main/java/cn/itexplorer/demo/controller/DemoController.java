package cn.itexplorer.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: DemoController</p>
 * <p>Describe: 用于演示的Controller类</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email 1297321709@qq.com
 * @date 2017/2/10 14:51
 */

/**
 * 使用RestController注解声明为Controller类
 */
@RestController
public class DemoController {
    /**
     * 用于演示的方法
     * @return
     */
    //使用 @RequestMapping注解声明访问路径
    @RequestMapping("/hello")
    public String sayHello(){
        //向浏览器返回的数据
        return "Hello StrpingBoot";
    }
}
