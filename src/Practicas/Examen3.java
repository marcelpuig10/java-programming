package Practicas;

public class Examen3 {
    public static void main(String[] args) {
        System.out.println(method1("apple"));

    }
    public static boolean method1(String str){
       boolean check = true;

       if(str.isEmpty()){
           check = false;
        }
        if(str.contains("a")) {
            check = false;
        }else if(str.contains("z")){
            check = false;
        }
        return check;
    }
}
