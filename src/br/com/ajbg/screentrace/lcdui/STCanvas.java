package br.com.ajbg.screentrace.lcdui;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;

import br.com.ajbg.screentrace.STElement;

public abstract class STCanvas extends Canvas implements STElement {
	private STElement parent;

	public STCanvas (STElement parent) {
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
