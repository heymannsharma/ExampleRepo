/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisexamplerepo;

/**
 *
 * @author heymannsharma
 */
public class ThisIsExampleRepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
       {
        Beads b1=new Beads();
        b1.setColor("White");
        //System.out.println(b1.getColor());
      
          Beads b2=new Beads("black");
        System.out.println(b1.getColor()+ " "+b2.getColor());
          //this is an example code
    
    }
    
}
