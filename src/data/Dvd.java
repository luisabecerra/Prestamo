/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public class Dvd extends Soporte{
    private int duracion;
    private Autor[] actores;
  

    public Dvd(int duracion, Autor autor, Autor[] actores,String titulo) {
        super(titulo);
        super.setAutor(autor);
        this.duracion= duracion;
        this.actores=actores;
        
    }
    @Override
    public String toString() {
        return "Dvd{" + super.toString() + "actores=" + actores[0] + actores [1] + "duracion=" + duracion + '}';
    }
    
    
}