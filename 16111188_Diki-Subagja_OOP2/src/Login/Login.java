/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author diksub(Diki Subagja/16111188/TIF RM Multimedi/STTBandung
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //inisiasi button
        Button btnLogin = new Button();
        btnLogin.setText("Login");
        Button btnBack = new Button();
        Button btnView = new Button();
        
        //inisiasi label
        Label lblNama = new Label();
        Label lblNpm = new Label();
        Label lblKelas = new Label();
        
        //inisiasi Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Diki Subagja");
        mhs.setNpm("16111188");
        mhs.setKelas("TIF RM 16 B");
        
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(btnLogin);
        
        Scene scene1 = new Scene(layout1, 300, 250);
        
        //add event listener for btnLogin        
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {               
                btnView.setText("View");
                btnBack.setText("Back");
                lblNama.setText("No Data");
                lblNpm.setText("No Data");
                lblKelas.setText("No Data");
                
                VBox layout2 = new VBox();
                layout2.getChildren().addAll(btnView, btnBack, lblNama,
                        lblNpm, lblKelas);
                
                Scene scene2 = new Scene(layout2, 300, 250);
                primaryStage.setScene(scene2);               
            }
        });
        
        //add event listener for btnBack
        btnBack.setOnAction(e -> {
            primaryStage.setScene(scene1);
        });
        
        //add event Listener for btnView
        btnView.setOnAction((ActionEvent e) -> {
            lblNama.setText(mhs.nama);
            lblNpm.setText(mhs.npm);
            lblKelas.setText(mhs.kelas);
        });
        
        //menampilkan stage dengan scene1
        primaryStage.setTitle("Aplikasi Diki");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
