package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

/**
 * @since 14-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.0
 */
public class BuildMap {

//	public static ArrayList<ArrayList<ArrayList<Integer>>> mapMaker = new ArrayList<ArrayList<ArrayList<Integer>>>();
	
	public static ArrayList<ArrayList<Integer>> mapTest = new ArrayList<ArrayList<Integer>>();
	
	public static void addTileArrayPlacement() {
		mapTest.add(new ArrayList<Integer>());
		mapTest.add(new ArrayList<Integer>());
		mapTest.add(new ArrayList<Integer>());
		mapTest.add(new ArrayList<Integer>());
		mapTest.add(new ArrayList<Integer>());
		
		mapTest.get(0).add(1);
		mapTest.get(0).add(2);
		mapTest.get(1).add(0);
		mapTest.get(1).add(10);
		mapTest.get(1).add(55551);
		mapTest.get(1).add(2);
		mapTest.get(1).add(97860);
		mapTest.get(1).add(10);
		mapTest.get(2).add(123452);
		mapTest.get(3).add(245);
		mapTest.get(3).add(2340);
		mapTest.get(4).add(123450);
		
		if (ME_CoreFX.isConsoleSpamOn == true) {
			for (int i = 0; i < mapTest.size(); i++) {
				for (int j = 0; j < mapTest.get(i).size(); j++) {
					System.out.print(mapTest.get(i).get(j) + ", ");
				}
				System.out.println();
			}
		}
	}
}
