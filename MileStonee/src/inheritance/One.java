package inheritance;
class Animal{
    void eat(){
        System.out.println("An animal eats food when hungry");
    }
    
    void sleep(){
        System.out.println("An animal sleeps when it feels tired");
    }
    
}
class Bird extends Animal{
    void eat()
    {
        System.out.println("A bird eats worms");
    }
    void sleep()
    {
        System.out.println("A bird sleeps on its nest");
    }
}
public class One {
    public static void main(String args[]) {
      Animal a=new Animal();
      a.eat();
      a.sleep();
      Bird b=new Bird();
      b.eat();
      b.sleep();
      }
}