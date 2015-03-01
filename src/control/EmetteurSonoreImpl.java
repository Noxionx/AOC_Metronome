package control;

import java.applet.Applet;

public class EmetteurSonoreImpl implements EmetteurSonore{

	java.net.URL url = getClass().getResource("/view/Beep.wav");
	java.applet.AudioClip clip = Applet.newAudioClip(url);
	
	/**
	 * émets un bip
	 */
	@Override
	public void emettreClic() {
		clip.play();
	}

}
