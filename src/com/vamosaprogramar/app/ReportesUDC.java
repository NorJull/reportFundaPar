/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vamosaprogramar.app;

import com.vamosaprogramar.beans.Estudiante;
import com.vamosaprogramar.beans.EstudianteLista;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author naren
 */
public class ReportesUDC {

    /**
     * @param args the command line arguments
     */
    
    public static String rutaCSV="";
    public static String rutaGuardado="";
    
    @SuppressWarnings("unchecked") 
    public static void generarReportes() throws IOException{
     String sourceFileName = "C:\\Users\\naren\\OneDrive\\Documents\\NetBeansProjects\\reportes\\src\\com\\vamosaprogramar\\reportes\\UsuarioReporte.jasper";
      String printFileName = null;
          
      List<Estudiante> dataList = EstudianteLista.getEstudiantes(rutaCSV);
    
      ArrayList<Estudiante> auxiliar = new ArrayList<>();
      
      for(Estudiante dt : dataList){
      auxiliar.add(dt);
      
      JRBeanCollectionDataSource beanColDataSource = new 
         JRBeanCollectionDataSource(auxiliar);
        Map parameters = new HashMap();
      try {
    	   printFileName = JasperFillManager.fillReportToFile( 
            sourceFileName, parameters, beanColDataSource);
         if(printFileName != null){
          //  JasperPrintManager.printReport( printFileName, true);
            
             JasperExportManager.exportReportToPdfFile(printFileName,rutaGuardado+"\\simple"+auxiliar.get(0).getNombre()+".pdf");
            
         }
      } catch (JRException e) {
         e.printStackTrace();
      }
      auxiliar.clear();
      } 
      
      
    
    
    }
    

    
}
