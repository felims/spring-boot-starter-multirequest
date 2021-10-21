package io.github.felims.annotation;

import io.github.felims.config.MultiRequestBodyConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 启动 MultiRequestBody 标签
 *
 * @author allen
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Configuration
@Import(MultiRequestBodyConfigurer.class)
public @interface EnableMultiRequestBody {
}
