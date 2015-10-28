import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTest {

	public static void main(String[] args) {
		
		Locale[] locales = { new Locale("da", "DK"), new Locale("en", "GB") };
		ResourceBundle messages;
		for(Locale locale : locales)
		{
			messages = ResourceBundle.getBundle("MessageBundle", locale);
			System.out.println("\nPrinting messages with in locale: " + locale.getLanguage());
			System.out.println(messages.getString("greetings"));
			System.out.println(messages.getString("gesture"));
			System.out.println(messages.getString("goodbye"));
		}
		
		

	}

}
