/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenido;
import plataforma.PlataformaPublicacion;
/**
 *
 * @author ESTACION
 */
public class Historia extends Contenido {

    public Historia(PlataformaPublicacion plataforma){
        super(plataforma);
    }
    @Override
    protected String crearMensaje() {
        return("El dia de hoy traemos una promocion en nuestras historias \n"
                + "Esta historia desaparecera en 24 horas al igual que nuestra promo \n"
                + "Aprovecha ahora");
    }
    
}
