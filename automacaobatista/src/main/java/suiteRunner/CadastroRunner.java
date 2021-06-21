package suiteRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/relatorios/report-html",
		"json:target/relatorios/cucumber.json",
		"junit:target/relatorios/cucumber.xml" },
		features = "src/main/java/features",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		glue = {"steps"}, 
		dryRun = false
		
	)
public class CadastroRunner {
	

}
