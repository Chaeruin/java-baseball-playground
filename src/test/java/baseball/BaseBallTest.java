package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.domain.Numbers;
import baseball.enums.Result;
import baseball.service.BaseBallService;
import baseball.utils.InputParser;
import baseball.utils.InputValidator;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseBallTest {

    InputParser inputParser = new InputParser();
    BaseBallService baseBallService = new BaseBallService();

    // EXCEPTION
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
        assertThatThrownBy(() -> {
            InputValidator.isThreeNumber(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("중복 숫자 입력 예외")
    @Test
    void duplicateNumberException() {
        String input = "144";
        assertThatThrownBy(() -> {
            InputValidator.isNotDuplicate(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("파싱이 잘 됨")
    @Test
    void psr() {
        String input = "145";
        int first = input.charAt(0) - '0';
        int second = input.charAt(1) - '0';
        int third = input.charAt(2) - '0';
        Numbers number = new Numbers(first, second, third);
        Numbers parsingNumber = inputParser.parseNumbers(input);
        assertThat(number.getFirst()).isEqualTo(parsingNumber.getFirst());
        assertThat(number.getSecond()).isEqualTo(parsingNumber.getSecond());
        assertThat(number.getThird()).isEqualTo(parsingNumber.getThird());
    }


    @DisplayName("낫싱 판단")
    @Test
    void nothingJudge() {
        Numbers number1 = new Numbers(1, 3, 5);
        Numbers number2 = new Numbers(6, 2, 4);
        Map<Result, Integer> result = baseBallService.judgeBaseBall(number1, number2);
        assertThat(result.get(Result.NOTHING)).isEqualTo(1);
    }

    @DisplayName("볼 판단")
    @Test
    void ballJudge() {
        Numbers number1 = new Numbers(1, 3, 5);
        Numbers number2 = new Numbers(3, 5, 1);
        Map<Result, Integer> result = baseBallService.judgeBaseBall(number1, number2);
        assertThat(result.get(Result.BALL)).isEqualTo(3);
    }

    @DisplayName("볼&스트라이크 동시 판단")
    @Test
    void ballStrikeJudge() {
        Numbers number1 = new Numbers(1, 3, 5);
        Numbers number2 = new Numbers(5, 3, 1);
        Map<Result, Integer> result = baseBallService.judgeBaseBall(number1, number2);
        assertThat(result.get(Result.BALL)).isEqualTo(2);
        assertThat(result.get(Result.STRIKE)).isEqualTo(1);
    }

    @DisplayName("3스트라이크 판단")
    @Test
    void strikeJudge() {
        Numbers number1 = new Numbers(1, 3, 5);
        Numbers number2 = new Numbers(1, 3, 5);
        Map<Result, Integer> result = baseBallService.judgeBaseBall(number1, number2);
        assertThat(result.get(Result.STRIKE)).isEqualTo(3);
    }
}
