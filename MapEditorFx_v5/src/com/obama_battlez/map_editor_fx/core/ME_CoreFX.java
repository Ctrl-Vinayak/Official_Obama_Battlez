package com.obama_battlez.map_editor_fx.core;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @since 18-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.2
 */
public class ME_CoreFX extends Application {

	public final static String GAMETITLE = "OBAMA BATTLEZ || MAP EDITOR || v1.0";
	public static Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
	public static double monitorWidth = (primaryScreenBounds.getWidth());
	public static double monitorHeight = (primaryScreenBounds.getHeight());
	public static double sceneWidth = (monitorWidth / 1.5);
	public static double sceneHeight = (monitorHeight / 1.5);
	public static double fps;
	public static boolean isFullScreen;
	public static boolean isConsoleSpamOn;
	
	public static Group root;
	public static Scene scene;
	public static Stage window;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new Group(); 
		scene = new Scene(root, sceneWidth, sceneHeight, Color.CORNFLOWERBLUE);
		window = primaryStage;
		window.setScene(scene);
		window.setTitle(GAMETITLE);
		window.show();
		fps = 60;
		isFullScreen = false;
		isConsoleSpamOn = false;
		
		ME_Resource.addResources();
		UI_TilePlacement.addBackground();
		UI_TilePlacement.backgroundFunc();
		UI_Menu.addBackground();
		UI_Menu.addTilesSelections();
		UI_Menu.tileFuncSelection();
		UI_Menu.addScrollBar();
		ME_GameLoop.startLoop();
	}
}