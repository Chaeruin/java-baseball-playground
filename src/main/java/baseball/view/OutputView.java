package baseball.view;

import baseball.enums.Result;
import java.util.Map;
import java.util.Map.Entry;

public class OutputView {

    public void printResult(Map<Result, Integer> results) {
        for (Entry<Result, Integer> entry : results.entrySet()) {
            threeStrike(entry);
            strike(entry);
            ball(entry);
            nothing(entry);
        }
        System.out.println();
    }

    private void nothing(Entry<Result, Integer> entry) {
        if (entry.getKey() == Result.NOTHING) {
            System.out.println("낫싱");
        }
    }

    private void ball(Entry<Result, Integer> entry) {
        if (entry.getKey() == Result.BALL) {
            System.out.println(entry.getValue() + "볼 ");
        }
    }

    private void strike(Entry<Result, Integer> entry) {
        if (entry.getKey() == Result.STRIKE && entry.getValue() != 3) {
            System.out.println(entry.getValue() + "스트라이크 ");
        }
    }

    public void threeStrike(Entry<Result, Integer> entry) {
        if (entry.getKey() == Result.STRIKE && entry.getValue() == 3) {
            System.out.println("3스트라이크");
            System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }
}
