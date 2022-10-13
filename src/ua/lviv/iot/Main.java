package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        FileStore fileData = new FileStore();
        WeddingTask weddingTask = new WeddingTask(fileData.getAll(fileData.countOfPairs()));
       System.out.print(weddingTask.getMarriesPairs());
    }
}