package strategypattern.problem;


public class Chess {

    private Difficulty difficulty = Difficulty.EASY;

    public int calculateNextStep(){
        /**
         * here the problem is that we switch algorithms using if conditions
         * as life goes more complex this won't be good design
         * a good solution could be  the strategy design pattern
         */
        
        if(difficulty == Difficulty.EASY){
            return 1;
        }

        if(difficulty == Difficulty.MEDIUM){
            return 2;
        }

        if(difficulty == Difficulty.HARD){
            return 3;
        }
        return 0;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
