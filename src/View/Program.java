package View;

//Shimon Desta-203670286

import Model.*;
import Controller.*;
import javax.swing.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
//import java.lang.ModuleLayer.Controller;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.scene.layout.Priority;




public class Program extends Application {
	
    final ScrollPane sp1 = new ScrollPane();
    final ScrollPane sp2 = new ScrollPane();
    private Text actionStatus;
	SystamController controller = new SystamController();
    Scene window1, window2, window3, window4, window5, window6, window7, window8,Mune_window;
    Button button1, button2, button3, button4, button5, button6,button7, button8 ;
    Button button9, button10, button11, button12, button13, button14, button15, button16;
    Button button_1,button_2,button_3;
    Button Gold,Silver,Bronze;
    Image GoldImage = new Image(getClass().getResourceAsStream("Gold.png"));
    ImageView GoldView = new ImageView(GoldImage);
    Image SilverImage = new Image(getClass().getResourceAsStream("Silver.png"));
    ImageView SilverView = new ImageView(SilverImage);
    Image BronzeImage = new Image(getClass().getResourceAsStream("Bronze.png"));
    ImageView BronzeView = new ImageView(BronzeImage);
    Image Viewolympic = new Image(getClass().getResourceAsStream("Olympic_Rings.png"));
    ImageView olympicView = new ImageView(Viewolympic);
    Image TeamImage = new Image(getClass().getResourceAsStream("TeamImage.png"));
    ImageView TeamView = new ImageView(TeamImage);
    Image CountriesImage = new Image(getClass().getResourceAsStream("CountriesImage.png"));
    ImageView CountriesView = new ImageView(CountriesImage);
    Image RuningImage = new Image(getClass().getResourceAsStream("Runing.png"));
    ImageView RuningView = new ImageView(RuningImage);
    Image JumpingImage = new Image(getClass().getResourceAsStream("Jumping.png"));
    ImageView JumpingView = new ImageView(JumpingImage);
    Image WinnerImage = new Image(getClass().getResourceAsStream("Winner.png"));
    ImageView WinnerView = new ImageView(WinnerImage);
    Image StartImage = new Image(getClass().getResourceAsStream("Stars.png"));
    ImageView StartView = new ImageView(StartImage);
    Image InfoImage = new Image(getClass().getResourceAsStream("Info.png"));
    ImageView InfoView = new ImageView(InfoImage);
    Image Winner2Image = new Image(getClass().getResourceAsStream("Winner2.png"));
    ImageView Winner2View = new ImageView(Winner2Image);
    Stage MainWindow;
	Scene Mune_window2;
    
    public void start(Stage primaryStage) throws Exception {
        controller.getInfroInOlympics();
        MainWindow = primaryStage;
        primaryStage.setTitle("OlympicGames");
        button1 = new Button("Start");
        button1.setTextFill(Color.BLUE);
        button1.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        
        Label layoutMain = new Label(" Welcome to Olympic Games");
        layoutMain.setTextFill(Color.BLUE);
        layoutMain.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        olympicView.setFitHeight(300);
        olympicView.setFitWidth(500);
        TeamView.setFitHeight(100);
        TeamView.setFitWidth(100);
        CountriesView.setFitHeight(100);
        CountriesView.setFitWidth(100);
        WinnerView.setFitHeight(100);
        WinnerView.setFitWidth(100);
        VBox Main_Window = new VBox(20);
        Main_Window.getChildren().addAll(layoutMain, olympicView, button1);
        Main_Window.setAlignment(Pos.CENTER);
        window1 = new Scene(Main_Window, 700, 600);
        primaryStage.setScene(window1);
        primaryStage.setOnCloseRequest(e -> {
        	e.consume();
            try {
                CloseProgram();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        VBox layout2 = new VBox(30);
        layout2.setAlignment(Pos.CENTER);
        Label label_2 = new Label("Select a contest type:");
        label_2.setTextFill(Color.BLUE);
        label_2.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        button2 = new Button("Countries Competition");
        button3 = new Button("   Teams Competition  ");
        button6 = new Button("     Olympic winners  ");
        button7 = new Button("Back");
        button2.setGraphic(CountriesView);
        button3.setGraphic(TeamView);
        button6.setGraphic(WinnerView);
        button2.setTextFill(Color.BLUE);
        button2.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        button3.setTextFill(Color.BLUE);
        button3.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        button6.setTextFill(Color.BLUE);
        button6.setFont(Font.font("Calibri", FontWeight.BOLD, 21));
        button1.setOnAction(e -> primaryStage.setScene(window2));
        button2.setOnAction(e -> Countries_Dispaly(primaryStage));
        button3.setOnAction(e -> Team_Dispaly(primaryStage));
        button6.setOnAction(e -> getWinners(primaryStage));
        
        
        layout2.getChildren().addAll(label_2,button2, button3, button6);
  
        window2 = new Scene(layout2, 700, 600);

        
        primaryStage.show();
    }
    public void Countries_Dispaly(Stage primaryStage) {
    	Label label_test = new Label("Select a Type of Sport:");
        label_test.setTextFill(Color.DARKBLUE);
        label_test.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
    	
        VBox vbox1 = new VBox(30);
        RuningView.setFitHeight(100);
        RuningView.setFitWidth(100);
        JumpingView.setFitHeight(100);
        JumpingView.setFitWidth(100);
        Winner2View.setFitHeight(100);
        Winner2View.setFitWidth(100);
        
        button_1 = new Button("Jumping Countries competition");
        button_2 = new Button("Running Countries competition");
        button_3 = new Button("     Olympic winners  ");
        button_1.setGraphic(JumpingView);
        button_2.setGraphic(RuningView);
        button_3.setGraphic(Winner2View);
        button_1.setOnAction(e -> WindowDisplay(controller.getCompetitions().get(0), primaryStage));
        button_2.setOnAction(e -> WindowDisplay(controller.getCompetitions().get(1), primaryStage));
        button6.setOnAction(e -> getWinners(primaryStage));
        button2 = new Button("Back");
        button_3.setOnAction(e -> primaryStage.setScene(window2));

  
    	
    	vbox1.setAlignment(Pos.CENTER);
        vbox1.getChildren().addAll(label_test,button_1,button_2,button_3,button2);

    	Mune_window2 = new Scene(vbox1, 700, 600); // w x h
        primaryStage.setScene(Mune_window2);
        
    	
    }
 
    public void Team_Dispaly(Stage primaryStage) {
    	Label label_test = new Label("Select a Type of Sport:");
        label_test.setTextFill(Color.DARKBLUE);
        label_test.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
    	
        VBox vbox1 = new VBox(10);
        RuningView.setFitHeight(100);
        RuningView.setFitWidth(100);
        JumpingView.setFitHeight(100);
        JumpingView.setFitWidth(100);
    	 

        button4 = new Button("Running competition");
        button5 = new Button("Jumping competition");
        button4.setGraphic(RuningView);
        button5.setGraphic(JumpingView);
        button4.setOnAction(e -> WindowDisplay(controller.getCompetitions().get(2), primaryStage));
        button5.setOnAction(e -> WindowDisplay(controller.getCompetitions().get(3), primaryStage));
        button2 = new Button("Back");
        button2.setOnAction(e -> primaryStage.setScene(window2));

  
    	
    	vbox1.setAlignment(Pos.CENTER);
        vbox1.getChildren().addAll(label_test,button4,button5,button2);

    	Mune_window = new Scene(vbox1, 700, 600); // w x h
        primaryStage.setScene(Mune_window);
        
    	
    }
    
    
    
    
    
    
  
    public void WindowDisplay(Tournament competition, Stage primaryStage) {
       
        
        Label label = new Label("Contenders");
        label.setTextFill(Color.DARKBLUE);
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(label);
        Label l2 = new Label("");
        l2.setText(competition.toString());   
        button10 = new Button("Back");
        button10.setOnAction(e -> primaryStage.setScene(window3));
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);
        VBox vbox2 = new VBox(10);
        vbox2.setPadding(new Insets(12,12,12, 12));
        sp1.setPrefSize(500, 500);
        sp1.setContent(l2);
        vbox2.getChildren().addAll(hb,sp1, actionStatus, button10);
        window7 = new Scene(vbox2, 700, 600); 


//----------------------------------------------------------------
        Label label3 = new Label("Participating Countries");
        label3.setTextFill(Color.DARKBLUE);
        label3.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        
        HBox hb3 = new HBox();
        hb3.setAlignment(Pos.CENTER);
        hb3.getChildren().add(label3);
        Label l3 = new Label("");
        l3.setText(competition.toString());
              
        button15 = new Button("Back");
        button15.setOnAction(e -> primaryStage.setScene(window3));

        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);
        VBox vbox4 = new VBox(20);
        vbox4.setPadding(new Insets(25, 25, 25, 25));
        sp2.setPrefSize(500, 500);
        sp2.setContent(l3);
        vbox4.getChildren().addAll(hb3,sp2, actionStatus, button15);
        window4 = new Scene(vbox4,  700, 600); 
//---------------------------------------------------------------
        Label label_5 = new Label("Let's Go!!!");
        label_5.setTextFill(Color.DARKBLUE);
        label_5.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        Label label10= new Label();
        StartView.setFitHeight(100);
        StartView.setFitWidth(100);
        InfoView.setFitHeight(100);
        InfoView.setFitWidth(100);

        button8 = new Button("Details of Competitors");
        button9 = new Button("    Start Competition   ");
        button8.setGraphic(InfoView);
        button9.setGraphic(StartView);
        button7.setAlignment(Pos.CENTER);
        button7.setOnAction(e -> primaryStage.setScene(window2));
        button9.setOnAction(e -> getWinnersInCompetition(competition, primaryStage));
        button8.setOnAction(e -> getTypeOfCompetition(competition, primaryStage));
        VBox vbox = new VBox(20);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label_5,button8, button9, button7,label10);
        window3 = new Scene(vbox, 700, 600);
        primaryStage.setScene(window3);
        primaryStage.show();

    }

    public void getWinnersInCountriesCompetition(Tournament competition,Stage primaryStage){
        Label label_1 = new Label("Winners in the Competition:");
        label_1.setTextFill(Color.DARKBLUE);
        label_1.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        VBox vbox1 = new VBox(15);
        controller.Olympic.getWinnersInSpecificCompetition(competition);
        button12 = new Button("Back");
        button12.setOnAction(e -> primaryStage.setScene(window3));
        Gold = new Button(((CountryCompetition)competition).getTeamsWinners().get(0).getTeamName());
        Silver= new Button(((CountryCompetition)competition).getTeamsWinners().get(1).getTeamName());
        Bronze= new Button(((CountryCompetition)competition).getTeamsWinners().get(2).getTeamName());
        Gold.setFont(new Font("David", 15));
        Silver.setFont(new Font("David", 15));
        Bronze.setFont(new Font("David", 15));
     
        GoldView.setFitHeight(100);
        GoldView.setFitWidth(100);
        SilverView.setFitHeight(100);
        SilverView.setFitWidth(100);
        BronzeView.setFitHeight(100);;
        BronzeView.setFitWidth(100);
        Gold.setGraphic(GoldView);
        Silver.setGraphic(SilverView);
        Bronze.setGraphic(BronzeView);

        vbox1.setAlignment(Pos.CENTER);
        vbox1.getChildren().addAll(label_1, Gold, Silver,Bronze,button12);
        window8 = new Scene(vbox1, 700, 600); // w x h
        primaryStage.setScene(window8);


    }
    public void getWinnersInTeamCompetition(Tournament competition,Stage primaryStage){
       Label label_2 = new Label("Winners in the Personal Competition:");
       label_2.setTextFill(Color.DARKBLUE);
       label_2.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
       VBox vbox2 = new VBox(15);
       
       controller.Olympic.getWinnersInSpecificCompetition(competition);
       button16 = new Button("Back");
       button16.setOnAction(e -> primaryStage.setScene(window3));
       Gold = new Button(((TeamCompetition)competition).getWinners().get(0).getName());
       Silver= new Button(((TeamCompetition)competition).getWinners().get(1).getName());
       Bronze= new Button(((TeamCompetition)competition).getWinners().get(2).getName());
       Gold.setFont(new Font("David", 15));
       Silver.setFont(new Font("David", 15));
       Bronze.setFont(new Font("David", 15));
    
       GoldView.setFitHeight(100);
       GoldView.setFitWidth(100);
       SilverView.setFitHeight(100);
       SilverView.setFitWidth(100);
       BronzeView.setFitHeight(100);;
       BronzeView.setFitWidth(100);
       Gold.setGraphic(GoldView);
       Silver.setGraphic(SilverView);
       Bronze.setGraphic(BronzeView);

       vbox2.setAlignment(Pos.CENTER);
       vbox2.getChildren().addAll(label_2, Gold, Silver,Bronze,button16);

       window5 = new Scene(vbox2, 700, 600); // w x h
       primaryStage.setScene(window5);

   }
    
    
    public void getWinners(Stage primaryStage) {
        Label label_0 = new Label("Countries with The\n      Most Medals");
        label_0.setTextFill(Color.DARKBLUE);
        label_0.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
     

        GridPane g_pane = new GridPane();
        Label label_3 = new Label();
        Label label_4 = new Label();
        Label label_5 = new Label();
        controller.Olympic.getWinnersInOlympicsByCountriesCompetitions();
        
        label_3.setText(controller.Olympic.getCountries().get(0).getCountryName());
        label_4.setText(controller.Olympic.getCountries().get(1).getCountryName());
        label_5.setText(controller.Olympic.getCountries().get(2).getCountryName());
        label_3.setTextFill(Color.BLACK);
        label_4.setTextFill(Color.BLACK);
        label_5.setTextFill(Color.BLACK);
        label_3.setFont(Font.font("Calibri", FontWeight.BOLD, 30));
        label_4.setFont(Font.font("Calibri", FontWeight.BOLD, 30));
        label_5.setFont(Font.font("Calibri", FontWeight.BOLD, 30));
        
        
        
        button13 = new Button("Back");
        button14 = new Button("Exit");
        button13.setOnAction(e -> primaryStage.setScene(window2));
        button14.setOnAction(e -> primaryStage.close());
        Gold = new Button(controller.Olympic.getCountries().get(0).getCountryName());
        Silver= new Button(controller.Olympic.getCountries().get(1).getCountryName() );
        Bronze= new Button( controller.Olympic.getCountries().get(2).getCountryName());
        Gold.setFont(new Font("David", 20));
        Silver.setFont(new Font("David", 20));
        Bronze.setFont(new Font("David", 20));
        Gold.setTextFill(Color.GOLD);
        Silver.setTextFill(Color.SILVER);
        Bronze.setTextFill(Color.BROWN);
        
        
        GoldView.setFitHeight(100);
        GoldView.setFitWidth(100);
        SilverView.setFitHeight(100);
        SilverView.setFitWidth(100);
        BronzeView.setFitHeight(100);;
        BronzeView.setFitWidth(100);
        
        Gold.setGraphic(GoldView);
        Silver.setGraphic(SilverView);
        Bronze.setGraphic(BronzeView);
        
        g_pane.add(label_0,13,0);
        g_pane.setHgap(1);
        g_pane.setVgap(20);
        g_pane.add(Gold, 13, 5);
        g_pane.add(Silver, 12, 6);
        g_pane.add(Bronze, 14, 6);
        g_pane.add(button13, 2,10);
        g_pane.add(button14, 15,10);
        
        
        
        
        window6 = new Scene(g_pane, 700, 600);
        primaryStage.setScene(window6);

    }

    
    private void getTypeOfCompetition(Tournament competition, Stage primaryStage) {
        if (competition instanceof TeamCompetition)
            primaryStage.setScene(window7);
        else {
            primaryStage.setScene(window4);
        }


    }
    
    private void getWinnersInCompetition(Tournament competition, Stage primaryStage) {
        if (competition instanceof TeamCompetition)
            getWinnersInTeamCompetition(competition,primaryStage);
        else {
            getWinnersInCountriesCompetition(competition,primaryStage);
        }
    }
    
    private void CloseProgram() throws Exception {
        

        int answer = JOptionPane.showConfirmDialog(null, "Exit", "Exit? ", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_OPTION) {

            System.out.print("Bye!!!");
            MainWindow.close();

        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
