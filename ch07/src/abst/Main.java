package abst;
//p.375~376
public class Main {
	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play();
		cd.play();
		cd.btnpause();
		cd.play();
		cd.nextTrack();
		cd.play();
		cd.btnpause();
		cd.play();
		cd.stop();
	}
}
