package com.obama_battlez.map_designing_fx.first;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * <h1>Collision Testing!</h1>
 * This is the core of the map development.
 * 
 * @author vinay
 * @version 1.0
 * @since 2019-12-28
 * @category Map Designing || Core
 */
public class Core extends Application {
	
	public final static String GAMETITLE = "OBAMA BATTLEZ || MAP DESIGNING || v1.0";
	public static Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
	public static double monitorWidth = (primaryScreenBounds.getWidth());
	public static double monitorHeight = (primaryScreenBounds.getHeight());
	public static double sceneWidth = (monitorWidth / 1.5);
	public static double sceneHeight = (monitorHeight / 1.5);
	public static double set_fps_to;
	public static boolean isFullScreen;
	public static boolean isConsoleSpamOn;
	
	public static Group root;
	public static Scene scene;
	public static Stage window;
	
	public static Camera camera = new PerspectiveCamera();
	
	/**
	 * index determines what object stand still in that tile:	
	 * 0 = just ground;
	 * 1 = trees;
	 * 2 = grass;
	 * 3 = house;
	 * 4 = sand(ground);
	 * 5 = sand(water);
	 * 6 = water(lightblue);
	 * 7 = road;
	 */
	
	
	public static double[][] mapTwo = {
		{1, 1, 1, 7, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 7, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 7, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{0, 0, 0, 7, 7, 7, 7, 7, 7, 7, 7, 2, 2, 2, 3, 3, 3, 3, 3, 3, 1, 1},
		{5, 4, 0, 0, 7, 7, 7, 7, 7, 7, 7, 7, 2, 2, 3, 3, 3, 3, 3, 3, 1, 1},
		{6, 5, 4, 0, 7, 7, 0, 0, 0, 0, 7, 7, 7, 2, 3, 3, 3, 3, 3, 3, 1, 1},
		{6, 6, 5, 4, 7, 7, 0, 0, 0, 0, 0, 0, 7, 7, 7, 7, 7, 0, 0, 0, 1, 1},
		{6, 6, 5, 4, 7, 7, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 1, 1},
		{6, 5, 4, 4, 7, 7, 0, 5, 6, 5, 5, 5, 0, 0, 0, 0, 4, 5, 6, 6, 1, 1},
		{5, 4, 0, 0, 7, 7, 5, 6, 6, 6, 6, 6, 5, 0, 0, 0, 5, 6, 6, 6, 1, 1},
		{0, 0, 0, 0, 7, 7, 5, 6, 6, 6, 6, 6, 6, 5, 0, 0, 5, 6, 6, 6, 1, 1},
		{1, 1, 1, 1, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 1, 1, 1, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};
	
	/**
	 * index determines what object stand still in that tile: 
	 * -1 = tree part, just ground.
	 * 0 = just ground; 
	 * 1 = trees; 
	 * 2 = grass; 
	 * 3 = house; 
	 * 4 = sand; 
	 * 5 = water; 
	 * 6 = road;
	 * 
	 * 7 = sand ground Edge 1
	 * 8 = sand ground Edge 2
	 * 9 = sand ground Edge 3
	 * 10 = sand ground Edge 4
	 * 
	 * 11 = sand ground Half 1
	 * 12 = sand ground Half 2
	 * 13 = sand ground Half 3
	 * 14 = sand ground Half 4
	 * 
	 * 15 = sand water Edge 1
	 * 16 = sand water Edge 2
	 * 17 = sand water Edge 3
	 * 18 = sand water Edge 4
	 * 
	 * 19 = sand water Half 1
	 * 20 = sand water Half 2
	 * 21 = sand water Half 3
	 * 22 = sand water Half 4
	 */
	
	public static double[][] mapOne = {
		{0, 0, 0, 0, 1, -1, 1, -1, 1, -1, 6, 6, 6, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1},
		{0, 0, 0, 0, -1, -1, -1, -1, -1, -1, 6, 6, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
		{0, 0, 0, 0, 1, -1, 1, -1, 1, -1, 6, 6, 6, 1, 0, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1},
		{0, 0, 0, 0, -1, -1, -1, -1, -1, -1, 6, 6, 6, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
		{0, 0, 0, 0, 1, -1, 1, -1, 1, -1, 6, 6, 6, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1},
		{0, 0, 0, 0, -1, -1, -1, -1, -1, -1, 6, 6, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
		{0, 0, 0, 0, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, -1},
		{0, 0, 0, 0, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, -1, -1},
		{0, 11, 11, 11, 11, 11, 11, 11, 8, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, -1},
		{0, 15, 19, 19, 19, 19, 16, 4, 12, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, -1, -1},
		{0, 22, 5, 5, 5, 5, 20, 4, 12, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 22, 5, 5, 5, 5, 20, 4, 12, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 22, 5, 5, 5, 5, 20, 4, 12, 0, 6 ,6 ,6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 22, 5, 5, 5, 5, 20, 4, 12, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 22, 5, 5, 5, 5, 20, 4, 12, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 18, 21, 21, 21, 21, 17, 4, 12, 0, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 13, 13, 13, 13, 13, 13, 13, 10, 0,6 ,6 ,6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	};
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new Group();
		scene = new Scene(root, sceneWidth, sceneHeight, Color.CORNFLOWERBLUE);
		window = primaryStage;
		window.setScene(scene);
		window.setTitle(GAMETITLE);
		window.show();
		set_fps_to = 60;
		isFullScreen = false;
		isConsoleSpamOn = false;
		
		MapElements.addAllElements();
		Sprite.addSprite();
		Sprite.keyEventSprite();
		GameLoop.startLoop();
		Core.cameraSettings();
	}
	
	public static void cameraSettings() {
		scene.setCamera(camera);
		Core.camera.setTranslateX(Sprite.spriteBoi.getX() - (Core.sceneWidth / 2 - 50));
		Core.camera.setTranslateY(Sprite.spriteBoi.getY() - (Core.sceneHeight / 2 - 50));
	}
}
