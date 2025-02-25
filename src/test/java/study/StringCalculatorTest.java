package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @DisplayName("문자 split 제대로 안됨 / 문자 parseInt 제대로 안됨")
    @Test
    void parseIntTest() {
        String[] str = "1 j 4 2 s".split(" ");
        assertThatThrownBy(() -> {
            Integer.parseInt(str[1]);
        }).isInstanceOf(NumberFormatException.class);

        assertThatThrownBy(() -> {
            Integer.parseInt(str[4]);
        }).isInstanceOf(NumberFormatException.class);

        assertThat(Integer.parseInt(str[0])).isEqualTo(1);
        assertThat(Integer.parseInt(str[2])).isEqualTo(4);
        assertThat(Integer.parseInt(str[3])).isEqualTo(2);
    }
}
