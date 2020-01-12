package cucumber.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@CucumberOptions(  monochrome = true,
//        features = "src/test/resources/features/",
//        format = { "pretty","html: cucumber-html-reports",
//                "json: cucumber-html-reports/cucumber.json" },
//        dryRun = false,
//        glue = "fr.tlasnier.cucumber" )
public class LoginSteps {
    @Given("^the user is student$")
    public void the_user_is_student() throws Throwable {
        System.out.println("_--------------------------------_");
        System.out.println("the user is student");
    }

    @Given("^the user types in Jimmy into username field$")
    public void the_user_types_in_Jimmy_into_username_field() throws Throwable {
        System.out.println("the user types in jimmy into username field");

    }

    @Given("^the user types in jimmyjimmy into password field$")
    public void the_user_types_in_jimmyjimmy_into_password_field() throws Throwable {
        System.out.println("the user types in jimmyjimmy into pass field");
    }

    @Given("^the credentials are correct$")
    public void the_credentials_are_correct() throws Throwable {
        System.out.println("the credentials are correct");
    }

    @When("^the user requests to login$")
    public void the_user_requests_to_login() throws Throwable {
        System.out.println("the user reuests to login");
    }

    @Then("^the user is successufully logged-in$")
    public void the_user_is_successufully_logged_in() throws Throwable {
        System.out.println("the user is successufully logged in ");
    }

    @Then("^a token(\\d+) is generated$")
    public void a_token_is_generated(int arg1) throws Throwable {
        System.out.println("a token is generated");
    }

    @Then("^a session should be created for the user$")
    public void a_session_should_be_created_for_the_user() throws Throwable {
        System.out.println("a session should be created for the user");
    }

    @Then("^session should contain token(\\d+) and Jimmy$")
    public void session_should_contain_token_and_Jimmy(int arg1) throws Throwable {
        System.out.println("session should contain token and Jmmy");
    }

    @Then("^user should be redirected to /app/student$")
    public void user_should_be_redirected_to_app_student() throws Throwable {
        System.out.println("user should be redirected to /app/students");
    }

    @Given("^the user is company$")
    public void the_user_is_company() throws Throwable {
        System.out.println("the user is company");
    }

    @Given("^the user types in Peter into username field$")
    public void the_user_types_in_Peter_into_username_field() throws Throwable {
        System.out.println("the user type in Peter into username field");
    }

    @Given("^the user types in Peter(\\d+) into password field$")
    public void the_user_types_in_Peter_into_password_field(int arg1) throws Throwable {
        System.out.println("the user types in Peter123 into pass field");
    }

    @Then("^session should contain token(\\d+) and Peter$")
    public void session_should_contain_token_and_Peter(int arg1) throws Throwable {
        System.out.println("session should contain token2 and Peter");
    }

    @Then("^user should be redirected to /app/company$")
    public void user_should_be_redirected_to_app_company() throws Throwable {
        System.out.println("user should be redirected to /app/company");
    }
}
