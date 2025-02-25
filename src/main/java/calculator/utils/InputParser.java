package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputParser {

    public List<Integer> parseIntegerList(String input) {
        String[] strInput = input.split("");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < strInput.length; i+=2) {
            if (InputValidator.isOkParseToIntAndSplit(input)) {
                numbers.add(Integer.parseInt(strInput[i]));
            }
        }
        return numbers;
    }

    public List<String> parseOperatorList(String input) {
        String[] strInput = input.split("");
        List<String> operators = new ArrayList<>();
        for (int i = 1; i < strInput.length; i+=2) {
            if (InputValidator.isOperator(input)) {
                operators.add(strInput[i]);
            }
        }
        return operators;
    }

}
