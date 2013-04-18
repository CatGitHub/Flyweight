package by.bsu.flyweight.form;

public class ConcreteSymbol extends Symbol {

	public ConcreteSymbol(char anotherLetter, int anotherSize) {
		letter = anotherLetter;
		size = anotherSize;
		height = 100;
		width = 100;
		ascent = 50;
		descent = 50;
	}

	@Override
	void display() {
		System.out.println(letter + " ( symbol's size = " + size + " )");
	}

}
