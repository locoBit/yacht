package strategies;

import java.util.Arrays;

public class ChoiceStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        return Arrays.stream(dices).sum();
    }
}