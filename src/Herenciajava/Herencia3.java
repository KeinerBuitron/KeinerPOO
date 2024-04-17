
package Herenciajava;

public class Herencia3 {

    public static void main(String[] args) {
        //Crear objeto clase Padre
        Humano adulto = new Humano();
        adulto.setNombre("Keiner");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        System.out.println();
        
        //Crear objeto clase Hija -> hombre
        Hombre padre = new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        
        System.out.println("");
        
        //Crear objeto clase hija -> mujer
        Mujer madre = new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
           
    }
    
}
