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

       +----------------+
       |   Jugador      |
       +----------------+
       | - login:String |
       | - password:String |
       | - correo:String |
       +----------------+
       | + toString()   |
       +----------------+
              |
              |
       +----------------+
       |   Criatura     |
       +----------------+
       | - nombre:String|
       | - fuerza:int   |
       | - inteligencia:int |
       | - velocidad:int|
       | - energia:int  |
       +----------------+
       | + comer()      |
       | + descansar()  |
       | + pelear(Criatura,Criatura) |
       | + toString()   |
       +----------------+
      /          |          \
     /           |           \
     +--------+ +----+-----+ +----+-----+
| Orco | | Enano | | Elfo |
+--------+ +----------+ +----------+
| + comer() | + comer() | + comer()
| + descansar() | + descansar() | + descansar()
| + pelear() | + pelear() | + pelear()
+----------------+------------+------------+

---

## 👤 Clases y métodos

### Jugador.java
- **Atributos:** login, password, correo  
- **Métodos:**
  - `getLogin() / setLogin(String)` → Acceso/modificación del login  
  - `getPassword() / setPassword(String)` → Acceso/modificación de contraseña  
  - `getCorreo() / setCorreo(String)` → Acceso/modificación de correo  
  - `toString()` → Devuelve los datos del jugador  

---

### Criatura.java
Clase base para todas las criaturas.

**Atributos:**
- nombre: String  
- fuerza: int  
- inteligencia: int  
- velocidad: int  
- energia: int  

**Métodos:**
- `comer()` → Incrementa energía y muestra mensaje  
- `descansar()` → Recupera energía y muestra mensaje  
- `pelear(Criatura c1, Criatura c2)` → Compara estadísticas y devuelve resultado de la pelea  
- `toString()` → Muestra todas las estadísticas de la criatura  

---

### Orco.java
- **Fuerza alta, velocidad media, inteligencia baja**  
- Mensajes personalizados:
  - Comer: "El Orco X devora su comida y recupera energía"  
  - Descansar: "El Orco X descansa y recupera fuerza bruta"  
  - Pelear: mensaje agresivo basado en fuerza  

### Enano.java
- **Equilibrado, resistente, buena defensa**  
- Mensajes personalizados:
  - Comer: "El Enano X come cuidadosamente y aumenta su energía"  
  - Descansar: "El Enano X descansa y se prepara para luchar"  
  - Pelear: lucha equilibrada, basada en fuerza y defensa  

### Elfo.java
- **Velocidad e inteligencia alta, fuerza baja**  
- Mensajes personalizados:
  - Comer: "El Elfo X come ligero y recupera agilidad"  
  - Descansar: "El Elfo X descansa y aumenta su destreza"  
  - Pelear: lucha ágil basada en velocidad e inteligencia  

---

## 🧬 Tabla comparativa de criaturas

| Criatura | Fuerza | Inteligencia | Velocidad | Energía | Comportamiento especial |
|----------|--------|--------------|-----------|---------|------------------------|
| Orco     | 8-10   | 3-5          | 4-6       | 7-10    | Pelea agresiva, fuerza bruta |
| Enano    | 6-8    | 5-7          | 4-6       | 7-9     | Pelea equilibrada, resistente |
| Elfo     | 4-6    | 7-10         | 8-10      | 6-9     | Pelea ágil, inteligente |

---

## ⚡ Sistema de lucha

- Selección de **dos criaturas**  
- Cada tipo utiliza su comportamiento específico  
- Calcula **puntaje de combate** combinando fuerza, inteligencia y velocidad  
- Muestra **resultado y mensajes descriptivos**  

---

## ▶️ Cómo ejecutar

### Clonar repositorio

```bash
git clone https://github.com/adriigege/Ejercicio-Polimorfismo-2.git
```
[Frame 1] Inicio sesión
[Frame 2] Menú principal
[Frame 3] Crear criaturas
[Frame 4] Acciones (comer/descansar)
[Frame 5] Pelea entre criaturas
[Frame 6] Mostrar estadísticas
[Frame 7] Mostrar datos jugador
