package cucumber.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubmitApplication {
    @Given("^the student is on specific page for submitting an application to Java Internship$")
    public void the_student_is_on_specific_page_for_submitting_an_application_to_Java_Internship() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the student is on specific page");

    }

    @Given("^the student fills in a textarea with I really want to be part of your team$")
    public void the_student_fills_in_a_textarea_with_I_really_want_to_be_part_of_your_team() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the student fills in a textarea with specific content");
    }

    @Given("^the student attach a Joedoe\\.pdf$")
    public void the_student_attach_a_Joedoe_pdf() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the student attach his cv");
    }

    @Given("^cv is in format pdf$")
    public void cv_is_in_format_pdf() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("cv is in ... format");
    }

    @When("^the user requests to submits his applications$")
    public void the_user_requests_to_submits_his_applications() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user requests to submits app");
    }

    @Then("^the user should be redirected to$")
    public void the_user_should_be_redirected_to() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user should be redirected to ...");
    }

    @Given("^the student is on specific page for submitting an application to Wallmart internship$")
    public void the_student_is_on_specific_page_for_submitting_an_application_to_Wallmart_internship() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on specific page for submitting app to Wallmart");
    }

    @Given("^the student fills in a textarea with I would like to have a flexible schedule$")
    public void the_student_fills_in_a_textarea_with_I_would_like_to_have_a_flexible_schedule() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the student fills in textarea with specific content");
    }

    @Given("^the student attach a philipcollins\\.doc$")
    public void the_student_attach_a_philipcollins_doc() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the student attach his cv philip");
    }

    @Given("^cv is in format doc$")
    public void cv_is_in_format_doc() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("cv is in doc format");
    }
}
