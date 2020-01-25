/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

/**
 *
 * @author abdullah-fadhel
 */
public class AddNumbersCommand extends AbstractCommand{
    private String undoText = "itial numbers are 5454545454";
    public AddNumbersCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void action(String numbers) {// performs itself
        undoText = getTextEditor().getText();
        getTextEditor().setText("numbers now are :" + numbers);
    }

    @Override
    public void undo() {//removes itself
        getTextEditor().setText(undoText);
    }
    
    
}
