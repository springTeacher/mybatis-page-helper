####1.引入tk.mybatis自定生成代码


###1.引入依赖：
```
  <!-- 访问数据库组件 -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.1</version>
        </dependency>
        <!--数据库连接池-->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.10</version>
        </dependency>
        <!-- mysql驱动 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.16</version>
        </dependency>
        <!--mapper-->
        <dependency>
            <groupId>tk.mybatis</groupId>
            <artifactId>mapper-spring-boot-starter</artifactId>
            <version>2.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.mybatis.generator</groupId>
            <artifactId>mybatis-generator-core</artifactId>
            <version>1.3.7</version>
        </dependency>
        <dependency>
            <groupId>tk.mybatis</groupId>
            <artifactId>mapper-generator</artifactId>
            <version>1.1.2</version>
        </dependency>
```
###2.test/resources下新建generationConfig.xml配置文件

###3.test/java下新建GeneratorMybatisTest测试类；

###4.配置连接数据库，包名，表，执行测试类就可以生成代码。



####2.引入pageHelper物理分页

```
1.引入PageHelper 分页插件依赖：

    <!--PageHelper 分页插件-->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>1.2.5</version>
        </dependency>
2.封装返回对象，包含数据list和总条数；
@Data
@Builder
public class AdManagementVO implements Serializable {
    private static final long serialVersionUID = 362199455271562386L;

    /**
     * 记录列表
     */
    private List<AdManagement> list;

    /**
     * 总记录数
     */
    private Long total;

}

3.
    @GetMapping("/list")
    public AdManagementVO selectByPage(@RequestParam Integer pageIndex,
                                       @RequestParam Integer pageSize){
        //pageHelper物理分页
        PageHelper.startPage(pageIndex, pageSize);
        List<AdManagement> adManagementList = adManagementService.queryAdList();
        PageInfo<AdManagement> pageInfo = new PageInfo<>(adManagementList);
        return AdManagementVO.builder().list(pageInfo.getList())
                .total(pageInfo.getTotal()).build();
    }
```

####3.引入批量插入

```
Mapper接口传一个list，

 <!--批量插入-->
  <insert id="insertBatch" parameterType="list">
    insert into ad_management
    (code_name, code_id, source)
    values
    <foreach collection ="list" item="adManagement" index="index" separator =",">
      (#{adManagement.codeName}, #{adManagement.codeId}, #{adManagement.source})
    </foreach >
  </insert>
```



