public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object callled p1p1.
        p1.setColor("blue"); // or
        
        System.out.println(p1.getColor());
        p1.setTip(3);
        System.out.println(p1.getTip());
        BankAccount myAccount = new BankAccount();
        myAccount.username = "shrdha";
        // myAccount.password = "abchsdfds";
        myAccount.setPassword("dfjdfjhdjh");
        // it showing error coz password is not acessible outside of class;
       Student student1 = new Student();
       Student student2 = new Student("neha");
       Student student3 = new Student(23);
       Student s3 = new Student(student3);
    }
}

// access modifiers
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    };

}

class Pen {
  private  String color;
   private int tip;

    String getColor(){
        return this.color;
    } //getter function
    int getTip(){
        return this.tip;
    }
    void setColor(String newcolor) {
       this. color = newcolor;
    } //setter function

    void setTip(int newTip) {
       this.tip = newTip;
    }
}

// class student {
//     String name;
//     int age;
//     float percentage;

//     void calculatePErcentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3;
//     }
// }

class Student {
    String name;
    int roll;

    String password;
    // constructor overloading -- we cant use student() (nonparametrized)constuctor without defined it if we have defined paramiterized constructor
    Student(){
        System.out.println("hello world");;
    }
  Student(String name){
        // this is constructur
        this.name = name;

    }
    Student(int roll){
        this.roll = roll;
    }
    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1. roll;
    }
}