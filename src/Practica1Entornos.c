#include <stdio.h>

int main() {
    char nombre[50];
    int nacimiento, edad;

    printf("Programa mensaje en C\n");

    printf("¿Cómo se llama?\n ");
    scanf("%49s", nombre);

    printf("¿En qué año nació?\n ");
    scanf("%d", &nacimiento);

    edad = 2025 - nacimiento;
    printf("Hola %s, tienes %d años. Este programa está hecho en el lenguaje de programación: C]", nombre, edad);

    return 0;
}
