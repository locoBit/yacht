package strategies;

import java.util.Arrays;

public class FullHouseStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        Arrays.sort(dices);

        int firstValue = dices[0];
        int lastValue = dices[4];

        Long firstValueTotal = Arrays.stream(dices).filter(dice -> dice == firstValue).count();
        Long lastValueTotal = Arrays.stream(dices).filter(dice -> dice == lastValue).count();

        if (firstValueTotal == 2 && lastValueTotal == 3 || firstValueTotal == 3 && lastValueTotal == 2) {
            return Arrays.stream(dices).sum();
        }

        return 0;
    }
}