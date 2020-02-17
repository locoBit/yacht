package strategies;

import java.util.Arrays;

public class FoursStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).filter(dice -> dice == 4).sum();
    }
}