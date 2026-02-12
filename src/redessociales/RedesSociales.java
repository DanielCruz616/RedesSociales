/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redessociales;
import plataforma.*;
import contenido.*;

/**
 *
 * @author ESTACION
 */
public class RedesSociales {

    public static void main(String[] args) {
        PlataformaPublicacion instagram = new Instagram();
        PlataformaPublicacion tiktok = new Tiktok();

        Contenido fotoInstagram = new Foto(instagram);
        fotoInstagram.publicar();
        
        Contenido fotoTiktok = new Foto(tiktok);
        fotoTiktok.publicar();
        
        Contenido historiaInstagram = new Historia(instagram);
        historiaInstagram.publicar();
        
        Contenido historiaTiktok = new Historia(tiktok);
        historiaTiktok.publicar();        
    
    }
    
}
