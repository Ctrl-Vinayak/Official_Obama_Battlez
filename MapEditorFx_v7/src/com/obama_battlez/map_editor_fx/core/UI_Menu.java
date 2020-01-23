package com.obama_battlez.map_editor_fx.core;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class UI_Menu {
	
	public static void addBackground() {
		ME_CoreFX.UI_MenuBG.setFill(Color.DARKSLATEGRAY);
		ME_CoreFX.UI_MenuBG.setX(ME_CoreFX.sceneWidth - 250);
		ME_CoreFX.UI_MenuBG.setY(0);
		ME_CoreFX.UI_MenuBG.setWidth(250);
		ME_CoreFX.UI_MenuBG.setHeight(ME_CoreFX.sceneHeight);
		ME_CoreFX.root.getChildren().add(ME_CoreFX.UI_MenuBG);
	}

	public static void addTilesSelections() {
		for (int i = 0; i < ME_CoreFX.imgArrayList.size(); i++) {
			ME_CoreFX.imgViewArrayMenuList.add(new ImageView(ME_CoreFX.imgArrayList.get(i)));
			if (i % 3 == 0) {
				ME_CoreFX.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20);
				ME_CoreFX.imgViewArrayMenuList.get(i).setY(i * 20 + 20);
			} else if (i % 3 == 1) {
				ME_CoreFX.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20);
				ME_CoreFX.imgViewArrayMenuList.get(i).setY((i - 1) * 20 + 20);
			} else {
				ME_CoreFX.imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20 + 50 + 20);
				ME_CoreFX.imgViewArrayMenuList.get(i).setY((i - 2) * 20 + 20);
			}
			ME_CoreFX.buttonYPos = i * 20 + 20 + 50;
			ME_CoreFX.imgViewArrayMenuList.get(i).setFitWidth(50);
			ME_CoreFX.imgViewArrayMenuList.get(i).setFitHeight(50);
			ME_CoreFX.root.getChildren().add(ME_CoreFX.imgViewArrayMenuList.get(i));
		}
	}

	@SuppressWarnings("unchecked")
	public static void tileFuncSelection() {
		@SuppressWarnings("rawtypes")
		class MyHandler implements EventHandler {
			int i;
			MyHandler(int i) {
				this.i = i;
			}
			
			@Override
			public void handle(Event event) {
				ME_CoreFX.selectedTile = i;
				System.out.println(ME_CoreFX.selectedTile);
			}
		}
		
		for (int i = 0; i < ME_CoreFX.imgArrayList.size(); i++) {
			ME_CoreFX.imgViewArrayMenuList.get(i).setOnMouseClicked(new MyHandler(i));
		}
	}

	public static void addScrollBar() {
		ME_CoreFX.sb.setLayoutX(ME_CoreFX.sceneWidth - 20);
		ME_CoreFX.sb.setLayoutY(0);
		ME_CoreFX.sb.setPrefWidth(20);
		ME_CoreFX.sb.setPrefHeight(ME_CoreFX.sceneHeight);
		
		ME_CoreFX.sb.setMin(0);
		ME_CoreFX.sb.setMax(100);
		ME_CoreFX.sb.setBlockIncrement(1);
		ME_CoreFX.sb.setOrientation(Orientation.VERTICAL);
		
		ME_CoreFX.root.getChildren().add(ME_CoreFX.sb);
	}

	public static void addPrintButton() {
		ME_CoreFX.printMap.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		ME_CoreFX.printMap.setLayoutY(ME_CoreFX.buttonYPos);
		ME_CoreFX.printMap.setPrefSize(190, 30);
		ME_CoreFX.printMap.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
//				System.out.println(ME_CoreFX.copyMap);
				
				UI_TilePlacement.setMapInArray();
			}
		});
		ME_CoreFX.root.getChildren().add(ME_CoreFX.printMap);
	}
}
