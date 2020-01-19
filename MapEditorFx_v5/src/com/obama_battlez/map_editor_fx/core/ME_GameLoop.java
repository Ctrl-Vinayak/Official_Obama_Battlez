package com.obama_battlez.map_editor_fx.core;

import java.time.Duration;

import org.reactfx.util.FxTimer;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ME_GameLoop {

	public static int fps = 60;
	public static boolean isZoomedIn = false;
	public static boolean isZoomedOut = false;
	public static boolean isUI_TilePlacement = true;
	
	public static void startLoop() {
		ME_CoreFX.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.Z && event.isControlDown()) {
					if (UI_TilePlacement.totalTiles > 0) {
						UI_TilePlacement.totalTiles--;
						ME_CoreFX.root.getChildren().remove(UI_TilePlacement.map2dArrayListRow.get(UI_TilePlacement.totalTiles));
						UI_TilePlacement.map2dArrayListRow.remove(UI_TilePlacement.totalTiles);
					}
					System.out.println("Z totalTiles right now: " + UI_TilePlacement.totalTiles);
					System.out.println("Z selectedTile, what I right now got: " + UI_Menu.selectedTile);
				}
				
				// arrow keys, camera view.
				if (event.getCode() == KeyCode.W) {
					if (isZoomedIn == false) {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() + 100);
						}
					} else {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() + 50);
						}
					}
				}
				if (event.getCode() == KeyCode.A) {
					if (isZoomedIn == false) {	
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() + 100);
						}
					} else {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() + 50);
						}
					}
				}
				if (event.getCode() == KeyCode.S) {
					if (isZoomedIn == false) {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() - 100);
						}
					} else {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() - 50);
						}
					}
				}
				if (event.getCode() == KeyCode.D) {
					if (isZoomedIn == false) {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() - 100);
						}
					} else {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() - 50);
						}
					}
				}
				
				
//				//all objects smaller...
//				if (event.getCode() == KeyCode.NUMPAD1) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(UI_TilePlacement.map2dArrayListRow.get(i).getScaleX() + 0.1);
//						UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(UI_TilePlacement.map2dArrayListRow.get(i).getScaleY() + 0.1);
//					}
//					System.out.println("pressed");
//				}
//				if (event.getCode() == KeyCode.NUMPAD2) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(UI_TilePlacement.map2dArrayListRow.get(i).getScaleX() - 0.1);
//						UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(UI_TilePlacement.map2dArrayListRow.get(i).getScaleY() - 0.1);
//					}
//					System.out.println("pressed");
//				}
				
				//zoom in and out function.
				if (event.getCode() == KeyCode.Y) {
					if (isZoomedIn == false) {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							if (UI_TilePlacement.map2dArrayListRow.get(i).getImage() == ME_Resource.imgArrayList.get(2)) {
								UI_TilePlacement.map2dArrayListRow.get(i).setX((UI_TilePlacement.map2dArrayListRow.get(i).getX() / 2));
								UI_TilePlacement.map2dArrayListRow.get(i).setY((UI_TilePlacement.map2dArrayListRow.get(i).getY() / 2));
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(0.5);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(0.5);
							} else {
								UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() / 2);
								UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() / 2);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(0.5);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(0.5);
							}
						}
						isUI_TilePlacement = false;
						isZoomedIn = true;
					} else {
						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
							if (UI_TilePlacement.map2dArrayListRow.get(i).getImage() == ME_Resource.imgArrayList.get(2)) {
								UI_TilePlacement.map2dArrayListRow.get(i).setX((UI_TilePlacement.map2dArrayListRow.get(i).getX()) + UI_TilePlacement.map2dArrayListRow.get(i).getX() * 2);
								UI_TilePlacement.map2dArrayListRow.get(i).setY((UI_TilePlacement.map2dArrayListRow.get(i).getX()) + UI_TilePlacement.map2dArrayListRow.get(i).getY() * 2);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(1);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(1);
							} else {
								UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() * 2);
								UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() * 2);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(1);
								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(1);
							}
						}
						isUI_TilePlacement = true;
						isZoomedIn = false;
					}
				}
//				if (event.getCode() == KeyCode.Y) {
//					if (isZoomedOut == false) {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() / 2);
//							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() / 2);
//							UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(0.5);
//							UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(0.5);
//						}
//						isUI_TilePlacement = false;
//						isZoomedOut = true;
//					} else {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() * 2);
//							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() * 2);
//							UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(1);
//							UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(1);
//						}
//						isUI_TilePlacement = true;
//						isZoomedOut = false;
//					}
//				}
			}
		});
		ME_CoreFX.scene.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
//				
//				test if the imageviews are removed from the root.
//									
				if (event.getCode() == KeyCode.I) {
					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
						System.out.println(UI_TilePlacement.map2dArrayListRow.get(i));
					}
				}
				if (event.getCode() == KeyCode.P) {
					for (int i = 0; i < ME_CoreFX.root.getChildren().size(); i++) {
						System.out.println(ME_CoreFX.root.getChildren().get(i));
					}
				}
				// arrow keys, camera view.
				if (event.getCode() == KeyCode.W) {
					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
						UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY());
					}
				}
				if (event.getCode() == KeyCode.A) {
					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
						UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX());
					}
				}
				if (event.getCode() == KeyCode.S) {
					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
						UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY());
					}
				}
				if (event.getCode() == KeyCode.D) {
					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
						UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX());
					}
				}
			}
		});
		
		FxTimer.runPeriodically(Duration.ofMillis((long) (1000 / fps)), () -> {
			//gameloop here...
			ResponsiveME.updateSceneSize();
			ResponsiveME.resp_TileSelection();
			ResponsiveME.resp_UI_Menu();
			ResponsiveME.resp_UI_ScrollBar();
			ResponsiveME.resp_TilePlacementArea();
		});
	}
}
