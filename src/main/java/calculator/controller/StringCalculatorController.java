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

    void run() {
        String input = inputView.getInput();
        int result = 0;


    }


}
