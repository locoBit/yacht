import strategies.*;

enum YachtCategory {

    YACHT(new YachtStrategy()),
    ONES(new OnesStrategy()),
    TWOS(new TwosStrategy()),
    THREES(new ThreesStrategy()),
    FOURS(new FoursStrategy()),
    FIVES(new FivesStrategy()),
    SIXES(new SixesStrategy()),
    FULL_HOUSE(new FullHouseStrategy()),
    FOUR_OF_A_KIND(new FourOfAKindStrategy()),
    LITTLE_STRAIGHT(new LittleStraightStrategy()),
    BIG_STRAIGHT(new BigStraightStrategy()),
    CHOICE(new ChoiceStrategy());

    private ScoreStrategy scoreStrategy;

    YachtCategory(ScoreStrategy scoreStrategy) {
        this.scoreStrategy = scoreStrategy;
    }

    public ScoreStrategy getScoreStrategy() {
        return this.scoreStrategy;
    }
}