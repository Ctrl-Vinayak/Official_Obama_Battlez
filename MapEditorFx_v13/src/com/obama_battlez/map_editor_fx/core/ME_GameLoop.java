package com.obama_battlez.map_editor_fx.core;

import java.time.Duration;

import org.reactfx.util.FxTimer;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * @since 15-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.8
 */
public class ME_GameLoop {
	
	public static void startLoop() {
		addKeyEvents();
		
		FxTimer.runPeriodically(Duration.ofMillis((long) (1000 / ME_CoreFX.fps)), () -> {
			//gameloop here...
			cameraMovement();
			updateCameraView();
			ResponsiveME.updateSceneSize();
			ResponsiveME.resp_TileSelection();
			ResponsiveME.resp_UI_Menu();
			ResponsiveME.resp_UI_ScrollBar();
			ResponsiveME.resp_printButtonMap();
			ResponsiveME.resp_copyButtonMap();
			ResponsiveME.resp_TilePlacementArea();
		});
	}
	
	public static void addKeyEvents() {
		ME_CoreFX.scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				
				if (event.getCode() == KeyCode.Z && event.isControlDown()) {
					if (UI_TilePlacement.totalTiles > 0) {
						UI_TilePlacement.totalTiles--;
						ME_CoreFX.root.getChildren().remove(UI_TilePlacement.map2dArrayListRow.get(UI_TilePlacement.totalTiles));
						UI_TilePlacement.map2dArrayListRow.remove(UI_TilePlacement.totalTiles);
						
						
						UI_TilePlacement.selectedTileList.remove(UI_TilePlacement.totalTiles);
						UI_TilePlacement.getRowX.remove(UI_TilePlacement.totalTiles);
						UI_TilePlacement.getRowY.remove(UI_TilePlacement.totalTiles);
						
						
//						PrintButton.tileNum--;
//						ME_CoreFX.getRowX.remove(PrintButton.tileNum);
//						ME_CoreFX.getRowY.remove(PrintButton.tileNum);
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
					SET_VELOCITY_CAMERA_Z(-20);
					ME_CoreFX.isUI_TilePlacement = false;
				}
				if (event.getCode() == KeyCode.DIGIT2) {
					SET_VELOCITY_CAMERA_Z(20);
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
		//update x coordz of camera.
			ME_CoreFX.cameraPosX += ME_CoreFX.cameraVelX;
			if (ME_CoreFX.cameraPosX < 0) {
				ME_CoreFX.cameraPosX = 0;
			}
			if (ME_CoreFX.cameraPosX > Integer.MAX_VALUE - 10) {
				ME_CoreFX.cameraPosX = Integer.MAX_VALUE - 10;
			}
			ME_CoreFX.camera.setTranslateX(ME_CoreFX.cameraPosX);
			
			//update y coordz of camera.
			ME_CoreFX.cameraPosY += ME_CoreFX.cameraVelY;
			if (ME_CoreFX.cameraPosY < 0) {
				ME_CoreFX.cameraPosY = 0;
			}
			if (ME_CoreFX.cameraPosY > Integer.MAX_VALUE - 10) {
				ME_CoreFX.cameraPosY = Integer.MAX_VALUE - 10;
			}
			ME_CoreFX.camera.setTranslateY(ME_CoreFX.cameraPosY);
			
		ME_CoreFX.cameraPosZ += ME_CoreFX.cameraVelZ;
		ME_CoreFX.camera.setTranslateZ(ME_CoreFX.cameraPosZ);
	}
}
