/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author abdullah-fadhel
 */
public class TextEditor {
    private String text = "empty";// first intilizes the editor with a first initial state data
    private Queue<Command> commandsQueue = new LinkedList<Command>();// holds a list of executed commands
    
    private void executeAction(Command command, String text){
        command.action(text);//performs a specific command
        commandsQueue.add(command);//adds it to the list of commands
    }
    
    private void undo()
    {
        Command command = commandsQueue.poll();//removes the las executed command
        if(command != null){// checks if there still any commands
            command.undo();// undos the last concrete command applied
        }
    }

    public String getText() {
        return text;
    }

    public Queue<Command> getCommandsQueue() {
        return commandsQueue;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCommandsQueue(Queue<Command> commandsQueue) {
        this.commandsQueue = commandsQueue;
    }
    
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();// creat a text editor

        ClearTextCommand clearTextCommand = new ClearTextCommand(textEditor);// create a concrete command
        textEditor.executeAction(clearTextCommand, "some text");//add and perform the command
        System.out.println(textEditor.getText());
        
        textEditor.undo();//undos the last command
        System.out.println(textEditor.getText());
        
        System.out.println("***************************************");
        AddNumbersCommand addNumberCommand = new AddNumbersCommand(textEditor);// creates different command
        textEditor.executeAction(addNumberCommand, "111111155555577");//add and perform the command
        System.out.println(textEditor.getText());
        
        textEditor.undo();//undos the last command
        System.out.println(textEditor.getText());

    }
    
    
}
