import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD})
public @interface DevelopmentHistoryWithReviewer {
    DevelopmentHistory developmentHistory();
    String[] reviewers();
}
