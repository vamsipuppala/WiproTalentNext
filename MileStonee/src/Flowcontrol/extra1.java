package Flowcontrol;
public class extra1 {
    public static void main(String args[]) {
        int n=6;
        int cnt=0;
        while(cnt<5)
        {
            if(n%2==0 && n%3==0 && n%5==0)
            {
                cnt++;
                System.out.print(n+" ");
            }
            n++;
        }
    }
}