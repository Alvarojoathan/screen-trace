package br.com.ajbg.screentrace.lcdui;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

import br.com.ajbg.screentrace.STElement;

public class STForm extends Form implements STElement {
	private STElement parent;

	public STForm(String title, STElement parent) {
		super(title);
		this.parent = parent;
	}

	public Displayable getDisplayable () {
		return this;
	}

	public void show (STElement screen) {
		parent.show (screen);
	}

	public void back (int qtdScreens) {
		if (qtdScreens == 0) {
			parent.show (this);
		} else {
			parent.back (qtdScreens - 1);
		}
	}
}
