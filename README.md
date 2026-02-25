# Ejercicio Polimorfismo 2
Ejercicio básico de polimorfismo con sobreescritura de métodos (overriding) hecho por mi, aprendido en el Ciclo Formativo Grado Superior de Desarrollo de Aplicaciones Web (DAW).

Este proyecto es una aplicación en **Java** que permite crear y gestionar criaturas (Orco, Enano y Elfo), haciendo que realicen acciones como comer, descansar, pelear entre ellas y mostrar sus características. Además, guarda los datos de un jugador con login, contraseña y correo electrónico.

---

## 🧠 ¿Qué hace este programa?

Al ejecutar la clase `Main`, el programa:

1. Solicita al usuario **login, contraseña y correo** para crear un jugador.
2. Muestra un **menú interactivo por consola** con las siguientes opciones:
   - Crear una criatura: Orco, Enano o Elfo.
   - Hacer que una criatura **coma**.
   - Hacer que una criatura **descanse**.
   - Realizar una **lucha entre dos criaturas**.
   - Mostrar las **características de una criatura**.
   - Mostrar los **datos del jugador**.
   - Salir del programa.

---

## 📋 Descripción de las clases

### 👤 `Jugador.java`

Guarda los datos del jugador:

- Login
- Contraseña
- Correo

Muestra esta información cuando se solicita en el menú.

---

### 🐲 `Criatura.java` (clase base)

Representa una criatura con atributos como nombre y define métodos comunes:

- `comer()`: devuelve un mensaje indicando que la criatura ha comido.
- `descansar()`: devuelve un mensaje indicando que la criatura descansa.
- `pelear(Criatura, Criatura)`: simula una pelea genérica entre criaturas y devuelve el resultado.
- Método `toString()` para mostrar las características de la criatura.

---

### 🪓 `Orco.java`, ⚔️ `Enano.java`, 🧝 `Elfo.java`

Estas clases heredan de `Criatura.java` y **sobrescriben métodos** para personalizar el comportamiento de cada tipo de criatura (por ejemplo, mensajes específicos para comer, descansar y pelear).

---

## 🎮 Ejecución del programa

### 📥 Clonar el repositorio

```bash
git clone https://github.com/adriigege/Ejercicio-Polimorfismo-2.git
```
