package demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class TranslateResponse implements Serializable {

    @JsonProperty
    private List<TranslationDto> translations;

}
