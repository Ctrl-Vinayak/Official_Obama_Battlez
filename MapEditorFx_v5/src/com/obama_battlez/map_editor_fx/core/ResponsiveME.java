package com.obama_battlez.map_editor_fx.core;

public class ResponsiveME {

	public static void updateSceneSize() {
		ME_CoreFX.sceneWidth = ME_CoreFX.scene.getWidth();
		ME_CoreFX.sceneHeight = ME_CoreFX.scene.getHeight();
	}
	
	public static void resp_TileSelection() {
		UI_Menu.yScroll = UI_Menu.sb.getValue() * 50;
		for (int i = 0; i < ME_Resource.imgArrayList.size(); i++) {
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
		}
	}
	
	public static void resp_UI_Menu() {
		UI_Menu.UI_MenuBG.setX(ME_CoreFX.sceneWidth - 250);
		UI_Menu.UI_MenuBG.setHeight(ME_CoreFX.sceneHeight);
	}
	
	public static void resp_UI_ScrollBar() {
		UI_Menu.sb.setLayoutX(ME_CoreFX.sceneWidth - 20);
		UI_Menu.sb.setPrefHeight(ME_CoreFX.sceneHeight);
	}
	
	public static void resp_TilePlacementArea() {
		if (UI_Menu.selectedTile == 1) {
			UI_TilePlacement.UI_TilePlacementBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20 - 150);
			UI_TilePlacement.UI_TilePlacementBG.setHeight(ME_CoreFX.sceneHeight);
		} else {
			UI_TilePlacement.UI_TilePlacementBG.setWidth(ME_CoreFX.sceneWidth - 230 - 20 - 50);
			UI_TilePlacement.UI_TilePlacementBG.setHeight(ME_CoreFX.sceneHeight);
		}
	}
}
