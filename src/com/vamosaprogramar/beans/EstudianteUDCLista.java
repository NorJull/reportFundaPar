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
    
    public static List<EstudianteUDC> getEstuciantesUDC(String ruta) throws IOException{
        
       List<String> rows = getRows(ruta);
       List<EstudianteUDC> estudiantes = new ArrayList<>();
     
        for(String row : rows){
    
        String[] fields = row.split(SEPARATOR);
    
        EstudianteUDC estudianteUDC = new EstudianteUDC(fields[0], fields[1], fields[2], fields[3],fields[4], fields[5], fields[6], fields[7], fields[8]);
        estudiantes.add(estudianteUDC);
        }
   
    return estudiantes;
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
