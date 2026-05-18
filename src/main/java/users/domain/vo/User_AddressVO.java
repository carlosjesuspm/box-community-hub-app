package users.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User_AddressVO {

    @NotNull
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String zip;
    @NotNull
    private String country;


}
