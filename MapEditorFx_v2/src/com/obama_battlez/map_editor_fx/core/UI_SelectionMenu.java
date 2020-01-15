package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

import org.reactfx.EventStream;
import org.reactfx.EventStreams;

import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @since 13-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.0
 */
public class UI_SelectionMenu {

	public static ScrollBar sb = new ScrollBar();
	public static double yScrollBar = 0;
	public static int selectedTile = 0;
	public static int index = 0;
	
	private static Rectangle rectBG = new Rectangle();
	
	/**
	 * index determines what object stand still in that tile: 
	 * 0 = just ground; 
	 * 1 = trees; 
	 * 2 = grass; 
	 * 3 = house; 
	 * 4 = sand; 
	 * 5 = water; 
	 * 6 = road;
	 * 
	 * 7 = sand ground Edge 1
	 * 8 = sand ground Edge 2
	 * 9 = sand ground Edge 3
	 * 10 = sand ground Edge 4
	 * 
	 * 11 = sand ground Half 1
	 * 12 = sand ground Half 2
	 * 13 = sand ground Half 3
	 * 14 = sand ground Half 4
	 * 
	 * 15 = sand water Edge 1
	 * 16 = sand water Edge 2
	 * 17 = sand water Edge 3
	 * 18 = sand water Edge 4
	 * 
	 * 19 = sand water Half 1
	 * 20 = sand water Half 2
	 * 21 = sand water Half 3
	 * 22 = sand water Half 4
	 */
	
	//general tiles:
	private static String groundStr = UI_SelectionMenu.class.getResource("resources/groundOutline.png").toExternalForm();
	private static Image groundImg = new Image(groundStr);
	private static String treeStr = UI_SelectionMenu.class.getResource("resources/tree.png").toExternalForm();
	private static Image treeImg = new Image(treeStr);
	private static String grassStr = UI_SelectionMenu.class.getResource("resources/grass.png").toExternalForm();
	private static Image grassImg = new Image(grassStr);
	private static String houseStr = UI_SelectionMenu.class.getResource("resources/house.png").toExternalForm();
	private static Image houseImg = new Image(houseStr);
	private static String sandStr = UI_SelectionMenu.class.getResource("resources/sand.png").toExternalForm();
	private static Image sandImg = new Image(sandStr);
	private static String waterStr = UI_SelectionMenu.class.getResource("resources/water.gif").toExternalForm();
	private static Image waterImg = new Image(waterStr);
	private static String roadStr = UI_SelectionMenu.class.getResource("resources/road.png").toExternalForm();
	private static Image roadImg = new Image(roadStr);
	
	//sand ground Edges:
	private static String sandGroundEdgeStr1 = UI_SelectionMenu.class.getResource("resources/sandGroundEgde1.png").toExternalForm();
	private static Image sandGroundEdgeImg1 = new Image(sandGroundEdgeStr1);
	private static String sandGroundEdgeStr2 = UI_SelectionMenu.class.getResource("resources/sandGroundEgde2.png").toExternalForm();
	private static Image sandGroundEdgeImg2 = new Image(sandGroundEdgeStr2);
	private static String sandGroundEdgeStr3 = UI_SelectionMenu.class.getResource("resources/sandGroundEgde3.png").toExternalForm();
	private static Image sandGroundEdgeImg3 = new Image(sandGroundEdgeStr3);
	private static String sandGroundEdgeStr4 = UI_SelectionMenu.class.getResource("resources/sandGroundEgde4.png").toExternalForm();
	private static Image sandGroundEdgeImg4 = new Image(sandGroundEdgeStr4);
	
	//sand ground Halfs:
	private static String sandGroundHalfStr1 = UI_SelectionMenu.class.getResource("resources/sandGroundHalf1.png").toExternalForm();
	private static Image sandGroundHalfImg1 = new Image(sandGroundHalfStr1);
	private static String sandGroundHalfStr2 = UI_SelectionMenu.class.getResource("resources/sandGroundHalf2.png").toExternalForm();
	private static Image sandGroundHalfImg2 = new Image(sandGroundHalfStr2);
	private static String sandGroundHalfStr3 = UI_SelectionMenu.class.getResource("resources/sandGroundHalf3.png").toExternalForm();
	private static Image sandGroundHalfImg3 = new Image(sandGroundHalfStr3);
	private static String sandGroundHalfStr4 = UI_SelectionMenu.class.getResource("resources/sandGroundHalf4.png").toExternalForm();
	private static Image sandGroundHalfImg4 = new Image(sandGroundHalfStr4);
	
	//sand water Edges:
	private static String sandWaterEdgeStr1 = UI_SelectionMenu.class.getResource("resources/sandWaterEdge1.png").toExternalForm();
	private static Image sandWaterEdgeImg1 = new Image(sandWaterEdgeStr1);
	private static String sandWaterEdgeStr2 = UI_SelectionMenu.class.getResource("resources/sandWaterEdge2.png").toExternalForm();
	private static Image sandWaterEdgeImg2 = new Image(sandWaterEdgeStr2);
	private static String sandWaterEdgeStr3 = UI_SelectionMenu.class.getResource("resources/sandWaterEdge3.png").toExternalForm();
	private static Image sandWaterEdgeImg3 = new Image(sandWaterEdgeStr3);
	private static String sandWaterEdgeStr4 = UI_SelectionMenu.class.getResource("resources/sandWaterEdge4.png").toExternalForm();
	private static Image sandWaterEdgeImg4 = new Image(sandWaterEdgeStr4);
	
	//sand water Halfs:
	private static String sandWaterHalfStr1 = UI_SelectionMenu.class.getResource("resources/sandWaterHalf1.png").toExternalForm();
	private static Image sandWaterHalfImg1 = new Image(sandWaterHalfStr1);
	private static String sandWaterHalfStr2 = UI_SelectionMenu.class.getResource("resources/sandWaterHalf2.png").toExternalForm();
	private static Image sandWaterHalfImg2 = new Image(sandWaterHalfStr2);
	private static String sandWaterHalfStr3 = UI_SelectionMenu.class.getResource("resources/sandWaterHalf3.png").toExternalForm();
	private static Image sandWaterHalfImg3 = new Image(sandWaterHalfStr3);
	private static String sandWaterHalfStr4 = UI_SelectionMenu.class.getResource("resources/sandWaterHalf4.png").toExternalForm();
	private static Image sandWaterHalfImg4 = new Image(sandWaterHalfStr4);
	
	public static ArrayList<ImageView> imgArrayList = new ArrayList<ImageView>();
	
	public static void addBackGroundMenu() {
		rectBG.setFill(Color.DARKSLATEGRAY);
		rectBG.setX(GameLoop.getSceneWidth() - 260);
		rectBG.setY(0);
		rectBG.setWidth(260);
		rectBG.setHeight(GameLoop.getSceneHeight());
		ME_CoreFX.root.getChildren().add(rectBG);
	}
	
	public static void addTilesSelection() {
		//general tiles:
		imgArrayList.add(new ImageView(groundImg));
		imgArrayList.add(new ImageView(treeImg));
		imgArrayList.add(new ImageView(grassImg));
		imgArrayList.add(new ImageView(houseImg));
		imgArrayList.add(new ImageView(sandImg));
		imgArrayList.add(new ImageView(waterImg));
		imgArrayList.add(new ImageView(roadImg));
		
		//sand ground Edges:
		imgArrayList.add(new ImageView(sandGroundEdgeImg1));
		imgArrayList.add(new ImageView(sandGroundEdgeImg2));
		imgArrayList.add(new ImageView(sandGroundEdgeImg3));
		imgArrayList.add(new ImageView(sandGroundEdgeImg4));
		
		//sand ground Halfs:
		imgArrayList.add(new ImageView(sandGroundHalfImg1));
		imgArrayList.add(new ImageView(sandGroundHalfImg2));
		imgArrayList.add(new ImageView(sandGroundHalfImg3));
		imgArrayList.add(new ImageView(sandGroundHalfImg4));
		
		//sand water Edges:
		imgArrayList.add(new ImageView(sandWaterEdgeImg1));
		imgArrayList.add(new ImageView(sandWaterEdgeImg2));
		imgArrayList.add(new ImageView(sandWaterEdgeImg3));
		imgArrayList.add(new ImageView(sandWaterEdgeImg4));
		
		//sand water Halfs:
		imgArrayList.add(new ImageView(sandWaterHalfImg1));
		imgArrayList.add(new ImageView(sandWaterHalfImg2));
		imgArrayList.add(new ImageView(sandWaterHalfImg3));
		imgArrayList.add(new ImageView(sandWaterHalfImg4));
		
		for (int i = 0; i < imgArrayList.size(); i++) {
			if (i % 2 == 0) {
				imgArrayList.get(i).setX(GameLoop.getSceneWidth() - 260 + 20);
				imgArrayList.get(i).setY(i * 70 + 20);
			} else {
				imgArrayList.get(i).setX(GameLoop.getSceneWidth() - 260 + 20 + 100 + 20);
				imgArrayList.get(i).setY((i - 1) * 70 + 20);
			}
			imgArrayList.get(i).prefWidth(100);
			imgArrayList.get(i).prefHeight(100);
			ME_CoreFX.root.getChildren().add(imgArrayList.get(i));
		}
	}
	
	public static void addPageTileSelection() {
		
	}
	
	public static void printArrayButton() {
		
	}
	
	public static void copyArrayToClipBoardButton() {
		
	}
	
	public static void keepResponsiveness() {
		rectBG.setX(GameLoop.getSceneWidth() - 260);
		rectBG.setHeight(GameLoop.getSceneHeight());
		
		for (int i = 0; i < imgArrayList.size(); i++) {
			if (i % 2 == 0) {
				imgArrayList.get(i).setX(GameLoop.getSceneWidth() - 260 + 20);
				imgArrayList.get(i).setY(i * 70 + 20 - yScrollBar);
			} else {
				imgArrayList.get(i).setX(GameLoop.getSceneWidth() - 260 + 20 + 100 + 20);
				imgArrayList.get(i).setY((i - 1) * 70 + 20 - yScrollBar);
			}
		}
		
		sb.setLayoutX(GameLoop.getSceneWidth() - 15);
		sb.setPrefHeight(GameLoop.getSceneHeight());
		sb.setBlockIncrement(GameLoop.getSceneHeight() / 144);
		yScrollBar = sb.getValue() * 50;
	}
	
	public static void addScrollBarElement() {
		sb.setLayoutX(GameLoop.getSceneWidth() - 15);
		sb.setLayoutY(0);
		sb.setPrefWidth(15);
		sb.setPrefHeight(GameLoop.getSceneHeight());
		sb.setMin(0);
		sb.setMax(100);
		sb.setBlockIncrement(5);
		sb.setOrientation(Orientation.VERTICAL);
		ME_CoreFX.root.getChildren().add(sb);
		
		UI_SelectionMenu.rectBG.setOnScroll(new EventHandler<ScrollEvent>() {

			@Override
			public void handle(ScrollEvent event) {
				if (yScrollBar > 0) {
					yScrollBar = event.getDeltaY() / 16;
					sb.setValue(sb.getValue() - event.getDeltaY() / 16);
				} else if (yScrollBar < 0) {
					yScrollBar = 0;
					sb.setValue(0);
				} else if (yScrollBar > 100) {
					yScrollBar = 100;
					sb.setValue(100);
				}
			}
		});
	}
}
