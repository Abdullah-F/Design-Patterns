/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.problem;

/**
 *
 * @author abdullah-fadhel
 */
public class TextEditor {
    private String text;
    private String undoText;
    
    /**
     * 
     * @param text
     * initializes the text with an empty string
     */
    public TextEditor(String text){
        this.text = text;
    }
    
    /**
     * 
     * @param text 
     * adds a new text
     */
    public void addText(String text){
        this.undoText = this.text;
        this.text = text;
    }
    /**
     * clears the text and resets
     */
    public void clearText()
    {
        this.undoText = text;
        this.text = "";
    }
    /**
     * 
     * @return
     * a text getter that returns the text string
     */
    public String getText(){
        return this.text;
    }
    
    /**
     * sets the text to the value of the undoText
     * 
     * the problem here (what if we want to undo many things ?????)
     */
    public void undo(){
        this.text = undoText;
    }
    
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor("intial text");//creates a text
        System.out.println(textEditor.getText());//prints current text value (empty in this case)
        textEditor.addText("some Text");// adds some text
        System.out.println(textEditor.getText());
        textEditor.undo();//undo the added text
        System.out.println(textEditor.getText());
    }
}
