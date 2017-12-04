package P13_Create_Custom_Class_Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IAnnotation {
    String Author() default "Pesho";
    int Revision() default 3;
    String Description() default "Used for Java OOP Advanced course - Enumerations and Annotations.";
    String Reviewers() default "Pesho, Svetlio";
 }
