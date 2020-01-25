package flyweight.problem;


public class Client {

    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello i'm a word processor";// the letters  that will be added
        int length = textToAdd.length();

        for(int i = 0; i<length;i++){

            String value = textToAdd.substring(i,i+1);
            processor.addLetter(new Letter(value));// even if the letter is repeated 
                                                   // it will be created again !!
                                                   // that has storage problems
                                                   // many bytes for each repetion !!

        }

        processor.printLetters();
    }


}
