package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";

        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);

        if(jobTitle.isEmpty()){
            System.out.println("job title is missing");
        }else{
            System.out.println("job title looks good");
        }
        if(jobTitle.length() == 0){
            System.out.println("job title is empty");
        }else{
            System.out.println("is ok");
        }
        System.out.println(jobTitle.equals(" "));
        if("".equals(jobTitle)){
            System.out.println("is empty");
        }else{
            System.out.println("is ok");
        }

        String veggie = "carrots";

        System.out.println(veggie.isEmpty());

        if(!veggie.isEmpty()){
            System.out.println("we have "+ veggie);
        }

        String word2;
        //System.out.println(word2); ERROR      NOT INITIALIZED

        String word5 = "java";

        System.out.println(word5.contains("ja"));
        System.out.println(word5.contains("jv"));
        System.out.println(word5.contains("JA"));
        System.out.println(word5.contains("v"));




    }
}
