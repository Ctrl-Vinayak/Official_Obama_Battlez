package com.obama_battlez.map_designing_fx.first;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class GameLoop {

	public static int frame = 0;
	
	public static int WFrame = 0;
	public static int AFrame = 0;
	public static int SFrame = 0;
	public static int DFrame = 0;
	
	public static int xx = 7;
	public static int yy = 0;

	private static Timeline tl;

	public static void startLoop() {
		tl = new Timeline(new KeyFrame(Duration.millis(1000 / Core.set_fps_to), e -> {

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

			GameLoop.spriteMovement();
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
		}));
		tl.setCycleCount(Animation.INDEFINITE);
		tl.play();
	}

	public static void spriteMovement() {
		if(Sprite.isPressedD == true && Sprite.right == true) {
			DFrame++;
			if(DFrame % 9 == 8) {
				Sprite.spriteBoi.setX(Sprite.spriteBoi.getX() + 50);
				xx++;
			}
		} else {
			DFrame = 0;
		}
	}
}
