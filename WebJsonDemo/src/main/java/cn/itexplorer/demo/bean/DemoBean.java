package cn.itexplorer.demo.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * <p>Title: DemoBean</p>
 * <p>Describe: 演示Bean</p>
 *
 * @author Pomelo
 * @version 1.0
 * @email 1297321709@qq.com
 * @date 2017/2/10 17:46
 */
public class DemoBean {
    private Integer id;
    private String name;

    /**
     * 普通的时间
     */
    private Date createDate;

    /**
     * 使用FastJson中的注解格式化JSON数据
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date formatCreateDate;

    public Date getFormatCreateDate() {
        return formatCreateDate;
    }

    public void setFormatCreateDate(Date formatCreateDate) {
        this.formatCreateDate = formatCreateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
