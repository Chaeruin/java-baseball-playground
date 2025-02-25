package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputParser {

    public List<Integer> parseIntegerList(String input) {
        String[] strInput = input.split("");
        List<Integer> numbers = new ArrayList<>();
        for (String element : strInput) {
            if (InputValidator.isOkParseToIntAndSplit(input)) {
                numbers.add(Integer.parseInt(element));
            }
        }
        return numbers;
    }

    public List<Integer> parseOperatorList(String input) {
        String[] strInput = input.split("");
        List<Integer> operators = new ArrayList<>();
        for (String element : strInput) {
            if (InputValidator.isOperator(element)) {
                operators.add(Integer.parseInt(element));
            }
        }
        return operators;
    }

}
