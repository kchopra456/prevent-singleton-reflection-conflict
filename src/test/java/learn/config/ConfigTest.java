package learn.config;

import org.junit.jupiter.api.Test;

public class ConfigTest {
    @Test
    void checkYMLValue() {
        AppConfig config = new AppConfig();

        XRules rules = XRules.getInstance();
        assert rules.xRegex.equals("[a-z]*");
    }
}
