interface  Animal{
    void walk();
}
interface dog{
    void bark();
}
class Man implements Animal,dog{
    public void walk(){
        System.out.println("ANIMAL CAN WALK");
    }
    public void bark(){
        System.out.println("DOG CAN WALK");
    }
}


public class interface1{
    public static void main(String args[]){
    Man a1=new Man();
    a1.walk();
    a1.bark();
}
}
