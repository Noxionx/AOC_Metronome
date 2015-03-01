package control;

import app.MainApp;

public class MoletteImpl implements Molette{

	@Override
	public float position() {
		return (float)MainApp.getView().getSlider().getValue();
	}

}
