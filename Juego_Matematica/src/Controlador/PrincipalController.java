/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class PrincipalController implements Initializable {
    //Backgroung fondo=new Background();
    
    @FXML
    private Label lblNombre;
    
    @FXML
    private Button btnJugar;

    @FXML
    private Button btnInstrucciones;

    @FXML
    private Button btnSalir;
    
    @FXML
    private Button btnEjemplo;

    @FXML
    void abrirGame(ActionEvent event) {
        try{
            Stage stage = (Stage) btnJugar.getScene().getWindow(); 
            //stage.close();
            //                     ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            //Léeme el source del archivo que te digo fxml y te pongo el path
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Game.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
 
            //Creame un nuevo Stage o para que nos entendamos una nueva ventana windows vacía
            //Stage stage= new Stage();
 
            //Y ahora dentro del Stage me metes la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root1));
 
            // Y ahora le digo que me muestres el stage
            stage.show();
 
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
        
        /*Parent g=new FXMLLoader.loader(getClass().getResource("/Vista/Game.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(g);
        stage.setScene(scene);
        stage.show();*/
    }

    @FXML
    void abrirInstrucciones(ActionEvent event) {
        try{
            //Dirigete al stage actual y toma la escena actual (valga la redundancia)
            Stage stage = (Stage) btnInstrucciones.getScene().getWindow(); 
            //Cierra el stage actual
            stage.close();
            //Léeme el source del archivo que te digo fxml y te pongo el path
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Instrucciones.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
 
            //Y ahora dentro del Stage cambias a la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root1));
 
            // Y ahora le digo que me muestres el stage
            stage.show();
 
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }

    @FXML
    void procesoSalir(ActionEvent event) {
        System.exit(0);
    }

    /*@FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    @FXML
    void abrirEjemplo(ActionEvent event) {
        try{
            //Dirigete al stage actual y toma la escena actual (valga la redundancia)
            Stage stage = (Stage) btnEjemplo.getScene().getWindow(); 
            //Cierra el stage actual
            stage.close();
            //Léeme el source del archivo que te digo fxml y te pongo el path
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Ejemplo.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
 
            //Y ahora dentro del Stage cambias a la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root1));
 
            // Y ahora le digo que me muestres el stage
            stage.show();
 
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //principalTodo;
        /*URL linkImagen = getClass().getResource("/Imagenes/fondo1");
        Image img=new Image(linkImagen.toString());
        principalTodo.setBackground(img);*/
        //principalTodo.set
        //lblNombre.setFont(Font.loadFont("/Tipografias/CabinSketch-Regular.ttf", 60));
        Font.loadFont(getClass().getResourceAsStream("/Tipografias/CabinSketch-Regular.ttf"),70);
    }    
    
}
