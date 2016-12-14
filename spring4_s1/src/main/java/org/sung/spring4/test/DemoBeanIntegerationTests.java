package org.sung.spring4.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @1 SpringJUnit4ClassRunner在junit环境下提供Spring TestContext Framework的功能
 * @2 @ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类
 * @3 @ActiveProfiles用来声明获得Profile
 * <p>
 * Created by sungang on 2016/12/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)//1
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegerationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }


}
