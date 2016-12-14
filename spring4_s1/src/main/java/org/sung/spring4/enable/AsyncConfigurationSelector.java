package org.sung.spring4.enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.scheduling.annotation.ProxyAsyncConfiguration;

/**
 * AsyncConfigurationSelector 通过条件筛选需要导入的配置类
 * AsyncConfigurationSelector 的跟接口为ImportSelector 这个接口需要重写selectImports方法，在此方法内进行事先条件判断。
 * <p>
 * 此列中  若 adviceMode 为PORXY 则返回 ProxyAsyncConfiguration
 * Created by sungang on 2016/12/12.
 */
public class AsyncConfigurationSelector extends AdviceModeImportSelector<EnableAsync> {

    private static final String ASYNX_EXECUTION_ASPECT_CONFIGURSTION_CLASS_NAME = "org.springframework.scheduling.aspectj.AspectJAsyncConfiguration";

    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{ProxyAsyncConfiguration.class.getName()};
            case ASPECTJ:
                return new String[]{ASYNX_EXECUTION_ASPECT_CONFIGURSTION_CLASS_NAME};
            default:
                return null;
        }
    }
}
