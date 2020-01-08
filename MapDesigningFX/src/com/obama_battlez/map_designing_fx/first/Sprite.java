package com.obama_battlez.map_designing_fx.first;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Sprite {

	public static String back1 = Sprite.class.getResource("resources/sprites/back1.png").toExternalForm();
	public static String back2 = Sprite.class.getResource("resources/sprites/back2.png").toExternalForm();
	public static String back3 = Sprite.class.getResource("resources/sprites/back3.png").toExternalForm();
	public static String front1 = Sprite.class.getResource("resources/sprites/front1.png").toExternalForm();
	public static String front2 = Sprite.class.getResource("resources/sprites/front2.png").toExternalForm();
	public static String front3 = Sprite.class.getResource("resources/sprites/front3.png").toExternalForm();
	public static String left1 = Sprite.class.getResource("resources/sprites/left1.png").toExternalForm();
	public static String left2 = Sprite.class.getResource("resources/sprites/left2.png").toExternalForm();
	public static String left3 = Sprite.class.getResource("resources/sprites/left3.png").toExternalForm();
	public static String right1 = Sprite.class.getResource("resources/sprites/right1.png").toExternalForm();
	public static String right2 = Sprite.class.getResource("resources/sprites/right2.png").toExternalForm();
	public static String right3 = Sprite.class.getResource("resources/sprites/right3.png").toExternalForm();

	public static Image back1_img = new Image(back1);
	public static Image back2_img = new Image(back2);
	public static Image back3_img = new Image(back3);
	public static Image front1_img = new Image(front1);
	public static Image front2_img = new Image(front2);
	public static Image front3_img = new Image(front3);
	public static Image left1_img = new Image(left1);
	public static Image left2_img = new Image(left2);
	public static Image left3_img = new Image(left3);
	public static Image right1_img = new Image(right1);
	public static Image right2_img = new Image(right2);
	public static Image right3_img = new Image(right3);

	public static ImageView spriteBoi = new ImageView();

	public static boolean back = false;
	public static boolean left = false;
	public static boolean front = true;
	public static boolean right = false;

	public static boolean isPressed = false;
	public static boolean isPressedW = false;
	public static boolean isPressedA = false;
	public static boolean isPressedS = false;
	public static boolean isPressedD = false;

	public static boolean isWalking;
	public static boolean isRunning;
	public static int walkSpeed = 1;
	public static int runSpeed = 2;

	public static void addSprite() {
		spriteBoi.setImage(front1_img);
		spriteBoi.setX(700);
		spriteBoi.setY(-25);
		spriteBoi.setFitWidth(100);
		spriteBoi.setFitHeight(100);
		Core.root.getChildren().add(spriteBoi);
	}

	private static double cameraZPosition = 0;

	public static void keyEventSprite() {
		Core.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {

				// keyevents MOVEMENTS!
				isPressed = true;

				if (event.getCode() == KeyCode.W && !event.isShiftDown()) {
					isPressedW = true;
				}
				if (event.getCode() == KeyCode.A && !event.isShiftDown()) {
					isPressedA = true;
				}
				if (event.getCode() == KeyCode.S && !event.isShiftDown()) {
					isPressedS = true;
				}
				if (event.getCode() == KeyCode.D && !event.isShiftDown()) {
					isPressedD = true;
				}
				if (event.isShiftDown() == true) {
					isWalking = false;
					isRunning = true;
				} else {
					isWalking = true;
					isRunning = false;
				}

				// keyevents CAMERA!
				if (event.getCode() == KeyCode.Z && event.isShiftDown()) {
					Core.camera.setTranslateZ(cameraZPosition -= 250);
				} else if (event.getCode() == KeyCode.Z && event.isControlDown()) {
					Core.camera.setTranslateZ(cameraZPosition += 250);
				}
			}
		});

		Core.scene.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {

				// keyevents MOVEMENTS!
				isPressed = false;

				if (event.getCode() == KeyCode.W && !event.isShiftDown()) {
					isPressedW = false;
				}
				if (event.getCode() == KeyCode.A && !event.isShiftDown()) {
					isPressedA = false;
				}
				if (event.getCode() == KeyCode.S && !event.isShiftDown()) {
					isPressedS = false;
				}
				if (event.getCode() == KeyCode.D && !event.isShiftDown()) {
					isPressedD = false;
				}
				if (isPressedW == false && isPressedA == false && isPressedS == false && isPressedD == false) {
					isWalking = false;
					isRunning = false;
				}

				// keyevents CAMERA!
				if (event.getCode() == KeyCode.Z && event.isShiftDown()) {
					Core.camera.setTranslateZ(cameraZPosition -= 0);
				} else if (event.getCode() == KeyCode.Z && event.isControlDown()) {
					Core.camera.setTranslateZ(cameraZPosition += 0);
				}
			}
		});
	}
}
