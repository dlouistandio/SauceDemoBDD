package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*RunCukes digunakan untuk melakukan setup awal pada BDD agar BDD bisa di running*/
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@CheckOut"}, /*Tags untuk menjalankan BDD*/
        features = {"classpath:features/"}, /*Features sebagai letak class BDD*/
        glue = { "classpath:step_definitions"}, /*Glue sebagai tempat untuk menjalankan method akhir dalam BDD*/
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"} /*Plugin sebagai tempat peletakan report*/
)
public class RunCukesTest {
}
