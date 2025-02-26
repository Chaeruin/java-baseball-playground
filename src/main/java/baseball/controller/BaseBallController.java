package baseball.controller;

import baseball.domain.Numbers;
import baseball.enums.Result;
import baseball.service.BaseBallService;
import baseball.utils.InputParser;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Map;

public class BaseBallController {
    final InputView inputView;
    final OutputView outputView;
    final InputParser inputParser;
    final BaseBallService baseBallService;

    public BaseBallController (InputView inputView, OutputView outputView, InputParser inputParser, BaseBallService baseBallService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.inputParser = inputParser;
        this.baseBallService = baseBallService;
    }

    public void run() {
        Numbers computer = new Numbers();
        while (true) {
            Numbers input = inputParser.parseNumbers(inputView.getNumbers());
            Map<Result, Integer> results = baseBallService.judgeBaseBall(computer, input);
            outputView.printResult(results);
            String restartStr = restartInput(results);
            if (restartStr == null) continue;
            if (restartStr.equals("2")) break;
            if (restartStr.equals("1")) computer = new Numbers();
        }
    }

    public String restartInput(Map<Result, Integer> results) {
        if (results.containsKey(Result.STRIKE) && results.get(Result.STRIKE) == 3) {
            return inputView.getRestart();
        }
        return null;
    }
}
