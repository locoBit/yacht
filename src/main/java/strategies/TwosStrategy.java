package strategies;

import java.util.Arrays;

public class TwosStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).filter(dice -> dice == 2).sum();
    }
}