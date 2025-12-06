/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lect6.act.pkg1.shazgg;


public abstract class shape {
    
    private double y;
    private double x;
     
    
    public double gety(){
        return y;
    }
    public void sety(){
        this.y=y;
    }
    public void setx(double x){
        this.x=x;
    } 
    public double getx(){
        return x;
    }
    public abstract void area();
        
    
    public abstract void parameter();
        
    public abstract void resize();
    public abstract void display();
    
    
    
    
    
    
    
    
    
}
