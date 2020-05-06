package co.com.challengeversion.one.task;

import java.util.Arrays;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;

import org.seleniumhq.jetty9.server.Authentication.User;

public class Authenticate {
private User user;
public Authenticate(User user){
	this.user = user;
}
@Override
public static Authenticate withThe(List<String> credentials){
System.out.print("Imprimir lista");	
System.out.println(Arrays.toString(credentials.toArray()));

User user = new User(credentials.get(3), credentials.get(4));
return instrumented(Authenticate.class, user);
}
}
