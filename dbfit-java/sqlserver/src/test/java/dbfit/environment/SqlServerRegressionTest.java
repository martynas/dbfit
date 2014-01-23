package dbfit.environment;

import fitnesse.junit.FitNesseSuite;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static fitnesse.junit.FitNesseSuite.*;

@Ignore
public class SqlServerRegressionTest {
    @RunWith(FitNesseSuite.class)
    @Name("AcceptanceTests.JavaTests.SqlServerTests.FlowMode")
    @FitnesseDir("../..")
    @OutputDir("../../tmp")
    @Port(1234)
    public static class FlowModeTest {
        @Test public void dummy(){}
    }

    @RunWith(FitNesseSuite.class)
    @Name("AcceptanceTests.JavaTests.SqlServerTests.StandaloneFixtures")
    @FitnesseDir("../..")
    @OutputDir("../../tmp")
    @Port(1234)
    public static class StandaloneFixturesTest {
        @Test public void dummy(){}
    }
}