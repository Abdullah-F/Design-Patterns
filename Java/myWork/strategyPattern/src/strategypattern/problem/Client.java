package strategypattern.problem;


public class Client {

    public static void main(String[] args) {

        Chess chess = new Chess();

        System.out.println("Chess next step " + chess.calculateNextStep());

        chess.setDifficulty(Difficulty.HARD);// change difficulty at run time

        System.out.println("Chess next step " + chess.calculateNextStep());

    }

}
