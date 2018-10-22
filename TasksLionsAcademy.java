package SDA.pl.Zadania;

public class TasksLionsAcademy {

    public int wordsCount(String[] words, int len) {
        int arrayLength = words.length;
        int wordsNumber = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (words[i].length() == len) {
                wordsNumber++;
            }
        }
        return wordsNumber;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] newWords = new String[n];

        for (int i = 0; i < n; i++) {
            newWords[i] = words[i];
        }
        return newWords;
    }

    public int greenTicket (int a, int b, int c) {
        int points = 0;

        if (a == b | a == c | b == c){
            points = 10;
        }
        if (a == b & b == c) {
            points = 20;
        }
        return points;
    }

}
