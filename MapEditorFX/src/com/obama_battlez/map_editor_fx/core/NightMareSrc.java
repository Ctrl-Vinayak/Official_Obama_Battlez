package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

/**
 * @since 13-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.0
 */
public class NightMareSrc {

	public static ArrayList<ArrayList<Integer>> mapOne = new ArrayList<ArrayList<Integer>>();
	
	public static ArrayList<Integer>[] mapOneRows = new ArrayList[10];
	
	/**
	 * dit is een depressieve methode...
	 */
	public static void killMePlz() {
		for (int i = 0; i < mapOneRows.length; i++) {
			mapOneRows[i] = new ArrayList<Integer>();
		}
		
		//test om dingen toe te voegen...
		mapOneRows[0].add(1232453);
		mapOneRows[0].add(32453);
		mapOneRows[1].add(1253);
		mapOneRows[2].add(123452453);
		mapOneRows[3].add(1232453);
		mapOneRows[3].add(123992453);
		mapOneRows[3].add(12312453);
		mapOneRows[4].add(1232453);
		mapOneRows[5].add(1231432453);
		mapOneRows[5].add(420);
		mapOneRows[7].add(1230002453);
		
		for (int j = 0; j < mapOneRows.length; j++) {
			for (int i = 0; i < mapOneRows[j].size(); i++) {
				if (i == mapOneRows[j].size() - 1) {
					System.out.print(mapOneRows[j].get(i) + "");
				} else {
					System.out.print(mapOneRows[j].get(i) + ", ");
				}
			}
			System.out.println();
		}
	}
}
