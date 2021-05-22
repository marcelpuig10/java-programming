package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        /*
        id          0
        firstName   1
        lastName    2
        batchNum    3
        phoneNum    4

         */
            String[] student1 = new String[5];
            student1[0] = "AD1234";
            student1[1] = "Adam";
            student1[2] = "Smith";
            student1[3] = "B22";
            student1[4] = "202-543-1234";

            String[] student2 = {"MK4421" , "Mike" , "Bloomberg" , "B22" , "703-432-1234"};

        System.out.println("student1 id: \t\t\t" + student1[0]);
        System.out.println("student1 first name: \t" + student1[1]);
        System.out.println("student1 last name: \t" + student1[2]);
        System.out.println("student1 batch num: \t" + student1[3]);
        System.out.println("student1 mobile: \t\t" + student1[4]);

        System.out.println("student data length: " + student1.length);
        System.out.println();
        System.out.println();

        if(student1.length == 5){
            System.out.println("PASS: correct length");
        }else{
            System.out.println("FAIL: incorrect length ");
        }
        System.out.println();

        if(student1.length == student2.length){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL: mismatch");
        }
        System.out.println();

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];

        System.out.println("phone number: " + mobileNum);
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));


    }
}
