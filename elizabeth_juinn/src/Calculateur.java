
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculateur extends Application {

	@Override
	public void start(Stage primaryStage) 
	{
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		TextField txt=new TextField();
		txt.setLayoutX(20);
		txt.setLayoutY(20);
		
		txt.setOnAction((event)->
		{
			System.out.println("Texte = " + txt.getText());
		}
			);
		
		TextField txt2=new TextField();
		txt2.setLayoutX(20);
		txt2.setLayoutY(60);
		
		txt2.setOnAction((event)->
		{
			System.out.println("Texte = " + txt2.getText());
		}
			);
		
		Label lbl=new Label();
		lbl.setLayoutX(20);
		lbl.setLayoutY(100);
		
		group.getChildren().add(txt);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
