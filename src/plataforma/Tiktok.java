/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plataforma;


public class Tiktok implements PlataformaPublicacion {

    @Override
    public void publicar(String contenidoFormato) {
        System.out.println("Desde Tiktok ->" + contenidoFormato);
    }
    
}
