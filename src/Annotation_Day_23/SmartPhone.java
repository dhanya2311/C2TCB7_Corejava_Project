package Annotation_Day_23;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
	
	
		String os() default "Symbian";
		int version() default 1;	
	}