package day14_multi_branch_if_statements;

public class yesOrNo {
    public static void main(String[] args) {

        boolean answer;
        char selection = 'n';

        System.out.println("Are you sure you want to delete this file?");

        if (selection=='y') {
            System.out.println("File will be deleted");
            answer = true;
        }else{
            System.out.println("cancelled");
            answer = false;
        }
        System.out.println("Did file get deleted?-" + answer);
    }
}
