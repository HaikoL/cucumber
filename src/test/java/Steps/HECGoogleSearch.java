package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class HECGoogleSearch {

    @Given("^I opened Google Search Page$")
    public void iOpenedGoogleSearchPage() throws Throwable {
        System.out.println("I opened the Google Search Page.");
    }

    @When("^I type \"?([^\"]*)\"? in the Search String textfield$")
    public void iTypeInTheSearchStringTextfield(String searchString) throws Throwable {
        System.out.println("I type " + searchString + " in the serach textfield.");
    }

    @When("^click on the Submit-Button$")
    public void clickOnTheSubmitButton() throws Throwable {
        System.out.println("I click the Submit Button");
    }

    @Then("^I should see \"?([^\"]*)\"? as the first entry$")
    public void iShouldSeeAsTheFirstEntry(String firstEntryString) throws Throwable {
        System.out.println("I should see that the first entry has the following string: " + firstEntryString);
    }

    @When("^click on the I'm feeling Lucky-Button$")
    public void clickOnTheIMFeelingLuckyButton() throws Throwable {
        System.out.println("I click on the I'm Feeling Lucky Button");
    }

    @Then("^my URL should be ([^\"]*)$")
    public void myURLShouldBeGoal(String goalUrl) throws Throwable {
        System.out.println("My URLS should be " + goalUrl);
    }

}
