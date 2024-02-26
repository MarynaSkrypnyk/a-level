package hw_spring.Annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final Repository repository;

    public UserService(@Qualifier("repo2") Repository repository) {
        this.repository = repository;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "repository=" + repository +
                '}';
    }
}
