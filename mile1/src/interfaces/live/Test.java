package interfaces.live;
import interfaces.music.Playable;
import interfaces.music.string.Veena;
import interfaces.music.wind.Saxophone;
public class Test {
public static void main(String[] args) {
	Veena v = new Veena();
	Saxophone s= new Saxophone();
	Playable pv= new Veena();
	Playable ps=new Saxophone();
	v.play();
	s.play();
	pv.play();
	ps.play();
}
}