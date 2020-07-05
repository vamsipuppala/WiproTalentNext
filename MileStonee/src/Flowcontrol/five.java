package Flowcontrol;
public class five {
    public static void main(String args[]) {
    char a='x';
    if((a>='A' && a<='Z') || (a>='a' && a<='z'))
    System.out.println("Alphabet");
    else if(a>='0' && a<='9')
    System.out.println("Digit");
    else
     System.out.println("Special Character");
    }
}