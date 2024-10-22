package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @since 22-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.5
 */
public class ME_CoreFX extends Application {

	public final static String GAMETITLE = "OBAMA BATTLEZ || MAP EDITOR || v1.0";
	public static Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
	public static double monitorWidth = (primaryScreenBounds.getWidth());
	public static double monitorHeight = (primaryScreenBounds.getHeight());
	public static double sceneWidth = (monitorWidth / 1.5);
	public static double sceneHeight = (monitorHeight / 1.5);
	public static boolean isFullScreen;
	public static boolean isConsoleSpamOn;
	
	public static Group root;
	public static Scene scene;
	public static Stage window;
	
	public static int fps = 60;
	public static boolean isZoomedIn = false;
	public static boolean isZoomedOut = false;
	public static boolean isUI_TilePlacement = true;
	
	public static Camera camera = new PerspectiveCamera();
	public static int cameraPosX = 0;
	public static int cameraPosY = 0;
	public static int cameraPosZ = 0;
	public static int cameraVelX = 0;
	public static int cameraVelY = 0;
	public static int cameraVelZ = 0;
	
	public static boolean back = false;
	public static boolean left = false;
	public static boolean front = false;
	public static boolean right = false;
	
	public static String copyMap = "";
	public static Button printMap = new Button("print map");
	public static int buttonYPos = 0;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new Group(); 
		scene = new Scene(root, sceneWidth, sceneHeight, Color.CORNFLOWERBLUE);
		scene.setCamera(camera);
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
		UI_Menu.addPrintButton();
		ME_GameLoop.startLoop();
	}
}