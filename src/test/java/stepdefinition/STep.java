package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.junit.Assert.*;0
public class STep {
    @Given("I hit the url of the product in the get")
    public void i_hit_the_url_of_the_product_in_the_get() {
        RestAssured.baseURI = "https://anatomy.adraproductstudio.com/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("qabot/");
        int code = response.getStatusCode();
        int i = response.hashCode();
        System.out.println(i);
        System.out.println(code);
        assertEquals(code, 200);
        System.out.println("Validation Passed");
    }
    @When("its show the response")
    public void its_show_the_response() {
    }
    @Then("validate the reponse code")
    public void validate_the_reponse_code() {
    }
}
