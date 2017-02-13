package cn.itexplorer.demo.app;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * <p>Title: DemoApp1</p>
 * <p>Describe: 第一种启动FastJson的方式</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email 1297321709@qq.com
 * @date 2017/2/13 9:05
 */

/**
 * 继承WebMvcConfigurerAdapter类
 */
@ComponentScan("cn.itexplorer.demo.controller")
@SpringBootApplication
public class DemoApp1 extends WebMvcConfigurerAdapter{

    /**
     * 重写 configureMessageConverters(List<HttpMessageConverter<?>> converters)方法
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        /**
         * 定义一个消息转换对象
         */
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        /**
         * 实例化FastJsonConfig对象
         */
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        /**
         * 添加 fastJson 的配置信息，比如：是否要格式化返回的json数据
         */
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        /**
         * 在converter中添加配置信息
         */
        converter.setFastJsonConfig(fastJsonConfig);
        /**
         * 将converter添加到方法参数的converters当中
         */
        converters.add(converter);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp1.class,args);
    }
}
