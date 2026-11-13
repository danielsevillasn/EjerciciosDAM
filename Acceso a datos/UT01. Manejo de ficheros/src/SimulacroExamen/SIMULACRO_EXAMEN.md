# Simulacro de examen — Gestión de empleados

**Duración orientativa:** 1 h 45 min  
**Material permitido:** tus apuntes y ejemplos Java.  
**Tema:** clase `File`, ficheros de acceso aleatorio y XML DOM.

Una empresa guarda datos de sus empleados. Cada empleado tiene:

- `id` (entero)
- `apellido` (máximo 10 caracteres)
- `departamento` (entero)
- `salario` (`double`)

Desarrolla una aplicación Java de consola que resuelva los apartados siguientes. Usa manejo adecuado de excepciones y cierra los recursos empleados.

## 1. Preparación y clase `File` (2 puntos)

El programa trabajará dentro de una carpeta llamada `datos` situada en el directorio de ejecución.

1. Crea un objeto `File` para esa carpeta.
2. Si no existe, crea la carpeta.
3. Muestra por pantalla:
   - su ruta absoluta;
   - si existe;
   - si es un directorio;
   - el contenido que tiene en ese momento (si no contiene archivos, indícalo).
4. Dentro de dicha carpeta se usará el fichero `empleados.dat`. Si ya existe, pregunta al usuario si desea reutilizarlo o borrarlo para empezar de cero.

## 2. Fichero de acceso aleatorio (4 puntos)

En `datos/empleados.dat` guarda **cinco empleados** usando `RandomAccessFile`.

Cada registro debe ocupar **36 bytes**, exactamente en este orden:

| Campo | Tamaño | Escritura / lectura |
|---|---:|---|
| id | 4 bytes | `writeInt` / `readInt` |
| apellido | 20 bytes | 10 caracteres con `writeChars` / `readChar` |
| departamento | 4 bytes | `writeInt` / `readInt` |
| salario | 8 bytes | `writeDouble` / `readDouble` |

Para cada apellido, conviértelo a mayúsculas y completa con espacios hasta 10 caracteres antes de escribirlo. Puedes partir de estos datos:

| id | apellido | departamento | salario |
|---:|---|---:|---:|
| 1 | Sevilla | 10 | 1500.50 |
| 2 | Fernández | 20 | 1750.00 |
| 3 | Gil | 10 | 1625.75 |
| 4 | López | 30 | 2100.00 |
| 5 | Ramos | 20 | 1900.25 |

Implementa estas operaciones:

1. **Listado completo:** recorre el fichero desde el principio y muestra todos los empleados.
2. **Consulta directa:** solicita un `id` entre 1 y 5 y muestra únicamente ese empleado usando `seek`, sin leer los registros anteriores.
3. **Añadir empleado:** solicita los datos de un sexto empleado y añádelo al final del fichero.

> Pista: para consultar un id, la posición inicial del registro es `(id - 1) * 36`. Antes de leer, comprueba que esa posición existe dentro del fichero.

## 3. Exportación a XML (3 puntos)

Implementa un método que lea `empleados.dat` y genere el fichero `datos/empleados.xml` usando DOM. Debe tener esta estructura:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<empleados>
  <empleado id="1">
    <apellido>SEVILLA</apellido>
    <departamento>10</departamento>
    <salario>1500.5</salario>
  </empleado>
</empleados>
```

Condiciones:

- El atributo `id` procede del fichero aleatorio.
- Debe aparecer un elemento `<empleado>` por cada registro almacenado, incluido el añadido.
- Usa `DocumentBuilderFactory`, `DocumentBuilder`, `createElement`, `appendChild` y `Transformer`.
- Al terminar, comprueba con `File` que `empleados.xml` existe y muestra su ruta absoluta y su tamaño en bytes.

## 4. Verificación XML (1 punto)

Lee el XML que acabas de crear y muestra solo los empleados cuyo departamento sea `20`, con este formato:

```text
ID: 2 | APELLIDO: FERNÁNDEZ | SALARIO: 1750.0
```

Para ello, obtén los nodos `empleado` con `getElementsByTagName` y recupera el atributo y los elementos hijo necesarios.

## Entrega y criterios de corrección

Entrega todos los `.java` necesarios. Se valorará especialmente:

- uso correcto de `File` y creación de la carpeta;
- que cada registro mida realmente 36 bytes;
- cálculo correcto de la posición con `seek`;
- lectura de campos en el mismo orden en que se escribieron;
- XML bien formado y con todos los registros;
- tratamiento de `IOException`, errores de XML y recursos cerrados.

### Checklist antes de entregar

- [ ] `datos` se crea si no existe.
- [ ] `empleados.dat` contiene los 5 registros iniciales y el nuevo empleado.
- [ ] La consulta por id funciona sin recorrer el fichero.
- [ ] `empleados.xml` contiene todos los empleados.
- [ ] La lectura XML filtra únicamente el departamento 20.
