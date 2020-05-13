package load_class;

public class LoadTest {
    public static void main(String[] args) {
//        TestClass testClass = new TestClass();
//        try {
//            Class.forName("load_class.TestClass");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Class<TestClass> testClassClass = TestClass.class;
        testClassClass.getFields();
    }
}
