package encapsulation26;

public class Encapsulate {
    // private variables declared these can only be
    //accessed by public methods of class
private String name;
private int rollNo;
private int age;
//set method for name to access private variable name
    public void setName(String name){
        this.name= name;
    }
   // get method for name to access private variable age
    public String getName(){
        return name;
    }
    //get method for roll to access private variable rollNo
    public  int getRollNo(){
        return rollNo;
    }
    // set method for roll to access private variable rollNo
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    // get method for age to access private variable age
    public int getAge(){
        return age;
    }
    //set method for age to access private variable age
    public void setAge (int age){
        this.age = age;
    }
    public class TestEncapsulation{
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);
            //Displaying value of the variables
            System.out.println("Prime' name: " );
            obj.getName();
            System.out.println("Prime' age : ");
            obj.getAge();
            System.out.println("Prime' rollNo : ");
            obj.getRollNo();
            //direct access of rollno is not possible due to encapsulation
            //System.out.println("Prime' rollNo : + obj.geekName)

        }
    }

}
