package anian.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class MyDataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }
    // 后台监控
    @Bean
    public ServletRegistrationBean sateViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");

        // 后台需要人进行登录
        HashMap<String,String> initParameters = new HashMap<>();
        // 增加配置
        initParameters.put("loginUsername","admin"); // 登录的key 是固定的
        initParameters.put("loginPassword","123456");

        // 允许谁访问 (value为空，则都可以访问)
        initParameters.put("allow","");
        bean.setInitParameters(initParameters);// 设置初始化参数
        return bean;
    }
}