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
public class Foto extends Contenido {

    public Foto(PlataformaPublicacion plataforma){
        super(plataforma);
    }
    @Override
    protected String crearMensaje() {
        return ".\n" +
"              /=\\\\\n" +
"             /===\\ \\\n" +
"            /=====\\' \\\n" +
"           /=======\\'' \\\n" +
"          /=========\\ ' '\\\n" +
"         /===========\\'' \\\n" +
"        /=============\\ ' ' \\\n" +
"       /===============\\ '' \\\n" +
"      /=================\\' ' ' ' \\\n" +
"     /====================\\' ' ' ' \\\n" +
"    /======================\\' ' ' ' \\\n" +
"   /=======================\\ ' ' /\n" +
"  /=========================\\ ' /\n" +
" /===========================\\' /\n" +
"/=============================\\/";
    }
    
}
