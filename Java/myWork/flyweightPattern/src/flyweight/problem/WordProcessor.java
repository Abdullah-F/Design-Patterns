package flyweight.problem;


import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author abdullah-fadhel
 * 
 * it has a group of letters that it manages and render 
 * (letters can be added dynamically to the list)
 */
public class WordProcessor {

    private List<Letter> letters = new ArrayList<Letter>();

    public void addLetter(Letter letter){
        this.letters.add(letter);
    }

    public void printLetters(){
        for (Letter letter : letters) {
            System.out.print(letter.getValue());
        }
    }

}
