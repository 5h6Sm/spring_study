package study.thymeleaf;

import lombok.*;

import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
//@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Author implements Serializable {
    private String name;
}

