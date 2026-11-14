# Guía de Actualización de Badges

Esta guía explica cómo actualizar los porcentajes de los badges de lenguajes en el `README.md` del repositorio. Está diseñada para ser seguida por cualquier asistente IA o LLM.

**Ubicación**: Este archivo vive en `badges/UPDATE_BADGES.md`, junto a los archivos SVG de los badges.

---

## Repositorio

- **Owner/Repo**: `danielsevillasn/EjerciciosDAM`
- **API de lenguajes**: `https://api.github.com/repos/danielsevillasn/EjerciciosDAM/languages`

La API devuelve un JSON con cada lenguaje y su tamaño en bytes. GitHub calcula los porcentajes por bytes de código.

---

## Estructura actual del README.md

El archivo `README.md` contiene las siguientes secciones de badges, en este orden:

### 1. Programación Orientada a Objetos
- **Java** (con porcentaje)
- **C#** (con porcentaje)

### 2. Bases de Datos
- **PL/SQL** (con porcentaje)

### 3. Frontend & Marcado
- **JavaScript** (con porcentaje)
- **HTML** (con porcentaje)
- **CSS** (con porcentaje)

### 4. Scripting & Utilidades
- **Python** (con porcentaje)
- **Shell** (con porcentaje)

### 5. Configuración & Datos
- **JSON** (siempre "used", nunca porcentaje)
- **XML** (con porcentaje)

---

## Reglas importantes

1. **JSON siempre es "used"**: Nunca asignes un porcentaje a JSON. Mantén siempre el badge con el texto "used" y el color `F7DF1E`.
2. **No cambies la estructura de categorías**: No añadas, elimines ni reordenes las secciones `###` del README. Solo actualiza los valores numéricos de los porcentajes.
3. **No cambies los colores**: Cada lenguaje tiene un color hexadecimal fijo en su badge. No lo modifiques.
4. **Usa los datos de GitHub**: Los porcentajes deben provenir exclusivamente de la API de GitHub, no de conteo local de archivos.
5. **Redondea a 1 decimal**: Los porcentajes se muestran con 1 decimal (ej: `81.6`).
6. **Nuevos lenguajes**: Si la API de GitHub devuelve un lenguaje que no está en el README y no es JSON:
   - Si el lenguaje es significativo (> 0.5%), añade un nuevo badge en la categoría más apropiada.
   - Si el lenguaje es trivial (≤ 0.5%), puedes ignorarlo.
   - Si no estás seguro de en qué categoría colocar un nuevo lenguaje, pregunta al usuario.

---

## Mapeo de lenguajes (GitHub → README)

| Lenguaje de GitHub | Categoría del README | Tipo de badge | Color hex |
|---|---|---|---|
| Java | Programación Orientada a Objetos | shields.io con logo | `007396` |
| C# | Programación Orientada a Objetos | SVG local + porcentaje | `239120` |
| PL/SQL | Bases de Datos | SVG local + porcentaje | `CC2927` |
| JavaScript | Frontend & Marcado | SVG local + porcentaje | `F7DF1E` |
| HTML | Frontend & Marcado | shields.io con logo | `E34C26` |
| CSS | Frontend & Marcado | SVG local + porcentaje | `1572B6` |
| Python | Scripting & Utilidades | SVG local + porcentaje | `3776AB` |
| Shell | Scripting & Utilidades | shields.io con logo | `4C4C4C` |
| XML | Configuración & Datos | shields.io con logo | `FF6600` |
| JSON | Configuración & Datos | SVG local + "used" | `F7DF1E` |

### Archivos SVG locales en `badges/`

Los siguientes lenguajes usan un archivo SVG local para el badge del nombre/logo:
- `badges/CSharp.svg`
- `badges/Css.svg`
- `badges/JavaScript.svg`
- `badges/Json.svg`
- `badges/PlSql.svg`
- `badges/Python.svg`

Los demás lenguajes (Java, HTML, Shell, XML) usan badges de shields.io con logo integrado.

---

## Patrones de URL de los badges

### Badge de porcentaje solo
```
https://img.shields.io/badge/XX.X%25-COLOR?style=flat-square
```
Donde `XX.X` es el porcentaje y `COLOR` es el código hexadecimal del lenguaje.

### Badge combinado (nombre + porcentaje)
```
https://img.shields.io/badge/LANGUAGE-XX.X%25-COLOR?logo=LOGO&logoColor=white&style=flat-square
```

### Badge de JSON (siempre "used")
```
https://img.shields.io/badge/used-F7DF1E?style=flat-square
```

---

## Workflow paso a paso

### Paso 1: Obtener los datos de GitHub

Llama a la API de GitHub:
```
https://api.github.com/repos/danielsevillasn/EjerciciosDAM/languages
```

La respuesta será un JSON como:
```json
{
  "Java": 700000,
  "C#": 50000,
  "PL/SQL": 30000,
  "JavaScript": 20000,
  "HTML": 15000,
  "CSS": 5000,
  "Python": 35000,
  "Shell": 10000,
  "XML": 14000
}
```

### Paso 2: Calcular los porcentajes

1. Suma todos los bytes para obtener el total.
2. Para cada lenguaje, calcula `(bytes / total) * 100` y redondea a 1 decimal.
3. Si un lenguaje del README no aparece en la API, verifica si tiene un nombre alternativo (ej: "Shell" puede aparecer como "Shell" o "Bash").

### Paso 3: Actualizar el README.md

1. Reemplaza solo los valores de porcentaje en las URLs de los badges.
2. El patrón a reemplazar es el número con `%25` en la URL: `XX.X%25`.
3. No toques los archivos SVG locales.
4. No toques el badge de JSON ("used").
5. Si hay un nuevo lenguaje significativo, añade su badge en la categoría apropiada siguiendo los patrones existentes.

### Paso 4: Verificar

1. Asegúrate de que todos los porcentajes se han actualizado correctamente.
2. Confirma que JSON sigue con "used".
3. Confirma que la estructura del README no ha cambiado (salvo si se añadió un nuevo lenguaje acordado).
4. Los porcentajes de los lenguajes presentes deben sumar aproximadamente 100%.

---

## Ejemplo completo

Si la API devuelve:
```json
{"Java": 700000, "C#": 50000, "PL/SQL": 30000, "JavaScript": 20000, "HTML": 15000, "CSS": 5000, "Python": 35000, "Shell": 10000, "XML": 14000}
```

Total: 875000 bytes

Los porcentajes serían:
- Java: 80.0%
- C#: 5.7%
- PL/SQL: 3.4%
- JavaScript: 2.3%
- HTML: 1.7%
- CSS: 0.6%
- Python: 4.0%
- Shell: 1.1%
- XML: 1.6%

Luego actualizas cada badge en el README.md reemplazando `XX.X%25` por el nuevo porcentaje.

---

## Cómo añadir un nuevo lenguaje

Si la API de GitHub detecta un lenguaje nuevo que no está en el README:

1. **Determina la categoría**:
   - Lenguajes de programación → Programación Orientada a Objetos
   - Lenguajes de consulta → Bases de Datos
   - Lenguajes web → Frontend & Marcado
   - Lenguajes de scripting → Scripting & Utilidades
   - Lenguajes de configuración → Configuración & Datos

2. **Elige el color**: Usa el color oficial del lenguaje (puedes consultarlo en [shields.io](https://shields.io) o en la documentación del lenguaje).

3. **Crea el badge**:
   - Si el lenguaje tiene logo en shields.io, usa un badge combinado:
     ```
     <img src="https://img.shields.io/badge/NUEVO-XX.X%25-COLOR?logo=logoName&logoColor=white&style=flat-square" height="28">
     ```
   - Si no tiene logo, usa dos badges separados (nombre + porcentaje).

4. **Añade el badge** en la sección `<p>` de la categoría correspondiente.

5. **Actualiza esta guía**: Añade el nuevo lenguaje a la tabla de mapeo y a la lista de categorías.

---

## Notas

- Los badges SVG locales en `badges/` no necesitan actualizarse al cambiar porcentajes.
- El archivo `README.md` es el único archivo que se modifica al actualizar porcentajes.
- Esta guía se actualiza cuando se añaden nuevos lenguajes de forma permanente.
