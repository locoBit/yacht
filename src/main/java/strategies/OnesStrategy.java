package strategies;

import java.util.Arrays;

public class OnesStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).filter(dice -> dice == 1).sum();
    }
}