package day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    //no args constructor

    public Customer(){
        System.out.println("no args constructor");
        name = "new customer";
        id = -1;
    }

    //add a constructor where we can assign name and id

    public Customer(String name, int id){
        System.out.println("constructor 2 arg");
        this.name =name;// setName
        this.id = id;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
