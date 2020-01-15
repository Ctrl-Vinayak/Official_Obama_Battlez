package com.obama_battlez.map_designing_fx.first;

import java.time.Duration;

import org.reactfx.util.FxTimer;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;

public class GameLoop {

	public static int frame = 0;
	public static int aniFrame = 0;
	
	public static int WFrame = 0;
	public static int AFrame = 0;
	public static int SFrame = 0;
	public static int DFrame = 0;
	
	public static int xx = 11;
	public static int yy = 1;

	public static boolean collW;
	public static boolean collA;
	public static boolean collS;
	public static boolean collD;

	public static void startLoop() {
		FxTimer.runPeriodically(Duration.ofMillis((long) 1000 / (long) Core.set_fps_to), () -> {

			// sprite looks to certain direction (:
			if (Sprite.isPressedW == true) {
				Sprite.back = true;
				Sprite.left = false;
				Sprite.front = false;
				Sprite.right = false;
				Sprite.spriteBoi.setImage(Sprite.back1_img);
			}
			if (Sprite.isPressedA == true) {
				Sprite.back = false;
				Sprite.left = true;
				Sprite.front = false;
				Sprite.right = false;
				Sprite.spriteBoi.setImage(Sprite.left1_img);
			}
			if (Sprite.isPressedS == true) {
				Sprite.back = false;
				Sprite.left = false;
				Sprite.front = true;
				Sprite.right = false;
				Sprite.spriteBoi.setImage(Sprite.front1_img);
			}
			if (Sprite.isPressedD == true) {
				Sprite.back = false;
				Sprite.left = false;
				Sprite.front = false;
				Sprite.right = true;
				Sprite.spriteBoi.setImage(Sprite.right1_img);
			}

			if (Sprite.isPressedW == false && Sprite.isPressedA == false && Sprite.isPressedS == false
					&& Sprite.isPressedD == false) {
				frame = 0;
			} else {
				frame++;
			}

			GameLoop.checkCollision();
			try {
				GameLoop.spriteMovement();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Core.camera.setTranslateX(Sprite.spriteBoi.getX() - (Core.sceneWidth / 2 - 50));
			Core.camera.setTranslateY(Sprite.spriteBoi.getY() - (Core.sceneHeight / 2 - 50));

			if (Core.isConsoleSpamOn == false) {
				System.out.println("isPressed: " + Sprite.isPressed);
				System.out.println("isPressedW: " + Sprite.isPressedW);
				System.out.println("isPressedA: " + Sprite.isPressedA);
				System.out.println("isPressedS: " + Sprite.isPressedS);
				System.out.println("isPressedD: " + Sprite.isPressedD);
				System.out.println("back: " + Sprite.back);
				System.out.println("left: " + Sprite.left);
				System.out.println("front: " + Sprite.front);
				System.out.println("right: " + Sprite.right);
				System.out.println("is walking: " + Sprite.isWalking);
				System.out.println("is running: " + Sprite.isRunning);
				System.out.println("frame: " + frame);
				System.out.println("WFrame: " + WFrame);
				System.out.println("AFrame: " + AFrame);
				System.out.println("SFrame: " + SFrame);
				System.out.println("DFrame: " + DFrame);
				System.out.println("mapArea: " + Core.mapOne[yy][xx]);
				System.out.println(".");
			}
		});
	}

	public static void checkCollision() {
		// PRESS W COLLISION.
			yy--;
		if(Core.mapOne[yy][xx] == 1 || Core.mapOne[yy][xx] == -1 || Core.mapOne[yy][xx] == -2 || Core.mapOne[yy][xx] == 3) {
			yy++;
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			collW = true;
		} else {
			yy++;
			collW = false;
		}
		
		// PRESS A COLLISION.
			xx--;
		if(Core.mapOne[yy][xx] == 1 || Core.mapOne[yy][xx] == -1 || Core.mapOne[yy][xx] == -2 || Core.mapOne[yy][xx] == 3) {
			xx++;
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			collA = true;
		} else {
			xx++;
			collA = false;
		}
	
		// PRESS S COLLISION.
			yy++;
		if(Core.mapOne[yy][xx] == 1 || Core.mapOne[yy][xx] == -1 || Core.mapOne[yy][xx] == -2 || Core.mapOne[yy][xx] == 3) {
			yy--;
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			collS = true;
		} else {
			yy--;
			collS = false;
		}
		
		// PRESS S COLLISION.
			xx++;
		if(Core.mapOne[yy][xx] == 1 || Core.mapOne[yy][xx] == -1 || Core.mapOne[yy][xx] == -2 || Core.mapOne[yy][xx] == 3) {
			xx--;
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			System.out.println("COLLISION");
			collD = true;
		} else {
			xx--;
			collD = false;
		}
	}
	
	//TODO verwijder stotter (:
	public static void spriteMovement() throws Exception {
		// movement W (begin)
		if(Sprite.isPressedW == true && Sprite.back == true && collW == false) {
			WFrame++;
			if(WFrame % 15 == 0) {
				doAnimate_W();
				yy--;
			}
		} else {
			WFrame = 0;
		}
		// movement W (end)
		
		// movement A (begin)
		if(Sprite.isPressedA == true && Sprite.left == true && collA == false) {
			AFrame++;
			if(AFrame % 15 == 0) {
				doAnimate_A();
				xx--;
			}
		} else {
			AFrame = 0;
		}
		// movement A (end)
		
		// movement S (begin)
		if(Sprite.isPressedS == true && Sprite.front == true && collS == false) {
			SFrame++;
			if(SFrame % 15 == 0) {
				doAnimate_S();
				yy++;
			}
		} else {
			SFrame = 0;
		}
		// movement S (end)
		
		// movement D (begin)
		if(Sprite.isPressedD == true && Sprite.right == true && collD == false) {
			DFrame++;
			if(DFrame % 15 == 0) {
				doAnimate_D();
				xx++;
			}
		} else {
			DFrame = 0;
		}
		// movement D (end)
	}
	
	public static void doAnimate_W() throws Exception {
		//its playing and about 5 seconds later it will
		//say nibba. (:
		//new Timeline(new KeyFrame(Duration.millis(5000), 
		//		ae -> System.out.println("nibba"))).play();
		
		FxTimer.runLater(
	        Duration.ofMillis(1000 / 60 * 20),
	        () -> {
	        for (int i = 0; i < 101; i++) {
	        	FxTimer.runLater(
    		        Duration.ofMillis(2 * i),
    		        () -> {
        		        Sprite.spriteBoi.setY(Sprite.spriteBoi.getY() - 1);
    	        });
	        }
        });
	}
	
	public static void doAnimate_A() throws Exception {
		FxTimer.runLater(
	        Duration.ofMillis(1000 / 60 * 20),
	        () -> {
	        for (int i = 0; i < 101; i++) {
	        	FxTimer.runLater(
    		        Duration.ofMillis(2 * i),
    		        () -> {
        		        Sprite.spriteBoi.setX(Sprite.spriteBoi.getX() - 1);
    	        });
	        }
        });
	}
	
	public static void doAnimate_S() throws Exception {
		FxTimer.runLater(
	        Duration.ofMillis(1000 / 60 * 20),
	        () -> {
	        for (int i = 0; i < 101; i++) {
	        	FxTimer.runLater(
    		        Duration.ofMillis(2 * i),
    		        () -> {
        		        Sprite.spriteBoi.setY(Sprite.spriteBoi.getY() + 1);
    	        });
	        }
        });
	}
	
	public static void doAnimate_D() throws Exception {
		FxTimer.runLater(
	        Duration.ofMillis(1000 / 60 * 20),
	        () -> {
	        for (int i = 0; i < 101; i++) {
	        	FxTimer.runLater(
    		        Duration.ofMillis(2 * i),
    		        () -> {
        		        Sprite.spriteBoi.setX(Sprite.spriteBoi.getX() + 1);
    	        });
	        }
        });
	}
}
