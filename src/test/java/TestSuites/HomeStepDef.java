package TestSuites;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.*;

public class HomeStepDef {
	@When("Utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menu) {
	  HomePage home = new HomePage();
	  home.clickOnMenuByName(menu);
	  
	}

	@Then("La page de menu est affichee")
	public void la_page_de_menu_est_affichee() throws InterruptedException {
	   Thread.sleep(3000);
	   Config.driver.close();
	}


}
