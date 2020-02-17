package strategies;

import java.util.Arrays;

public class ThreesStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).filter(dice -> dice == 3).sum();
    }
}