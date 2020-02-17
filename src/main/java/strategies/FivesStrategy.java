package strategies;

import java.util.Arrays;

public class FivesStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).filter(dice -> dice == 5).sum();
    }
}