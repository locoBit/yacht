package strategies;

import java.util.Arrays;

public class BigStraightStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        Arrays.sort(dices);

        if (
            dices[0] == 2 &&
            dices[1] == 3 &&
            dices[2] == 4 &&
            dices[3] == 5 &&
            dices[4] == 6
        ) {
            return 30;
        }

        return 0;
    }
}