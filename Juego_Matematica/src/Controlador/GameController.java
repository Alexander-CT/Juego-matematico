/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Escencial.Azar;
import Escencial.Logica;
//import Tipografias.Fuentes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class GameController implements Initializable {
    Azar a = new Azar();
    Logica L= new Logica();
    /*URL linkImagen = getClass().getResource(L.getSilueta());
    Image img=new Image(linkImagen.toString());*/
    
    //ImageView visor = new ImageView(L.getSilueta());
    //StackPane root = new StackPane();
    
    @FXML
    private AnchorPane todo;
    
    @FXML
    private ImageView visor;
    
    @FXML
    private Label lblPuntaje;
    
    @FXML
    private Button btnVolver;

    @FXML
    private Label lblImagen;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;
    
    @FXML 
    void btnVolverAccion(ActionEvent event) {
        try{
            //Dirigete al stage actual y toma la escena actual (valga la redundancia)
            Stage stage = (Stage) btnVolver.getScene().getWindow(); 
            //Cierra el stage actual
            stage.close();
            //Léeme el source del archivo que te digo fxml y te pongo el path
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Principal.fxml"));
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
    void accionBtn1(ActionEvent event) {
        try{
            L.procesoBoton(btn1.getText());
            JOptionPane.showMessageDialog(null, L.getMsg(), L.getTitulo(), JOptionPane.INFORMATION_MESSAGE);
            URL linkImagen1 = getClass().getResource(L.getEjercicio());
            Image img1=new Image(linkImagen1.toString());
            visor.setImage(img1);
            lblPuntaje.setText("Puntaje: "+L.getPuntaje());
            //******
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Game.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
            todo.getChildren().setAll(root1);
            
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }

    @FXML
    void accionBtn2(ActionEvent event) {
        try{
            L.procesoBoton(btn2.getText());
            JOptionPane.showMessageDialog(null, L.getMsg(), L.getTitulo(), JOptionPane.INFORMATION_MESSAGE);
            URL linkImagen2 = getClass().getResource(L.getEjercicio());
            Image img2=new Image(linkImagen2.toString());
            visor.setImage(img2);
            lblPuntaje.setText("Puntaje: "+L.getPuntaje());
            //******
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Game.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
            todo.getChildren().setAll(root1);
            
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }

    @FXML
    void accionBtn3(ActionEvent event) {
        try{
            L.procesoBoton(btn3.getText());
            JOptionPane.showMessageDialog(null, L.getMsg(), L.getTitulo(), JOptionPane.INFORMATION_MESSAGE);
            URL linkImagen3 = getClass().getResource(L.getEjercicio());
            Image img3=new Image(linkImagen3.toString());
            visor.setImage(img3);
            lblPuntaje.setText("Puntaje: "+L.getPuntaje());
            //******
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Game.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
            todo.getChildren().setAll(root1);
            
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }

    }

    @FXML
    void accionBtn4(ActionEvent event) {
        try{
            L.procesoBoton(btn4.getText());
            JOptionPane.showMessageDialog(null, L.getMsg(), L.getTitulo(), JOptionPane.INFORMATION_MESSAGE);
            URL linkImagen4 = getClass().getResource(L.getEjercicio());
            Image img4=new Image(linkImagen4.toString());
            visor.setImage(img4);
            lblPuntaje.setText("Puntaje: "+L.getPuntaje());
            //******
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("/Vista/Game.fxml"));
            Parent root1= (Parent)fxmlLoader.load();
            todo.getChildren().setAll(root1);
            
        }catch(Exception ex){
            System.out.println("Ocurrió un error, lo sentimos");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        int sil=a.conseguirEjercicio();
        int resp=a.conseguirRespuesta();
        L.procesoImagen(sil, resp);
        URL linkImagen = getClass().getResource(L.getEjercicio());
        Image img=new Image(linkImagen.toString());
        visor.setImage(img);
        btn1.setText(L.getB1());
        btn2.setText(L.getB2());
        btn3.setText(L.getB3());
        btn4.setText(L.getB4());
        lblPuntaje.setText("Puntaje: 0");
    }
}
