package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

public class PrintButton {

	public static int tileNum = 0;
	public static boolean isX = false;
	public static boolean isY = false;
	public static int highestCoordzNum = 0;
	
	public static int oldYRows = 0;
	public static int newYRows = 0;
	public static int oldXRows = 0;
	public static int newXRows = 0;
	
	public static void updateStuff() {
		
		//Setting Minimum X Placement.
		if (ME_CoreFX.mouseX <= ME_CoreFX.minMouseX) {
			ME_CoreFX.minMouseX = ME_CoreFX.mouseX;
			ME_CoreFX.TileFronZeroX = ME_CoreFX.minMouseX ;
		}
		//Setting Minimum Y Placement.
		if (ME_CoreFX.mouseY <= ME_CoreFX.minMouseY) {
			ME_CoreFX.minMouseY = ME_CoreFX.mouseY;
			ME_CoreFX.TileFronZeroY = ME_CoreFX.minMouseY;
		}
		//Setting Maximum X Placement.
		if (ME_CoreFX.mouseX >= ME_CoreFX.maxMouseX) {
			ME_CoreFX.maxMouseX = ME_CoreFX.mouseX;
			newXRows = (int) ME_CoreFX.maxMouseX / 100;
		}
		//Setting Maximum Y Placement.
		if (ME_CoreFX.mouseY >= ME_CoreFX.maxMouseY) {
			ME_CoreFX.maxMouseY = ME_CoreFX.mouseY;
			newYRows = (int) ME_CoreFX.maxMouseY / 100;
		}
		
		if (ME_CoreFX.maxMouseX >= ME_CoreFX.maxMouseY) {
			highestCoordzNum = (int) ME_CoreFX.maxMouseX;
		} else {
			highestCoordzNum = (int) ME_CoreFX.maxMouseY;
		}
		
		//calculating the difference between minimum x, y and maximum x, y.
		ME_CoreFX.deltaMouseX = ME_CoreFX.maxMouseX - ME_CoreFX.minMouseX;
		ME_CoreFX.deltaMouseY = ME_CoreFX.maxMouseY - ME_CoreFX.minMouseY;
		
		//push all tiles from negative to positive.
		//note, this will push the positive tiles even further.
		for (int i = 0; i < ME_CoreFX.map2dArrayListRow.size(); i++) {
			ME_CoreFX.map2dArrayListRow.get(i).setX(ME_CoreFX.map2dArrayListRow.get(i).getX() - ME_CoreFX.TileFronZeroX);
			ME_CoreFX.map2dArrayListRow.get(i).setY(ME_CoreFX.map2dArrayListRow.get(i).getY() - ME_CoreFX.TileFronZeroY);
		}
		
		//add selected tile into the selected tile list.
		ME_CoreFX.selectedTileList.add(tileNum, ME_CoreFX.selectedTile);
		ME_CoreFX.getRowX.add(tileNum, (int) ME_CoreFX.map2dArrayListRow.get(tileNum).getX());
		ME_CoreFX.getRowY.add(tileNum, (int) ME_CoreFX.map2dArrayListRow.get(tileNum).getY());
		
		
		
		
		
		
		
		
		//add horizontal rows in the map arraylist.
		for (int i = oldYRows; i <= newYRows; i++) {
			ME_CoreFX.map.add(new ArrayList<Integer>());
		}
		
		System.out.println();
		System.out.println("oldYRows: " + oldYRows + " x " + "newYRows: " + newYRows);
		System.out.println("oldXRows: " + oldXRows + " x " + "newXRows: " + newXRows);
		System.out.println();
		
		//add cells in each horizontal row of the map arraylist.
		for (int i = oldYRows; i <= newYRows; i++) {
			for (int j = oldXRows; j <= newXRows; j++) {
				ME_CoreFX.map.get(i).add(j, -2);
			}
		}
		
		//prints map out.
//		for (int k = 0; k < ME_CoreFX.map2dArrayListRow.size(); k++) {
//			for (int j = 0; j <= ME_CoreFX.maxMouseY / 100; j++) {
//				for (int i = 0; i <= ME_CoreFX.maxMouseX / 100; i++) {
//					if (ME_CoreFX.getRowX.get(k) == i && ME_CoreFX.getRowY.get(k) == j) {
//						ME_CoreFX.map.get((int) (ME_CoreFX.mouseY / 100)).set((int) (ME_CoreFX.mouseX / 100), ME_CoreFX.selectedTileList.get(k));
////						System.out.print(ME_CoreFX.selectedTileList.get(k) + ", ");
//					}
//					System.out.print(ME_CoreFX.map.get(j).get(i) + ", ");
//				}
//				System.out.println();
//			}
//		}
		
		for (int i = 0; i < ME_CoreFX.map.size(); i++) {
			for (int j = 0; j < ME_CoreFX.map.get(i).size(); j++) {
				System.out.print(ME_CoreFX.map.get(i).get(j) + ", ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//concept poging #2.
//		//prints map out.
//		for (int j = 0; j <= ME_CoreFX.maxMouseY; j += 100) {
//			for (int i = 0; i <= ME_CoreFX.maxMouseX; i += 100) {
//				if (ME_CoreFX.getRowX.get(tileNum) == i && ME_CoreFX.getRowY.get(tileNum) == j) {
//					ME_CoreFX.map.get(ME_CoreFX.getRowY.get(tileNum)).add(ME_CoreFX.selectedTileList.get(tileNum));
//					System.out.print(ME_CoreFX.map.get(ME_CoreFX.getRowY.get(tileNum)).get(tileNum) + ", ");
////					System.out.print(tileNum + ": " + ME_CoreFX.selectedTileList.get(tileNum) + ", ");
//				} else {
////					ME_CoreFX.map.get(ME_CoreFX.getRowY.get(tileNum)).add(-2);
////					System.out.print(ME_CoreFX.map.get(ME_CoreFX.getRowY.get(tileNum)).get(tileNum) + ", ");
////					System.out.print(tileNum + ": " + -2 + ", ");
//				}
//			}
//			System.out.println();
//		}
		
		//concept poging #1.
//		for (int k = 0; k < ME_CoreFX.getRowX.size(); k++) {
//			for (int j = (int) ME_CoreFX.minMouseX; j < ME_CoreFX.maxMouseX; j += 100) {
//				if (j == ME_CoreFX.getRowX.get(k)) {
//					isX = true;
//					System.out.println("isX = " + Boolean.toString(isX));
//				} else {
//					isX = false;
//					System.out.println("isX = " + Boolean.toString(isX));
//				}
//			}
//		}
//		for (int k = 0; k < ME_CoreFX.getRowY.size(); k++) {
//			for (int j = (int) ME_CoreFX.minMouseY; j < ME_CoreFX.maxMouseY; j += 100) {
//				if (j == ME_CoreFX.getRowY.get(k)) {
//					isY = true;
//					System.out.println("isX = " + Boolean.toString(isY));
//				} else {
//					isY = false;
//					System.out.println("isX = " + Boolean.toString(isY));
//				}
//			}
//		}
		
		//push all tiles back to original position.
		for (int i = 0; i < ME_CoreFX.map2dArrayListRow.size(); i++) {
			ME_CoreFX.map2dArrayListRow.get(i).setX(ME_CoreFX.map2dArrayListRow.get(i).getX() + ME_CoreFX.TileFronZeroX);
			ME_CoreFX.map2dArrayListRow.get(i).setY(ME_CoreFX.map2dArrayListRow.get(i).getY() + ME_CoreFX.TileFronZeroY);
		}
		
		tileNum++;
		ME_CoreFX.minMouseX = 0;
		ME_CoreFX.minMouseY = 0;
		ME_CoreFX.TileFronZeroX = 0;
		ME_CoreFX.TileFronZeroY = 0;
		highestCoordzNum = 0;
		oldYRows = newYRows;
		oldXRows = newXRows;
		System.out.println();
	}
	
	public static void foo() {
		//push all tiles from negative to positive.
		//note, this will push the positive tiles even further.
		for (int i = 0; i < ME_CoreFX.map2dArrayListRow.size(); i++) {
			ME_CoreFX.map2dArrayListRow.get(i).setX(ME_CoreFX.map2dArrayListRow.get(i).getX() + ME_CoreFX.TileFronZeroX);
			ME_CoreFX.map2dArrayListRow.get(i).setY(ME_CoreFX.map2dArrayListRow.get(i).getY() + ME_CoreFX.TileFronZeroY);
		}
		
		
		
		//push all tiles back to original position.
//		for (int i = 0; i < ME_CoreFX.map2dArrayListRow.size(); i++) {
//			ME_CoreFX.map2dArrayListRow.get(i).setX(ME_CoreFX.map2dArrayListRow.get(i).getX() - ME_CoreFX.TileFronZeroX);
//			ME_CoreFX.map2dArrayListRow.get(i).setY(ME_CoreFX.map2dArrayListRow.get(i).getY() - ME_CoreFX.TileFronZeroY);
//		}
		
		ME_CoreFX.minMouseX = 0;
		ME_CoreFX.minMouseY = 0;
		ME_CoreFX.TileFronZeroX = 0;
		ME_CoreFX.TileFronZeroY = 0;
	}
}
