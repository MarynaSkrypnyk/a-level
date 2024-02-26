package hw_spring.Annotation;

import hw_spring.Annotation.Repository;
import org.springframework.stereotype.Component;

@Component
public class Repo1 implements Repository {
    @Override
    public String toString() {
        return "repo1";
    }
}
