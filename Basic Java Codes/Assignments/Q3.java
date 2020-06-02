import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
public class Q3 extends Application {
@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("Tax Calculator");
GridPane pane = new GridPane();
pane.setAlignment(Pos.CENTER);
pane.setHgap(10);
pane.setVgap(10);
pane.getBackground();
pane.setPadding(new Insets(25, 25, 25, 25)); 
Scene scene = new Scene(pane, 350, 300);
Label gstpercent = new Label("GST Rate");
pane.add(gstpercent,0,1);
final TextField gstpercentField = new TextField();
gstpercentField.backgroundProperty();
pane.add(gstpercentField, 1, 1);
Label gstpercent1 = new Label("%");
pane.add(gstpercent1,2,1);
Label qstpercent = new Label("QST Rate");
pane.add(qstpercent,0,2);
final TextField qstpercentField = new TextField();
pane.add(qstpercentField, 1, 2);
Label qstpercent1 = new Label("%");
pane.add(qstpercent1,2,2);
Label cost = new Label("Cost");
pane.add(cost, 0, 3);
final TextField costField = new TextField();
pane.add(costField, 1, 3);
Label percent = new Label("GST");
pane.add(percent,0,4);
final TextField percentField = new TextField();
percentField.setStyle("-fx-background-color:DarkGray"); 
pane.add(percentField, 1, 4);
Label percent1 = new Label("QST");
pane.add(percent1,0,5);
final TextField percentField1 = new TextField();
percentField1.setStyle("-fx-background-color:DarkGray"); 
pane.add(percentField1, 1, 5);
Label total = new Label("Total");
pane.add(total, 0, 6);
final TextField totalField = new TextField();
totalField.setStyle("-fx-background-color:DarkGray"); 
pane.add(totalField, 1, 6);
Button calculateButton = new Button("Calculate Tax"); 
HBox hbox = new HBox(15);
hbox.setAlignment(Pos.BOTTOM_LEFT);
hbox.getChildren().add(calculateButton);
pane.add(hbox, 0, 8);
final Text gstaxMessage = new Text();
pane.add(gstaxMessage, 1, 4);
final Text qstaxMessage = new Text();
pane.add(qstaxMessage, 1, 5);
final Text taxMessage = new Text();
pane.add(taxMessage, 1, 6);
calculateButton.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent t) {
Double gstax = Double.parseDouble(gstpercentField.getText())/100;
Double qstax = Double.parseDouble(qstpercentField.getText())/100;
Double income = Double.parseDouble(costField.getText());
Double gst = gstax*income;
Double qst = qstax*(income+gst);
gstaxMessage.setText(" "+gst);
qstaxMessage.setText(" "+qst);
taxMessage.setText(" "+(income+qst+gst));
}}); 
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args); 
} }