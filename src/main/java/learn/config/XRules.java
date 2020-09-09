package learn.config;


import java.util.Map;
import java.util.Objects;

//public class XRules {
//
//
//    public String xRegex;
//    public Map<String, String> xMapping;
//
//
//    private static XRules INSTANCE;
//
//
//    private XRules() {
//    }
//
//    private XRules(String pgmRegex, Map<String, String> pgmMapping) {
//        System.out.println("Call to constructor");
//    }
//
//    public static XRules getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new XRules();
//        }
//        return INSTANCE;
//    }
//
//    public static String getRegex() {
//        return getInstance().xRegex;
//    }
//
//    public static Map<String, String> getMapping() {
//        return getInstance().xMapping;
//    }
//
//    @Override
//    public XRules clone() throws CloneNotSupportedException {
//        if (INSTANCE != null) {
//            throw new RuntimeException("Its Singleton Class use getInstance method for object creation");
//        }
//        return INSTANCE;
//    }
//
//    protected Object readResolve() {
//        return getInstance();
//    }
//
//    // getters and setters
//
//}


public class XRules {
    public String xRegex;
    public Map<String, String> xMapping;
    public static XRules INSTANCE;

    private XRules() {
        throw new RuntimeException("Use getInstance method!");
    }

    public static XRules getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new XRules();
        }
        return INSTANCE;
    }
}


//public enum XRules {
//    INSTANCE;
//    public String xRegex;
//    public Map<String, String> xMapping;
//
//    public static XRules getInstance() {
//        return INSTANCE;
//    }
//    public static String getRegex() {
//        return INSTANCE.xRegex;
//    }
//    public static Map<String, String> getMapping() {
//        return INSTANCE.xMapping;
//    }
//    // getters and setters
//}