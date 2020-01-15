package com.obama_battlez.map_editor_fx.core;

import java.time.Duration;

import org.reactfx.util.FxTimer;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * @since 13-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.0
 */
public class GameLoop {
	
	private static double newSceneWidth = ME_CoreFX.sceneWidth;
	private static double newSceneHeight = ME_CoreFX.sceneHeight;
	
	private static int i;
	
	public static void startLoop() {
		
		//loop stuff in 60 frames per seconds.
		FxTimer.runPeriodically(Duration.ofMillis((long) (1000 / ME_CoreFX.fps)), () -> {
			newSceneWidth = ME_CoreFX.scene.getWidth();
			newSceneHeight = ME_CoreFX.scene.getHeight();
			UI_SelectionMenu.keepResponsiveness();
			consoleSpam();
		});
	}
	
	public static double getSceneWidth() {
		return newSceneWidth;
	}
	
	public static double getSceneHeight() {
		return newSceneHeight;
	}
	
	public static void consoleSpam() {
		if (ME_CoreFX.isConsoleSpamOn == true) {
			//sysout stuff here...
//			System.out.println(GameLoop.getSceneWidth());
//			System.out.println(GameLoop.getSceneHeight());
//			System.out.println(UI_SelectionMenu.sb.getValue());
//			System.out.println(UI_SelectionMenu.sb.getBlockIncrement());
			System.out.println(UI_SelectionMenu.selectedTile);
		}
	}
}