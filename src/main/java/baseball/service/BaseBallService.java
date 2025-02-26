package baseball.service;

import baseball.domain.Numbers;
import baseball.enums.Result;
import java.util.*;
import java.util.Map;


public class BaseBallService {

    public Map<Result, Integer> judgeBaseBall(Numbers computer, Numbers input) {
        Map<Result, Integer> results = new HashMap<>();
        int strike = judgeStrike(computer, input);
        int ball = judgeBall(computer, input);
        if (strike == 0 && ball == 0) {
            results.put(Result.NOTHING, 1);
            return results;
        }
        results.put(Result.STRIKE, strike);
        results.put(Result.BALL, ball);
        return results;
    }

    private int judgeStrike(Numbers computer, Numbers input) {
        int strike = 0;
        if (computer.getFirst() == input.getFirst()) {
            strike++;
        } if (computer.getSecond() == input.getSecond()) {
            strike++;
        } if (computer.getThird() == input.getThird()) {
            strike++;
        }
        return strike;
    }

    private int judgeBall(Numbers computer, Numbers input) {
        int ball = 0;
        if (input.getFirst() == computer.getSecond() || input.getFirst() == computer.getThird()) {
            ball++;
        } if (input.getSecond() == computer.getFirst() || input.getSecond() == computer.getThird()) {
            ball++;
        } if (input.getThird() == computer.getSecond() || input.getThird() == computer.getFirst()) {
            ball++;
        }
        return ball;
    }
}
