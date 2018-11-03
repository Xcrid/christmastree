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
    private  boolean hasRoot;
    
    //constructs
    public ArtificialTree() {
        setDescription("Artificial Tree");
        setPrice(100.99);
    }
    
    public ArtificialTree( String description,  double price,  String plasticType,  boolean hasRoot){
        setDescription(description);
        setPrice(price);
        this.plasticType=plasticType;
        this.hasRoot=hasRoot;
        
    }
    
    
    //getters
    public String getPlasticType() {
        return plasticType;
    }

    public boolean isHasRoot() {
        return hasRoot;
    }
 
    //setters

    public void setPlasticType(String plasticType) {
        this.plasticType = plasticType;
    }

    public void setHasRoot(boolean hasRoot) {
        this.hasRoot = hasRoot;
    }
    
   
    
    
}
