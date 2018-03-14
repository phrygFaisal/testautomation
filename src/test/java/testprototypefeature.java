import cucumber.api.java.en.Given;

public class testprototypefeature {

    @Given("^Sample feature file is ready$")
    public void givenStatement(){

        System.out.println("Given statement executed successfully");

    }

    @Given("^I run the feature file$")
    public void whenStatement(){

        System.out.println("When statement executed successfully");

    }

    @Given("^run should be successful$")
    public void thenStatement(){

        System.out.println("Then statement executed successfully.");
    }


}
