package cn.itexplorer.demo.controller;

import cn.itexplorer.demo.bean.DemoBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>Title: DemoController</p>
 * <p>Describe: 用于演示的Controller类</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email 1297321709@qq.com
 * @date 2017/2/10 14:51
 */

@RestController
public class DemoController {

    /**
     * 返回DemoBean对象
     * 注意，如果不使用FastJson处理，SpringBoot也会自动为我们把对象处理成JSON格式
     * @return
     */
    @RequestMapping("/getDemoBean")
    public DemoBean getDemoBean(){
        DemoBean demoBean = new DemoBean();
        demoBean.setId(1);
        demoBean.setName("Pomelo");
        demoBean.setCreateDate(new Date());
        demoBean.setFormatCreateDate(new Date());
        return demoBean;
    }

}
