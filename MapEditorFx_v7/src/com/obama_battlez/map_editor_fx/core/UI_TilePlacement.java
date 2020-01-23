package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

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

					//Mouse X Tile Placement
					if ((int) event.getX() + ME_CoreFX.cameraPosX > 0) {
						ME_CoreFX.mouseX = (int) (Math.round(((int) (event.getX() + ME_CoreFX.cameraPosX)) / 100) * 100);
					} else {
						ME_CoreFX.mouseX = Math.floorDiv((int) event.getX() + ME_CoreFX.cameraPosX, 100) * 100;
					}
					//Mouse Y Tile Placement
					if ((int) event.getY() + ME_CoreFX.cameraPosY > 0) {
						ME_CoreFX.mouseY = (int) (Math.round(((int) (event.getY() + ME_CoreFX.cameraPosY)) / 100) * 100);
					} else {
						ME_CoreFX.mouseY = Math.floorDiv((int) event.getY() + ME_CoreFX.cameraPosY, 100) * 100;
					}
					
					ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles).setX(ME_CoreFX.mouseX);
					ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles).setY(ME_CoreFX.mouseY);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles));
					
					
					
					
					
					
					
					
					
					
					/*
					 * Begin
					 * Important Code for getting the arraylist map constructing.
					 * 
					 * */
					
//					
////					if (ME_CoreFX.isOnceAddedToMap == false) {
////						for (int i = 0; i < ((ME_CoreFX.deltaMouseY / 100) + 1); i++) {
////							ME_CoreFX.map2dArrayList.add(new ArrayList<Integer>());
////						}
////						for (int i = 0; i < ME_CoreFX.map2dArrayList.size(); i++) {
////							ME_CoreFX.map2dArrayList.get(i).add(-2);
////						}
////						ME_CoreFX.isOnceAddedToMap = true;
////					}
//					
////					for (int i = 0; i < ((ME_CoreFX.deltaMouseY / 100) + 1); i++) {
////						ME_CoreFX.map2dArrayList.remove(new ArrayList<Integer>());
////					}
////					for (int i = 0; i < ME_CoreFX.map2dArrayList.size(); i++) {
////						ME_CoreFX.map2dArrayList.get(i).remove(i);
////					}
////					
////					
////					for (int i = 0; i < ((ME_CoreFX.deltaMouseY / 100) + 1); i++) {
////						ME_CoreFX.map2dArrayList.add(new ArrayList<Integer>());
////					}
////					for (int i = 0; i < ME_CoreFX.map2dArrayList.size(); i++) {
//////						for (int j = 0; j < ME_CoreFX.map2dArrayList.get(i); j++) {
//////							
//////						}
////						ME_CoreFX.map2dArrayList.get(i).add(-2);
////					}
					
					
					
					
					//Setting Minimum X Placement.
					if (ME_CoreFX.mouseX < ME_CoreFX.minMouseX) {
						ME_CoreFX.minMouseX = ME_CoreFX.mouseX;
						ME_CoreFX.TileFronZeroX = ME_CoreFX.minMouseX / -1;
					}
					//Setting Minimum Y Placement.
					if (ME_CoreFX.mouseY < ME_CoreFX.minMouseY) {
						ME_CoreFX.minMouseY = ME_CoreFX.mouseY;
						ME_CoreFX.TileFronZeroY = ME_CoreFX.minMouseY / -1;
					}
					
					//Setting Maximum X Placement.
					if (ME_CoreFX.mouseX > ME_CoreFX.maxMouseX) {
						ME_CoreFX.maxMouseX = ME_CoreFX.mouseX;
					}
					//Setting Maximum Y Placement.
					if (ME_CoreFX.mouseY > ME_CoreFX.maxMouseY) {
						ME_CoreFX.maxMouseY = ME_CoreFX.mouseY;
					}
					
					//calculating the difference between minimum x, y and maximum x, y.
					ME_CoreFX.deltaMouseX = ME_CoreFX.maxMouseX - ME_CoreFX.minMouseX;
					ME_CoreFX.deltaMouseY = ME_CoreFX.maxMouseY - ME_CoreFX.minMouseY;
					
					//add selected tile into the selected tile list.
					ME_CoreFX.selectedTileList.add(ME_CoreFX.selectedTile);
					
					//begin array string...
					ME_CoreFX.copyMap += "{" + ME_CoreFX.selectedTileList.get(ME_CoreFX.totalTiles).toString();
					
					
					
					
					
					
					
					
					
					
					
					
					
					for (int i = 0; i < ME_CoreFX.map2dArrayListRow.size(); i++) {
						System.out.println("map2dArrayListRow.get(totalTiles).setx: " + ME_CoreFX.map2dArrayListRow.get(i).getX());
						System.out.println("map2dArrayListRow.get(totalTiles).sety: " + ME_CoreFX.map2dArrayListRow.get(i).getY());
					}
					
					System.out.println();
					System.out.println("MAP!!!!! : ");
					for (int i = 0; i < ME_CoreFX.map2dArrayList.size(); i++) {
						for (int j = 0; j < ME_CoreFX.map2dArrayList.get(i).size(); j++) {
							System.out.print(ME_CoreFX.map2dArrayList.get(i).get(j) + ", ");
						}
						System.out.println();
					}
					System.out.println("MAP ARRAY ENDS!!!!");
					System.out.println();
					
					
					/*
					 * Important Code for getting the arraylist map constructing.
					 * End
					 * 
					 * */
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					ME_CoreFX.totalTiles++;
					
//					System.out.println("ME_CoreFX.minMouseX: " + ME_CoreFX.minMouseX);
//					System.out.println("ME_CoreFX.minMouseY: " + ME_CoreFX.minMouseY);
					
//					System.out.println("total tiles in the map: " + ME_CoreFX.totalTiles);
//					System.out.println("selectedTile added: " + ME_CoreFX.selectedTile);
					
					
					
					
//					System.out.println("map2dArrayListRow.get(totalTiles).setx: " + ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles - 1).getX());
//					System.out.println("map2dArrayListRow.get(totalTiles).sety: " + ME_CoreFX.map2dArrayListRow.get(ME_CoreFX.totalTiles - 1).getY());
					
					
					
					
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
//		ME_CoreFX.UI_PlaceTileBG.setOnMouseMoved(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
////				if ((int) event.getX() + ME_CoreFX.cameraPosX > 0) {
////					ME_CoreFX.mouseX = (int) (Math.round(((int) (event.getX() + ME_CoreFX.cameraPosX)) / 100) * 100);
////				} else {
////					ME_CoreFX.mouseX = Math.floorDiv((int) event.getX() + ME_CoreFX.cameraPosX, 100) * 100;
////				}
////				
////				if ((int) event.getY() + ME_CoreFX.cameraPosY > 0) {
////					ME_CoreFX.mouseY = (int) (Math.round(((int) (event.getY() + ME_CoreFX.cameraPosY)) / 100) * 100);
////				} else {
////					ME_CoreFX.mouseY = Math.floorDiv((int) event.getY() + ME_CoreFX.cameraPosY, 100) * 100;
////				}
//////				System.out.println("ME_CoreFX.mouseX: " + ME_CoreFX.mouseX);
//////				System.out.println("ME_CoreFX.mouseY: " + ME_CoreFX.mouseY);
//			}
//		});
	}
	
	
	public static void setMapInArray() {
////		ME_CoreFX.map2dArrayList.add(new ArrayList<Integer>());
//		
////			System.out.println(ME_CoreFX.minMouseX + " x " + ME_CoreFX.minMouseY);
////			System.out.println(ME_CoreFX.TileFronZeroX + " x " + ME_CoreFX.TileFronZeroY);
//			
////			ME_CoreFX.map2dArrayListRow.get(i).setX(ME_CoreFX.map2dArrayListRow.get(i).getX() + ME_CoreFX.TileFronZeroX);
////			ME_CoreFX.map2dArrayListRow.get(i).setY(ME_CoreFX.map2dArrayListRow.get(i).getY() + ME_CoreFX.TileFronZeroY);
//			
////			for (int j = 0; j < ME_CoreFX.map2dArrayListRow.size(); j++) {
////				if (ME_CoreFX.map2dArrayListRow.get(j).getImage() == ME_CoreFX.imgArrayList.get(j)) {
////					if (ME_CoreFX.imgArrayList.size() - 1 > j)
////					ME_CoreFX.copyMap += Integer.toString(j) + ", ";
////					System.out.println(ME_CoreFX.map2dArrayListRow.get(j).getImage().toString());
////				}
////			}
////			ME_CoreFX.copyMap += "}";
//			
////	ME_CoreFX.map2dArrayListRow
		
		/*
		 * 
		 * benedenste stukje comment is een belangrijke comment.
		 * 
		 * */
////	ME_CoreFX.map2dArrayListRow.get(i).setX(ME_CoreFX.map2dArrayListRow.get(i).getX() + ME_CoreFX.TileFronZeroX);
////	ME_CoreFX.map2dArrayListRow.get(i).setY(ME_CoreFX.map2dArrayListRow.get(i).getY() + ME_CoreFX.TileFronZeroY);
		
//		for (int i = 0; i < ME_CoreFX.map2dArrayListRow.size(); i++) {
//			System.out.println("map2dArrayListRow.get(totalTiles).setx: " + ME_CoreFX.map2dArrayListRow.get(i).getX());
//			System.out.println("map2dArrayListRow.get(totalTiles).sety: " + ME_CoreFX.map2dArrayListRow.get(i).getY());
//		}
		
		ME_CoreFX.minMouseX = 0;
		ME_CoreFX.minMouseY = 0;
		ME_CoreFX.TileFronZeroX = 0;
		ME_CoreFX.TileFronZeroY = 0;
		System.out.println();
	}
}
