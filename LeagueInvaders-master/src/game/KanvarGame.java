package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class KanvarGame {

	public static BufferedImage tl;
	public static BufferedImage bl;
	public static BufferedImage tr;
	public static BufferedImage br;
	

	public KanvarGame() {
		// TODO Auto-generated constructor stub
		
		try {
			bl = ImageIO.read(this.getClass().getResourceAsStream("bottomleft.png"));
			tl = ImageIO.read(this.getClass().getResourceAsStream("topleft.png"));
			br = ImageIO.read(this.getClass().getResourceAsStream("bottomright.png"));
			tr = ImageIO.read(this.getClass().getResourceAsStream("topright.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new KanvarGame
	}
	public void start(){
		new GameWindow(WIDTH, HEIGHT, "League Invaders");
	}
	public void draw(Graphics g){
		//g.setColor(Color.RED);
		//g.fillRect(x, y, width, height);
		
		g.drawImage(GamePanel.alien, x, y, width, height, null);
		//g.setColor(Color.CYAN);
		//g.drawRect(colBox.x, colBox.y, colBox.width, colBox.height);
	}

}
