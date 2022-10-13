package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileStore {

    public int countOfPairs() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/ua/lviv/iot/resources/input.txt"));
            return Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public List<List<Integer>> getAll(int count) {
        List<List<Integer>> pairs = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/ua/lviv/iot/resources/input.txt"));
            reader.readLine();
            for (int i = 0; i < count; i++) {
                List<Integer> pair = new ArrayList<>();
                String[] linePair = reader.readLine().split(" ");
                for (int n = 0; n < 2; n++) {
                    pair.add(Integer.valueOf(linePair[n]));
                }
                pairs.add(pair);
            }
            return pairs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pairs;
    }
}
