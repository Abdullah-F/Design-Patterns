package observerpattern.problem;


public class Button {

    private InputText inputText;

    private List list;


    public void clicked(){
        // here when the button is clicked it goes to upate other object values itself
        // an observer should do this not the button itself
        list.setListValue(1);
        inputText.setText("button has been clicked");

    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }

    public void setList(List list) {
        this.list = list;
    }
}
