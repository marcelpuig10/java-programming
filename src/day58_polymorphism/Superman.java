package day58_polymorphism;

public class Superman extends Father implements Worker {
    @Override
    public void work(String job) {
        System.out.println("superman is working as "+ job);
    }

    @Override
    public double getPaid() {
        System.out.println("superman is gettin paid");
        return 8000;
    }
}
