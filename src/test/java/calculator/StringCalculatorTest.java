package calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import calculator.service.CalculatorService;
import calculator.utils.InputParser;
import calculator.utils.InputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    InputParser inputParser = new InputParser();
    CalculatorService calculatorService = new CalculatorService();

    @DisplayName("문자 split 제대로 안됨 / 문자 parseInt 제대로 안됨")
    @Test
    void validIntTest() {
        String str = "1+ 2-4";
        assertThatThrownBy(() -> {
            InputValidator.isOkParseToIntAndSplit(str);
        }).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> {
            InputValidator.isOperator(str);
        }).isInstanceOf(IllegalArgumentException.class);
    }


    @DisplayName("문자열 계산 입력 List 파싱 테스트")
    @Test
    void parseIntOperatorTest() {
        String input = "2*3/4-5";
        assertThat(inputParser.parseIntegerList(input).size()).isEqualTo(4);
        assertThat(inputParser.parseIntegerList(input)).contains(4);

        assertThat(inputParser.parseOperatorList(input).size()).isEqualTo(3);
        assertThat(inputParser.parseOperatorList(input)).contains("/");
    }

    @DisplayName("사칙연산 테스트")
    @Test
    void calculateTest() {
        int firstNum = 5;
        int secondNum = 3;

        assertThat(calculatorService.addNum(5, 3)).isEqualTo(8);
        assertThat(calculatorService.minusNum(5, 3)).isEqualTo(2);
        assertThat(calculatorService.multNum(5, 3)).isEqualTo(15);
        assertThat(calculatorService.divNum(5, 3)).isEqualTo(1);
    }

}
