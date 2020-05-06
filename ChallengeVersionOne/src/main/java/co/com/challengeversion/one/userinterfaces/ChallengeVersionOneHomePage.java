package co.com.challengeversion.one.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://s1.demo.opensourcecms.com/wordpress/wp-login.php?redirect_to=https%3A%2F%2Fs1.demo.opensourcecms.com%2Fwordpress%2Fwp-admin%2Fedit.php%3Fs%3Dhel%26post_status%3Dall%26post_type%3Dpost%26action%3D-1%26m%3D0%26cat%3D0%26paged%3D1%26action2%3D-1&reauth=1")
public class ChallengeVersionOneHomePage extends PageObject {
	
	public static final Target WORDPRESS_LOGO = Target.the("Wordpress logo")
			.locatedBy("//a[contains(text(),'Powered by WordPress')]");
	public static final Target WORDPRESS_USER_NAME = Target.the("Wordpress user name")
			.locatedBy("//input[@id='user_login']");
	public static final Target WORDPRESS_USER_PASS = Target.the("Wordpress user pass")
			.locatedBy("//input[@id='user_pass']");
	public static final Target WORDPRESS_LOGIN_BTN = Target.the("Wordpress login boton")
			.locatedBy("//input[@id='wp-submit']");
	
}
