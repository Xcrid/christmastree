/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorsapin;

/**
 *
 * @author MediaMonster
 */
public class ArtificialTree implements ChrismasTree {
     
   private  String  description;
   private  double price;
 
    
    @Override
    public String getDescription() {
        return "Artificial tree";
    }

    @Override
    public double getPrice() {
        return 100.20;
    }
    
    
}
