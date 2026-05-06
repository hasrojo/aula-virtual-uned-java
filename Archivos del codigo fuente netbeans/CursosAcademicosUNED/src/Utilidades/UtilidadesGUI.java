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

package Utilidades;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UtilidadesGUI {

    public static void configurarVentana(JFrame ventana, String rutaImagen) {
        try {
            ventana.setLocationRelativeTo(null); // Centra la ventana

            //cargar la imagen
            ImageIcon icono = new ImageIcon(ventana.getClass().getResource(rutaImagen));
            Image imagen = icono.getImage().getScaledInstance(
                    ventana.getWidth(), ventana.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imagenRedimensionada = new ImageIcon(imagen);

            //crear el JLabel con la imagen
            JLabel fondo = new JLabel(imagenRedimensionada);
            fondo.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());

            //insertar fondo detrás de los botones
            JPanel panel = (JPanel) ventana.getContentPane();
            panel.setLayout(null);
            panel.add(fondo);
            panel.setComponentZOrder(fondo, panel.getComponentCount() - 1); //fondo detrás
        } catch (Exception e) {
            System.err.println("Error al cargar fondo: " + e.getMessage());
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