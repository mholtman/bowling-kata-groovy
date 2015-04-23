/**
 * Created by mholtman on 4/23/15.
 */
class BowlingGame {

    private int score = 0;

    def void rollFrame(int rollOne, int rollTwo)
    {
        score += rollOne
        score += rollTwo
    }

    def int getScore() {
        return score
    }
}
