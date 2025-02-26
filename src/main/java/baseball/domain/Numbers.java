package baseball.domain;

import java.util.*;

public class Numbers {

    private int first;
    private int second;
    private int third;



    public Numbers(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setRandomNumbers() {
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 3) {
            uniqueNumbers.add(random.nextInt(9) + 1);
        }

        Integer[] nums = uniqueNumbers.toArray(new Integer[0]);
        this.first = nums[0];
        this.second = nums[1];
        this.third = nums[2];
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }
}

