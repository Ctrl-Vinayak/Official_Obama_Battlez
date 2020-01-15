package com.obama_battlez.map_designing_fx.first;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
	
	public static void addAllElements() {
		MapElements.addGround();
		MapElements.addTrees();
		MapElements.addGrass();
		MapElements.addHouse();
		MapElements.addSand();
		MapElements.addWater();
		MapElements.addRoad();
		
		MapElements.addSandGroundEdge1();
		MapElements.addSandGroundEdge2();
		MapElements.addSandGroundEdge3();
		MapElements.addSandGroundEdge4();
		
		MapElements.addSandGroundHalf1();
		MapElements.addSandGroundHalf2();
		MapElements.addSandGroundHalf3();
		MapElements.addSandGroundHalf4();
		
		MapElements.addSandWaterEdge1();
		MapElements.addSandWaterEdge2();
		MapElements.addSandWaterEdge3();
		MapElements.addSandWaterEdge4();
		
		MapElements.addSandWaterHalf1();
		MapElements.addSandWaterHalf2();
		MapElements.addSandWaterHalf3();
		MapElements.addSandWaterHalf4();
	}

	// ground = 0;
	private static int totalGroundTiles = 0;
	private static void addGround() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 0 || Core.mapOne[yy][xx] == 1 || Core.mapOne[yy][xx] == -1
						|| Core.mapOne[yy][xx] == 2) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalGroundTiles: " + totalGroundTiles++);
						System.out.println(totalGroundTiles + "_xx: " + xx);
						System.out.println(totalGroundTiles + "_yy: " + yy);
					}
					groundImgView[totalGroundTiles] = new ImageView(groundImg);
					groundImgView[totalGroundTiles].setX(xx * 100);
					groundImgView[totalGroundTiles].setY(yy * 100);
					groundImgView[totalGroundTiles].setFitWidth(100);
					groundImgView[totalGroundTiles].setFitHeight(100);
					Core.root.getChildren().add(groundImgView[totalGroundTiles]);
				}
			}
		}
	}

	// tree = 1;
	private static int totalTreeTiles = 0;
	private static void addTrees() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 1) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalTreeTiles: " + totalTreeTiles++);
						System.out.println(totalTreeTiles + "_xx: " + xx);
						System.out.println(totalTreeTiles + "_yy: " + yy);
					}
					treeImgView[totalTreeTiles] = new ImageView(treeImg);
					treeImgView[totalTreeTiles].setX(xx * 100);
					treeImgView[totalTreeTiles].setY(yy * 100);
					treeImgView[totalTreeTiles].setFitWidth(200);
					treeImgView[totalTreeTiles].setFitHeight(200);
					Core.root.getChildren().add(treeImgView[totalTreeTiles]);
				}
			}
		}
	}

	// grass = 2;
	private static int totalGrassTiles = 0;
	private static void addGrass() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 2) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalGrassTiles: " + totalGrassTiles++);
						System.out.println(totalGrassTiles + "_xx: " + xx);
						System.out.println(totalGrassTiles + "_yy: " + yy);
					}
					grassImgView[totalGrassTiles] = new ImageView(grassImg);
					grassImgView[totalGrassTiles].setX(xx * 100);
					grassImgView[totalGrassTiles].setY(yy * 100);
					grassImgView[totalGrassTiles].setFitWidth(100);
					grassImgView[totalGrassTiles].setFitHeight(100);
					Core.root.getChildren().add(grassImgView[totalGrassTiles]);
				}
			}
		}
	}

	// house = 3;
	private static int totalHouseTiles = 0;
	private static void addHouse() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 3) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalHouseTiles: " + totalHouseTiles++);
						System.out.println(totalHouseTiles + "_xx: " + xx);
						System.out.println(totalHouseTiles + "_yy: " + yy);
					}
					houseImgView[totalHouseTiles] = new ImageView(houseImg);
					houseImgView[totalHouseTiles].setX(xx * 100);
					houseImgView[totalHouseTiles].setY(yy * 100);
					houseImgView[totalHouseTiles].setFitWidth(100);
					houseImgView[totalHouseTiles].setFitHeight(100);
					Core.root.getChildren().add(houseImgView[totalHouseTiles]);
				}
			}
		}
	}

	// sand = 4;
	private static int totalSandTiles = 0;
	private static void addSand() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 4) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandTiles: " + totalSandTiles++);
						System.out.println(totalSandTiles + "_xx: " + xx);
						System.out.println(totalSandTiles + "_yy: " + yy);
					}
					sandImgView[totalSandTiles] = new ImageView(sandImg);
					sandImgView[totalSandTiles].setX(xx * 100);
					sandImgView[totalSandTiles].setY(yy * 100);
					sandImgView[totalSandTiles].setFitWidth(100);
					sandImgView[totalSandTiles].setFitHeight(100);
					Core.root.getChildren().add(sandImgView[totalSandTiles]);
				}
			}
		}
	}

	// water = 5;
	private static int totalWaterTiles = 0;
	private static void addWater() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 5) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalWaterTiles: " + totalWaterTiles++);
						System.out.println(totalWaterTiles + "_xx: " + xx);
						System.out.println(totalWaterTiles + "_yy: " + yy);
					}
					waterImgView[totalWaterTiles] = new ImageView(waterImg);
					waterImgView[totalWaterTiles].setX(xx * 100);
					waterImgView[totalWaterTiles].setY(yy * 100);
					waterImgView[totalWaterTiles].setFitWidth(100);
					waterImgView[totalWaterTiles].setFitHeight(100);
					Core.root.getChildren().add(waterImgView[totalWaterTiles]);
				}
			}
		}
	}

	// road = 6;
	private static int totalRoadTiles = 0;
	private static void addRoad() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 6) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalRoadTiles: " + totalRoadTiles++);
						System.out.println(totalRoadTiles + "_xx: " + xx);
						System.out.println(totalRoadTiles + "_yy: " + yy);
					}
					roadImgView[totalRoadTiles] = new ImageView(roadImg);
					roadImgView[totalRoadTiles].setX(xx * 100);
					roadImgView[totalRoadTiles].setY(yy * 100);
					roadImgView[totalRoadTiles].setFitWidth(100);
					roadImgView[totalRoadTiles].setFitHeight(100);
					Core.root.getChildren().add(roadImgView[totalRoadTiles]);
				}
			}
		}
	}
	
	// 7 = sand ground Edge 1;
	private static int totalSandGroundEdge1Tiles = 0;
	private static void addSandGroundEdge1() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 7) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundEdge1Tiles: " + totalSandGroundEdge1Tiles++);
						System.out.println(totalSandGroundEdge1Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundEdge1Tiles + "_yy: " + yy);
					}
					sandGroundEdge1ImgView[totalSandGroundEdge1Tiles] = new ImageView(sandGroundEdgeImg1);
					sandGroundEdge1ImgView[totalSandGroundEdge1Tiles].setX(xx * 100);
					sandGroundEdge1ImgView[totalSandGroundEdge1Tiles].setY(yy * 100);
					sandGroundEdge1ImgView[totalSandGroundEdge1Tiles].setFitWidth(100);
					sandGroundEdge1ImgView[totalSandGroundEdge1Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundEdge1ImgView[totalSandGroundEdge1Tiles]);
				}
			}
		}
	}
	
	// 8 = sand ground Edge 2;
	private static int totalSandGroundEdge2Tiles = 0;
	private static void addSandGroundEdge2() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 8) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundEdge2Tiles: " + totalSandGroundEdge2Tiles++);
						System.out.println(totalSandGroundEdge2Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundEdge2Tiles + "_yy: " + yy);
					}
					sandGroundEdge2ImgView[totalSandGroundEdge2Tiles] = new ImageView(sandGroundEdgeImg2);
					sandGroundEdge2ImgView[totalSandGroundEdge2Tiles].setX(xx * 100);
					sandGroundEdge2ImgView[totalSandGroundEdge2Tiles].setY(yy * 100);
					sandGroundEdge2ImgView[totalSandGroundEdge2Tiles].setFitWidth(100);
					sandGroundEdge2ImgView[totalSandGroundEdge2Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundEdge2ImgView[totalSandGroundEdge2Tiles]);
				}
			}
		}
	}
	
	// 9 = sand ground Edge 3;
	private static int totalSandGroundEdge3Tiles = 0;
	private static void addSandGroundEdge3() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 9) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundEdge3Tiles: " + totalSandGroundEdge3Tiles++);
						System.out.println(totalSandGroundEdge3Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundEdge3Tiles + "_yy: " + yy);
					}
					sandGroundEdge3ImgView[totalSandGroundEdge3Tiles] = new ImageView(sandGroundEdgeImg3);
					sandGroundEdge3ImgView[totalSandGroundEdge3Tiles].setX(xx * 100);
					sandGroundEdge3ImgView[totalSandGroundEdge3Tiles].setY(yy * 100);
					sandGroundEdge3ImgView[totalSandGroundEdge3Tiles].setFitWidth(100);
					sandGroundEdge3ImgView[totalSandGroundEdge3Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundEdge3ImgView[totalSandGroundEdge3Tiles]);
				}
			}
		}
	}
	
	// 10 = sand ground Edge 4;
	private static int totalSandGroundEdge4Tiles = 0;
	private static void addSandGroundEdge4() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 10) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundEdge4Tiles: " + totalSandGroundEdge4Tiles++);
						System.out.println(totalSandGroundEdge4Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundEdge4Tiles + "_yy: " + yy);
					}
					sandGroundEdge4ImgView[totalSandGroundEdge4Tiles] = new ImageView(sandGroundEdgeImg4);
					sandGroundEdge4ImgView[totalSandGroundEdge4Tiles].setX(xx * 100);
					sandGroundEdge4ImgView[totalSandGroundEdge4Tiles].setY(yy * 100);
					sandGroundEdge4ImgView[totalSandGroundEdge4Tiles].setFitWidth(100);
					sandGroundEdge4ImgView[totalSandGroundEdge4Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundEdge4ImgView[totalSandGroundEdge4Tiles]);
				}
			}
		}
	}
	
	// 11 = sand ground Half 1;
	private static int totalSandGroundHalf1Tiles = 0;
	private static void addSandGroundHalf1() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 11) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundHalf1Tiles: " + totalSandGroundHalf1Tiles++);
						System.out.println(totalSandGroundHalf1Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundHalf1Tiles + "_yy: " + yy);
					}
					sandGroundHalf1ImgView[totalSandGroundHalf1Tiles] = new ImageView(sandGroundHalfImg1);
					sandGroundHalf1ImgView[totalSandGroundHalf1Tiles].setX(xx * 100);
					sandGroundHalf1ImgView[totalSandGroundHalf1Tiles].setY(yy * 100);
					sandGroundHalf1ImgView[totalSandGroundHalf1Tiles].setFitWidth(100);
					sandGroundHalf1ImgView[totalSandGroundHalf1Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundHalf1ImgView[totalSandGroundHalf1Tiles]);
				}
			}
		}
	}
	
	// 12 = sand ground Half 2;
	private static int totalSandGroundHalf2Tiles = 0;
	private static void addSandGroundHalf2() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 12) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundHalf2Tiles: " + totalSandGroundHalf2Tiles++);
						System.out.println(totalSandGroundHalf2Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundHalf2Tiles + "_yy: " + yy);
					}
					sandGroundHalf2ImgView[totalSandGroundHalf2Tiles] = new ImageView(sandGroundHalfImg2);
					sandGroundHalf2ImgView[totalSandGroundHalf2Tiles].setX(xx * 100);
					sandGroundHalf2ImgView[totalSandGroundHalf2Tiles].setY(yy * 100);
					sandGroundHalf2ImgView[totalSandGroundHalf2Tiles].setFitWidth(100);
					sandGroundHalf2ImgView[totalSandGroundHalf2Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundHalf2ImgView[totalSandGroundHalf2Tiles]);
				}
			}
		}
	}
	
	// 13 = sand ground Half 3;
	private static int totalSandGroundHalf3Tiles = 0;
	private static void addSandGroundHalf3() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 13) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundHalf3Tiles: " + totalSandGroundHalf3Tiles++);
						System.out.println(totalSandGroundHalf3Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundHalf3Tiles + "_yy: " + yy);
					}
					sandGroundHalf3ImgView[totalSandGroundHalf3Tiles] = new ImageView(sandGroundHalfImg3);
					sandGroundHalf3ImgView[totalSandGroundHalf3Tiles].setX(xx * 100);
					sandGroundHalf3ImgView[totalSandGroundHalf3Tiles].setY(yy * 100);
					sandGroundHalf3ImgView[totalSandGroundHalf3Tiles].setFitWidth(100);
					sandGroundHalf3ImgView[totalSandGroundHalf3Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundHalf3ImgView[totalSandGroundHalf3Tiles]);
				}
			}
		}
	}
	
	// 14 = sand ground Half 4;
	private static int totalSandGroundHalf4Tiles = 0;
	private static void addSandGroundHalf4() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 14) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandGroundHalf4Tiles: " + totalSandGroundHalf4Tiles++);
						System.out.println(totalSandGroundHalf4Tiles + "_xx: " + xx);
						System.out.println(totalSandGroundHalf4Tiles + "_yy: " + yy);
					}
					sandGroundHalf4ImgView[totalSandGroundHalf4Tiles] = new ImageView(sandGroundHalfImg4);
					sandGroundHalf4ImgView[totalSandGroundHalf4Tiles].setX(xx * 100);
					sandGroundHalf4ImgView[totalSandGroundHalf4Tiles].setY(yy * 100);
					sandGroundHalf4ImgView[totalSandGroundHalf4Tiles].setFitWidth(100);
					sandGroundHalf4ImgView[totalSandGroundHalf4Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandGroundHalf4ImgView[totalSandGroundHalf4Tiles]);
				}
			}
		}
	}
	
	// 15 = sand water Edge 1;
	private static int totalSandWaterEdge1Tiles = 0;
	private static void addSandWaterEdge1() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 15) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterEdge1Tiles: " + totalSandWaterEdge1Tiles++);
						System.out.println(totalSandWaterEdge1Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterEdge1Tiles + "_yy: " + yy);
					}
					sandWaterEdge1ImgView[totalSandWaterEdge1Tiles] = new ImageView(sandWaterEdgeImg1);
					sandWaterEdge1ImgView[totalSandWaterEdge1Tiles].setX(xx * 100);
					sandWaterEdge1ImgView[totalSandWaterEdge1Tiles].setY(yy * 100);
					sandWaterEdge1ImgView[totalSandWaterEdge1Tiles].setFitWidth(100);
					sandWaterEdge1ImgView[totalSandWaterEdge1Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterEdge1ImgView[totalSandWaterEdge1Tiles]);
				}
			}
		}
	}
	
	// 16 = sand water Edge 2;
	private static int totalSandWaterEdge2Tiles = 0;
	private static void addSandWaterEdge2() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 16) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterEdge2Tiles: " + totalSandWaterEdge2Tiles++);
						System.out.println(totalSandWaterEdge2Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterEdge2Tiles + "_yy: " + yy);
					}
					sandWaterEdge2ImgView[totalSandWaterEdge2Tiles] = new ImageView(sandWaterEdgeImg2);
					sandWaterEdge2ImgView[totalSandWaterEdge2Tiles].setX(xx * 100);
					sandWaterEdge2ImgView[totalSandWaterEdge2Tiles].setY(yy * 100);
					sandWaterEdge2ImgView[totalSandWaterEdge2Tiles].setFitWidth(100);
					sandWaterEdge2ImgView[totalSandWaterEdge2Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterEdge2ImgView[totalSandWaterEdge2Tiles]);
				}
			}
		}
	}
	
	// 17 = sand water Edge 3;
	private static int totalSandWaterEdge3Tiles = 0;
	private static void addSandWaterEdge3() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 17) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterEdge3Tiles: " + totalSandWaterEdge3Tiles++);
						System.out.println(totalSandWaterEdge3Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterEdge3Tiles + "_yy: " + yy);
					}
					sandWaterEdge3ImgView[totalSandWaterEdge3Tiles] = new ImageView(sandWaterEdgeImg3);
					sandWaterEdge3ImgView[totalSandWaterEdge3Tiles].setX(xx * 100);
					sandWaterEdge3ImgView[totalSandWaterEdge3Tiles].setY(yy * 100);
					sandWaterEdge3ImgView[totalSandWaterEdge3Tiles].setFitWidth(100);
					sandWaterEdge3ImgView[totalSandWaterEdge3Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterEdge3ImgView[totalSandWaterEdge3Tiles]);
				}
			}
		}
	}
	
	// 18 = sand water Edge 4;
	private static int totalSandWaterEdge4Tiles = 0;
	private static void addSandWaterEdge4() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 18) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterEdge4Tiles: " + totalSandWaterEdge4Tiles++);
						System.out.println(totalSandWaterEdge4Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterEdge4Tiles + "_yy: " + yy);
					}
					sandWaterEdge4ImgView[totalSandWaterEdge4Tiles] = new ImageView(sandWaterEdgeImg4);
					sandWaterEdge4ImgView[totalSandWaterEdge4Tiles].setX(xx * 100);
					sandWaterEdge4ImgView[totalSandWaterEdge4Tiles].setY(yy * 100);
					sandWaterEdge4ImgView[totalSandWaterEdge4Tiles].setFitWidth(100);
					sandWaterEdge4ImgView[totalSandWaterEdge4Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterEdge4ImgView[totalSandWaterEdge4Tiles]);
				}
			}
		}
	}
	
	// 19 = sand water Half 1;
	private static int totalSandWaterHalf1Tiles = 0;
	private static void addSandWaterHalf1() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 19) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterHalf1Tiles: " + totalSandWaterHalf1Tiles++);
						System.out.println(totalSandWaterHalf1Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterHalf1Tiles + "_yy: " + yy);
					}
					sandWaterHalf1ImgView[totalSandWaterHalf1Tiles] = new ImageView(sandWaterHalfImg1);
					sandWaterHalf1ImgView[totalSandWaterHalf1Tiles].setX(xx * 100);
					sandWaterHalf1ImgView[totalSandWaterHalf1Tiles].setY(yy * 100);
					sandWaterHalf1ImgView[totalSandWaterHalf1Tiles].setFitWidth(100);
					sandWaterHalf1ImgView[totalSandWaterHalf1Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterHalf1ImgView[totalSandWaterHalf1Tiles]);
				}
			}
		}
	}
	
	// 20 = sand water Half 2;
	private static int totalSandWaterHalf2Tiles = 0;
	private static void addSandWaterHalf2() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 20) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterHalf2Tiles: " + totalSandWaterHalf2Tiles++);
						System.out.println(totalSandWaterHalf2Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterHalf2Tiles + "_yy: " + yy);
					}
					sandWaterHalf2ImgView[totalSandWaterHalf2Tiles] = new ImageView(sandWaterHalfImg2);
					sandWaterHalf2ImgView[totalSandWaterHalf2Tiles].setX(xx * 100);
					sandWaterHalf2ImgView[totalSandWaterHalf2Tiles].setY(yy * 100);
					sandWaterHalf2ImgView[totalSandWaterHalf2Tiles].setFitWidth(100);
					sandWaterHalf2ImgView[totalSandWaterHalf2Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterHalf2ImgView[totalSandWaterHalf2Tiles]);
				}
			}
		}
	}
	
	// 21 = sand water Half 3;
	private static int totalSandWaterHalf3Tiles = 0;
	private static void addSandWaterHalf3() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 21) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterHalf3Tiles: " + totalSandWaterHalf3Tiles++);
						System.out.println(totalSandWaterHalf3Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterHalf3Tiles + "_yy: " + yy);
					}
					sandWaterHalf3ImgView[totalSandWaterHalf3Tiles] = new ImageView(sandWaterHalfImg3);
					sandWaterHalf3ImgView[totalSandWaterHalf3Tiles].setX(xx * 100);
					sandWaterHalf3ImgView[totalSandWaterHalf3Tiles].setY(yy * 100);
					sandWaterHalf3ImgView[totalSandWaterHalf3Tiles].setFitWidth(100);
					sandWaterHalf3ImgView[totalSandWaterHalf3Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterHalf3ImgView[totalSandWaterHalf3Tiles]);
				}
			}
		}
	}
	
	// 22 = sand water Half 4;
	private static int totalSandWaterHalf4Tiles = 0;
	private static void addSandWaterHalf4() {
		for (int yy = 0; yy < Core.mapOne.length; yy++) {
			for (int xx = 0; xx < Core.mapOne[yy].length; xx++) {
				if (Core.mapOne[yy][xx] == 22) {
					if (Core.isConsoleSpamOn == true) {
						System.out.println("totalSandWaterHalf4Tiles: " + totalSandWaterHalf4Tiles++);
						System.out.println(totalSandWaterHalf4Tiles + "_xx: " + xx);
						System.out.println(totalSandWaterHalf4Tiles + "_yy: " + yy);
					}
					sandWaterHalf4ImgView[totalSandWaterHalf4Tiles] = new ImageView(sandWaterHalfImg4);
					sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setX(xx * 100);
					sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setY(yy * 100);
					sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setFitWidth(100);
					sandWaterHalf4ImgView[totalSandWaterHalf4Tiles].setFitHeight(100);
					Core.root.getChildren().add(sandWaterHalf4ImgView[totalSandWaterHalf4Tiles]);
				}
			}
		}
	}
}
