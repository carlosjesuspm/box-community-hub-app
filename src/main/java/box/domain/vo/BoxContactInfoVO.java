package box.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Box_ContactInfoVO {

    @NotNull
    private final String boxName;
    @NotNull
    private final String boxNif;
    @NotNull
    private String boxPhone;
    @NotNull
    private String boxEmail;

}
