package sec13.ch02.ex02;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited // ⭐
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritT { }
