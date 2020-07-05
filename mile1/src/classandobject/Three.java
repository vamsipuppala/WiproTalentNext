package classandobject;;
class Patient
{  
    String patientName;
    double height,width;
    Patient(String patientName,double height,double  width)
    {
        this.patientName=patientName;
        this.height=height;
        this.width=width;
    }
    double computeBMI(double weight)
    {
        double t=this.height*this.height;
        return weight/t;
    }
}
public class Three {
    public static void main(String args[]) {
     
     Patient p=new Patient("Raju",5.6,5.5);
     System.out.println(p.computeBMI(72));
    }
}