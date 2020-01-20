package com.obama_battlez.map_editor_fx.core;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class UI_TilePlacement {
	
	public static void addBackground() {
		ME_CoreFX.UI_PlaceTileBG.setX(0);
		ME_CoreFX.UI_PlaceTileBG.setY(0);
		ME_CoreFX.UI_PlaceTileBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20);
		ME_CoreFX.UI_PlaceTileBG.setHeight(ME_CoreFX.sceneHeight);
		ME_CoreFX.UI_PlaceTileBG.setFill(Color.DARKRED);
		ME_CoreFX.UI_PlaceTileBG.setOpacity(0);
		
		ME_CoreFX.root.getChildren().add(ME_CoreFX.UI_PlaceTileBG);
	}

	public static void backgroundFunc() {
		ME_CoreFX.UI_PlaceTileBG.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (ME_CoreFX.isUI_TilePlacement == true) {
					
					ME_CoreFX.map2dArrayListRow.add(new ImageView(ME_CoreFX.imgArrayList.get(ME_CoreFX.selectedTile)));

					if ((int) event.getX() + ME_CoreFX.cameraPosX > 0) {
						ME_CoreFX.mouseX = (int) (Math.round(((int) (event.getX() + ME_CoreFX.cameraPosX)) / 100) * 100);
					} else {
						ME_CoreFX.mouseX = Math.floorDiv((int) event.getX() + ME_CoreFX.cameraPosX, 100) * 100;
					}
					
					if ((int) event.getY() + ME_CoreFX.cameraPosY > 0) {
						ME_CoreFX.mouseY = (int) (Math.round(((int) (event.getY() + ME_CoreFX.cameraPosY)) / 100) * 100);
					} else {
						ME_CoreFX.mouseY = Math.floorDiv((int) event.getY() + ME_CoreFX.cameraPosY, 100) * 100;
					}
					
					ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles).setX(ME_CoreFX.mouseX);
					ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles).setY(ME_CoreFX.mouseY);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles));
					
					ME_CoreFX.totalTiles++;
					System.out.println("total tiles in the map: " + ME_CoreFX.totalTiles);
					System.out.println("selectedTile added: " + ME_CoreFX.selectedTile);
					System.out.println("map2dArrayListRow.get(totalTiles).setx: " + ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles - 1).getX());
					System.out.println("map2dArrayListRow.get(totalTiles).sety: " + ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles - 1).getY());
					
					// REMOVE AND ADD ELEMENTS TO LAYOUT!
					ME_CoreFX.root.getChildren().remove(ME_CoreFX.totalTiles - 1);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.UI_PlaceTileBG);
					ME_CoreFX.root.getChildren().remove(ME_CoreFX.totalTiles - 1);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.UI_MenuBG);
					for (int i = 0; i < ME_CoreFX.imgViewArrayMenuList.size(); i++) {
						ME_CoreFX.root.getChildren().remove(ME_CoreFX.totalTiles - 1);
						ME_CoreFX.root.getChildren().add(ME_CoreFX.imgViewArrayMenuList.get(i));
					}
					ME_CoreFX.root.getChildren().remove(ME_CoreFX.totalTiles - 1);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.sb);
					ME_CoreFX.root.getChildren().remove(ME_CoreFX.totalTiles - 1);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.printMap);
				}
			}
		});
		ME_CoreFX.UI_PlaceTileBG.setOnMouseMoved(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if ((int) event.getX() + ME_CoreFX.cameraPosX > 0) {
					ME_CoreFX.mouseX = (int) (Math.round(((int) (event.getX() + ME_CoreFX.cameraPosX)) / 100) * 100);
				} else {
					ME_CoreFX.mouseX = Math.floorDiv((int) event.getX() + ME_CoreFX.cameraPosX, 100) * 100;
				}
				
				if ((int) event.getY() + ME_CoreFX.cameraPosY > 0) {
					ME_CoreFX.mouseY = (int) (Math.round(((int) (event.getY() + ME_CoreFX.cameraPosY)) / 100) * 100);
				} else {
					ME_CoreFX.mouseY = Math.floorDiv((int) event.getY() + ME_CoreFX.cameraPosY, 100) * 100;
				}
//				System.out.println("ME_CoreFX.mouseX: " + ME_CoreFX.mouseX);
//				System.out.println("ME_CoreFX.mouseY: " + ME_CoreFX.mouseY);
			}
		});
	}
}
