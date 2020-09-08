package learn.config;

import java.util.Map;

public class XRules {


    public String xRegex;
    public Map<String, String> xMapping;


    private static XRules INSTANCE;


    private XRules() {
    }

    private XRules(String pgmRegex, Map<String, String> pgmMapping) {
        System.out.println("Call to constructor");
    }

    public static XRules getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new XRules();
        }
        return INSTANCE;
    }

    public static String getRegex() {
        return getInstance().xRegex;
    }

    public static Map<String, String> getMapping() {
        return getInstance().xMapping;
    }

    @Override
    public XRules clone() throws CloneNotSupportedException {
        if (INSTANCE != null) {
            throw new RuntimeException("Its Singleton Class use getInstance method for object creation");
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

    // getters and setters

}
