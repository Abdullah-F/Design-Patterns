package problem;


public class Preferences {

    public static Preferences globalPreferences = new Preferences("First one created");//this is the problem
    //we need to create a global varaible but the problem that it can be defined again and again

    private String preference;

    public Preferences(String preference){
        this.preference = preference;
    }

    public String getPreferencesDetail(){
        return preference;
    }

}
