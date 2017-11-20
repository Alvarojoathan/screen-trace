package br.com.ajbg.screentrace.midlet;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

import br.com.ajbg.screentrace.STElement;

public abstract class STMIDlet extends MIDlet implements STElement {

	public Displayable getDisplayable () {
		return null;
	}

	public void show (STElement screen) {
		Display.getDisplay (this).setCurrent (screen.getDisplayable ());
	}

	public void back (int qtdScreens) {
		try {
			destroyApp (true);
			notifyDestroyed ();
		} catch (MIDletStateChangeException e) { }
	}
}
