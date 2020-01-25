package mediatorpattern.solution;


public class Client {

    public static void main(String[] args) {

        List list = new List();// create list
        InputText text = new InputText();//create an input text


        ScreenDirectorOne screendirector = new ScreenDirectorOne();// create a concrete director
        screendirector.setInputText(text);// set director input to the concrete input
        list.setScreendirector(screendirector);// set director for the list


        list.getItems().add("Data item one");
        list.getItems().add("Data item two");
        list.getItems().add("Data item three");

        list.selectItem(2);

        System.out.println("Selected value is: "+text.getValue());




    }

}
