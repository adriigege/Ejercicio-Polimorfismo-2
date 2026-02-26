# Ejercicio Polimorfismo 2
Ejercicio básico de polimorfismo con sobreescritura de métodos (overriding) hecho por mi, aprendido en el Ciclo Formativo Grado Superior de Desarrollo de Aplicaciones Web (DAW).

![Java](https://img.shields.io/badge/Java-17+-red)
![POO](https://img.shields.io/badge/Paradigma-POO-blue)
![Estado](https://img.shields.io/badge/Estado-Completado-brightgreen)
![Licencia](https://img.shields.io/badge/Licencia-MIT-lightgrey)

Este proyecto es una **aplicación en Java** que simula la gestión de un jugador que puede crear y controlar criaturas de distintos tipos (**Orco, Enano y Elfo**).  
Cada criatura tiene **acciones diferenciadas**, estadísticas únicas y puede interactuar con otras criaturas a través de **luchas simuladas**.

El programa utiliza **polimorfismo** para que cada tipo de criatura tenga un comportamiento propio al ejecutar los mismos métodos (`comer`, `descansar`, `pelear`).

---

## 🧱 Diagrama de herencia conceptual
    Criatura
   /    |     \
Orco   Enano   Elfo

- `Criatura` es la clase base con métodos genéricos.
- Orco, Enano y Elfo sobrescriben esos métodos para comportamientos específicos.

---

## 👤 Jugador.java

Representa al jugador que controla todas las criaturas.

**Atributos:**

| Atributo  | Tipo   | Descripción                         |
|-----------|--------|-------------------------------------|
| login     | String | Nombre de usuario                    |
| password  | String | Contraseña del jugador               |
| correo    | String | Correo electrónico                   |

**Métodos:**

- `getLogin() / setLogin(String)` → Obtiene o modifica el login.  
- `getPassword() / setPassword(String)` → Obtiene o modifica la contraseña.  
- `getCorreo() / setCorreo(String)` → Obtiene o modifica el correo.  
- `toString()` → Devuelve los datos completos del jugador en formato legible.

---

## 🐲 Criatura.java

Clase base de la que heredan Orco, Enano y Elfo.

**Atributos principales:**

| Atributo      | Tipo   | Descripción                             |
|---------------|--------|-----------------------------------------|
| nombre        | String | Nombre de la criatura                   |
| fuerza        | int    | Nivel de fuerza (1-10)                  |
| inteligencia  | int    | Nivel de inteligencia (1-10)            |
| velocidad     | int    | Nivel de velocidad (1-10)               |
| energia       | int    | Nivel de energía de la criatura         |

**Métodos:**

- `comer()` → Incrementa la energía y muestra un mensaje indicando que la criatura ha comido.  
- `descansar()` → Recupera parte de la energía y muestra un mensaje de descanso.  
- `pelear(Criatura c1, Criatura c2)` → Simula un enfrentamiento entre dos criaturas basándose en sus estadísticas (`fuerza`, `inteligencia`, `velocidad`). Devuelve mensaje con ganador o empate.  
- `toString()` → Muestra todas las estadísticas y el nombre de la criatura.

---

## 🪓 Orco.java

Criatura especializada en fuerza y resistencia.

**Estadísticas aproximadas:**

| Atributo      | Valor promedio |
|---------------|----------------|
| Fuerza        | 8-10           |
| Inteligencia  | 3-5            |
| Velocidad     | 4-6            |
| Energía       | 7-10           |

**Comportamiento sobrescrito:**

- `comer()` → Mensaje contundente: "El Orco X devora su comida y recupera energía".  
- `descansar()` → Mensaje: "El Orco X descansa y recupera fuerza bruta".  
- `pelear()` → Mensaje de lucha agresiva y cálculo basado en fuerza principalmente.

---

## ⚔️ Enano.java

Criatura equilibrada, con buena resistencia.

**Estadísticas promedio:**

| Atributo      | Valor promedio |
|---------------|----------------|
| Fuerza        | 6-8            |
| Inteligencia  | 5-7            |
| Velocidad     | 4-6            |
| Energía       | 7-9            |

**Comportamiento sobrescrito:**

- `comer()` → Mensaje: "El Enano X come cuidadosamente y aumenta su energía".  
- `descansar()` → Mensaje: "El Enano X descansa y se prepara para luchar".  
- `pelear()` → Lucha equilibrada, basada en fuerza y defensa.

---

## 🧝 Elfo.java

Criatura ágil e inteligente.

**Estadísticas promedio:**

| Atributo      | Valor promedio |
|---------------|----------------|
| Fuerza        | 4-6            |
| Inteligencia  | 7-10           |
| Velocidad     | 8-10           |
| Energía       | 6-9            |

**Comportamiento sobrescrito:**

- `comer()` → Mensaje: "El Elfo X come ligero y recupera agilidad".  
- `descansar()` → Mensaje: "El Elfo X descansa y aumenta su destreza".  
- `pelear()` → Lucha rápida basada en velocidad e inteligencia.

---

## ⚡ Sistema de lucha

- Se seleccionan dos criaturas.  
- Cada tipo usa **sus estadísticas y mensajes propios**.  
- Se calcula un **puntaje de combate** basado en fuerza, inteligencia y velocidad.  
- Se muestra en pantalla quién gana, quién pierde o si hay empate.

---

## ▶️ Cómo ejecutar el proyecto

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/adriigege/Ejercicio-Polimorfismo-2.git
