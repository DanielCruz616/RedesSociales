/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenido;
import plataforma.PlataformaPublicacion;


public abstract class Contenido {
  
    protected PlataformaPublicacion plataforma;
    
    public Contenido(PlataformaPublicacion plataforma) {
        this.plataforma = plataforma;
    }
    
    public void publicar() {
        plataforma.publicar(crearMensaje());
    }

    protected abstract String crearMensaje();
}
