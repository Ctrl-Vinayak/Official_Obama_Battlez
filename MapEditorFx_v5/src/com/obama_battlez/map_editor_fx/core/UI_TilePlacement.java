package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class UI_TilePlacement {

	public static ArrayList<ArrayList<Integer>> map2dArrayList = new ArrayList<ArrayList<Integer>>();
	public static ArrayList<ImageView> map2dArrayListRow = new ArrayList<ImageView>();
	
	public static double mouseX;
	public static double mouseY;
	
	public static int totalTiles = 0;
	
	public static Rectangle UI_TilePlacementBG = new Rectangle();
	
	public static void addBackground() {
		UI_TilePlacementBG.setX(0);
		UI_TilePlacementBG.setY(0);
		UI_TilePlacementBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20);
		UI_TilePlacementBG.setHeight(ME_CoreFX.sceneHeight);
		UI_TilePlacementBG.setFill(Color.DARKRED);
		UI_TilePlacementBG.setOpacity(0);
		
		ME_CoreFX.root.getChildren().add(UI_TilePlacementBG);
	}

	public static void backgroundFunc() {
		UI_TilePlacementBG.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (ME_GameLoop.isUI_TilePlacement == true) {
					if (UI_Menu.selectedTile == 1) {
	//					UI_NoTilePlacementBG.setX(ME_CoreFX.sceneWidth - 230 - 20 - 150);
	//					UI_NoTilePlacementBG.setWidth(150);
						map2dArrayListRow.add(new ImageView(ME_Resource.imgArrayList.get(UI_Menu.selectedTile)));
						mouseX = ((((int) (event.getX() / 200 * 200) - (int) (event.getX() % 200)) + 199) / 200) * 200;
						mouseY = ((((int) (event.getY() / 200 * 200) - (int) (event.getY() % 200)) + 199) / 200) * 200;
						map2dArrayListRow.get(totalTiles).setX(mouseX);
						map2dArrayListRow.get(totalTiles).setY(mouseY);
						
						map2dArrayListRow.get(totalTiles).setFitWidth(200);
						map2dArrayListRow.get(totalTiles).setFitHeight(200);
					} else {
	//					UI_NoTilePlacementBG.setX(ME_CoreFX.sceneWidth - 230 - 20 - 50);
	//					UI_NoTilePlacementBG.setWidth(50);
						map2dArrayListRow.add(new ImageView(ME_Resource.imgArrayList.get(UI_Menu.selectedTile)));
						mouseX = ((((int) (event.getX() / 100 * 100) - (int) (event.getX() % 100)) + 99) / 100) * 100;
						mouseY = ((((int) (event.getY() / 100 * 100) - (int) (event.getY() % 100)) + 99) / 100) * 100;
						map2dArrayListRow.get(totalTiles).setX(mouseX);
						map2dArrayListRow.get(totalTiles).setY(mouseY);
						
						map2dArrayListRow.get(totalTiles).setFitWidth(100);
						map2dArrayListRow.get(totalTiles).setFitHeight(100);
					}
					ME_CoreFX.root.getChildren().add(map2dArrayListRow.get(totalTiles));
					
					totalTiles++;
					System.out.println("total tiles in the map: " + totalTiles);
					System.out.println("selectedTile added: " + UI_Menu.selectedTile);
					System.out.println("map2dArrayListRow.get(totalTiles).setx: " + map2dArrayListRow.get(totalTiles - 1).getX());
					System.out.println("map2dArrayListRow.get(totalTiles).sety: " + map2dArrayListRow.get(totalTiles - 1).getY());
					
					// REMOVE AND ADD ELEMENTS TO LAYOUT!
					ME_CoreFX.root.getChildren().remove(totalTiles - 1);
					ME_CoreFX.root.getChildren().add(UI_TilePlacementBG);
					ME_CoreFX.root.getChildren().remove(totalTiles - 1);
					ME_CoreFX.root.getChildren().add(UI_Menu.UI_MenuBG);
					for (int i = 0; i < UI_Menu.imgViewArrayMenuList.size(); i++) {
						ME_CoreFX.root.getChildren().remove(totalTiles - 1);
						ME_CoreFX.root.getChildren().add(UI_Menu.imgViewArrayMenuList.get(i));
					}
					ME_CoreFX.root.getChildren().remove(totalTiles - 1);
					ME_CoreFX.root.getChildren().add(UI_Menu.sb);
				}
			}
		});
	}
}
