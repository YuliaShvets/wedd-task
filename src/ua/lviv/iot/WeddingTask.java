package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

public class WeddingTask {

    private List<List<Integer>> pairs = new ArrayList<>();

    public WeddingTask(List<List<Integer>> pair) {
        this.pairs = pair;
    }

    public List<List<Integer>> getMarriesPairs() {
        List<Integer> firstFamily = new ArrayList<>();
        List<Integer> secondFamily = new ArrayList<>();
        List<List<Integer>> possiblePairs = new ArrayList<>();
        int count = 0;
        firstFamily.add(pairs.get(0).get(0));
        firstFamily.add(pairs.get(0).get(1));
        for (List<Integer> pair : pairs) {
            if (firstFamily.contains(pair.get(0))) {
                if (!firstFamily.contains(pair.get(1))) {
                    firstFamily.add(pair.get(1));
                }
            } else if (firstFamily.contains(pair.get(1))) {
                if (!firstFamily.contains(pair.get(0))) {
                    firstFamily.add(pair.get(0));
                }
            } else {
                secondFamily.add(pair.get(0));
                secondFamily.add(pair.get(1));
            }
        }

        for (Integer firstPerson : firstFamily) {
            for (Integer secondPerson : secondFamily) {
                if ((firstPerson % 2 == 0 && secondPerson % 2 != 0) || (firstPerson % 2 != 0 && secondPerson % 2 == 0)) {
                    List<Integer> newPairs = new ArrayList<>();
                    newPairs.add(firstPerson);
                    newPairs.add(secondPerson);
                    possiblePairs.add(newPairs);
                    count++;
                }
            }
        }
        System.out.println(count);
        return possiblePairs;
    }

}
