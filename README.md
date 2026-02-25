# Ejercicio Polimorfismo 2
Ejercicio básico de polimorfismo con sobreescritura de métodos (overriding) hecho por mi, aprendido en el Ciclo Formativo Grado Superior de Desarrollo de Aplicaciones Web (DAW).

![Java](https://img.shields.io/badge/Java-17+-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Completado-brightgreen)
![Licencia](https://img.shields.io/badge/Licencia-MIT-lightgrey)

Este proyecto es una aplicación en **Java** que permite crear y gestionar criaturas (Orco, Enano y Elfo), haciendo que realicen acciones como comer, descansar, pelear entre ellas y mostrar sus características. Además, guarda los datos de un jugador con login, contraseña y correo electrónico.

---

## 🎮 Funcionamiento general

1. Se solicita crear un **jugador**: login, contraseña y correo.  
2. Se muestra un **menú interactivo** para:  
   - Crear criaturas  
   - Hacer comer o descansar a una criatura  
   - Iniciar una pelea entre criaturas  
   - Mostrar características de una criatura  
   - Mostrar datos del jugador  
   - Salir del programa  

Todas las acciones se muestran por pantalla mediante mensajes claros.

---

## 🧱 Clases principales

### 👤 `Jugador.java`
- Login, contraseña y correo del jugador.  
- Métodos para mostrar la información del jugador.

### 🐲 `Criatura.java` (clase base)
- Atributo: nombre de la criatura.  
- Métodos:
  - `comer()`: acción genérica de alimentación.  
  - `descansar()`: acción genérica de descanso.  
  - `pelear(Criatura c1, Criatura c2)`: método para simular lucha entre criaturas.  
  - `toString()`: devuelve las características de la criatura.

---

## 🧬 Tipos de criaturas

Cada criatura hereda de `Criatura` y **sobrescribe los métodos** para personalizar su comportamiento:

| Criatura | Comer | Descansar | Pelear | Características destacadas |
|----------|------|-----------|--------|---------------------------|
| **Orco** | Mensaje contundente indicando que se alimenta con fuerza | Recupera energía mostrando fuerza bruta | Mensaje agresivo, lucha con poder y contundencia | Gran fuerza, resistencia alta |
| **Enano** | Alimentación disciplinada y medida | Recupera energía con resistencia | Lucha equilibrada, basada en fuerza y defensa | Resistente, muy disciplinado |
| **Elfo** | Alimentación ligera y ágil | Recupera energía con rapidez | Lucha ágil y estratégica | Rápido, inteligente, alto control de movimientos |

---

## ⚔️ Sistema de lucha

- Se seleccionan **dos criaturas** para pelear.  
- Cada tipo de criatura muestra mensajes propios durante la lucha.  
- Se determina un resultado basado en la lógica implementada.  

---

## 📥 Clonar el proyecto

```bash
git clone https://github.com/adriigege/Ejercicio-Polimorfismo-2.git
