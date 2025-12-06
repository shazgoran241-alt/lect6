/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lect6.act.pkg1.shazgg;

/**
 *
 * @author MSI
 */
public class rectangle extends shape {
    private double w;
    private double H;
    double area;
    double parameter;
    
    
   public void setw(double w){
       this.w=w;
   }
            public void setH(double H){
                this.H=H;
            }
            public double getw(){
                return w;
            }
            public double getH(){
                return H;
            }
 
            public void area(){
                area=w*H;
                System.out.println(area);
            }
                   public void parameter(){
                       parameter=2*(H+w);
                       System.out.println("parameter rectangle"+parameter);
                   }
            
            
            public void draw(){
                System.out.println("draw rectangle");
            }

    @Override
    public void resize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
            
            
            
            
            
            
            
            
            
    
    
    
    
}
