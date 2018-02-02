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
public class Estudiante {
    
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String institucion;
    private String departamento;
    private String correo;
    private String pruebaLecturaCritica;
    private String pruebaMatematica;
    private String pruebaSociales;
    private String pruebaNaturales;
    private String pruebaIngles;
    private String total;
    
    //Variables de Nivel de Desempeño
    private String nivelL;
    private String nivelM;
    private String nivelS;
    private String nivelN;
    private String nivelI;
    private String descNivelL;
    private String descNivelM;
    private String descNivelS;
    private String descNivelN;
    private String descNivelI;
    
    
    public Estudiante(){
    }
    
    public Estudiante(String nombre, String apellidos, String identificacion, String institucion, String departamento, String correo, String pruebaLecturaCritica, String pruebaMatematica, String pruebaSociales, String pruebaNaturales, String pruebaIngles, String total) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.institucion = institucion;
        this.departamento = "-------";
        this.correo = correo;
        this.pruebaLecturaCritica = pruebaLecturaCritica;
        this.pruebaMatematica = pruebaMatematica;
        this.pruebaSociales = pruebaSociales;
        this.pruebaNaturales = pruebaNaturales;
        this.pruebaIngles = pruebaIngles;
        this.nivelI = "";
        this.nivelL ="";
        this.nivelM="";
        this.nivelN="";
        this.nivelS="";
        this.descNivelL="";
        
        double lectura = Double.parseDouble(pruebaLecturaCritica);
        double matematicas = Double.parseDouble(pruebaMatematica);
        double sociales = Double.parseDouble(pruebaSociales);
        double naturales = Double.parseDouble(pruebaNaturales);
        double ingles = Double.parseDouble(pruebaIngles);
        
        double TOTAL = (((lectura*3) + (matematicas*3) +(sociales*3) +(naturales*3)+(ingles))*5)/13;
       
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
    
    //Niveles de desempeño Sociales y Ciudadanas 
    
    if(sociales>0 && sociales<=40){
        this.nivelS = "Nivel 1";
        this.descNivelS = "El estudiante que se ubica en este nivel podría reconocer algunos derechos ciudadanos en\n" +
"situaciones sencillas. Adicionalmente, podría reconocer factores que generan un conflicto e\n" +
"identificar creencias que explican algunos comportamientos. Este estudiante probablemente\n" +
"no está en capacidad de utilizar conceptos de las ciencias sociales o modelos conceptuales,\n" +
"ni de reconocer principios constitucionales o de analizar enunciados.";
    
    }else if(sociales>40 && sociales<=55){
        this.nivelS = "Nivel 2";
        this.descNivelS ="•	Identifica derechos ciudadanos y deberes del Estado establecidos en la Constitución\n" +
"Política de Colombia.\n" +
"•	Relaciona la conducta de una persona con su forma de ver la vida.\n" +
"•	Reconoce los efectos de una solución y las dimensiones que privilegia.\n" +
"•	Identifica contextos o procesos en los que se inscribe una fuente o evento.";
    
    }else if(sociales>55 && sociales<=70){
        this.nivelS = "Nivel 3";
        this.descNivelS = "• Reconoce intenciones y prejuicios, así como argumentos similares o diferentes dados en\n" +
"un contexto o una situación específica.\n" +
"• Identifica dimensiones (económicas, políticas, culturales, ambientales, etc.) involucradas\n" +
"en situaciones, problemáticas o propuestas de solución.\n" +
"• Identifica y compara opiniones e intereses de diferentes actores involucrados en una\n" +
"situación problemática y establece relaciones entre esas posturas y posibles soluciones.\n" +
"• Reconoce algunos conceptos básicos de las ciencias sociales.\n" +
"• Identifica supuestos y usos de algunos modelos conceptuales.\n" +
"• Relaciona contextos históricos y/o geográficos con fuentes, situaciones y prácticas\n" +
"sociales.\n" +
"• Valora la información contenida en una fuente y reconoce sus alcances.";
    
    }else if(sociales>70 && sociales<=100){
        this.nivelS="Nivel 4";
        this.descNivelS= "• Conoce los procedimientos de reforma a la Constitución Política de Colombia, los\n" +
"mecanismos de participación ciudadana y las funciones de los organismos de control.\n" +
"• Compara enunciados o argumentos, así como intereses y posiciones de actores en\n" +
"contextos en los que se discuten situaciones problemáticas o sus alternativas de solución.\n" +
"• Relaciona propuestas de solución a un problema con su contexto de implementación,\n" +
"o con sus posibles impactos en ciertas dimensiones (económicas, políticas, culturales,\n" +
"ambientales, etc.).\n" +
"• Entiende problemáticas, eventos o procesossocialesa partir del uso de conceptos básicos\n" +
"de las ciencias sociales, o a partir de contextos históricos y/o geográficos.\n" +
"• Analiza fuentes (primarias y secundarias) para valorar inferencias o identificar intenciones,\n" +
"características de los actores involucrados y contextos en los que se ubican dichas fuentes.\n" +
"• Establece relaciones entre modelos conceptuales y fuentes que los abordan o decisiones\n" +
"sociales que los aplican.";
    
    }
    //Niveles desempeño Naturales
    if(naturales>0 && naturales<=40){
        this.nivelN="Nivel 1";
        this.descNivelN="El estudiante que se ubica en este nivel muy posiblemente alcanza a reconocer información\n" +
"explícita, presentada de manera ordenada en tablas o gráficas, con un lenguaje cotidiano y\n" +
"que implica la lectura de una sola variable independiente. Por lo tanto, estos estudiantes\n" +
"demuestran un insuficiente desarrollo de la competencia Indagación definida en el marco\n" +
"teórico de la prueba. ";
    
    }else if(naturales>40 && naturales<=55){
        this.nivelN="Nivel 2";
        this.descNivelN="•	Identifica patronesy característicasa partir de información presentada en textos, gráficasytablas.\n" +
"•	Relaciona esquemas con nociones básicas del conocimiento científico.\n" +
"•	Establece predicciones a partir de datos presentados en tablas, gráficas y esquemas en\n" +
"donde se presentan patrones claramente crecientes o decrecientes.\n" +
"•	Ordena datos e información en gráficas y tablas.";
    
    }else if(naturales>55 && naturales<=70){
        this.nivelN = "Nivel 3";
        this.descNivelN="• Establece relaciones de causa-efecto usando información no suministrada.\n" +
"•	Interpreta gráficas, tablas y modelos para hacer predicciones.\n" +
"•	Establece relaciones entre conceptos, leyesyteorías científicas con diseños experimentales\n" +
"y sus resultados.\n" +
"•	Diferencia entre evidencias y conclusiones.\n" +
"•	Plantea hipótesis basadas en evidencias.\n" +
"•	Relaciona variables para explicar algunos fenómenos naturales";
    
    
    
    }else if(naturales>70 && naturales<=100){
    this.nivelN = "Nivel 4";
    this.descNivelN = "• Plantea preguntas de investigación desde las ciencias naturales a partir de un contexto\n" +
"determinado.\n" +
"•	Establece conclusiones derivadas de una investigación.\n" +
"•	Contrasta modelos de las ciencias naturales con fenómenos cotidianos.\n" +
"•	Resuelve situaciones problema haciendo uso de conceptos, leyes y teorías de las ciencias\n" +
"naturales.\n" +
"•	Comunica resultados de procesos de investigación científica.\n" +
"•	Analizafenómenos naturales con base en los procedimientos propios de lainvestigación científica.";
    }
    
//Nivel de Desempeño Ingles
    if(ingles>0 && ingles <=47){
        this.nivelI = "A-";
        this.descNivelI = "• El estudiante promedio clasificado en este nivel no supera las preguntas de menor\n" +
"complejidad de la prueba. ";
    
    }else if(ingles>47 && ingles <=57){
        this.nivelI = "A1";
        this.descNivelI ="•	 El estudiante es capaz de comprender y utilizar expresiones cotidianas de uso muy\n" +
"frecuente, así como frases sencillas destinadas a satisfacer necesidades inmediatas.\n" +
"• Puede presentarse a sí mismo y a otros, pedir y dar información personal básica sobre\n" +
"su domicilio, sus pertenencias y las personas que conoce.\n" +
"• Puede relacionarse de forma elemental con su interlocutor siempre que este hable\n" +
"despacio y con claridad y esté dispuesto a cooperar. ";
    
    }else if(ingles>57 && ingles <=67){
        this.nivelI = "A2";
        this.descNivelI = "•	 El estudiante es capaz de comprender frases y expresiones de uso frecuente relacionadas\n" +
"con áreas de experiencia que le son especialmente relevantes (información básica sobre sí\n" +
"mismo y su familia, compras, lugares de interés, ocupaciones, etc.).\n" +
"• Sabe comunicarse a la hora de llevar a cabo tareas simples y cotidianas que no\n" +
"requieran más que intercambios sencillos y directos de información sobre cuestiones\n" +
"que le son conocidas o habituales.\n" +
"• Sabe describir en términos sencillos aspectos de su pasado y su entorno, así como\n" +
"cuestiones relacionadas con sus necesidades inmediatas. ";
    }else if(ingles>67 && ingles <=78){
        this.nivelI = "B1";
        this.descNivelI = "•	 El estudiante es capaz de comprender los puntos principales de textos claros y en lengua\n" +
"estándar si tratan sobre cuestiones que le son conocidas, ya sea en situaciones de trabajo,\n" +
"de estudio o de ocio.\n" +
"• Sabe desenvolverse en la mayor parte de las situaciones que pueden surgir durante un\n" +
"viaje por zonas donde se utiliza la lengua.\n" +
"• Es capaz de producir textos sencillos y coherentes sobre temas que le son familiares o\n" +
"en los que tiene un interés personal.\n" +
"• Puede describir experiencias, acontecimientos, deseos y asp";
    
    }else if(ingles>78 && ingles <=100){
        this.nivelI = "B+";
        this.descNivelI = "•	 El estudiante promedio clasificado en este nivel supera las preguntas de mayor\n" +
"complejidad de la prueba. ";
        
    
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

    public String getPruebaSociales() {
        return pruebaSociales;
    }

    public void setPruebaSociales(String pruebaSociales) {
        this.pruebaSociales = pruebaSociales;
    }

    public String getPruebaNaturales() {
        return pruebaNaturales;
    }

    public void setPruebaNaturales(String pruebaNaturales) {
        this.pruebaNaturales = pruebaNaturales;
    }

    public String getPruebaIngles() {
        return pruebaIngles;
    }

    public void setPruebaIngles(String pruebaIngles) {
        this.pruebaIngles = pruebaIngles;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNivelL() {
        return nivelL;
    }

    public void setNivelL(String nivelL) {
        this.nivelL = nivelL;
    }

    public String getNivelM() {
        return nivelM;
    }

    public void setNivelM(String nivelM) {
        this.nivelM = nivelM;
    }

    public String getNivelS() {
        return nivelS;
    }

    public void setNivelS(String nivelS) {
        this.nivelS = nivelS;
    }

    public String getNivelN() {
        return nivelN;
    }

    public void setNivelN(String nivelN) {
        this.nivelN = nivelN;
    }

    public String getNivelI() {
        return nivelI;
    }

    public void setNivelI(String nivelI) {
        this.nivelI = nivelI;
    }

    public String getDescNivelL() {
        return descNivelL;
    }

    public void setDescNivelL(String descNivelL) {
        this.descNivelL = descNivelL;
    }

    public String getDescNivelM() {
        return descNivelM;
    }

    public void setDescNivelM(String descNivelM) {
        this.descNivelM = descNivelM;
    }

    public String getDescNivelS() {
        return descNivelS;
    }

    public void setDescNivelS(String descNivelS) {
        this.descNivelS = descNivelS;
    }

    public String getDescNivelN() {
        return descNivelN;
    }

    public void setDescNivelN(String descNivelN) {
        this.descNivelN = descNivelN;
    }

    public String getDescNivelI() {
        return descNivelI;
    }

    public void setDescNivelI(String descNivelI) {
        this.descNivelI = descNivelI;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", identificacion=" + identificacion + ", institucion=" + institucion + ", departamento=" + departamento + ", correo=" + correo + ", pruebaLecturaCritica=" + pruebaLecturaCritica + ", pruebaMatematica=" + pruebaMatematica + ", pruebaSociales=" + pruebaSociales + ", pruebaNaturales=" + pruebaNaturales + ", pruebaIngles=" + pruebaIngles + ", total=" + total + '}';
    }

    
    
}
