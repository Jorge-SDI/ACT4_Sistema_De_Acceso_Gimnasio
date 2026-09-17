# Sistema de Control de Acceso a Gimnasio (POO Java)

Proyecto que simula el control de acceso en los torniquetes de un gimnasio aplicando **Abstracción, Encapsulamiento, Herencia y Polimorfismo**[cite: 1].

---

## 📋 Reglas del Negocio

* **`MembresiaBasica`:** Visitas limitadas (ej. 10). Se resta 1 por acceso. Con 0 visitas restantes, se niega la entrada.
* **`MembresiaPremium`:** Visitas ilimitadas para el titular. Cuenta con pases de invitado limitados; si se agotan, entra solo el titular.

---

## 🛠️ Arquitectura

### 1. Clase Abstracta Base (`Membresia`)
* **Atributos protegidos:** `idMiembro` y `nombreUsuario` (`protected`).
* **Método abstracto:** `public abstract boolean verificarAcceso();
* **Método concreto:** `public void mostrarDatos()` para imprimir la información básica.

### 2. Subclases hijas
* **`MembresiaBasica`:** Maneja el atributo privado `visitasRestantes`. Resta visitas en `verificarAcceso()` mientras `visitasRestantes > 0`.
* **`MembresiaPremium`:** Maneja `pasesInvitado` privados. Otorga acceso siempre al titular e incluye el método propio `ingresarConInvitado()`.

### 3. Recorrido (`Main`)
* Guarda objetos de ambas clases en un arreglo/lista de tipo `Membresia`.
* Ejecuta accesos consecutivos dentro de un bucle para observar la reducción del contador.
* Usa `instanceof` para invocar `ingresarConInvitado()` en instancias de la Membresia Premium.

---
###### Desarrollado por: `Jorge O. Salazar Díaz`