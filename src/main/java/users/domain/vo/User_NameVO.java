package users.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User_NameVO {

    @NotNull (message= "This field name cannot be blank")
    private String name;
    @NotNull(message= "This field firstName cannot be blank")
    private String firstName;

    private String lastName;


}
