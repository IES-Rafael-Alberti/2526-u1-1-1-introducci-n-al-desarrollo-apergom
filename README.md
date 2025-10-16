# Práctica 2: Introducción al desarrollo. Ponlo en práctica.

## Identificación de la Actividad
- **Módulo:** `EDES`
- **Alumno(s):** 
  - **Nombre y Apellidos:** Antonio Manuel Pérez Gómez
  - **Correo electrónico:** apergom459w@g.educaand.es
  - **Iniciales del Alumno/Grupo:** AMPG



Descripción de la Actividad.

Esta actividad consiste en desarrollar un pequeño programa en tres lenguajes de programación diferentes (Python, C y Java) para comprender y comparar sus modos de ejecución: interpretado, compilado y mediante máquina virtual. El objetivo principal es que el alumno escriba un programa básico que solicite el nombre del usuario y muestre un mensaje personalizado, analizando el funcionamiento del software en relación con el hardware, la transformación del código fuente, el uso de herramientas de desarrollo y la clasificación de los lenguajes según su nivel de abstracción y paradigma. Se espera que el alumno implemente los tres programas, responda preguntas sobre el proceso de desarrollo y compile evidencia como capturas de pantalla y conclusiones.


Desarrollo de la Actividad.

El desarrollo comenzó definiendo la estructura básica de cada programa para que todos cumplan la misma función: pedir el nombre al usuario y mostrar un mensaje personalizado con el lenguaje de programación utilizado. En Python, el enfoque fue directo utilizando entradas por consola y salidas con print. En C, se diseñó el código con gestión explícita de variables y scanf/printf para entrada/salida, considerando la compilación previa. En Java se usó la clase Scanner y estructura de método main, con manejo de entrada y salida en consola y generación de bytecode. La organización del código es sencilla y modular en todos los casos, facilitando su comprensión y ejecución. Las decisiones de diseño primaron la claridad, simplicidad y equivalencia funcional entre los ejemplos para permitir una comparación justa entre los distintos modos de ejecución. Cada fase fue documentada y se realizaron capturas de pantalla de la ejecución que ilustran el funcionamiento en cada entorno.


Preguntas sobre la actividad.


5.1. Relación entre Software y Hardware
En el programa en Python (lenguaje interpretado), durante la ejecución, los datos del usuario (nombre y año de nacimiento) se almacenaron temporalmente en la memoria RAM como variables en formato cadena e entero, respectivamente. El procesador ejecutó directamente el código fuente línea a línea mediante el intérprete de Python, traduciendo las instrucciones a operaciones de máquina entendibles por el hardware en tiempo real. La salida se presentó en la pantalla, un periférico, a través de llamadas al sistema operativo para mostrar texto en la consola.

Para el programa equivalente en C (lenguaje compilado), el código fuente fue transformado en código objeto y luego en un ejecutable que el procesador puede ejecutar directamente, accediendo a la memoria RAM para almacenar los datos y utilizando los periféricos (pantalla) mediante llamadas del sistema operativo. El ejecutable contiene instrucciones en lenguaje máquina que el procesador interpreta nativamente.

En Java (lenguaje de máquina virtual), el código fuente se compila a bytecode, un código intermedio almacenado en memoria RAM. La JVM interpreta este bytecode para emitir instrucciones específicas del procesador en tiempo real. La entrada y salida con periféricos, como la pantalla, se gestionan indirectamente a través de la JVM y el sistema operativo.

5.2. Diferenciación entre Código Fuente, Código Objeto y Ejecutable
En C, el código fuente escrito se compiló usando un compilador que generó archivos de código objeto intermedios con extensión ".o" o ".obj", que luego se enlazaron para crear un archivo ejecutable (.exe en Windows o sin extensión explícita en otros sistemas). Estos archivos intermedios contienen código máquina pero no ejecutable por sí solos.

En Python, el código fuente se ejecutó directamente por el intérprete sin generar archivos de código objeto o ejecutables, lo que permite una ejecución inmediata y flexible, aunque menos eficiente en rendimiento.

En Java, el código fuente se compiló a bytecode, almacenado en archivos ".class" que contienen código intermedio. Este bytecode es ejecutado posteriormente por la Máquina Virtual de Java (JVM), que traduce las instrucciones a código máquina en tiempo de ejecución.

5.3. Generación de Código Intermedio para Máquinas Virtuales
En Java, el proceso comienza con la compilación del código fuente en archivos .java a bytecode contenido en archivos .class mediante el compilador javac. Este bytecode es independiente de la arquitectura física y es ejecutado por la JVM, que actúa como una capa de abstracción, traduciendo el bytecode en instrucciones que el procesador puede entender. Esto permite que el mismo bytecode corra en diferentes plataformas.

La JVM difiere de la ejecución directa porque maneja la abstracción del sistema operativo y hardware, proporcionando características como gestión de memoria y seguridad, mientras que los lenguajes compilados ejecutan código máquina directamente y los interpretados traducen línea a línea sin pasos intermedios prolongados.

5.4. Clasificación de Lenguajes de Programación
Python (interpretado): Se ejecuta línea a línea mediante un intérprete (modo interpretado), es un lenguaje de alto nivel con paradigma imperativo y orientado a objetos. Su sencillez y flexibilidad influyen en su clasificación como interpretado y de alto nivel.

C (compilado): Es compilado directamente a código máquina (modo compilado), es de alto nivel pero cercano al hardware (niveles medios), y su paradigma es imperativo/procedimental. Tiene características de bajo nivel que permiten acceso directo a memoria, lo que define su clasificación.

Java (máquina virtual): Se compila a bytecode que se ejecuta en máquina virtual (modo máquina virtual), es un lenguaje de alto nivel con paradigma orientado a objetos. Su uso de bytecode y JVM para portabilidad es clave para esta categoría.

5.5. Evaluación de Herramientas Utilizadas en el Desarrollo
Python (interpretado):

Sistema operativo: Linux/Windows (según tu caso).

Editor: Visual Studio Code o cualquier editor de texto.

Intérprete: Python 3 instalado para ejecución directa.

Depurador: Uso del depurador integrado en el IDE para trazar y corregir.

Gestión de versiones: Git para controlar versiones del código.

Otras herramientas: Terminal para ejecutar comandos Python.

C (compilado):

Sistema operativo: Linux/Windows.

Editor: VS Code, Code::Blocks o similar. (En mi caso he utilizado un compilador online)

Compilador: gcc o MSVC para transformar código fuente en ejecutable.

Depurador: GDB para seguimiento y corrección de errores.

Gestión de versiones: Git.

Otras herramientas: Makefile para automatización.

Java (máquina virtual):

Sistema operativo: Linux/Windows.

Editor: IntelliJ IDEA, Eclipse o VS Code con extensión Java. (Al igual que con C, he utilizado un compilador online.)

Compilador: javac para bytecode.

Máquina Virtual: JVM para ejecución.

Depurador: Integrado en IDE para análisis.

Gestión de versiones: Git.

Otras herramientas: Maven o Gradle para manejo de proyectos.