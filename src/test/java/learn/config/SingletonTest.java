package learn.config;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void checkHash() {
        XRules obj1 = XRules.getInstance();
        XRules obj2 = XRules.getInstance();

        assert obj1.hashCode() == obj2.hashCode();
    }

    @Test
    void checkMemberValue() {
        final String value = "Hello";
        XRules obj1 = XRules.getInstance();
        obj1.xRegex = value;

        XRules obj2 = XRules.getInstance();
        assert obj2.xRegex.equals(value);
    }
}
