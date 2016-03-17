//U10416040 ªL¦ö¼á

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;


public class BeamGame extends Application {
    
    @Override
    public void start(Stage primaryStage) {               
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
                                
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(new LinePane(), 600, 800);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class LinePane extends Pane{
        int pt[][]=new int[22][2];
        Line line1;
        
        public LinePane(){
            pt[0][0]=275;
            pt[0][1]=50;
        
            pt[1][0]=275;
            pt[1][1]=100;
            
            pt[2][0]=20;
            pt[2][1]=580;
            
            pt[3][0]=20;
            pt[3][1]=680;
            
            pt[4][0]=580;
            pt[4][1]=680;
            
            pt[5][0]=580;
            pt[5][1]=580;
            
            pt[6][0]=325;
            pt[6][1]=100;
            
            pt[7][0]=325;
            pt[7][1]=50;
            
            pt[8][0]=90;
            pt[8][1]=580;
            
            pt[9][0]=90;
            pt[9][1]=680;
            
            pt[10][0]=160;
            pt[10][1]=580;
            
            pt[11][0]=160;
            pt[11][1]=680;
            
            pt[12][0]=230;
            pt[12][1]=580;
            
            pt[13][0]=230;
            pt[13][1]=680;
            
            pt[14][0]=300;
            pt[14][1]=580;
            
            pt[15][0]=300;
            pt[15][1]=680;
            
            pt[16][0]=370;
            pt[16][1]=580;
            
            pt[17][0]=370;
            pt[17][1]=680;
            
            pt[18][0]=440;
            pt[18][1]=580;
            
            pt[19][0]=440;
            pt[19][1]=680;
            
            pt[20][0]=510;
            pt[20][1]=580;
            
            pt[21][0]=510;
            pt[21][1]=680;
            
            int i;
            for(i=0;i<21;i++){
                if((i>=7) && (i%2==1)){
                    continue;
                }
                
                line1=new Line(pt[i][0], pt[i][1], pt[i+1][0], pt[i+1][1]);
                line1.setStrokeWidth(5);
                line1.setStroke(Color.GREEN);
                getChildren().add(line1);
            }
            
            
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
