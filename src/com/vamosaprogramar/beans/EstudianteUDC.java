/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vamosaprogramar.beans;

/**
 *
 * @author naren
 */
public class EstudianteUDC {
    
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String institucion;
    private String departamento;
    private String correo;
    private String pruebaLecturaCritica;
    private String pruebaMatematica;
    private String total;

    public EstudianteUDC() {
    }

    public EstudianteUDC(String nombre, String apellidos, String identificacion, String institucion, String departamento, String correo, String pruebaLecturaCritica, String pruebaMatematica, String total) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.institucion = institucion;
        this.departamento = departamento;
        this.correo = correo;
        this.pruebaLecturaCritica = pruebaLecturaCritica;
        this.pruebaMatematica = pruebaMatematica;
        this.total = total;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPruebaLecturaCritica() {
        return pruebaLecturaCritica;
    }

    public void setPruebaLecturaCritica(String pruebaLecturaCritica) {
        this.pruebaLecturaCritica = pruebaLecturaCritica;
    }

    public String getPruebaMatematica() {
        return pruebaMatematica;
    }

    public void setPruebaMatematica(String pruebaMatematica) {
        this.pruebaMatematica = pruebaMatematica;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "EstudianteUDC{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", identificacion=" + identificacion + ", institucion=" + institucion + ", departamento=" + departamento + ", correo=" + correo + ", pruebaLecturaCritica=" + pruebaLecturaCritica + ", pruebaMatematica=" + pruebaMatematica + ", total=" + total + '}';
    }

    
    
}
