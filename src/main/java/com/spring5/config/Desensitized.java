package com.spring5.config;

import com.spring5.common.SensitiveTypeEnum;

import java.lang.annotation.*;

/**
 * @author chenxl
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Desensitized {
    //    脱敏类型(规则)
    SensitiveTypeEnum type();
}
