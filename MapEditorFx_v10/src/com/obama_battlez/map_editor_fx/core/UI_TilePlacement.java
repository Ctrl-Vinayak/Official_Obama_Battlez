package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class UI_TilePlacement {
	
	public static Rectangle UI_PlaceTileBG = new Rectangle();
	
	//Imageview list, that stores the imageviews on the UI Tile Placement Background.
	public static ArrayList<ImageView> map2dArrayListRow = new ArrayList<ImageView>();
	//2d ArrayList, this is for constructing or printing the map out.
	public static ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
	
	public static ArrayList<Integer> selectedTileList = new ArrayList<Integer>();
	public static ArrayList<Integer> getRowX = new ArrayList<Integer>();
	public static ArrayList<Integer> getRowY = new ArrayList<Integer>();
	
	public static double mouseX;
	public static double mouseY;
	
	public static int totalTiles = 0;
	public static int selectedTile = 0;
	
	private static int x = 0;
	private static int y = 0;
	private static int xRows = 1;
	private static int yRows = 1;
	
	public static void addBackground() {
		UI_PlaceTileBG.setX(0);
		UI_PlaceTileBG.setY(0);
		UI_PlaceTileBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20);
		UI_PlaceTileBG.setHeight(ME_CoreFX.sceneHeight);
		UI_PlaceTileBG.setFill(Color.DARKRED);
		UI_PlaceTileBG.setOpacity(0);
		
		ME_CoreFX.root.getChildren().add(UI_PlaceTileBG);
	}

	public static void backgroundFunc() {
		UI_PlaceTileBG.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (ME_CoreFX.isUI_TilePlacement == true) {
					
					map2dArrayListRow.add(new ImageView(UI_Menu.imgArrayList.get(selectedTile)));

					//Mouse X Tile Placement
					if ((int) event.getX() + ME_CoreFX.cameraPosX > 0) {
						mouseX = (int) (Math.round(((int) (event.getX() + ME_CoreFX.cameraPosX)) / 100) * 100);
					} else {
						mouseX = Math.floorDiv((int) event.getX() + ME_CoreFX.cameraPosX, 100) * 100;
					}
					//Mouse Y Tile Placement
					if ((int) event.getY() + ME_CoreFX.cameraPosY > 0) {
						mouseY = (int) (Math.round(((int) (event.getY() + ME_CoreFX.cameraPosY)) / 100) * 100);
					} else {
						mouseY = Math.floorDiv((int) event.getY() + ME_CoreFX.cameraPosY, 100) * 100;
					}
					
					map2dArrayListRow.get(totalTiles).setX(mouseX);
					map2dArrayListRow.get(totalTiles).setY(mouseY);
					ME_CoreFX.root.getChildren().add(map2dArrayListRow.get(totalTiles));
					
						/*
						 * Begin
						 * Important Code for getting the arraylist map constructing.
						 * 
						 * */
					
						//resets map string:
						ME_CoreFX.copyMap = "";
					
						//x area
						x = (int) mouseX;
						getRowX.add(totalTiles, x);
						if (x >= xRows * 100) {
							xRows = x / 100 + 1;
						}
						
						//y area
						y = (int) mouseY;
						getRowY.add(totalTiles, y);
						if (y >= yRows * 100) {
							yRows = y / 100 + 1;
						}
						
						//tile area
						selectedTileList.add(totalTiles, selectedTile);
						
						//add horizontal rows in the map arraylist.
						for (int i = 0; i < yRows; i++) {
							map.add(new ArrayList<Integer>());
						}
						
						//add cells in each horizontal row of the map arraylist.
						for (int i = 0; i < yRows; i++) {
							for (int j = 0; j < xRows; j++) {
								map.get(i).add(j, -2);
							}
						}
						
						for (int i = 0; i <= totalTiles; i++) {
							for (int j = 0; j < yRows; j++) {
								for (int k = 0; k < xRows; k++) {
									map.get(getRowY.get(i) / 100).set(getRowX.get(i) / 100, selectedTileList.get(i));
								}
							}
						}
						
						//printing out the map format
						System.out.println();
						ME_CoreFX.copyMap += "public static double[][] mapOne = {\n";
						System.out.println("public static double[][] mapOne = {");
						for (int i = 0; i < map.size(); i++) {
							ME_CoreFX.copyMap += "\t{";
							System.out.print("\t{");
							for (int j = 0; j < map.get(i).size(); j++) {
								if (j < map.get(i).size() - 1) {
									ME_CoreFX.copyMap += map.get(i).get(j) + ", ";
									System.out.print(map.get(i).get(j) + ", ");
								} else {
									ME_CoreFX.copyMap += map.get(i).get(j) + "}";
									System.out.print(map.get(i).get(j) + "}");
								}
							}
							if (i < map.size() - 1) {
								ME_CoreFX.copyMap += ",";
								System.out.print(",");
							}
							ME_CoreFX.copyMap += "\n";
							System.out.println();
						}
						ME_CoreFX.copyMap += "};";
						System.out.println("};");
						System.out.println();
						
						//resets the map format.
						for (int i = 0; i < map.size(); i++) {
							map.get(i).clear();
						}
						map.clear();
						
						System.out.println("ME_CoreFX.mouseX: " + mouseX);
						System.out.println("ME_CoreFX.mouseY: " + mouseY);
						
						/*
						 * Important Code for getting the arraylist map constructing.
						 * End
						 * 
						 * */
					
					// REMOVE AND ADD ELEMENTS TO LAYOUT!
					ME_CoreFX.root.getChildren().remove(totalTiles);
					ME_CoreFX.root.getChildren().add(UI_PlaceTileBG);
					ME_CoreFX.root.getChildren().remove(totalTiles);
					ME_CoreFX.root.getChildren().add(UI_Menu.UI_MenuBG);
					for (int i = 0; i < UI_Menu.imgViewArrayMenuList.size(); i++) {
						ME_CoreFX.root.getChildren().remove(totalTiles);
						ME_CoreFX.root.getChildren().add(UI_Menu.imgViewArrayMenuList.get(i));
					}
					ME_CoreFX.root.getChildren().remove(totalTiles);
					ME_CoreFX.root.getChildren().add(UI_Menu.sb);
					ME_CoreFX.root.getChildren().remove(totalTiles);
					ME_CoreFX.root.getChildren().add(ME_CoreFX.printMap);
					
					totalTiles++;
				}
			}
		});
	}
}
