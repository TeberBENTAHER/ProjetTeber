package TestSuites;

import java.time.Duration;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("Utilisateur est bien connectee avec nom correct {string} et mdp correct {string}")
	public void utilisateur_est_bien_connectee_avec_nom_correct_et_mdp_correct(String username, String password) {
	   
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage page = new LoginPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		page.connexion(username, password);
		
	}
	


}
