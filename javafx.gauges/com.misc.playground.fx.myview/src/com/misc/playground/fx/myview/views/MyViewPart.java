package com.misc.playground.fx.myview.views;

import org.eclipse.fx.ui.workbench3.FXViewPart;

import eu.hansolo.medusa.FGauge;
import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.Gauge.SkinType;
import eu.hansolo.medusa.GaugeBuilder;
import eu.hansolo.medusa.GaugeDesign;
import eu.hansolo.medusa.Section;
import eu.hansolo.medusa.skins.SlimSkin;
import eu.hansolo.medusa.skins.TileTextKpiSkin;
import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.TileBuilder;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
//import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyViewPart extends FXViewPart {
    private GridPane pane;  

    private Button button;
	private final int nofSkins = Gauge.SkinType.values().length;
	private int minvalue = 500;
	private int maxvalue = 1100;
	private int currentValue = 501;
	
	private Tile              percentageTile;
	private static final double TILE_SIZE = 200;
	      
	private Gauge    gauges[][];
    private Gauge    steps;  
    private Gauge    distance;  
    private Gauge    activeCalories;  
    private Gauge    foodCalories;  
    private Gauge    weight;  
    private Gauge    bodyFat;  
 
 
public void startNotUsedSoIDoNotCare(Stage stage) {  
        Scene scene = new Scene(pane);  
 
        steps.setValue(5201);  
        distance.setValue(3.12);  
        activeCalories.setValue(347);  
        foodCalories.setValue(1500);  
        weight.setValue(78.7);  
        bodyFat.setValue(14.2);  
 
//        stage.setTitle("Medusa Dashboard");  
//        stage.setScene(scene);  
//        stage.show();  
    }  
 
public void stopNotUsedSoIDoNotCare() { System.exit(0); }  
 
private VBox getTopicBox(final String TEXT, final Color COLOR, final Gauge GAUGE) {  
    Rectangle bar = new Rectangle(200, 3);  
    bar.setArcWidth(6);  
    bar.setArcHeight(6);  
    bar.setFill(COLOR);  

    Label label = new Label(TEXT);  
    label.setTextFill(COLOR);  
    label.setAlignment(Pos.CENTER);  
    label.setPadding(new Insets(0, 0, 10, 0));  

    GAUGE.setBarColor(COLOR);  
    GAUGE.setBarBackgroundColor(Color.rgb(39,44,50));  
    GAUGE.setAnimated(true);  

    VBox vBox = new VBox(bar, label, GAUGE);  
    vBox.setSpacing(3);  
    vBox.setAlignment(Pos.CENTER);  
    return vBox;  
}  

private Node getTopicBox2(final String TEXT, final Color COLOR, final Gauge GAUGE) {  
//    Rectangle bar = new Rectangle(200, 3);  
//    bar.setArcWidth(6);  
//    bar.setArcHeight(6);  
//    bar.setFill(COLOR);  
//
//    Label label = new Label(TEXT);  
//    label.setTextFill(COLOR);  
//    label.setAlignment(Pos.CENTER);  
//    label.setPadding(new Insets(0, 0, 10, 0));  

    GAUGE.setBarColor(COLOR);  
    GAUGE.setBarBackgroundColor(Color.rgb(39,44,50));  
    GAUGE.setAnimated(true);  

//    VBox vBox = new VBox(bar, label, GAUGE);  
//    vBox.setSpacing(3);  
//    vBox.setAlignment(Pos.CENTER);  
    return new FGauge(GAUGE, GaugeDesign.TRANSPARENT, GaugeDesign.GaugeBackground.BEIGE);
}  

 //    public static void main(String[] args) { launch(args); }   

    @Override
	protected Scene createFxScene() {
    	
    	pane = new GridPane();  
        pane.setPadding(new Insets(20));  
        pane.setHgap(10);  
        pane.setVgap(15);  
        pane.setBackground(new Background(new BackgroundFill(Color.rgb(130,116,133), CornerRadii.EMPTY, Insets.EMPTY)));  
//        pane.setBackground(new Background(new BackgroundFill(Color.rgb(39,44,50), CornerRadii.EMPTY, Insets.EMPTY))); 
        ScrollPane superPane = new ScrollPane();
        superPane.setContent(pane);
        
    	button = new Button("Accept");
    	button.setOnAction(new EventHandler<ActionEvent>() {
    	    @Override public void handle(ActionEvent e) {
    	    	currentValue+= 12;
    	    	gauges[0][27].setValue(currentValue);
    	    }
    	});
    	pane.add(button, 0, 1);
    	
        this.test1();

        Scene newScene =  new Scene(superPane);

        return newScene;
    }
    
    private void test3(){
    	 percentageTile = TileBuilder.create()
                 .prefSize(TILE_SIZE, TILE_SIZE)
                 .skinType(eu.hansolo.tilesfx.Tile.SkinType.PERCENTAGE)
                 .title("moplaf gauge")
                 .unit("KM")
                 .description("Test")
                 .minValue(20)
                 .maxValue(60)
                 .build();
    	 
//    	 this.percentageTile.setMinValue(19);
    	 this.percentageTile.setStartFromZero(false);
    	 this.percentageTile.setValue(25);
    	 this.percentageTile.setValue(26);
    	 
    	 
    	 pane.add(this.percentageTile, 0, 0);
    }
    
    private void test1(){
        GaugeBuilder builder = GaugeBuilder.create();
        gauges = new Gauge[3][nofSkins];
        for ( int i=0; i<3; i++){
        	for ( int skin = 0; skin<nofSkins; skin++){
        		Gauge.SkinType skinType = Gauge.SkinType.values()[skin];
        		gauges[i][skin] = builder.decimals(0)
		                 .minValue( this.minvalue)
		                 .maxValue( this.maxvalue)
        				 .unit("KM")
//        				 .skinType(skinType)
        				 .build();          
        	}
        }
//        steps          = builder.decimals(0).maxValue(10000).unit("STEPS").skinType(SkinType.LCD).build();          //OK
//        distance       = builder.decimals(2).maxValue(10)   .unit("KM")   .skinType(SkinType.MODERN).build();  
//        activeCalories = builder.decimals(0).maxValue(2200) .unit("KCAL") .skinType(SkinType.BULLET_CHART).lcdVisible(false).build(); //OK
//        foodCalories   = builder.decimals(0).maxValue(2200) .unit("KCAL") .skinType(SkinType.BULLET_CHART).build();       
//        weight         = builder.decimals(1).maxValue(85)   .unit("KG")   .skinType(SkinType.DIGITAL).build();      //OK
//        bodyFat        = builder.decimals(1).maxValue(20)   .unit("%")    .skinType(SkinType.DIGITAL).build();         //OK
 
//        Node stepsBox        = getTopicBox("STEPS"          , Color.rgb(77,208,225) , steps);  
//        Node distanceBox     = getTopicBox("DISTANCE"       , Color.rgb(255,183,77) , distance);
//        Node actvCaloriesBox = getTopicBox("ACTIVE CALORIES", Color.rgb(229,115,115), activeCalories);  
//        Node foodCaloriesBox = getTopicBox("FOOD"           , Color.rgb(129,199,132), foodCalories);  
//        Node weightBox       = getTopicBox("WEIGHT"         , Color.rgb(149,117,205), weight);  
//        Node bodyFatBox      = getTopicBox("BODY FAT"       , Color.rgb(186,104,200), bodyFat);  
 

        int firstSkin = 27;//this.nofSkins-3;
        int lastSkin = 27;
        for ( int i=0; i<1; i++){
        	for ( int skin = firstSkin; skin<=lastSkin; skin++){
          	  Gauge gauge = gauges[i][skin];
//      	  gauge.setSkin(new MoplafSkinType(gauge));
          	  String title = String.format("%s(%d)", Gauge.SkinType.values()[skin].toString(), skin);
              Node node = getTopicBox(title       , Color.rgb(255,183,77) , gauge);
              pane.add(node       , i, skin);
//              gauge.setPrefSize(100.0, 100.0);
              // min measured value
              // not supported by TILES gauges
//              gauge.setMinMeasuredValue(20.0);
//              gauge.setMinMeasuredValueVisible(true);
              // starts from zero
//              gauge.setStartFromZero(false);
              // lcd supported by AMP, INDICATOR, HORIZONTAL, QUARTER
//              gauge.setLcdVisible(false);;
              // serctions are supported by BULLET_CHART, SIMPLE, TINY, SECTION, SIMPLE_SECTION
//              gauge.addSection(new Section(10,20, Color.AZURE));
//              gauge.addSection(new Section(33,50, Color.YELLOW));
              // areas supported by INDICATOR, HORIZONTAL, VERTICAL, QUARTER
//              gauge.setAreasVisible(true);
//              gauge.addArea(new Section(80,100, Color.RED));
              // threshold supported by BULLETCHART, KPI, MODERN, INDICATOR, HORIZONTAL, VERTICAL, QUARTER, TILEKPI
              gauge.setThresholdVisible(true);
              gauge.setThreshold(654);
              gauge.setThresholdColor(Color.RED);
              
              gauge.addSection(new Section(600, 1000, Color.GREEN));

              gauge.setMinValue(this.minvalue);
              gauge.setMaxValue(this.maxvalue);
              gauge.setStartFromZero(false);
              gauge.setSectionsVisible(false);
              gauge.setValue(this.currentValue);
          	  gauge.setSkin(new MoplafSkinType(gauge));
              }
        }
//        pane.add(stepsBox       , 0, 0);  
//        pane.add(distanceBox    , 1, 0);  
//        pane.add(actvCaloriesBox, 2, 0);  
//        pane.add(foodCaloriesBox, 3, 0);  
//        pane.add(weightBox      , 4, 0);  
//        pane.add(bodyFatBox     , 5, 0);       
        
//        steps         .setValue(5201);  
//        distance      .setValue(3.12);  
//        activeCalories.setValue(347);  
//        foodCalories  .setValue(1500);  
//        weight        .setValue(78.7);  
//        bodyFat       .setValue(14.2);  
    	}

	@Override
	protected void setFxFocus() {
		//this.button.requestFocus();
		
	}
}