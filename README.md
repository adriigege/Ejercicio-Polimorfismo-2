# Ejercicio de Polimorfismo 2

![Java](https://img.shields.io/badge/Java-17+-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Completado-brightgreen)
![Licencia](https://img.shields.io/badge/Licencia-MIT-lightgrey)

Este proyecto es una **aplicación en Java** que simula la gestión de un jugador que puede crear y controlar criaturas de distintos tipos (**Orco, Enano y Elfo**).  
Cada criatura tiene **acciones diferenciadas**, estadísticas únicas y puede interactuar con otras criaturas a través de **luchas simuladas**.

El programa utiliza **polimorfismo** para que cada tipo de criatura tenga un comportamiento propio al ejecutar los mismos métodos (`comer`, `descansar`, `pelear`).

---

## 🎮 Funcionamiento general

Al iniciar el programa:

1. Se solicita la creación de un **jugador**, introduciendo:
   - Login
   - Contraseña
   - Correo electrónico
2. Se muestra un **menú interactivo** por consola que permite:
   - Crear criaturas
   - Hacer que una criatura coma
   - Hacer que una criatura descanse
   - Enfrentar dos criaturas en una lucha
   - Mostrar características de una criatura
   - Mostrar los datos del jugador
   - Salir del programa

Todas las acciones generan una salida por pantalla describiendo lo que ocurre.

---

## 🧱 Descripción de las clases

### 👤 `Jugador.java`

Representa al jugador que controla las criaturas.

Contiene:
- Login
- Contraseña
- Correo electrónico

Incluye métodos para mostrar los datos del jugador cuando se solicitan desde el menú.

---

### 🐲 `Criatura.java`

Clase base que representa una criatura genérica.

Atributos y comportamiento común:
- Nombre de la criatura
- Métodos:
  - `comer()`
  - `descansar()`
  - `pelear(Criatura, Criatura)`
  - `toString()`

Esta clase sirve como base para los distintos tipos de criaturas, que personalizan su comportamiento.

---

## 🧬 Tipos de criaturas

Cada tipo de criatura hereda de `Criatura` y redefine sus acciones con mensajes propios.

---

### 🪓 `Orco.java`

Representa una criatura de tipo **Orco**.

Características:
- Comportamiento más agresivo en combate
- Mensajes propios al comer y descansar

Acciones:
- **Comer:** muestra un mensaje indicando que el orco se alimenta de forma contundente.
- **Descansar:** indica que el orco recupera fuerzas.
- **Pelear:** muestra un mensaje específico de lucha propio del orco.

---

### ⚔️ `Enano.java`

Representa una criatura de tipo **Enano**.

Características:
- Criatura resistente y disciplinada
- Mensajes propios adaptados a su tipo

Acciones:
- **Comer:** mensaje acorde a la naturaleza del enano.
- **Descansar:** indica que el enano recupera energía.
- **Pelear:** muestra una lucha basada en fuerza y resistencia.

---

### 🧝 `Elfo.java`

Representa una criatura de tipo **Elfo**.

Características:
- Criatura ágil e inteligente
- Mensajes diferenciados respecto a las otras criaturas

Acciones:
- **Comer:** mensaje acorde al estilo del elfo.
- **Descansar:** indica descanso y recuperación.
- **Pelear:** muestra una lucha basada en rapidez y destreza.

---

## ⚔️ Sistema de lucha

El programa permite seleccionar **dos criaturas** y enfrentarlas entre sí.

Durante la lucha:
- Se muestran mensajes descriptivos del enfrentamiento.
- Se indica el resultado del combate según la lógica implementada.
- Cada tipo de criatura utiliza su propio mensaje de combate.

---

## ▶️ Ejecución del proyecto

### 📥 Clonar el repositorio

```bash
git clone https://github.com/adriigege/Ejercicio-Polimorfismo-2.git
