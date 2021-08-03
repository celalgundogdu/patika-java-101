package classes.practise1;

public class Teacher {

    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void print(){
        System.out.println("İsim\t: " + this.name);
        System.out.println("Telefon\t: " + this.phoneNumber);
        System.out.println("Bölüm\t: " + this.branch);
    }

}
