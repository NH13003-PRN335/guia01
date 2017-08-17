/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieriaprn335_2017.guia;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      utilities nombre=new utilities();

          String texto = "los procesadores de computadoras an evolucionado la informatica actual ya que realizan"
                  + " miles de millones de calculos por segundo tanto asi que una persona tardaria toda una vida y no temrinaria  de completar dicho calculo";
 String[]palabras=texto.split("\\s+");
    StringBuilder textoFormateado=new StringBuilder();
    
        for (String palabra:palabras) {
            textoFormateado.append(palabra.substring(0,1)
                    .toUpperCase().concat(palabra.substring
                    (1, palabra.length()).toLowerCase()).concat(" "));}
        
         System.out.println(nombre.getResume(texto.replace(" ","")));
         
        System.out.println(textoFormateado);
        
    }
    
    
    
  
    }
    

