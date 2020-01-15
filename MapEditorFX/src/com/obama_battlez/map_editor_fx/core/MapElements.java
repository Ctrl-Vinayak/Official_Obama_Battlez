package com.obama_battlez.map_editor_fx.core;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * @since 13-1-2020
 * @author vinayak
 * @category Map Editor // Obama Battlez Dev
 * @version v1.0
 */
public class MapElements {
	
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
	 * 
	 * 23 = sneeuw
	 * 24 = sneeuw grond half
	 */
	
	//general tiles:
	private static String groundStr = MapElements.class.getResource("resources/groundOutline.png").toExternalForm();
	private static Image groundImg = new Image(groundStr);
	private static ImageView[] groundImgView = new ImageView[738];

	private static String treeStr = MapElements.class.getResource("resources/tree.png").toExternalForm();
	private static Image treeImg = new Image(treeStr);
	private static ImageView[] treeImgView = new ImageView[738];

	private static String grassStr = MapElements.class.getResource("resources/grass.png").toExternalForm();
	private static Image grassImg = new Image(grassStr);
	private static ImageView[] grassImgView = new ImageView[738];

	private static String houseStr = MapElements.class.getResource("resources/house.png").toExternalForm();
	private static Image houseImg = new Image(houseStr);
	private static ImageView[] houseImgView = new ImageView[738];
	
	private static String sandStr = MapElements.class.getResource("resources/sand.png").toExternalForm();
	private static Image sandImg = new Image(sandStr);
	private static ImageView[] sandImgView = new ImageView[738];

	private static String waterStr = MapElements.class.getResource("resources/water.gif").toExternalForm();
	private static Image waterImg = new Image(waterStr);
	private static ImageView[] waterImgView = new ImageView[738];

	private static String roadStr = MapElements.class.getResource("resources/road.png").toExternalForm();
	private static Image roadImg = new Image(roadStr);
	private static ImageView[] roadImgView = new ImageView[738];
	
	//sand ground Edges:
	private static String sandGroundEdgeStr1 = MapElements.class.getResource("resources/sandGroundEgde1.png").toExternalForm();
	private static Image sandGroundEdgeImg1 = new Image(sandGroundEdgeStr1);
	private static ImageView[] sandGroundEdge1ImgView = new ImageView[738];
	
	private static String sandGroundEdgeStr2 = MapElements.class.getResource("resources/sandGroundEgde2.png").toExternalForm();
	private static Image sandGroundEdgeImg2 = new Image(sandGroundEdgeStr2);
	private static ImageView[] sandGroundEdge2ImgView = new ImageView[738];
	
	private static String sandGroundEdgeStr3 = MapElements.class.getResource("resources/sandGroundEgde3.png").toExternalForm();
	private static Image sandGroundEdgeImg3 = new Image(sandGroundEdgeStr3);
	private static ImageView[] sandGroundEdge3ImgView = new ImageView[738];
	
	private static String sandGroundEdgeStr4 = MapElements.class.getResource("resources/sandGroundEgde4.png").toExternalForm();
	private static Image sandGroundEdgeImg4 = new Image(sandGroundEdgeStr4);
	private static ImageView[] sandGroundEdge4ImgView = new ImageView[738];
	
	//sand ground Halfs:
	private static String sandGroundHalfStr1 = MapElements.class.getResource("resources/sandGroundHalf1.png").toExternalForm();
	private static Image sandGroundHalfImg1 = new Image(sandGroundHalfStr1);
	private static ImageView[] sandGroundHalf1ImgView = new ImageView[738];
	
	private static String sandGroundHalfStr2 = MapElements.class.getResource("resources/sandGroundHalf2.png").toExternalForm();
	private static Image sandGroundHalfImg2 = new Image(sandGroundHalfStr2);
	private static ImageView[] sandGroundHalf2ImgView = new ImageView[738];
	
	private static String sandGroundHalfStr3 = MapElements.class.getResource("resources/sandGroundHalf3.png").toExternalForm();
	private static Image sandGroundHalfImg3 = new Image(sandGroundHalfStr3);
	private static ImageView[] sandGroundHalf3ImgView = new ImageView[738];
	
	private static String sandGroundHalfStr4 = MapElements.class.getResource("resources/sandGroundHalf4.png").toExternalForm();
	private static Image sandGroundHalfImg4 = new Image(sandGroundHalfStr4);
	private static ImageView[] sandGroundHalf4ImgView = new ImageView[738];
	
	//sand water Edges:
	private static String sandWaterEdgeStr1 = MapElements.class.getResource("resources/sandWaterEdge1.png").toExternalForm();
	private static Image sandWaterEdgeImg1 = new Image(sandWaterEdgeStr1);
	private static ImageView[] sandWaterEdge1ImgView = new ImageView[738];
	
	private static String sandWaterEdgeStr2 = MapElements.class.getResource("resources/sandWaterEdge2.png").toExternalForm();
	private static Image sandWaterEdgeImg2 = new Image(sandWaterEdgeStr2);
	private static ImageView[] sandWaterEdge2ImgView = new ImageView[738];
	
	private static String sandWaterEdgeStr3 = MapElements.class.getResource("resources/sandWaterEdge3.png").toExternalForm();
	private static Image sandWaterEdgeImg3 = new Image(sandWaterEdgeStr3);
	private static ImageView[] sandWaterEdge3ImgView = new ImageView[738];
	
	private static String sandWaterEdgeStr4 = MapElements.class.getResource("resources/sandWaterEdge4.png").toExternalForm();
	private static Image sandWaterEdgeImg4 = new Image(sandWaterEdgeStr4);
	private static ImageView[] sandWaterEdge4ImgView = new ImageView[738];
	
	//sand water Halfs:
	private static String sandWaterHalfStr1 = MapElements.class.getResource("resources/sandWaterHalf1.png").toExternalForm();
	private static Image sandWaterHalfImg1 = new Image(sandWaterHalfStr1);
	private static ImageView[] sandWaterHalf1ImgView = new ImageView[738];
	
	private static String sandWaterHalfStr2 = MapElements.class.getResource("resources/sandWaterHalf2.png").toExternalForm();
	private static Image sandWaterHalfImg2 = new Image(sandWaterHalfStr2);
	private static ImageView[] sandWaterHalf2ImgView = new ImageView[738];
	
	private static String sandWaterHalfStr3 = MapElements.class.getResource("resources/sandWaterHalf3.png").toExternalForm();
	private static Image sandWaterHalfImg3 = new Image(sandWaterHalfStr3);
	private static ImageView[] sandWaterHalf3ImgView = new ImageView[738];
	
	private static String sandWaterHalfStr4 = MapElements.class.getResource("resources/sandWaterHalf4.png").toExternalForm();
	private static Image sandWaterHalfImg4 = new Image(sandWaterHalfStr4);
	private static ImageView[] sandWaterHalf4ImgView = new ImageView[738];
	
	private static int totalSandWaterHalf4Tiles = 0;
	private static int xImageB = ((int) (GameLoop.mouseX / 100 * 100) - (int) (GameLoop.mouseX % 100));
	private static int yImageB = ((int) (GameLoop.mouseY / 100 * 100) - (int) (GameLoop.mouseY % 100));
	private static int xImage = ((xImageB + 99) / 100) * 100;
	private static int yImage = ((yImageB + 99) / 100) * 100;
	public static void addElements() {
		MapEditor.scene.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				System.out.println("mouse clicked: x =  " + GameLoop.mouseX + "\t y = " + GameLoop.mouseY);
				
				xImageB = ((int) (GameLoop.mouseX / 100 * 100) - (int) (GameLoop.mouseX % 100));
				yImageB = ((int) (GameLoop.mouseY / 100 * 100) - (int) (GameLoop.mouseY % 100));
				xImage = ((xImageB + 99) / 100) * 100;
				yImage = ((yImageB + 99) / 100) * 100;
				
				sandWaterHalf4ImgView[totalSandWaterHalf4Tiles] = new ImageView(sandWaterHalfImg4);
				sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setX(xImage);
				sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setY(yImage);
				System.out.println("GameLoop.mouseX / 100 * 100 = " + (xImage));
				System.out.println("GameLoop.mouseY / 100 * 100 = " + (yImage));
				sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setFitWidth(100);
				sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setFitHeight(100);
				MapEditor.root.getChildren().add(sandWaterHalf4ImgView[totalSandWaterHalf4Tiles]);
				totalSandWaterHalf4Tiles++;
			}
		});
	}
}