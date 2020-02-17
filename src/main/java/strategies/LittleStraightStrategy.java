package strategies;

import java.util.Arrays;

public class LittleStraightStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        Arrays.sort(dices);

        if (
            dices[0] == 1 &&
            dices[1] == 2 &&
            dices[2] == 3 &&
            dices[3] == 4 &&
            dices[4] == 5
        ) {
            return 30;
        }

        return 0;
    }
}