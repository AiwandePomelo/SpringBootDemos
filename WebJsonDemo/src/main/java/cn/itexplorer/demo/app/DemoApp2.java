package cn.itexplorer.demo.app;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * <p>Title: DemoApp2</p>
 * <p>Describe: 第二种启动FastJson的方式</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email 1297321709@qq.com
 * @date 2017/2/13 9:07
 */
@ComponentScan("cn.itexplorer.demo.controller")
@SpringBootApplication
public class DemoApp2 {

    /**
     * 通过 @Bean 注入 fastJsonHttpMessageConverters
     * @return
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        /**
         * 创建converter对象
         */
        FastJsonHttpMessageConverter convert = new FastJsonHttpMessageConverter();
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
        convert.setFastJsonConfig(fastJsonConfig);
        /**
         * 实例化HttpMessageConverter并将convert赋值给converter
         */
        HttpMessageConverter<?> converter = convert;
        /**
         * 最后返回HttpMessageConverters对象，并传入converter
         */
        return new HttpMessageConverters(converter);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp2.class,args);
    }

}
