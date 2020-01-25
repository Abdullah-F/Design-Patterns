package strategypattern.solution;

/**
 * 
 * @author abdullah-fadhel
 * a simple class that represents a game level with simple logic
 */
public class EasyChessAlgorithm implements ChessAlgorithm{

    @Override
    public int calculateNextStep() {
        return 1;
    }
}
