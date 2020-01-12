package cucumber.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {

    @Given("^the domain is IT$")
    public void the_domain_is_IT() throws Throwable {
        System.out.println("the domain is it");
    }

    @Given("^the user types in IT$")
    public void the_user_types_in_IT() throws Throwable {
        System.out.println("the user type in it");
        
    }

    @When("^the user clicks on search button$")
    public void the_user_clicks_on_search_button() throws Throwable {
        System.out.println("user click on search");
        
    }

    @Then("^the application should display a table with \\[Java,PHP,C#\\]$")
    public void the_application_should_display_a_table_with_Java_PHP_C() throws Throwable {
        System.out.println("app should display a table wirh JAVA PHP C#");
        
    }

    @Then("^the card should be returned$")
    public void the_card_should_be_returned() throws Throwable {
        System.out.println("");
        
    }

    @Given("^the domain is Vanzari$")
    public void the_domain_is_Vanzari() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Given("^the user types in Vanzari$")
    public void the_user_types_in_Vanzari() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^the application should display a table with \\[Profi,Carrefour,Mega Image\\]$")
    public void the_application_should_display_a_table_with_Profi_Carrefour_Mega_Image() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

}
