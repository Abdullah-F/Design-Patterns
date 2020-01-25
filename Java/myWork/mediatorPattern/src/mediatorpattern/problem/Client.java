package mediatorpattern.problem;


public class Client {

    public static void main(String[] args) {

        List list = new List();//create the list
        InputText text = new InputText();//create an input filed (of type text)

        list.setInputText(text);// set the input text (we need this to be changeable at runtime)


        list.getItems().add("Data item one");//add an item
        list.getItems().add("Data item two");//add an item
        list.getItems().add("Data item three");//add an item

        list.selectItem(0);// select one of the list items

        System.out.println("Selected value is: "+text.getValue());// print the selected item




    }

}
