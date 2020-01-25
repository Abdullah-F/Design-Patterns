package strategypattern.solution;


public class Client {

    public static void main(String[] args) {


        Chess chess = new Chess();// creates a game instance

        System.out.println("Calculate next step: " +chess.calculateNextStep());



        chess.setAlgorithm(new HardChessAlgorithm());//sets the algorithm (change the algorithm)
                                                      // at runtime



        System.out.println("Calculate next step: " +chess.calculateNextStep());


    }

}
