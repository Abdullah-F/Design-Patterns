package problem;


public class Client {

    public static void main(String[] args) {

        System.out.println(Preferences.globalPreferences.globalPreferences.getPreferencesDetail());

        Preferences secondPreference = new Preferences("Second preference");// can be defined again and agin !
        
        Preferences.globalPreferences = secondPreference;

        System.out.println(Preferences.globalPreferences.getPreferencesDetail());


    }

}
