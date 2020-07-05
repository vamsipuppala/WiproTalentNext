package overriding;
class Fruit{
  String name;
  String taste;
   int size;
  void eat()
   {
        System.out.println(name+"\n"+taste);
   }
}
class Apple extends Fruit{
   Apple(String n,String t,int n1)
	{

            name=n;
 	    taste=t;
            size=n1;
	}
   void eat()
	{
	    System.out.println("the name of the fruit is " +name  +" and its taste is "+taste);
	}
}
class Orange extends Fruit{
   Orange(String n,String t,int n1)
	{

            name=n;
 	    taste=t;
            size=n1;
	}
   void eat()
	{
	     System.out.println("the name of the fruit is " +name  +" and its taste is "+taste);
	}
}
class one{
  public static void main(String[] args)
  {
        Apple A=new Apple("Apple","sweet",3);
           A.eat();
          Orange O=new Orange("Orange","sour",2);
          O.eat();
  }

}