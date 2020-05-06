package co.com.challengeversion.one.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;;

public class OpentheAplication implements Task{
	private PageObject page;
	public OpentheAplication (PageObject page){
		this.page = page;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Carga del Browser");
		actor.attemptsTo(Open.browserOn(page));
		System.out.println("Carga de la Pagina");
		
		System.out.println("Prueba");
	}
	public static OpentheAplication at(){
		// TODO Auto-generated method stub
		// return Tasks.instrumented(OpentheAplication.class);
		return instrumented(OpentheAplication.class);
	}
	
	public static Performable at(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
