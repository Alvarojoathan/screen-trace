package br.com.ajbg.screentrace.lcdui;

import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;

import br.com.ajbg.screentrace.STElement;

public class STList extends List implements STElement {
	private STElement parent;

	public STList(String title, int listType, STElement parent) {
		super(title, listType);
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
