package observerpattern.solution;


public class Client {

    public static void main(String[] args) {
        Button button = new Button();// creates a button
        InputText text = new InputText();//creates an input text
        List list = new List();//creates a list



        button.attachObserver(text);//adds text as an observer
        button.attachObserver(list);//assd list as an observer

        button.clicked();//the click event triggers the observers !

    }

}
