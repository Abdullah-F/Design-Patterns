package mediatorpattern.problem;


import java.util.ArrayList;

public class List {

    private java.util.List<String> items = new ArrayList<String>();// holds list items


    private InputText inputText;// what if we need different type of inputs with the list


    public void selectItem(int itemNumber){
        String item = items.get(itemNumber);
        inputText.setValue(item);
    }


    public java.util.List<String> getItems() {
        return items;
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }
}
