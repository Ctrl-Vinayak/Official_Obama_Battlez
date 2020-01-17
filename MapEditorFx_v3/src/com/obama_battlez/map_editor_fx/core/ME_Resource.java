package com.obama_battlez.map_editor_fx.core;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class ME_Resource {
	
	public static ArrayList<Image> imgArrayList = new ArrayList<Image>();
	
	public static void addResources() {
		//general tiles:
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/groundOutline.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/tree.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/grass.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/house.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sand.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/water.gif").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/road.png").toExternalForm()));
		
		//sand ground Edges:
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundEgde1.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundEgde2.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundEgde3.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundEgde4.png").toExternalForm()));
		
		//sand ground Halfs:
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundHalf1.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundHalf2.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundHalf3.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandGroundHalf4.png").toExternalForm()));
		
		//sand water Edges:
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterEdge1.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterEdge2.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterEdge3.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterEdge4.png").toExternalForm()));
		
		//sand water Halfs:
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterHalf1.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterHalf2.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterHalf3.png").toExternalForm()));
		imgArrayList.add(new Image(ME_Resource.class.getResource("resources/sandWaterHalf4.png").toExternalForm()));
	}
}
