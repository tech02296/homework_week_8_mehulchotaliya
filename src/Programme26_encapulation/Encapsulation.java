package Programme26_encapulation;

public class Encapsulation {
    private String name;
    private int rollNo;
    private int age;
    // set method for name to access private variable name

    public void setName(String name){
        this.name = name;
    }
    // get method for name to access private variable age
    public String getName(){
        return name;
    }
    // get method for roll no to access private variable roll No

    public int getRollNo(){
        return rollNo;
    }
    // set method for roll no to access private variable roll No
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    // set method for age to access private variable age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


}
