package baseball.service;

import baseball.domain.Numbers;
import baseball.enums.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaseBallService {

    public List<Result> judgeBaseBall(Numbers computer, Numbers input) {
        List<Result> results = new ArrayList<>();
        int strike = judgeStrike(computer, input);
        int ball = judgeBall(computer, input);
        if (strike == 0 && ball == 0) {
            results.add(Result.NOTHING);
            return results;
        }

        results.addAll(IntStream.range(0, strike).mapToObj(i -> Result.STRIKE).collect(Collectors.toList()));
        results.addAll(IntStream.range(0, ball).mapToObj(i -> Result.BALL).collect(Collectors.toList()));

        return results;
    }

    private int judgeStrike(Numbers computer, Numbers input) {
        return 0;
    }

    private int judgeBall(Numbers computer, Numbers input) {
        return 0;
    }
}
