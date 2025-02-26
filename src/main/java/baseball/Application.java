package baseball;

import baseball.controller.BaseBallController;
import baseball.service.BaseBallService;
import baseball.utils.InputParser;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        InputParser inputParser = new InputParser();
        BaseBallService baseBallService = new BaseBallService();
        BaseBallController baseBallController = new BaseBallController(inputView, outputView, inputParser, baseBallService);

        baseBallController.run();
    }
}
