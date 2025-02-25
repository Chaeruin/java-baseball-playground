package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void testcase1() {
        String[] splits = "1,2".split(",");
        assertThat(splits).contains("1");
        assertThat(splits).contains("2");
        assertThat(splits).containsExactly("1", "2");
    }
}
