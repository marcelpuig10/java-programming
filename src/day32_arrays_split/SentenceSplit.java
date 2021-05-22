package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] google = googleResult.split(" ");
        System.out.println(google[1]);
    }
}
