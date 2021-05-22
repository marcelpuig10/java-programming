package day26_for_loop;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'j';
        int count = 0;
        //For loop: read each character(charAt(i))
        //and test if it matches letter
        //if true: add 1 to count

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("There are " + count + " " + letter + "'s in " + word);
    }
}
