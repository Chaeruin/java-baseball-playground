package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("문자열 1,2 를 , 로 split 했을 때 분리 확인")
    @Test
    void testcase1() {
        String[] splits = "1,2".split(",");
        assertThat(splits).contains("1");
        assertThat(splits).contains("2");
        assertThat(splits).containsExactly("1", "2");
    }


    @DisplayName("문자열 (1,2) 값이 주어졌을 때 () 제거 후 반환 확인")
    @Test
    void testcase2() {
        String result = "(1,2)".substring(1,4);
        assertThat(result).isEqualTo("1,2");
    }
}
