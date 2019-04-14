package Day31;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("ztt","zhutingting");
        properties.setProperty("lfy","lufangying");
        properties.setProperty("yfl","yangfulin");
        System.out.println(properties.get("ztt"));
        System.out.println(properties.get("lfy"));
        File file = new File("C:\\Users\\13764\\Desktop\\合并\\properties.txt");
        properties.store(new FileOutputStream(file),"ztt");
    }
}
