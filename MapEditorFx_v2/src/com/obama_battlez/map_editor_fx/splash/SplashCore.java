package com.obama_battlez.map_editor_fx.splash;

import java.time.Duration;

import org.reactfx.util.FxTimer;

import com.obama_battlez.map_editor_fx.core.UI_SelectionMenu;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class SplashCore extends Application{

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
	
	public static Camera camera = new PerspectiveCamera();
	
	private static ImageView splash[] = new ImageView[5];
	private static int frame = 0;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new Group();
		scene = new Scene(root, sceneWidth, sceneHeight, Color.CRIMSON);
		window = primaryStage;
		window.setScene(scene);
		window.setTitle(GAMETITLE);
		window.show();
		fps = 60;
		isFullScreen = false;
		isConsoleSpamOn = false;
		
		for (int i = 0; i < splash.length; i++) {
			splash[i] = new ImageView(new Image(UI_SelectionMenu.class.getResource("resources/splash" + (i + 1) + ".png").toExternalForm()));
			splash[i].setX(400);
			splash[i].setY(400);
			splash[i].prefWidth(500);
			splash[i].prefHeight(500);
			splash[i].setOpacity(0);
			root.getChildren().add(splash[i]);
		}
		
		FxTimer.runPeriodically(Duration.ofMillis((long) (1000 / 2)), () -> {
			frame++;
			if (frame == 10) {
				frame = 0;
			}
			
			for (int i = 0; i < splash.length; i++) {
				if (frame == i * (splash.length / 2.5)) {
					splash[0].setOpacity(0);
					splash[i].setOpacity(1);
				} else {
					splash[0].setOpacity(1);
					splash[i].setOpacity(0);
				}
			}
		});
	}
}
