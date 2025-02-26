package baseball.domain;

import java.util.Random;

public class Numbers {

    private int first;
    private int second;
    private int third;

    Random random = new Random();

    public Numbers(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setRandomNumbers() {
        first = random.nextInt(9) + 1;
        second = random.nextInt(9) + 1;
        third = random.nextInt(9) + 1;
    }
}
