package game;

import java.awt.Color;

public class Game {
	public static void main(String[] args) throws InterruptedException {
		float x = 100;
		
		double currentTime = System.nanoTime() / 1000000;
		double lastTime = currentTime;
		
		byte frameCap = 60;
		long frameDelay = (long)(((double)1000 / (double)frameCap) * 1e+6);
		long currentFrameTime = System.nanoTime();
		long lastFrameTime = currentFrameTime;
		
		
		
		Window window = new Window();
		while(true) {
			currentFrameTime = System.nanoTime();
			if(currentFrameTime - lastFrameTime >= frameDelay)
			{
				window.clear();
				
				window.graphics.setColor(Color.blue);
				window.graphics.fillRect((int)x, 0, 100, 100);
				x++;
				
				window.update();
				lastFrameTime = currentFrameTime;
			}
		}
	}
}
