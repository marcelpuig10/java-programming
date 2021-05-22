package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather="windy";

        System.out.println("Whats the weather like??");

        if (weather.equals("sunny")) {
            System.out.println(weather+"-go to park");
        }else if (weather.equals("rainy")) {
            System.out.println(weather+"-stay home");
        }else if (weather.equals("snowy")) {
            System.out.println(weather+"-drink hot chocolate and code java");
        }else if(weather.equals("windy")) {
            System.out.println(weather+"-get ready for power loss");
        }else {
            System.out.println("just keep coding java");
        }
    }
}
