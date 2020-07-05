package classandobject;
class Box
{  
  double width,height,depth;
    Box(double  width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    
    double volume()
    {
        return this.width*this.height*this.depth;
    }
}
public class One {
    public static void main(String args[]) {
     Box b=new Box(12,13.5,14.4);
     System.out.println("Volume :"+b.volume());
      
    }
}