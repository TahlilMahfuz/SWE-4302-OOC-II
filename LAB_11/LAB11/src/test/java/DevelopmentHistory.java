import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DevelopmentHistory {
    int version() default 1;
    String developer();
    String tester() default "";
}
