package com.xiaoniu.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * 数据库连接配置
 *
 * @author lihoujing
 * @date 2019/11/5 18:11
 */
@Configuration
@MapperScan(basePackages = MysqlDatasourceConfig.PACKAGE)
public class MysqlDatasourceConfig {


    /**
     * mysqldao扫描路径
     */
    public static final String PACKAGE = "com.xiaoniu.mapper";
    /**
     * mybatis mapper扫描路径
     */
    private static final String MAPPER_LOCATION = "classpath*:/mapper/**/*.xml";

    @Bean
    public DataSource mysqlDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDbType("com.alibaba.druid.pool.DruidDataSource");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/user_login?useSSL=false&serverTimezone=Hongkong&characterEncoding=utf-8&autoReconnect=true");
        return druidDataSource;
    }

    @Bean
    public DataSourceTransactionManager mysqlTransactionManager() {
        return new DataSourceTransactionManager(mysqlDataSource());
    }

    @Bean
    public SqlSessionFactory mysqlSqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(mysqlDataSource());
        //如果不使用xml的方式配置mapper，则可以省去下面这行mapper location的配置。
        sessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources(MysqlDatasourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
