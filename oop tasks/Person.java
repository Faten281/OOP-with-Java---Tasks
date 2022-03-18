package task2;
public class Person {
    String name;
    String address;
    //constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    //getter & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //to string

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + '}';
    }
    
    
}
