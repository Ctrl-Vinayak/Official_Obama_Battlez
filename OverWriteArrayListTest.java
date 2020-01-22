package com.vinstorm.javafx_experiments.dev.vinayak.aaaae;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @since 21-1-2020
 * @author vinayak
 * @category JavaFX Experiments Project // Obama Battlez Dev // Convert placed tiles to 2d int array converted again to string.
 * @version v1.0
 */
public class OverWriteArrayListTest {

	private static ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static int x = 0;
	private static int y = 0;
	private static int tile = 0;
	private static int totalTiles = 0;
	private static boolean exit = false;
	
	private static ArrayList<Integer> selectedTileList = new ArrayList<Integer>();
	private static ArrayList<Integer> getRowX = new ArrayList<Integer>();
	private static ArrayList<Integer> getRowY = new ArrayList<Integer>();
	
	private static int xRows = 0;
	private static int yRows = 0;
	
	public static void main(String[] args) {
		
		while (exit == false) {			
			//x area
			System.out.println("type een x in: ");
			x = sc.nextInt();
			x = (int) (Math.round((x) / 100) * 100);
			System.out.println("jouw x is = " + x);
			getRowX.add(totalTiles, x);
			if (x > xRows * 100) {
				xRows = x / 100 + 1;	
			}
			System.out.println("jouw xRows is = " + xRows);
			
			//y area
			System.out.println("type een y in: ");
			y = sc.nextInt();
			y = (int) (Math.round((y) / 100) * 100);
			System.out.println("jouw y is = " + y);
			getRowY.add(totalTiles, y);
			if (y > yRows * 100) {
				yRows = y / 100 + 1;	
			}
			System.out.println("jouw yRows is = " + yRows);
			
			//tile area
			System.out.println("type een tile nummer in: ");
			tile = sc.nextInt();
			System.out.println("jouw tile nummer is = " + tile);
			selectedTileList.add(totalTiles, tile);
			
			//press 666 to exit program.
			if (tile == 666) {
				exit = true;
				System.exit(0);
			}
			
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
			
			//oude simpele versie van map formaat uitprinten.
////			//shows the xRows and yRows.
////			System.out.println("xRows: " + xRows + " x " + "yRows: " + yRows);
//			
//			//printing out the map format
//			System.out.println();
//			for (int i = 0; i < map.size(); i++) {
//				for (int j = 0; j < map.get(i).size(); j++) {
//					System.out.print(map.get(i).get(j) + ", ");
//				}
//				System.out.println();
//			}

			System.out.println("xRows: " + xRows);
			System.out.println("yRows: " + yRows);
			
//			//prints map out.
			System.out.println();
			for (int i = 0; i <= totalTiles; i++) {
				for (int j = 0; j < yRows; j++) {
					for (int k = 0; k < xRows; k++) {
						map.get(getRowY.get(i) / 100).set(getRowX.get(i) / 100, selectedTileList.get(i));
					}
					System.out.println("getRowX.get(" + i + "): " + getRowX.get(i) + " x " + " getRowY.get(" + i + "): " + getRowY.get(i));
				}
			}
			
//			for (int k = 0; k < map.size(); k++) {
//				for (int j = 0; j <= maxMouseY / 100; j++) {
//					for (int i = 0; i <= maxMouseX / 100; i++) {
//						if (getRowX.get(k) == i && getRowY.get(k) == j) {
//							map.get((int) (y / 100)).set((int) (x / 100), selectedTileList.get(k));
////							System.out.print(ME_CoreFX.selectedTileList.get(k) + ", ");
//						}
//						System.out.print(map.get(j).get(i) + ", ");
//					}
//					System.out.println();
//				}
//			}
			
			//printing out the map format
			System.out.println();
			for (int i = 0; i < map.size(); i++) {
				System.out.print("\t{");
				for (int j = 0; j < map.get(i).size(); j++) {
					if (j < map.get(i).size() - 1) {
						System.out.print(map.get(i).get(j) + ", ");
					} else {
						System.out.print(map.get(i).get(j) + "}");
					}
				}
				if (i < map.size() - 1) {
					System.out.print(",");
				}
				System.out.println();
			}
			
			//resets the map format.
			for (int i = 0; i < map.size(); i++) {
				map.get(i).clear();
			}
			map.clear();
			
			//increments totalTiles.
			totalTiles++;
		}
	}
}