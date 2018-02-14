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
    
    
    //Variables de Nivel de Desempeño
    private String nivelL;
    private String nivelM;
    private String descNivelL;
    private String descNivelM;

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
        this.nivelL ="";
        this.nivelM="";
        this.descNivelL="";
        this.descNivelM="";  
        
        double lectura = Double.parseDouble(pruebaLecturaCritica);
        double matematicas = Double.parseDouble(pruebaMatematica);
    
          double TOTAL = (lectura+matematicas)/2;
       
          this.total = String.valueOf(TOTAL);
    
           //Nivel de desempeño Lectura Critica
       
    if(lectura>0 && lectura <=35){
        this.nivelL ="Nivel 1";
        this.descNivelL = "El estudiante que se ubica en este nivel probablemente identifica elementos literales en\n" +
"textos continuos y discontinuos sin establecer relaciones de significado. ";
    
    }else if(lectura>35 && lectura <=50){
    this.nivelL ="Nivel 2";
    this.descNivelL= "•	Identifica información local del texto.\n" +
"•	Identifica la estructura de textos continuos y discontinuos.\n" +
"•	Identifica relaciones básicas entre componentes del texto.\n" +
"•	Identifica fenómenos semánticos básicos: sinónimos y antónimos.\n" +
"•	Reconoce en un texto la diferencia entre proposición y párrafo.\n" +
"•	Reconoce el sentido local y global del texto.\n" +
"•	Identifica intenciones comunicativas explícitas.\n" +
"•	Identifica relaciones básicas: contraste, similitud y complementación, entre textos\n" +
"presentes.";
     
    }else if(lectura>50 && lectura <=65){
    this.nivelL = "Nivel 3";
    this.descNivelL = "• Jerarquiza la información presente en un texto.\n" +
"•	Infiere información implícita en textos continuos y discontinuos.\n" +
"•	Establece relaciones intertextuales: definición, causa-efecto, oposición y antecedenteconsecuente,\n" +
"entre textos presentes.\n" +
"•	Reconoce la intención comunicativa del texto.\n" +
"•	Relaciona marcadores textuales en la interpretación de textos.\n" +
"•	Reconoce la función de figuras literarias.\n" +
"•	Identifica el uso del lenguaje en contexto.\n" +
"•	Analiza y sintetiza la información contenida en un texto.\n" +
"•	Identifica la estructura sintáctica en textos discontinuos.\n" +
"•	Establece la validez de argumentos en un texto.";

    }else if(lectura>65 && lectura <=100){
        this.nivelL = "Nivel 4";
        this.descNivelL = "• Propone soluciones a problemas de interpretación que subyacen en un texto.\n" +
"• Evalúa contenidos, estrategias discursivas y argumentativas presentes en un texto.\n" +
"• Relaciona información de dos o más textos o fragmentos de texto para llegar a una\n" +
"conclusión.\n" +
"• Aplica conceptos de análisis literario para caracterizar diferentes elementos en un texto.\n" +
"• Reconoce los contextos como elementos importantes en la valoración de un texto.\n" +
"• Selecciona elementos locales y construye argumentos que sustentan una tesis con base\n" +
"en textos relacionados.\n" +
"• Asume una postura crítica frente a los planteamientos de un texto.\n" +
"• Plantea hipótesis de lectura a partir de las ideas presentes en un texto.";
    
    }
    
       
    //Nivel de Desempeño Matematicas 
    
    if(matematicas>0 && matematicas <=35){
        this.nivelM = "Nivel 1";
        this.descNivelM = "El estudiante que se ubica en este nivel probablemente puede leer información puntual\n" +
"(un dato, por ejemplo) relacionada con situaciones cotidianas y presentada en tablas o\n" +
"gráficas con escala explícita, cuadrícula o, por lo menos, líneas horizontales; pero puede\n" +
"tener dificultades al comparar distintos conjuntos de datos, involucrar diferentes variables o\n" +
"analizar situaciones alejadas de su vida diaria";
    }else if(matematicas>35 && matematicas <=50){
        this.nivelM = "Nivel 2";
        this.descNivelM = "	Compara datos de dos variables presentadas en una misma gráfica sin necesidad de hacer\n" +
"operaciones aritméticas.\n" +
"•	Identifica valores o puntos representativos en diferentes tipos de registro a partir del\n" +
"significado que tienen en la situación.\n" +
"•	Compara la probabilidad de eventos simples (casos favorables/casos posibles), cuando\n" +
"los casos posibles son los mismos en ambos eventos y en contextos similares a los\n" +
"presentados en el aula.\n" +
"•	Toma decisiones sobre la veracidad o falsedad de una afirmación cuando esta se puede\n" +
"explicar verbalizando la lectura directa que se hace de la información.\n" +
"•	Cambia gráficas de barras a tablas de doble entrada.\n" +
"•	Reconoce e interpreta según el contexto el significado de promedio simple, moda, mayor,\n" +
"menor, máximo y mínimo.";
    }else if(matematicas>50 && matematicas <=70){
        this.nivelM = "Nivel 3";
        this.descNivelM = "• Selecciona la gráfica (que puede ser de doble entrada) correspondiente a la\n" +
"información de una tabla, o a partir de verbalizaciones (características de crecimiento\n" +
"o decrecimiento deseadas), teniendo en cuenta para la selección la escala, el tipo de\n" +
"variable y el tipo de gráfica.\n" +
"•	Compara información gráfica que requiere algunas manipulaciones aritméticas.\n" +
"•	Señala información representada en formatos no convencionales (mapas o infografías).\n" +
"•	Reconoce errores ocurridos al realizar una trasformación entre diferentes tipos de registro.\n" +
"•	Reconoce desarrollos planos de una forma tridimensional y viceversa.\n" +
"•	Compara la probabilidad de eventos simples en diversos contextos (casos favorables/casos\n" +
"posibles), incluso cuando los casos posibles de cada evento son diferentes.\n" +
"•	Selecciona información necesaria para resolver problemas que involucran operaciones\n" +
"aritméticas.\n" +
"•	Selecciona información necesaria para resolver problemas que involucran características\n" +
"medibles de figuras geométricas elementales (triángulos, cuadriláteros y circunferencias).\n" +
"•	Cambia la escala cuando la trasformación no es convencional.\n" +
"•	Justifica afirmaciones utilizando planteamientos y operaciones aritméticas o haciendo uso\n" +
"directo de un concepto, es decir, a partir de un único argumento.\n" +
"•	Identifica información relevante cuando el tipo de registro contiene información de más de\n" +
"tres categorías.\n" +
"•	Hace manipulaciones algebraicas sencillas (aritmética de términos semejantes)";
    }else if(matematicas>70 && matematicas <=100){
        this.nivelM = "Nivel 4";
        this.descNivelM = "• Resuelve problemas que requieren interpretar información de eventos dependientes.\n" +
"•	Realiza transformaciones de subconjuntos de información que pueden requerir el uso de\n" +
"operaciones complejas (cálculos de porcentajes).\n" +
"•	Resuelve problemas que requieren construir una representación auxiliar (gráficas y\n" +
"fórmulas) como paso intermedio para su solución.\n" +
"•	Modela usando lenguaje algebraico información dada en lenguaje natural, tablas o\n" +
"representaciones geométricas.\n" +
"•	Manipula expresiones algebraicas o aritméticas haciendo uso de las propiedades de las\n" +
"operaciones.\n" +
"•	Modela fenómenos variacionales no explícitos haciendo uso de lenguaje simbólico o\n" +
"gráficas.\n" +
"• Reconoce en diferentes formatos el espacio muestral de un experimento aleatorio.\n" +
"• Resuelve problemas de conteo que requieren el uso de permutaciones.\n" +
"• Justifica si hay falta de información en una situación problema para tomar una decisión.\n" +
"• Toma decisiones sobre la veracidad o falsedad de una afirmación cuando requiere el uso\n" +
"de varias propiedades o conceptualizaciones formales."; 
    }
          
          
          
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
