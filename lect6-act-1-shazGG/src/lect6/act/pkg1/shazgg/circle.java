/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lect6.act.pkg1.shazgg;

/**
 *
 * @author MSI
 */
public class circle extends shape {
    private double rad;
     double area;
     double parameter;
     
     public double getrad(){
         return rad;
     }
    public void setrad(double rad){
        this.rad=super.getx();
    }
    
    public void parameter(){
        parameter=2*Math.PI*super.getx();
    }
    public void draw(){
        System.out.println("draw ");
    }
    public void area(){
        area=Math.PI*super.getx()*super.getx();
    }
    
    
    public void resize(){
        
    }
        public void display(){
            System.out.println(area);
            System.out.println(parameter);
        }   
    
}
