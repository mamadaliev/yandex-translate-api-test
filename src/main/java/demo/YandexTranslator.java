package demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo.dto.TranslateRequest;
import demo.dto.TranslateResponse;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

public class YandexTranslator {

    private final String YANDEX_TRANSLATE_API = "https://translate.api.cloud.yandex.net/translate/v2/translate";
    private final String FOLDER_ID = "";
    private final String BEARER_TOKEN = "";

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    public String translate(String text, String fromLang, String targetLang) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        RequestBody body = RequestBody
                .create(JSON, mapper.writeValueAsString(TranslateRequest.builder()
                        .folderId(FOLDER_ID)
                        .targetLanguageCode(targetLang)
                        .texts(List.of(text))
                .build()));

        Request request = new Request.Builder()
                .url(YANDEX_TRANSLATE_API)
                .addHeader("Authorization", "Bearer " + BEARER_TOKEN)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();

        TranslateResponse result = mapper.readValue(response.body().string(), TranslateResponse.class);
        return result.getTranslations().get(0).getText();
    }

//    public static void main(String[] args) throws IOException {
//        YandexTranslator x = new YandexTranslator();
//        System.out.println(x.translate("Hello, World!", "en", "ru"));
//    }
}
