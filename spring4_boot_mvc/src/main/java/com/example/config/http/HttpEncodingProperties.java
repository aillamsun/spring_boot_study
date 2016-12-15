package com.example.config.http;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 *
 * Created by sungang on 2016/12/15.
 */
@ConfigurationProperties(prefix = "spring.http.encoding")//1
public class HttpEncodingProperties {

    /**
     * default Http Encoding charset
     */
    public static final Charset DEFAUTL_CHARSET = Charset.forName("UTF-8");
    private Charset charset = DEFAUTL_CHARSET;

    private boolean force = true;//


    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }


    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
