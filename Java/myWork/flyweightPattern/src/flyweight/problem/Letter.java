package flyweight.problem;


/**
 * 
 * @author abdullah-fadhel
 * just a class that creates a letter (holds the letter in a string)
 */
public class Letter {

    private String value;

    public Letter(String value) {
        System.out.println("New letter created with value: "+value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
