/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataforma;

/**
 *
 * @author ESTACION
 */
public class Instagram implements PlataformaPublicacion{

    @Override
    public void publicar(String contenidoFormato) {
        System.out.println("Desde Instagram ->" + contenidoFormato);
    }
    
}
