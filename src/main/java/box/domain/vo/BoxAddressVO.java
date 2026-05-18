package box.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoxAddressVO {

    @NotNull
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String zip;
    @NotNull
    private String country;


}
