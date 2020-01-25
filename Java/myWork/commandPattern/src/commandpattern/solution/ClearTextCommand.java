/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

/**
 *
 * @author abdullah-fadhel
 * a concrete command class
 * it holds the undo data that will be needed to undo the command
 * it implements the two methods (action, undo) for a specific do and undo operations
 */
public class ClearTextCommand extends AbstractCommand{

    private String undoText;// holds the undo data
    public ClearTextCommand(TextEditor textEditor){
        super(textEditor);// initlizes the object witch commands will be executed on
    }
    @Override
    public void action(String text) {
        undoText = getTextEditor().getText();//creates a backup for the command
        getTextEditor().setText(text);// sets the object with the commands
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);// undos itself !!
    }
    
}
