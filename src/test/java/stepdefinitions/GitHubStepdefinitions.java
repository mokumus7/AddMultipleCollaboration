package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.GitHubHomePage;
import pages.GitHubLoginPage;
import pages.GitHubRepoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class GitHubStepdefinitions {
    GitHubHomePage gitHubHomePage = new GitHubHomePage();
    GitHubLoginPage gitHubLoginPage = new GitHubLoginPage();
    GitHubRepoPage gitHubRepoPage = new GitHubRepoPage();

    @Given("user goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(string);
    }

    @Given("user login github")
    public void user_login_github() {
        gitHubHomePage.login.click();
        gitHubLoginPage.username.sendKeys(ConfigReader.getProperty("username"));
        gitHubLoginPage.password.sendKeys(ConfigReader.getProperty("password"));
        gitHubLoginPage.signInButton.click();
    }

    @Given("user goes to {string} repositorie")
    public void user_goes_to_repositorie(String string) {
        gitHubHomePage.searchrepo.sendKeys(string);
        Driver.wait(5);
        gitHubHomePage.searchrepo.sendKeys(Keys.TAB, Keys.ENTER);

    }

    @Given("user goes to collaborators")
    public void user_goes_to_collaborators() {
        gitHubRepoPage.settings.click();
        gitHubRepoPage.collaborators.click();
    }

    @Given("user adds {string} to repositorie")
    public void user_adds_to_repositorie(String string) {
        Driver.clickWithJS(gitHubRepoPage.addPeopleee);
        gitHubRepoPage.addEmail.sendKeys(string);
        gitHubRepoPage.selectEmail.click();
        gitHubRepoPage.addButton.click();
    }

}
