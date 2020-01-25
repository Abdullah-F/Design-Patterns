package flyweight.solution;


import java.util.HashMap;
import java.util.Map;
// we retrive any letter from the list in this class
public class LetterFactory {// a factory method class that manages creating only one copy of a letter

    private Map<String, Letter> letterMap = new HashMap<String, Letter>();

    public Letter createLetter(String key){
        Letter letter = letterMap.get(key);
        if(letter == null){// only adds new letters and ignores repeated once 
                          // that is a safe for storage since we only store a reference
                          // taht can be rendered in many pleases
                          // since the object identity is not important here
            letter = new Letter(key);
            letterMap.put(key,letter);
        }

        return letterMap.get(key);
    }

}
