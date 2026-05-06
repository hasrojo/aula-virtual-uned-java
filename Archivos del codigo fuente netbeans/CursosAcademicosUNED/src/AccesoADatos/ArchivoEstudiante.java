//Universidad Estatal a Distancia
//Vicerrectoría de Docencia
//Escuela de Ciencias Exactas y Naturales
//Cátedra de Desarrollo de sistemas
//Asignatura: SISTEMAS OPERATIVOS
//Código: 00881
// II CUATRIMESTRE 2025
//Estudiante: Héctor Andrés Arrieta Sancho
//Cédula: 114070263
//Proyecto final sistemas operativos
/// Proyecto de aula virtual que permite el registro, asignación y consulta de cursos,
/// gestionando accesos diferenciados para administradores y estudiantes.

package AccesoADatos;

import Entidades.Estudiante;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoEstudiante {

     ///
    ///guarda un estudiante en un archivo .txt usando su ID como nombre
    ///si ya existe un archivo con ese ID, no sobrescribe y retorna un error
    ///
public static String guardarEstudiante(Estudiante estudiante) throws IOException {
    // Carpeta donde se guardarán los registros
    File carpeta = new File("registros_estudiantes");

    //si la carpeta no existe, se crea
    if (!carpeta.exists()) {
        carpeta.mkdir();
    }

    //nombre del archivo usando el ID del estudiante
    File archivo = new File(carpeta, estudiante.getId() + ".txt");

    // Validar si ya existe un archivo con ese ID
    if (archivo.exists()) {
        return "Error: Ya existe un estudiante registrado con ese ID.";
    }

    //escribe cada dato en una línea del archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
        writer.write(estudiante.getId());
        writer.newLine();
        writer.write(estudiante.getNombre());
        writer.newLine();
        writer.write(estudiante.getPrimerApellido());
        writer.newLine();
        writer.write(estudiante.getSegundoApellido());
        writer.newLine();
        writer.write(estudiante.getFechaNacimiento());
        writer.newLine();
        writer.write(estudiante.getEmail());
        writer.newLine();
        writer.write(estudiante.getTelefono());
        writer.newLine();
        writer.write(estudiante.getContrasena());
        writer.newLine();
        writer.write(estudiante.getRespuestaSecreta());
    }

    return "Estudiante guardado correctamente.";
}


///
///carga un estudiante desde archivo usando su ID como nombre del archivo
///si el archivo no existe o está incompleto devuelve null
///
public static Estudiante cargarEstudiantePorId(String id) throws IOException {
    // Ruta del archivo
    File archivo = new File("registros_estudiantes", id + ".txt");

    //si el archivo no existe se retorna null
    if (!archivo.exists()) {
        return null;
    }

    //lee las líneas del archivo
    java.util.List<String> lineas = java.nio.file.Files.readAllLines(archivo.toPath());

    //valida que el archivo tenga al menos 9 líneas (todos los campos)
    if (lineas.size() < 9) {
        return null;
    }

    //crea y retornar el objeto estudiante con los datos del archivo
    return new Estudiante(
        lineas.get(0), // ID
        lineas.get(1), // Nombre
        lineas.get(2), // Primer Apellido
        lineas.get(3), // Segundo Apellido
        lineas.get(4), // Fecha de nacimiento
        lineas.get(5), // Email
        lineas.get(6), // Teléfono
        lineas.get(7), // Contraseña
        lineas.get(8)  // Respuesta secreta
    );
}

}
/*
Referencias bibliográficas
Academy, E. (24 de abril de 2023). youtube. Obtenido de https://www.youtube.com/watch?v=SXIOxvxWf7A
BOS, A. S. (2024). SISTEMAS OPERATIVOS. México: Pearson Educación de méxico.
freepik. (2025). www.freepik.com. Obtenido de https://www.freepik.es/vector-gratis/personas-que-van-universidad-fondo-rosa_9057638.htm#fromView=search&page=1&position=43&uuid=ed7ad1f5-f8a4-46b1-83c2-9724be9869a6&query=entorno+estudiantil+animado+minimalista
freepik. (2025). www.freepik.com. Obtenido de https://www.freepik.es/foto-gratis/concepto-escritorio-vista-superior-cafe_9216574.htm#fromView=image_search_similar&page=1&position=7&uuid=54a8cc55-3529-43e0-91d6-66f41a252e2a&query=fondo+registrarse+universidad
freepik. (2025). www.freepik.com. Obtenido de https://www.freepik.es/foto-gratis/vista-superior-lapices-clips-espacio-copia_8852256.htm#fromView=image_search_similar&page=3&position=1&uuid=54a8cc55-3529-43e0-91d6-66f41a252e2a&query=fondo+registrarse+universidad
freepik. (2025). www.freepik.com. Obtenido de https://www.freepik.es/vector-gratis/zoom-velocidad-tubo-luz-azul-abstracto-tecnologia-fondo-negro_32947939.htm#fromView=image_search_similar&page=1&position=32&uuid=2e117b63-eddd-4d54-8d4f-c5a328b65db8&query=fondo+login+ciberseguridad
freepik. (2025). www.freepik.com. Obtenido de https://www.freepik.es/foto-gratis/vista-superior-teclado-escritorio-notebook-planta-suculenta_6607587.htm#fromView=image_search_similar&page=3&position=17&uuid=db87fedd-c891-4ed0-b419-c51dce023178&query=asignar+curso+minimalista+fondo
Freepik. (2025). www.freepik.com. Obtenido de https://www.freepik.es/foto-gratis/universidad-harvard-cambridge-ee-uu_8565573.htm#fromView=search&page=1&position=26&uuid=efc7ea68-6ca1-4126-9981-7f3b0855dd20&query=universidad
novato, P. (4 de septiembre de 2019). youtube. Obtenido de Programación novato: https://www.youtube.com/watch?v=97nO4-zdviA&list=PLCTD_CpMeEKTT-qEHGqZH3fkBgXH4GOTF
TodoCode. (6 de octubre de 2024). youtube. Obtenido de https://www.youtube.com/watch?v=qxXcI56NfnE
TX, P. (10 de febrero de 2021). youtube. Obtenido de https://www.youtube.com/watch?v=AHKUFs5brOc&list=PLC8aeqj9UWGOaKEz2_AjY5o0-a8wiphc0
*/