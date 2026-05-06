# Aula Virtual UNED

Aplicacion de escritorio desarrollada en Java para simular procesos tipicos de un sistema academico: autenticacion, registro de estudiantes, registro de cursos, asignacion de cursos y consulta de informacion.

El proyecto fue realizado para la asignatura `00881 - Sistemas Operativos` de la UNED durante el segundo cuatrimestre de 2025. La solucion fue construida en NetBeans con interfaz Swing y persistencia en archivos de texto.

## Que incluye este repositorio

Este repositorio conserva la estructura general del proyecto y sus diferentes entregables:

- `Archivos del codigo fuente netbeans/`
  Proyecto editable de NetBeans con codigo fuente, recursos, librerias, carpeta `dist` y archivos de datos usados por la aplicacion.
- `Archivo ejecutable directamente .JAR/`
  Version lista para ejecutar mediante `java -jar`, junto con sus librerias y carpetas de datos.
- `Instalador tipo sieguiente siguiente/`
  Instalador para Windows en formato `.exe`.
- `Informe escrito/`
  Documento final del proyecto en PDF.
- `Guia de uso.pdf`
  Guia resumida de ubicacion y uso de los entregables.

## Funcionalidades principales

- Registro de estudiantes con validaciones de datos.
- Inicio de sesion con doble factor para estudiantes.
- Inicio de sesion administrativo con credenciales fijas.
- Registro de cursos con estado `activo` o `inactivo`.
- Asignacion de hasta 4 cursos por estudiante.
- Consulta de estudiantes y cursos asignados.
- Persistencia local en archivos `.txt`.

## Estructura funcional del codigo

Dentro de `Archivos del codigo fuente netbeans/CursosAcademicosUNED/src/` el proyecto esta organizado por capas:

- `AccesoADatos/`
  Maneja lectura y escritura de estudiantes, cursos y asignaciones en archivos `.txt`.
- `Entidades/`
  Define las clases del dominio, como estudiantes, cursos y administrador.
- `LogicaDeNegocio/`
  Contiene validaciones, autenticacion y reglas de negocio.
- `Ventanas/`
  Reune las ventanas Swing del sistema.
- `Utilidades/`
  Incluye utilidades graficas de apoyo.
- `imagenes/`
  Recursos visuales usados por la interfaz.

## Credenciales y datos de ejemplo

La aplicacion incluye un acceso administrativo fijo:

- Usuario: `admin`
- Contrasena: `admin`

Tambien se dejaron tres estudiantes de ejemplo con datos ficticios para probar el sistema:

- ID: `501230456`
  Contrasena: `aurora98`
  Respuesta secreta: `cerezo`
- ID: `502340567`
  Contrasena: `cedro2000`
  Respuesta secreta: `canela`
- ID: `503450678`
  Contrasena: `luna2002`
  Respuesta secreta: `ambar`

Los archivos de ejemplo estan en:

- `Archivos del codigo fuente netbeans/CursosAcademicosUNED/registros_estudiantes/`
- `Archivos del codigo fuente netbeans/CursosAcademicosUNED/asignaciones_estudiantes/`
- `Archivo ejecutable directamente .JAR/registros_estudiantes/`
- `Archivo ejecutable directamente .JAR/asignaciones_estudiantes/`

## Compatibilidad

Este proyecto fue planteado como aplicacion de escritorio en Java y, por su naturaleza, puede ejecutarse en distintos sistemas operativos siempre que el entorno Java sea compatible.

- El proyecto fuente usa Java configurado en NetBeans.
- El archivo `CursosAcademicosUNED.jar` esta pensado para ejecutarse tanto en Windows como en Linux.
- El instalador `AulaVirtualInstalador.exe` es una opcion orientada a Windows.
- Para que el `.jar` funcione correctamente, debe mantenerse junto a su carpeta `lib` y a las carpetas de datos que lo acompanian.

## Como ejecutar el proyecto

### Opcion 1: Ejecutar el `.jar`

Ubicate dentro de la carpeta:

- `Archivo ejecutable directamente .JAR/`

Y ejecuta:

```bash
java -jar CursosAcademicosUNED.jar
```

### Opcion 2: Abrir el proyecto en NetBeans

Abre en NetBeans la carpeta:

- `Archivos del codigo fuente netbeans/CursosAcademicosUNED/`

El proyecto usa:

- `build.xml`
- `manifest.mf`
- `nbproject/`
- la libreria `AbsoluteLayout.jar`

La clase principal configurada es:

- `Ventanas.VentanaPrincipal`

### Opcion 3: Usar el instalador de Windows

Dentro de:

- `Instalador tipo sieguiente siguiente/`

se encuentra:

- `AulaVirtualInstalador.exe`

Esta opcion esta orientada a una instalacion directa en Windows.

## Persistencia de datos

La aplicacion guarda informacion en carpetas locales usando archivos de texto:

- `registros_estudiantes/`
- `registros_cursos/`
- `asignaciones_estudiantes/`

Eso significa que los datos visibles en la aplicacion dependen de la carpeta desde la cual se ejecute cada version del sistema.

## Observaciones

- Los datos de ejemplo incluidos en los archivos `.txt` fueron anonimizados para publicacion.
- El proyecto conserva el codigo fuente, el `.jar`, el instalador, la guia y el informe.
- El enunciado original del curso no se incluye en este repositorio.
