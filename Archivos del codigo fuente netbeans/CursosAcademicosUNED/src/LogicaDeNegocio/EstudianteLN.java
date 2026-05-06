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

package LogicaDeNegocio;

import Entidades.Estudiante;
import AccesoADatos.ArchivoEstudiante;
import AccesoADatos.ArchivoEstudiante;


///
///clase para manejar las operaciones relacionadas con estudiantes
///se encarga de validar datos y delegar la escritura en archivos a la capa de acceso a datos
///
public class EstudianteLN {

    ///
    ///registra un nuevo estudiante validando los campos requeridos
    ///si la validación es exitosa guarda el estudiante mediante la capa de acceso a datos
    ///
    public static String registrarEstudiante(Estudiante estudiante) {
        try {
            // Validar campos obligatorios
            if (estudiante.getId().isEmpty() || estudiante.getNombre().isEmpty() ||
                estudiante.getPrimerApellido().isEmpty() || estudiante.getSegundoApellido().isEmpty() ||
                estudiante.getFechaNacimiento().isEmpty() || estudiante.getEmail().isEmpty() ||
                estudiante.getTelefono().isEmpty() || estudiante.getContrasena().isEmpty() ||
                estudiante.getRespuestaSecreta().isEmpty()) {
                return "Todos los campos deben estar completos.";
            }

            //validación de formato de ID debe ser numérico
            if (!estudiante.getId().matches("\\d+")) {
                return "El ID debe contener solo números.";
            }

            //validación de formato de correo
            if (!estudiante.getEmail().contains("@")) {
                return "El correo electrónico no es válido, ejemplo correcto: 'usuario@dominio.com' ";
            }

            //validación de número de teléfono solo números
            if (!estudiante.getTelefono().matches("\\d+")) {
                return "El número de teléfono debe contener solo números.";
            }

            //validación de contraseña mínima
            if (estudiante.getContrasena().length() < 4) {
                return "La contraseña debe tener al menos 4 caracteres.";
            }

            //validación de respuesta secreta mínima
            if (estudiante.getRespuestaSecreta().length() < 2) {
                return "La respuesta secreta debe tener al menos 2 caracteres.";
            }

            //si todo es válido guardar
            String resultado = ArchivoEstudiante.guardarEstudiante(estudiante);
            return resultado;



        } catch (Exception e) {
            return "Error al registrar estudiante: " + e.getMessage();
        }
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