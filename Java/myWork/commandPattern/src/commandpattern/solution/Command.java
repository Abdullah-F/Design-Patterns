/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.solution;

/**
 *
 * @author abdullah-fadhel
 * a very general command interface that has only two general method (action and undoaAction methods)
 */
public interface Command {

    void action(String text);

    void undo();
}
