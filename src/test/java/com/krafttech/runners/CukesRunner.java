package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.lang.annotation.Repeatable;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/krafttech/step_definitions",
        dryRun = false,
        tags = "@wip"

                )

public class CukesRunner {

}
