package sec15.exam_01_collection.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Properties;

public class ProtertiesExample {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = "C:/dev/database.properties";
        path = URLDecoder.decode(path,"utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println(driver + url + username + password);


    }
}
