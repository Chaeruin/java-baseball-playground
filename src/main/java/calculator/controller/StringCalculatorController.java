package calculator.controller;

import calculator.service.CalculatorService;
import calculator.utils.InputParser;
import calculator.utils.InputValidator;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class StringCalculatorController {
    final InputView inputView;
    final OutputView outputView;
    final InputParser inputParser;
    final CalculatorService calculatorService;

    public StringCalculatorController(InputView inputView, OutputView outputView, InputParser inputParser, CalculatorService calculatorService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.inputParser = inputParser;
        this.calculatorService = calculatorService;
    }

    public void run() {
        String input = inputView.getInput();
        List<Integer> integers = inputParser.parseIntegerList(input);
        List<String> operators = inputParser.parseOperatorList(input);

        int result = calculate(integers, operators);
        outputView.printResult(result);
    }

    int calculate(List<Integer> integers, List<String> operators) {
        int result = integers.get(0);
        int idx = 0;
        for (int i = 1; i < integers.size(); i++) {
            if (operators.get(idx).equals("+")) {
                result = calculatorService.addNum(result, integers.get(i));
            }
            if (operators.get(idx).equals("-")) {
                result = calculatorService.minusNum(result, integers.get(i));
            }
            if (operators.get(idx).equals("*")) {
                result = calculatorService.multNum(result, integers.get(i));
            }
            if (operators.get(idx).equals("/")) {
                result = calculatorService.divNum(result, integers.get(i));
            }
            idx++;
        }
        return result;
    }

}
