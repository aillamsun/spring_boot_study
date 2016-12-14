package org.sung.spring4.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by sungang on 2016/12/12.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {


    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }


    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }


    public void outputResult() {
        System.out.println("Bean 名称为:" + beanName);
        Resource resource = loader.getResource("classpath:org/sung/spring4/aware/test.txt");
        try {
            System.out.println("ResourceLoader 加载的文件内容为:" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
