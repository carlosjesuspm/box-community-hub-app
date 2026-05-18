package exercise.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Exercise_UnitVO {

    @NotNull
    private String unit;
}
