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
	
	public static double mouseX = 0;
	public static double mouseY = 0;
	
	public static void startLoop() {
		MapEditor.scene.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				mouseX = event.getX();
				mouseY = event.getY();
				if (MapEditor.isConsoleSpamOn == true) {
					System.out.println(event.getX() + " x " + event.getY());
				}
			}
		});
		
		FxTimer.runPeriodically(Duration.ofMillis((long) (1000 / MapEditor.fps)), () -> {
			//loop stuff in 60 frames per seconds.
		});
	}
}
