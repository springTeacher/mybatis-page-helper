import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratorMybatisTest {

    @Test
    public void myBatisGenerator() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        try {
            Configuration config = cp.parseConfiguration(inputStream);
            DefaultShellCallback callBack = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callBack, warnings);
            myBatisGenerator.generate(null);
            for (String warning : warnings) {
                System.out.println(warning);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}