package learn.config;

import org.junit.jupiter.api.Test;

public class ConfigTest {
    @Test
    void checkYMLValue() throws Exception {
        AppConfig config = new AppConfig();

        XRules rules = XRules.getInstance();
        assert rules.xRegex.equals("[a-z]*");
    }

    @Test
    void checkHash() throws Exception {
        AppConfig config = new AppConfig();

        XRules rules = XRules.getInstance();
        assert config.getRules().hashCode() == rules.hashCode();
    }
}
