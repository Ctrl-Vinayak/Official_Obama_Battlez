package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @since 15-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.8
 */
public class UI_Menu {
	
	//Image resources list.
	public static ArrayList<Image> imgArrayList = new ArrayList<Image>();
	//Imageview list for UI Menu.
	public static ArrayList<ImageView> imgViewArrayMenuList = new ArrayList<ImageView>();
	
	public static Rectangle UI_MenuBG = new Rectangle();
	public static ScrollBar sb = new ScrollBar();
	public static double yScroll = 0;
	
	public static Button printMapButton = new Button("print map");
	public static int printMapButtonYPos = 0;
	
	public static Button copyMapButton = new Button("copy map");
	public static int copyMapButtonYPos = 0;
	
	private static Clipboard cb = Clipboard.getSystemClipboard();
	private static ClipboardContent content = new ClipboardContent();
	
	public static void addBackground() {
		UI_MenuBG.setFill(Color.DARKSLATEGRAY);
		UI_MenuBG.setX(ME_CoreFX.sceneWidth - 250);
		UI_MenuBG.setY(0);
		UI_MenuBG.setWidth(250);
		UI_MenuBG.setHeight(ME_CoreFX.sceneHeight);
		ME_CoreFX.root.getChildren().add(UI_MenuBG);
	}

	public static void addTilesSelections() {
		for (int i = 0; i < imgArrayList.size(); i++) {
			imgViewArrayMenuList.add(new ImageView(imgArrayList.get(i)));
			if (i % 3 == 0) {
				imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20);
				imgViewArrayMenuList.get(i).setY(i * 20 + 20);
			} else if (i % 3 == 1) {
				imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20);
				imgViewArrayMenuList.get(i).setY((i - 1) * 20 + 20);
			} else {
				imgViewArrayMenuList.get(i).setX(ME_CoreFX.sceneWidth - 250 + 20 + 50 + 20 + 50 + 20);
				imgViewArrayMenuList.get(i).setY((i - 2) * 20 + 20);
			}
			printMapButtonYPos = i * 20 + 20 + 20 + 50;
			imgViewArrayMenuList.get(i).setFitWidth(50);
			imgViewArrayMenuList.get(i).setFitHeight(50);
			ME_CoreFX.root.getChildren().add(imgViewArrayMenuList.get(i));
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
				UI_TilePlacement.selectedTile = i;
//				System.out.println(ME_CoreFX.selectedTile);
			}
		}
		
		for (int i = 0; i < imgArrayList.size(); i++) {
			imgViewArrayMenuList.get(i).setOnMouseClicked(new MyHandler(i));
		}
	}

	public static void addScrollBar() {
		sb.setLayoutX(ME_CoreFX.sceneWidth - 20);
		sb.setLayoutY(0);
		sb.setPrefWidth(20);
		sb.setPrefHeight(ME_CoreFX.sceneHeight);
		
		sb.setMin(0);
		sb.setMax(100);
		sb.setBlockIncrement(1);
		sb.setOrientation(Orientation.VERTICAL);
		
		ME_CoreFX.root.getChildren().add(sb);
	}

	public static void addPrintButton() {
		printMapButton.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		printMapButton.setLayoutY(printMapButtonYPos);
		printMapButton.setPrefSize(190, 30);
		printMapButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println(UI_TilePlacement.copyMap);
			}
		});
		ME_CoreFX.root.getChildren().add(printMapButton);
	}
	
	public static void addCopyButton() {
		copyMapButton.setLayoutX(ME_CoreFX.sceneWidth - 250 + 20);
		copyMapButton.setLayoutY(copyMapButtonYPos += printMapButtonYPos + 50);
		copyMapButton.setPrefSize(190, 30);
		copyMapButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				content.putString(UI_TilePlacement.copyMap);
				cb.setContent(content);
			}
		});
		ME_CoreFX.root.getChildren().add(copyMapButton);
	}
}
