package Modelo;

import java.util.LinkedList;
import javafx.scene.image.Image;

/**
 *
 * @author HOGAR
 */
public class AcImagenes {
    LinkedList <Image> listImage;
    int i ;
    
    public AcImagenes () {
        i = 0;
        listImage = new LinkedList<>();
        LlamarImages();
    }        
    
    public void LlamarImages(){
        listImage.add(new Image("/Images/ImaTomas1.jpg"));
        listImage.add(new Image("/Images/ImaBruno1.jpg"));
        listImage.add(new Image("/Images/ImaHaru1.jpg"));
        listImage.add(new Image("/Images/ImaTomas2.jpg"));
        listImage.add(new Image("/Images/ImaBruno2.jpg"));
        listImage.add(new Image("/Images/ImaHaru2.jpg"));
        listImage.add(new Image("/Images/ImaTomas3.jpg"));
        listImage.add(new Image("/Images/ImaHaru3.jpg"));
        listImage.add(new Image("/Images/ImaBruno3.jpg"));
    }
    
    public Image retImagen(){
        Image ima;
        
        if (listImage.size() <= i){
            i=0;
        }
        ima = listImage.get(i);
        i++;
        
        return ima;
    }
    
}
