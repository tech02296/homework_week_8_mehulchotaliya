package Programme26_encapulation;

import encapsulation26.Encapsulate;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        obj.setName("Mehul");
        obj.setAge(20);
        obj.setRollNo(25);

        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());
    }

}
