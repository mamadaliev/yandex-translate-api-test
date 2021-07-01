package demo;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class YandexTranslatorTest {

    @Test
    public void test() throws IOException {
        YandexTranslator yandexTranslator = new YandexTranslator();
        assertEquals("Привет, Мир!", yandexTranslator.translate("Hello, World!", "en", "ru"));
    }
}
