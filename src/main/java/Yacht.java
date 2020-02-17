class Yacht {

    private int[] dices;
    private YachtCategory yachtCategory;

    Yacht(int[] dices, YachtCategory yachtCategory) {
        this.dices = dices;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        return yachtCategory.getScoreStrategy().calculate(dices);
    }

}
