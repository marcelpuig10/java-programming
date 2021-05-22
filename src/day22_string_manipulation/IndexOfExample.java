package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index "+ idxOfCss);

        int indexOfSelenium = technologies.indexOf("selenium");
        System.out.println("selenium is at index "+ indexOfSelenium);

        if(technologies.contains("selenium")){
            System.out.println("selenium is present");
        }else{
            System.out.println("selenium is not present");
        }

        if(technologies.indexOf("selenium")> -1){
            System.out.println("no se");
        }

    }
}

