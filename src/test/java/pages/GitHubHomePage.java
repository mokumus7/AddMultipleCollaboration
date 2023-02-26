package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GitHubHomePage {

    public GitHubHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;



    @FindBy(xpath = "//input[@id='dashboard-repos-filter-left']")
    public WebElement searchrepo;

}
