package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";

        System.out.println(word.startsWith("int"));
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));
        System.out.println(word.startsWith("Int"));

        System.out.println();
        System.out.println();

        System.out.println(word.endsWith("ea"));
        System.out.println(word.endsWith("idea"));

        String name = "Mario";

        System.out.println(name.endsWith("a"));
        System.out.println();

        if(name.endsWith("a")){
            System.out.println("maybe female name");
        }else{
            System.out.println("male");


            System.out.println("-------------------");


            String firstName = "Sr. Nadir";

            if(firstName.startsWith("Dr")){
                System.out.println("Doctor");
            }else if(firstName.startsWith("Mr.")){
                System.out.println("Man");
            }else if(firstName.startsWith("Mrs")){
                System.out.println("Married women");
            }else if(firstName.startsWith("Ms")){
                System.out.println("Single women");
            }else if(firstName.startsWith("Sr")){
                System.out.println("Senior");
            }else{
                System.out.println("Invalid entry");
            }

            /*
            url = "https: //www.google.com
            .com -> commercial
            .ru -> russian
            .gov -> goverment
            .org -> organisation
            .edu -> education
             */


            String url= "www.google.go";

            if(url.endsWith(".gov")){
                System.out.println("goverment");

            }else if(url.endsWith(".org")){
                System.out.println("organisation");

            }else if(url.endsWith(".edu")){
                System.out.println("education");
            }else{
                System.out.println("url not valid");
            }
        }









    }
}
