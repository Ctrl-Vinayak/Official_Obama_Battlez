package com.obama_battlez.map_editor_fx.core;

import java.time.Duration;

import org.reactfx.util.FxTimer;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ME_GameLoop {
	
	public static void startLoop() {	
//		ME_CoreFX.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//			@Override
//			public void handle(KeyEvent event) {
//				if (event.getCode() == KeyCode.Z && event.isControlDown()) {
//					if (UI_TilePlacement.totalTiles > 0) {
//						UI_TilePlacement.totalTiles--;
//						ME_CoreFX.root.getChildren().remove(UI_TilePlacement.map2dArrayListRow.get(UI_TilePlacement.totalTiles));
//						UI_TilePlacement.map2dArrayListRow.remove(UI_TilePlacement.totalTiles);
//					}
//					System.out.println("Z totalTiles right now: " + UI_TilePlacement.totalTiles);
//					System.out.println("Z selectedTile, what I right now got: " + UI_Menu.selectedTile);
//				}
//				
//				// arrow keys, camera view.
//				if (event.getCode() == KeyCode.W) {
//					if (isZoomedIn == false) {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() + 100);
//						}
//					} else {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() + 50);
//						}
//					}
//				}
//				if (event.getCode() == KeyCode.A) {
//					if (isZoomedIn == false) {	
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() + 100);
//						}
//					} else {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() + 50);
//						}
//					}
//				}
//				if (event.getCode() == KeyCode.S) {
//					if (isZoomedIn == false) {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() - 100);
//						}
//					} else {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() - 50);
//						}
//					}
//				}
//				if (event.getCode() == KeyCode.D) {
//					if (isZoomedIn == false) {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() - 100);
//						}
//					} else {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() - 50);
//						}
//					}
//				}
//				
//				
////				//all objects smaller...
////				if (event.getCode() == KeyCode.NUMPAD1) {
////					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
////						UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(UI_TilePlacement.map2dArrayListRow.get(i).getScaleX() + 0.1);
////						UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(UI_TilePlacement.map2dArrayListRow.get(i).getScaleY() + 0.1);
////					}
////					System.out.println("pressed");
////				}
////				if (event.getCode() == KeyCode.NUMPAD2) {
////					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
////						UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(UI_TilePlacement.map2dArrayListRow.get(i).getScaleX() - 0.1);
////						UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(UI_TilePlacement.map2dArrayListRow.get(i).getScaleY() - 0.1);
////					}
////					System.out.println("pressed");
////				}
//				
//				//zoom in and out function.
//				if (event.getCode() == KeyCode.Y) {
//					if (isZoomedIn == false) {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							if (UI_TilePlacement.map2dArrayListRow.get(i).getImage() == ME_Resource.imgArrayList.get(2)) {
//								UI_TilePlacement.map2dArrayListRow.get(i).setX((UI_TilePlacement.map2dArrayListRow.get(i).getX() / 2));
//								UI_TilePlacement.map2dArrayListRow.get(i).setY((UI_TilePlacement.map2dArrayListRow.get(i).getY() / 2));
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(0.5);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(0.5);
//							} else {
//								UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() / 2);
//								UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() / 2);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(0.5);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(0.5);
//							}
//						}
//						isUI_TilePlacement = false;
//						isZoomedIn = true;
//					} else {
//						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//							if (UI_TilePlacement.map2dArrayListRow.get(i).getImage() == ME_Resource.imgArrayList.get(2)) {
//								UI_TilePlacement.map2dArrayListRow.get(i).setX((UI_TilePlacement.map2dArrayListRow.get(i).getX()) + UI_TilePlacement.map2dArrayListRow.get(i).getX() * 2);
//								UI_TilePlacement.map2dArrayListRow.get(i).setY((UI_TilePlacement.map2dArrayListRow.get(i).getX()) + UI_TilePlacement.map2dArrayListRow.get(i).getY() * 2);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(1);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(1);
//							} else {
//								UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() * 2);
//								UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() * 2);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(1);
//								UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(1);
//							}
//						}
//						isUI_TilePlacement = true;
//						isZoomedIn = false;
//					}
//				}
////				if (event.getCode() == KeyCode.Y) {
////					if (isZoomedOut == false) {
////						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
////							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() / 2);
////							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() / 2);
////							UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(0.5);
////							UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(0.5);
////						}
////						isUI_TilePlacement = false;
////						isZoomedOut = true;
////					} else {
////						for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
////							UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX() * 2);
////							UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY() * 2);
////							UI_TilePlacement.map2dArrayListRow.get(i).setScaleX(1);
////							UI_TilePlacement.map2dArrayListRow.get(i).setScaleY(1);
////						}
////						isUI_TilePlacement = true;
////						isZoomedOut = false;
////					}
////				}
//			}
//		});
//		ME_CoreFX.scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
//
//			@Override
//			public void handle(KeyEvent event) {
////				
////				test if the imageviews are removed from the root.
////									
//				if (event.getCode() == KeyCode.I) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						System.out.println(UI_TilePlacement.map2dArrayListRow.get(i));
//					}
//				}
//				if (event.getCode() == KeyCode.P) {
//					for (int i = 0; i < ME_CoreFX.root.getChildren().size(); i++) {
//						System.out.println(ME_CoreFX.root.getChildren().get(i));
//					}
//				}
//				// arrow keys, camera view.
//				if (event.getCode() == KeyCode.W) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY());
//					}
//				}
//				if (event.getCode() == KeyCode.A) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX());
//					}
//				}
//				if (event.getCode() == KeyCode.S) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						UI_TilePlacement.map2dArrayListRow.get(i).setY(UI_TilePlacement.map2dArrayListRow.get(i).getY());
//					}
//				}
//				if (event.getCode() == KeyCode.D) {
//					for (int i = 0; i < UI_TilePlacement.map2dArrayListRow.size(); i++) {
//						UI_TilePlacement.map2dArrayListRow.get(i).setX(UI_TilePlacement.map2dArrayListRow.get(i).getX());
//					}
//				}
//			}
//		});
//		
		
		addKeyEvents();
		
		FxTimer.runPeriodically(Duration.ofMillis((long) (1000 / ME_CoreFX.fps)), () -> {
			//gameloop here...
			cameraMovement();
			updateCameraView();
			ResponsiveME.updateSceneSize();
			ResponsiveME.resp_TileSelection();
			ResponsiveME.resp_UI_Menu();
			ResponsiveME.resp_UI_ScrollBar();
			ResponsiveME.resp_PrintButtonMap();
			ResponsiveME.resp_TilePlacementArea();
		});
	}
	
	public static void addKeyEvents() {
		ME_CoreFX.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				
				if (event.getCode() == KeyCode.Z && event.isControlDown()) {
					if (ME_CoreFX.totalTiles > 0) {
						ME_CoreFX.totalTiles--;
						ME_CoreFX.root.getChildren().remove(ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles));
						ME_CoreFX.map2dArrayListRow.remove(ME_CoreFX.totalTiles);
					}
//					System.out.println("Z totalTiles right now: " + ME_CoreFX.totalTiles);
//					System.out.println("Z selectedTile, what I right now got: " + ME_CoreFX.selectedTile);
				}
				
				
				if (event.getCode() == KeyCode.W) {
					ME_CoreFX.back = true;
				}
				if (event.getCode() == KeyCode.A) {
					ME_CoreFX.left = true;
				}
				if (event.getCode() == KeyCode.S) {
					ME_CoreFX.front = true;
				}
				if (event.getCode() == KeyCode.D) {
					ME_CoreFX.right = true;
				}
				
				if (event.getCode() == KeyCode.DIGIT1) {
					SET_VELOCITY_CAMERA_Z(-5);
					ME_CoreFX.isUI_TilePlacement = false;
				}
				if (event.getCode() == KeyCode.DIGIT2) {
					SET_VELOCITY_CAMERA_Z(5);
					ME_CoreFX.isUI_TilePlacement = false;
				}
				if (event.getCode() == KeyCode.DIGIT3) {
					ME_CoreFX.cameraPosZ = 0;
					ME_CoreFX.isUI_TilePlacement = true;
				}
				if (event.getCode() == KeyCode.DIGIT4) {
					ME_CoreFX.cameraPosX = 0;
					ME_CoreFX.cameraPosY = 0;
				}
			}
		});
		ME_CoreFX.scene.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.W) {
					ME_CoreFX.back = false;
					SET_VELOCITY_CAMERA_Y(0);
				}
				if (event.getCode() == KeyCode.A) {
					ME_CoreFX.left = false;
					SET_VELOCITY_CAMERA_X(0);
				}
				if (event.getCode() == KeyCode.S) {
					ME_CoreFX.front = false;
					SET_VELOCITY_CAMERA_Y(0);
				}
				if (event.getCode() == KeyCode.D) {
					ME_CoreFX.right = false;
					SET_VELOCITY_CAMERA_X(0);
				}
				
				if (event.getCode() == KeyCode.DIGIT1) {
					SET_VELOCITY_CAMERA_Z(0);
				}
				if (event.getCode() == KeyCode.DIGIT2) {
					SET_VELOCITY_CAMERA_Z(0);
				}
			}
		});
	}
	
	private static void cameraMovement() {
		// pressed W
		if (ME_CoreFX.back == true) {
			SET_VELOCITY_CAMERA_Y(-5);
		}
		
		// pressed A
		if (ME_CoreFX.left == true) {
			SET_VELOCITY_CAMERA_X(-5);
		}
		
		// pressed S
		if (ME_CoreFX.front == true) {
			SET_VELOCITY_CAMERA_Y(5);
		}
		
		// pressed D
		if (ME_CoreFX.right == true) {
			SET_VELOCITY_CAMERA_X(5);
		}
	}
	
	private static void SET_VELOCITY_CAMERA_X(int velx) {
		ME_CoreFX.cameraVelX = velx;
	}
	private static void SET_VELOCITY_CAMERA_Y(int vely) {
		ME_CoreFX.cameraVelY = vely;
	}
	private static void SET_VELOCITY_CAMERA_Z(int velz) {
		ME_CoreFX.cameraVelZ = velz;
	}
	
	public static void updateCameraView() {
		ME_CoreFX.cameraPosX += ME_CoreFX.cameraVelX;
		ME_CoreFX.camera.setTranslateX(ME_CoreFX.cameraPosX);
		ME_CoreFX.cameraPosY += ME_CoreFX.cameraVelY;
		ME_CoreFX.camera.setTranslateY(ME_CoreFX.cameraPosY);
		ME_CoreFX.cameraPosZ += ME_CoreFX.cameraVelZ;
		ME_CoreFX.camera.setTranslateZ(ME_CoreFX.cameraPosZ);
	}
}
