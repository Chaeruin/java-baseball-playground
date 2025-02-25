package calculator;

import calculator.controller.StringCalculatorController;
import calculator.service.CalculatorService;
import calculator.utils.InputParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        InputParser inputParser = new InputParser();
        CalculatorService calculatorService = new CalculatorService();
        StringCalculatorController stringCalculatorController = new StringCalculatorController(inputView, outputView, inputParser, calculatorService);

        stringCalculatorController.run();

    }
}
