Autor: Juan Pablo Guerrero Hernandez - 02230132029
Unidad 5 post contenido 1

Instrucciones de ejecución

1. Clonar el repositorio
git clone <URL_DEL_REPOSITORIO>
cd gestion-tareas

3. Abrir el proyecto en IntelliJ IDEA
File → Open → Seleccionar carpeta del proyecto
Esperar a que Maven descargue dependencias
4. Configurar servidor Tomcat

Ir a:

Run → Edit Configurations
Crear nueva configuración:
Tipo: Tomcat Server → Local
En la pestaña Deployment:
Agregar: Artifact → gestion-tareas:war exploded

4. Ejecutar la aplicación
Iniciar el servidor Tomcat
Acceder en el navegador:
http://localhost:8080/gestion-tareas/tareas

Capturas de pantalla: 
/Capturas/capture1.png
/Capturas/capture2.png
/Capturas/capture3.png

