package strategies;

import java.util.Arrays;

public class FourOfAKindStrategy implements ScoreStrategy {

    @Override
    public int calculate(int[] dices) {
        Arrays.sort(dices);

        int firstValue = dices[0];
        int lastValue = dices[4];

        Long firstValueTotal = Arrays.stream(dices).filter(dice -> dice == firstValue).count();
        Long lastValueTotal = Arrays.stream(dices).filter(dice -> dice == lastValue).count();

        if (firstValueTotal == 1 && lastValueTotal == 4) {
            return Arrays.stream(dices).filter(dice -> dice == lastValue).sum();
        } else if (firstValueTotal == 4 && lastValueTotal == 1) {
            return Arrays.stream(dices).filter(dice -> dice == firstValue).sum();
        } else if (lastValueTotal == 5) {
            return 4 * lastValue;
        }

        return 0;
    }
}