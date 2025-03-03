package baseball;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.utils.InputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseBallTest {



    @DisplayName("숫자가 아닌 입력 예외")
    @Test
    void notNumberException() {
        String input = "1-2";
        assertThatThrownBy(() -> {
            InputValidator.isNumeric(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("3자리 숫자가 아닌 입력 예외")
    @Test
    void not3NumberException() {
        String input = "1324";

    }
}
