package box.domain.vo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoxContactInfoVO {

    @NotNull
    private final String boxName;

    @NotNull
    @NotBlank(message="El CIF es obligatorio")
    @Pattern(
            regexp = "^[ABCDEFGHJKLMNPQRSUVWabcdefghjklmnpqrsuvw]\\d{7}[0-9A-Ja-j]$",
            message = "El formato del CIF no es válido"
    )
    private final String boxCif;

    @NotNull
    @NotBlank(message="El teléfono es obligatorio")
    private String boxPhone;

    @NotNull
    @NotBlank(message="El email es obligatorio")
    private String boxEmail;

}
