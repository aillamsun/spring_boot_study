package org.sung.spring4.enable;

import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * AspectJAutoProxyRegistart 实现了 ImportBeanDefinitionRegistrar 接口，
 * ImportBeanDefinitionRegistrar 的作用是在运行时自动添加Bean到已有的配置类 通过重写方法registerBeanDefinitions()
 * <p>
 * Created by sungang on 2016/12/12.
 */
public class AspectJAutoProxyRegistart implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        AopConfigUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(registry);

//        AnnotationAttributes enableAJAutoProxy =
//                AnnotationConfigUtils.attrbutesFor(annotationMetadata, EnableAspectJAutoProxy.class);
//        if (enableAJAutoProxy.getBoolean("proxyTargetClass")) {
//            AopConfigUtils.forceAutoProxyCreatorToUseClassProxying(registry);
//        }
    }
}
