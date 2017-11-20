package br.com.ajbg.screentrace;

import javax.microedition.lcdui.Displayable;

public interface STElement {
	Displayable getDisplayable ();
	void show (STElement screen);
	void back (int qtdScreens);
}
