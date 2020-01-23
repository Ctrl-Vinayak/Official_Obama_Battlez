package com.obama_battlez.map_editor_fx.core;

/**
 * @since 15-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.7
 */
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
	
	public static void resp_printButtonMap() {
		UI_Menu.printMapButton.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		UI_Menu.printMapButton.setLayoutY(UI_Menu.printMapButtonYPos - UI_Menu.yScroll);
		UI_Menu.printMapButton.setTranslateX(ME_CoreFX.camera.getTranslateX());
		UI_Menu.printMapButton.setTranslateY(ME_CoreFX.camera.getTranslateY());
		UI_Menu.printMapButton.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_copyButtonMap() {
		UI_Menu.copyMapButton.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		UI_Menu.copyMapButton.setLayoutY(UI_Menu.copyMapButtonYPos + 20 - UI_Menu.yScroll);
		UI_Menu.copyMapButton.setTranslateX(ME_CoreFX.camera.getTranslateX());
		UI_Menu.copyMapButton.setTranslateY(ME_CoreFX.camera.getTranslateY());
		UI_Menu.copyMapButton.setTranslateZ(ME_CoreFX.camera.getTranslateZ());
	}
	
	public static void resp_TilePlacementArea() {
		if (UI_TilePlacement.selectedTile == 4 || UI_TilePlacement.selectedTile == 5 || UI_TilePlacement.selectedTile == 6) {
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
