/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vamosaprogramar.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naren
 */
public class EstudianteUDCLista {
    public static final String SEPARATOR=";";
    
    public static List<EstudianteUDC> getEstuciantesUDC(String ruta){
        
        
        
        
        return null;
    }
    
    
    
    
    
      private static List<String>  getRows(String ruta) throws IOException{
         BufferedReader br = null;
      
      try {
         
         br =new BufferedReader(new FileReader(ruta));
         String line = br.readLine();//Obviamos los titulos
         line = br.readLine();
         
         List<String> rows = new ArrayList<>();
         
         while (null!=line) {
             rows.add(line);
            line = br.readLine();
         }
        return rows;
        
      } catch (Exception e) {
    
      } finally {
         if (null!=br) {
            br.close();
         }
      }
    
        
        return null;
    }
    
    
}
