package cucumber.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewInternship {

    @Given("^the user is company representant for Google$")
    public void the_user_is_company_representant_for_Google() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user is from google");
    }

    @Given("^the user is on add-new-internship-page$")
    public void the_user_is_on_add_new_internship_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user is on addnewintersnhip page");
    }

    @Given("^the user types in an Java Internship$")
    public void the_user_types_in_an_Java_Internship() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user types in java internship");
    }

    @Given("^the user types in an (\\d+) weeks$")
    public void the_user_types_in_an_weeks(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user types in 4 weeks");
    }

    @Given("^the user types in an Java$")
    public void the_user_types_in_an_Java() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user types in java");
    }

    @Given("^the user types in an (\\d+)\\$$")
    public void the_user_types_in_an_$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user types in 1500$");
    }

    @When("^the user submits the form$")
    public void the_user_submits_the_form() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user submits the form");
    }

    @Then("^the user should be redirected to internship_page$")
    public void the_user_should_be_redirected_to_internship_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user should be redirected to internship page");
    }

    @Then("^the user should see a confirmation pop-up$")
    public void the_user_should_see_a_confirmation_pop_up() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user should see a confirmation pop-up");
    }

    @Then("^the internship's company should be Google$")
    public void the_internship_s_company_should_be_Google() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the internship's company should be google");
    }

    @Given("^the user is company representant for Wallmart$")
    public void the_user_is_company_representant_for_Wallmart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user is from wallmart");
    }

    @Given("^the user types in an Internship at Wallmart$")
    public void the_user_types_in_an_Internship_at_Wallmart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user types in internship at eallmart");
    }

    @Given("^the user types in an Vanzari$")
    public void the_user_types_in_an_Vanzari() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user types in vanzari");
    }

    @Then("^the internship's company should be Wallmart$")
    public void the_internship_s_company_should_be_Wallmart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the internship's company should be wallmart");
    }

}
