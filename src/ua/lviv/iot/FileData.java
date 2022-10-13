package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileData {

    public int countOfPairs() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/ua/lviv/iot/resources/input.txt"));
            return Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
