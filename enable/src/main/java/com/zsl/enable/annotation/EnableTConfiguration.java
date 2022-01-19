package com.zsl.enable.annotation;

import com.zsl.enable.config.ImportConfigure;
import com.zsl.enablet.config.EnableConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Import(EnableConfiguration.class)
@Import(ImportConfigure.class)  // 通过 设置 ImportSelector 类，来统一获取配置
public @interface EnableTConfiguration {
}
