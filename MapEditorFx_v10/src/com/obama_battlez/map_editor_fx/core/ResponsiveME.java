package com.obama_battlez.map_editor_fx.core;

public class ResponsiveME {

	public static void updateSceneSize() {
		ME_CoreFX.sceneWidth = ME_CoreFX.scene.getWidth();
		ME_CoreFX.sceneHeight = ME_CoreFX.scene.getHeight();
	}
	
	public static void resp_TileSelection() {
		UI_Menu.yScroll = UI_Menu.sb.getValue() * 50;
		for (int i = 0; i < UI_Menu.imgArrayList.size(); i++) {
			if (i % 3 == 0) {
				UI_Menu.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20);
				UI_Menu.imgViewArrayMenuList.get(i).setY(i * 20 + 20 - UI_Menu.yScroll);
			} else if (i % 3 == 1) {
				UI_Menu.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20);
				UI_Menu.imgViewArrayMenuList.get(i).setY((i - 1) * 20 + 20 - UI_Menu.yScroll);
			} else {
				UI_Menu.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20 + 50 + 20);
				UI_Menu.imgViewArrayMenuList.get(i).setY((i - 2) * 20 + 20 - UI_Menu.yScroll);
			}
			UI_Menu.imgViewArrayMenuList.get(i).setTranslateX(ME_CoreFX.camera.getTranslateX());
			UI_Menu.imgViewArrayMenuList.get(i).setTranslateY(ME_CoreFX.camera.getTranslateY());
			UI_Menu.imgViewArrayMenuList.get(i).setTranslateZ(ME_CoreFX.camera.getTranslateZ());
		}
	}
	
	public static void resp_UI_Menu() {
		UI_Menu.UI_MenuBG.setX(ME_CoreFX.sceneWidth - 250);
		UI_Menu.UI_MenuBG.setHeight(ME_CoreFX.sceneHeight);
		UI_Menu.UI_MenuBG.setTranslateX(ME_CoreFX.camera.getTranslateX());
		UI_Menu.UI_MenuBG.setTranslateY(ME_CoreFX.camera.getTranslateY());
		UI_Menu.UI_MenuBG.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_UI_ScrollBar() {
		UI_Menu.sb.setLayoutX(ME_CoreFX.sceneWidth - 20);
		UI_Menu.sb.setPrefHeight(ME_CoreFX.sceneHeight);
		UI_Menu.sb.setTranslateX(ME_CoreFX.camera.getTranslateX());
		UI_Menu.sb.setTranslateY(ME_CoreFX.camera.getTranslateY());
		UI_Menu.sb.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_PrintButtonMap() {
		ME_CoreFX.printMap.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		ME_CoreFX.printMap.setLayoutY(ME_CoreFX.buttonYPos - UI_Menu.yScroll);
		ME_CoreFX.printMap.setTranslateX(ME_CoreFX.camera.getTranslateX());
		ME_CoreFX.printMap.setTranslateY(ME_CoreFX.camera.getTranslateY());
		ME_CoreFX.printMap.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_TilePlacementArea() {
		if (UI_TilePlacement.selectedTile == 1 /*|| UI_TilePlacement.selectedTile == 2 || UI_TilePlacement.selectedTile == 3*/) {
			UI_TilePlacement.UI_PlaceTileBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20 - 150);
			UI_TilePlacement.UI_PlaceTileBG.setHeight(ME_CoreFX.sceneHeight);
		} else {
			UI_TilePlacement.UI_PlaceTileBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20 - 50);
			UI_TilePlacement.UI_PlaceTileBG.setHeight(ME_CoreFX.sceneHeight);
		}
		UI_TilePlacement.UI_PlaceTileBG.setTranslateX(ME_CoreFX.camera.getTranslateX());
		UI_TilePlacement.UI_PlaceTileBG.setTranslateY(ME_CoreFX.camera.getTranslateY());
		UI_TilePlacement.UI_PlaceTileBG.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
}
