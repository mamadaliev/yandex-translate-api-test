package demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TranslationDto implements Serializable {

    @JsonProperty("text")
    private String text;

    @JsonProperty("detectedLanguageCode")
    private String detectedLanguageCode;
}
