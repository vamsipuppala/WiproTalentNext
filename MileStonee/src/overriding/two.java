package overriding;
class shape{
 
  void draw()
   {
        System.out.println("Drawing shape");
   }
void erase()
   {
        System.out.println("Erasing shape");
   }
}
class Circle extends shape{
  
   void draw()
   {
        System.out.println("Drawing Circle");
   }
void erase()
   {
        System.out.println("Erasing circle");
   }
}
class Triangle extends shape{
  
   void draw()
   {
        System.out.println("Drawing Triangle ");
   }
void erase()
   {
        System.out.println("Erasing Triangle ");
   }
}
class Square extends shape{
  
   void draw()
   {
        System.out.println("Drawing Square ");
   }
void erase()
   {
        System.out.println("Erasing Square ");
   }
}


class two{
  public static void main(String[] args)
  {
        shape c= new Circle();
        shape t=new Triangle();
        shape s=new Square();
        c.draw();
        c.erase();
         s.draw();
        s.erase();
         t.draw();
        t.erase();
  
  }

}