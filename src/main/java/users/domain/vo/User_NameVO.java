package users.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Name {

    private String name;
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
    }

}
