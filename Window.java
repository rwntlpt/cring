package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Window {
	private int width = 800, height = 600;
	private Canvas canvas;
	private BufferStrategy bufferStrategy;
	private JFrame frame;
	public Graphics graphics;
	
	public Window() {
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setTitle("Lame");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		canvas = new Canvas();
		frame.add(canvas);
		canvas.createBufferStrategy(2);
		//canvas.addMouseListener(mouseInput);
		//canvas.addMouseMotionListener(mouseInput);
		//canvas.addMouseWheelListener(mouseInput);
		canvas.setFocusable(true);
		canvas.requestFocus();
	}
	
	void clear() {
		bufferStrategy = canvas.getBufferStrategy();
		graphics = bufferStrategy.getDrawGraphics();
		bufferStrategy = canvas.getBufferStrategy();
		graphics = bufferStrategy.getDrawGraphics();
		canvas.paint(graphics);
		
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, width, height);
	}
	
	void update() {
		bufferStrategy.show();
		graphics.dispose();
	}
}
