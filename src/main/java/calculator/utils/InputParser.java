package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputParser {

    public List<Integer> parseIntegerList(String input) {
        List<Integer> parseList = new ArrayList<>();
        if (InputValidator.isOkToParseAndSplit(input)) {
            parseList = Arrays.stream(input.split(","))
                    .map(Integer::parseInt) // Integer 변환
                    .collect(Collectors.toList()); // 리스트로 변환
        }
        return parseList;
    }
}
