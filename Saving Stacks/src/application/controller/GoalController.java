package application.controller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;

public class GoalController implements EventHandler<ActionEvent>, Initializable{
	
	@FXML
	private GridPane goalGrid;
		
	@FXML
	private AnchorPane goalAnchor;
	
	public static final String controllerID = "GOALS";
	public static final int MAX_ROWS = 10;
	File file;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// sets the Bottom Bar.
		BottomBarController.attachBottomBar(goalAnchor.getChildren(), controllerID);
		
		//TODO: This likely inhibits the loading performance *but* it is better than before. Possible to thread?
		for (int i = 0; i < MAX_ROWS; i++)
		{
			generateRowIcons(i, null);
		}

		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		
	}

	
	public void generateRowIcons( int row, File f )
	{
	
		//ObservableList<Node> goalGrid = this.getGoalGrid().getChildren();
		
		/*
		Button unlock = new Button();
		SVGPath unlockPath = new SVGPath();
		unlockPath.setContent("M18 8h-1V6c0-2.76-2.24-5-5-5S7 3.24 7 6h2c0-1.66 1.34-3 3-3s3 1.34 3 3v2H6c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2zm0 12H6V10h12v10zm-6-3c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2z");
		unlock.setGraphic(unlockPath);
		unlock.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));
		goalGrid.add(unlock, 3, row);
		 */
		
		Button lock = new Button("");
		SVGPath lockPath = new SVGPath();
		lockPath.setContent("M18 8h-1V6c0-2.76-2.24-5-5-5S7 3.24 7 6v2H6c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.1-.9-2-2-2zM9 6c0-1.66 1.34-3 3-3s3 1.34 3 3v2H9V6zm9 14H6V10h12v10zm-6-3c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2z");
		lock.setGraphic(lockPath);
		lock.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));	
		goalGrid.add(lock, 3, row);
	
		
		Button delete = new Button("");
		SVGPath deletePath = new SVGPath();
		deletePath.setContent("M7 11v2h10v-2H7zm5-9C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z");
		delete.setGraphic(deletePath);
		delete.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));		
		goalGrid.add(deletePath, 4, row);
		
		Button add = new Button("");
		SVGPath addPath = new SVGPath();
		addPath.setContent("M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z");
		add.setGraphic(addPath);
		add.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));		
		goalGrid.add(add, 5, row);
		
	}
}










