package cn.ww.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("cn.ww.mapper")
@EnableTransactionManagement //启用事务管理
public class MyBatisPlusConfig {


}
