/*
	Author: David Whynot
	Created: 11/30/17
	Updated: 11/30/17
	v2.0.0
	Board
*/
import java.awt.Color;
import java.util.*;
public class Board extends JFrame {
	/* PROPERTIES */
	protected int x = 640;
	protected int y = 480;

	protected int cellx = 1;
	protected int celly = 1;

	protected Color bg = Color.black;


	/* CONSTRUCTORS */
	Board() {
		System.out.println("board is using defaults");
	}
	Board(Options o) {
		x = o.getX();
		y = o.getY();

		cellx = o.getCellX();
		celly = o.getCellY();

		bg = o.getColor();

		System.out.println("board is using overloaded constructor 1");
	}


	/* GETTERS */
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}


	/* SETTERS */
	public void setX(int n) {
		x = n;
	}
	public void setY(int n) {
		y = n;
	}
	public int getCellX() {
		return cellx;
	}
	public int getCellY() {
		return celly;
	}
	public Color getBgColor() {
		return bg;
	}
	public void setBgColor(Color c) {
		bg = c;
	}

	/* RENDERING FUNCTIONS */
	public Dimension getPreferredSize() {
    return new Dimension(canvas.getWidth(), canvas.getHeight());
  }

	public void paintComponent() {

	}
}
