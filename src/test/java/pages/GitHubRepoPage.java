package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GitHubRepoPage {

    public GitHubRepoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


   @FindBy(xpath = "//a[@id='settings-tab']")
    public WebElement settings;

    @FindBy(xpath = "//span[normalize-space()='Collaborators']")
    public WebElement collaborators;

    @FindBy(xpath = "//summary[normalize-space()='Add people']")
    public WebElement addPeopleee;

    @FindBy(xpath = "//input[@placeholder='Search by username, full name, or email']")
    public WebElement addEmail;

    @FindBy(xpath = "//span[@class='js-selected-member-id']")
    public WebElement addButton;

    @FindBy(id = "repo-add-access-search-results-user-option-0")
    public WebElement selectEmail;


}
