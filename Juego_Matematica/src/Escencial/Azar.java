package Escencial;

//import java.util.ArrayList;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Azar {
    private final int cantImg=6, cantBtn=4;
    /*String[] animales = {"Oso","Zorro","Rinoceronte"};
    String[] objetos = {"TV","Sofá","PC"};
    
    public int ConseguirOrdenBtn() {
    	switch(cantImg=2){
            opciones[0]="d";
        }
        return 0;
    }*/
    
    public int conseguirEjercicio() {
    	return (int) (Math.random() * cantImg) + 1;
    }
    
    public int conseguirRespuesta() {
    	return (int) (Math.random() * cantBtn) + 1;
    }
}
