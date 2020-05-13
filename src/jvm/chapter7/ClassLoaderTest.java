package jvm.chapter7;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".")+1) + ".class";
                InputStream in = getClass().getResourceAsStream(fileName);
                if (in == null){
                    return super.loadClass(name);
                }
                try {
                    byte[] data = new byte[in.available()];
                    in.read(data);
                    return defineClass(name, data, 0, data.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        Object obj = classLoader.loadClass("jvm.chapter7.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof jvm.chapter7.ClassLoaderTest);
        System.out.println(Object.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());

    }
}
