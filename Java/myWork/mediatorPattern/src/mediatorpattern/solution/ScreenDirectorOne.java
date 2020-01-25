package mediatorpattern.solution;

/**
 * a screen director for the lists that need a text type of input fields
 * @author abdullah-fadhel
 */
public class ScreenDirectorOne implements Screendirector{

    private InputText inputText;


    @Override
    public void itemSelected(String item) {// sets the input text field on list select action
        inputText.setValue(item);
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
