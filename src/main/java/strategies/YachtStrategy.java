package strategies;

import java.util.Arrays;

public class YachtStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        Arrays.sort(dices);

        int firstValue = dices[0];

        Long firstValueTotal = Arrays.stream(dices).filter(dice -> dice == firstValue).count();

        if (firstValueTotal == 5) {
            return 50;
        }

        return 0;
    }
}