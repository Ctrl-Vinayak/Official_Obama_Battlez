package com.obama_battlez.map_editor_fx.core;

public class ResponsiveME {

	public static void updateSceneSize() {
		ME_CoreFX.sceneWidth = ME_CoreFX.scene.getWidth();
		ME_CoreFX.sceneHeight = ME_CoreFX.scene.getHeight();
	}
	
	public static void resp_TileSelection() {
		ME_CoreFX.yScroll = ME_CoreFX.sb.getValue() * 50;
		for (int i = 0; i < ME_CoreFX.imgArrayList.size(); i++) {
			if (i % 3 == 0) {
				ME_CoreFX.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20);
				ME_CoreFX.imgViewArrayMenuList.get(i).setY(i * 20 + 20 - ME_CoreFX.yScroll);
			} else if (i % 3 == 1) {
				ME_CoreFX.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20);
				ME_CoreFX.imgViewArrayMenuList.get(i).setY((i - 1) * 20 + 20 - ME_CoreFX.yScroll);
			} else {
				ME_CoreFX.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20 + 50 + 20);
				ME_CoreFX.imgViewArrayMenuList.get(i).setY((i - 2) * 20 + 20 - ME_CoreFX.yScroll);
			}
			ME_CoreFX.imgViewArrayMenuList.get(i).setTranslateX(ME_CoreFX.camera.getTranslateX());
			ME_CoreFX.imgViewArrayMenuList.get(i).setTranslateY(ME_CoreFX.camera.getTranslateY());
			ME_CoreFX.imgViewArrayMenuList.get(i).setTranslateZ(ME_CoreFX.camera.getTranslateZ());
		}
	}
	
	public static void resp_UI_Menu() {
		ME_CoreFX.UI_MenuBG.setX(ME_CoreFX.sceneWidth - 250);
		ME_CoreFX.UI_MenuBG.setHeight(ME_CoreFX.sceneHeight);
		ME_CoreFX.UI_MenuBG.setTranslateX(ME_CoreFX.camera.getTranslateX());
		ME_CoreFX.UI_MenuBG.setTranslateY(ME_CoreFX.camera.getTranslateY());
		ME_CoreFX.UI_MenuBG.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_UI_ScrollBar() {
		ME_CoreFX.sb.setLayoutX(ME_CoreFX.sceneWidth - 20);
		ME_CoreFX.sb.setPrefHeight(ME_CoreFX.sceneHeight);
		ME_CoreFX.sb.setTranslateX(ME_CoreFX.camera.getTranslateX());
		ME_CoreFX.sb.setTranslateY(ME_CoreFX.camera.getTranslateY());
		ME_CoreFX.sb.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_PrintButtonMap() {
		ME_CoreFX.printMap.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		ME_CoreFX.printMap.setLayoutY(ME_CoreFX.buttonYPos - ME_CoreFX.yScroll);
		ME_CoreFX.printMap.setTranslateX(ME_CoreFX.camera.getTranslateX());
		ME_CoreFX.printMap.setTranslateY(ME_CoreFX.camera.getTranslateY());
		ME_CoreFX.printMap.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_TilePlacementArea() {
		if (ME_CoreFX.selectedTile == 1 || ME_CoreFX.selectedTile == 2 || ME_CoreFX.selectedTile == 3) {
			ME_CoreFX.UI_PlaceTileBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20 - 150);
			ME_CoreFX.UI_PlaceTileBG.setHeight(ME_CoreFX.sceneHeight);
		} else {
			ME_CoreFX.UI_PlaceTileBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20 - 50);
			ME_CoreFX.UI_PlaceTileBG.setHeight(ME_CoreFX.sceneHeight);
		}
		ME_CoreFX.UI_PlaceTileBG.setTranslateX(ME_CoreFX.camera.getTranslateX());
		ME_CoreFX.UI_PlaceTileBG.setTranslateY(ME_CoreFX.camera.getTranslateY());
		ME_CoreFX.UI_PlaceTileBG.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
}
