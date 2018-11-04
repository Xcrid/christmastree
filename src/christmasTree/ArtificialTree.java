/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasTree;

/**
 *
 * @author MediaMonster
 */
public class ArtificialTree extends ChrismasTree {
     
    private  String  plasticType;
    
    //constructs
    public ArtificialTree() {
        setDescription("Artificial Tree");
        setPrice(100.99);
    }
    
    public ArtificialTree( String description,  double price,  String plasticType, String color){
        setDescription(description);
        setPrice(price);
        setColor(color);
        this.plasticType=plasticType;  
    }

    //Getters and Setters
    public String getPlasticType() {
        return plasticType;
    }

    public void setPlasticType(String plasticType) {
        this.plasticType = plasticType;
    }
    
    
 

    @Override
    public String toString() {
        super.toString();
        return " ArtificialTree{" + "plasticType=" + plasticType + '}';
    }
    
   
    
    
}
