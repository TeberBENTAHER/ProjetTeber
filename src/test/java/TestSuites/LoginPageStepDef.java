package TestSuites;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginPageStepDef {
	
	@Before
	public void init() {
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maxWindow();
	}
	
	@Given("Administrateur sur la page authentification")
	public void administrateur_sur_la_page_authentification() {
	 Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	@When("Entrer le nom {string} et le MDP correct {string}")
	public void entrer_le_nom_et_le_mdp_correct(String nom, String mdp) {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage page = new LoginPage();
		page.connexion(nom, mdp);
	}

	@Then("Administrateur deriger vers la page accueil")
	public void administrateur_deriger_vers_la_page_accueil() {
	  
		HomePage home = new HomePage();
		String actualmsg = home.verifmsg();
		String expectedmsg = "Dashboard";
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	@Then("Administrateur deriger vers la page accueil qui contient le message {string}")
	public void administrateur_deriger_vers_la_page_accueil_qui_contient_le_message(String expectedMsg) {
		HomePage home = new HomePage();
		String actualmsg = home.verifmsg();
		Assert.assertEquals(expectedMsg, actualmsg);
	}

	@When("Entrer le nom {string} et le MDP incorrect {string}")
	public void entrer_le_nom_et_le_mdp_incorrect(String nom, String mdp) {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage page = new LoginPage();
		page.connexion(nom, mdp);
	}

	@Then("Administrateur est encore dans la page Login qui contient le message {string}")
	public void administrateur_est_encore_dans_la_page_login_qui_contient_le_message(String expectedMsg) {
	LoginPage page = new LoginPage();
	String actualMsg = page.verifmsg();
	Assert.assertEquals(expectedMsg, actualMsg);
	
	}



}
