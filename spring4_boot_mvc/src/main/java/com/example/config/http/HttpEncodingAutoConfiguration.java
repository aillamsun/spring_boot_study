package com.example.config.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 配置http 编码过滤器  相当于 web.xml 配置一样
 * <p>
 *
 * @EnableConfigurationProperties 开启属性注入声明 使用@Autowired 注入
 * @ConditionalOnClass 定义当CharacterEncodingFilter在类路径的条件下
 *
 * 当设置spring.http.encoding=enabled 的情况下，如果没有设置则默认为true 即符合条件
 * 使用java 配置的方式配置 CharacterEncodingFilter 这个 Bean
 *
 * @ConditionalOnMissingBean 当容器中没有CharacterEncodingFilter这个 Bean 的时候新建 Bean
 *
 * Created by sungang on 2016/12/15.
 */

@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class) //1
@ConditionalOnClass(CharacterEncodingFilter.class)
@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
public class HttpEncodingAutoConfiguration {

    @Autowired
    private HttpEncodingProperties encodingProperties;

    /**
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)
    public CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding(this.encodingProperties.getCharset().name());
        filter.setForceEncoding(this.encodingProperties.isForce());
        return filter;
    }
}
