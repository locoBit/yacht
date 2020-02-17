package strategies;

import java.util.Arrays;

public class SixesStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).filter(dice -> dice == 6).sum();
    }
}