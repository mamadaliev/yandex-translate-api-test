package demo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class TranslateRequest {
    private String folderId;
    private List<String> texts;
    private String targetLanguageCode;

    public TranslateRequest(String folderId, List<String> texts, String targetLanguageCode) {
        this.folderId = folderId;
        this.texts = texts;
        this.targetLanguageCode = targetLanguageCode;
    }
}
