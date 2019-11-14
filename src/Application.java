import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

	public static String GAMETITLE = "Obama Battlez";
	public static Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
	public static double WIDTH = (primaryScreenBounds.getWidth());
	public static double HEIGHT = (primaryScreenBounds.getHeight());
	public static double SCENEWIDTH = (WIDTH / 1.5);
	public static double SCENEHEIGHT = (HEIGHT / 1.5);
	public static double setFPSto = 1000 / (1000 / 30);
	
	public static Stage WINDOW;
	public static Stage CLOSEWINDOW;
	
	public static Scene beginScene;
	public static Group beginRoot;
	
	private String[] pngNames = {"/Start.png", "/bloem7.png", "/plant7.png", "/plant8.png", "/sprite_1_2.png", 
		"/sprite_2.png"
	};
	private String[] gifNames = {"/obama_meets_willem.gif", "/obama_walk2.gif", "/robberySceneV2.gif"
			
	};
	private String[] txtNames = {"/txtTest.txt", "/txtTest - kopie.txt", "/txtTest - kopie (2).txt", "/txtTest - kopie (3).txt",
		"/txtTest - kopie (4).txt", "/txtTest - kopie (5).txt"
	};
	private String[] otherNames = {"/qwertyu.php", "/testFile.xml"
			
	};
	
	private String dataFolder = System.getProperty("user.home") + "\\AppData\\Roaming\\.000_ObamaBattlez";
	private String pngFolder = System.getProperty("user.home") + "\\AppData\\Roaming\\.000_ObamaBattlez\\pngFolder";
	private String gifFolder = System.getProperty("user.home") + "\\AppData\\Roaming\\.000_ObamaBattlez\\gifFolder";
	private String txtFolder = System.getProperty("user.home") + "\\AppData\\Roaming\\.000_ObamaBattlez\\txtFolder";
	private String otherFolder = System.getProperty("user.home") + "\\AppData\\Roaming\\.000_ObamaBattlez\\otherFolder";
	
	private String this_pngFolder = "src/pngFolder";
	private String this_gifFolder = "src/gifFolder";
	private String this_txtFolder = "src/txtFolder";
	private String this_otherFolder = "src/otherFolder";
	
	private File dataStringFolder = new File(dataFolder);
	private File pngStringFolder = new File(pngFolder);
	private File gifStringFolder = new File(gifFolder);
	private File txtStringFolder = new File(txtFolder);
	private File otherStringFolder = new File(otherFolder);
	
	public void start(Stage primaryStage) throws Exception {
		try {
			System.out.println(SCENEWIDTH);	
			System.out.println(SCENEHEIGHT);	
				
			beginRoot = new Group();
			beginScene = new Scene(beginRoot, SCENEWIDTH, SCENEHEIGHT);
			WINDOW = primaryStage;
			WINDOW.setScene(beginScene);
			WINDOW.getIcons().add(new Image(getClass().getResource("Obama_Icon.png").toExternalForm()));
			WINDOW.setTitle(GAMETITLE);
			WINDOW.requestFocus();
			WINDOW.show();
			
			newDir();
			movePNG_FILES();
			moveGIF_FILES();
			moveTXT_FILES();
			moveOTHER_FILES();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void newDir() {
		try {
			dataStringFolder.mkdir();
			pngStringFolder.mkdir();
			gifStringFolder.mkdir();
			txtStringFolder.mkdir();
			otherStringFolder.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void movePNG_FILES() throws IOException {
		for(int i = 0; i < pngNames.length; i++) {
			if(new File(this_pngFolder + pngNames[i]).exists() && !new File(pngFolder + pngNames[i]).exists()) {
				Files.copy(Paths.get(this_pngFolder + pngNames[i]), Paths.get(pngFolder + pngNames[i]));
			}
		}
	}
	private void moveGIF_FILES() throws IOException {
		for(int i = 0; i < gifNames.length; i++) {
			if(new File(this_gifFolder + gifNames[i]).exists() && !new File(gifFolder + gifNames[i]).exists()) {
				Files.copy(Paths.get(this_gifFolder + gifNames[i]), Paths.get(gifFolder + gifNames[i]));
			}
		}
	}
	private void moveTXT_FILES() throws IOException {
		for(int i = 0; i < txtNames.length; i++) {
			if(new File(this_txtFolder + txtNames[i]).exists() && !new File(txtFolder + txtNames[i]).exists()) {
				Files.copy(Paths.get(this_txtFolder + txtNames[i]), Paths.get(txtFolder + txtNames[i]));
			}
		}
	}
	private void moveOTHER_FILES() throws IOException {
		for(int i = 0; i < otherNames.length; i++) {
			if(new File(this_otherFolder + otherNames[i]).exists() && !new File(otherFolder + otherNames[i]).exists()) {
				Files.copy(Paths.get(this_otherFolder + otherNames[i]), Paths.get(otherFolder + otherNames[i]));
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
