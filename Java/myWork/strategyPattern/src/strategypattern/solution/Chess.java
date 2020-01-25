package strategypattern.solution;



/**
 * 
 * @author abdullah-fadhel
 * the game class
 * has an algorithm instance (to be chosen and a signed at runtime)
 * it delegates calculateNextStep() call to the calculateNextStep() method of the algorithm
 */
public class Chess {

    private ChessAlgorithm algorithm = new EasyChessAlgorithm();// easy level is the default

    public int calculateNextStep(){
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
