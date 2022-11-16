package sec15.exam01_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
//Annotation의 적용 범위
//(CLASS, ANNOTATION_TYPE, FIELD, CONSTRUCTOR, METHOD, LOCAL_VARIABLE, PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
//SOURCE, CLASS, RUNTIME
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
