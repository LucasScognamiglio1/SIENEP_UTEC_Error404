# Proyecto SIENEP - Grupo Error 404 - UTEC

## 📚 Descripción

Este proyecto forma parte del Caso de Estudio 2025 de la Licenciatura en Tecnologías de la Información de UTEC. Consiste en el diseño e implementación de las clases base del sistema SIENEP, orientado al seguimiento personalizado de estudiantes con necesidades educativas especiales.

---

## 📁 Estructura del Proyecto

Cada clase está implementada en su propio archivo `.java`:

- `Estudiante.java`
- `Usuario.java`
- `Rol.java`
- `Instancia.java`
- `Recordatorio.java`
- `Incidencia.java`
- `Reporte.java`
- `Auditoria.java`

Se utilizan relaciones entre clases como asociación, agregación o composición. Todas las clases implementan el método `toString()` y pueden tener múltiples constructores. No se incluye el método `main()`, ya que no es necesario para esta entrega.

---

## 🧱 Supuestos de diseño

- Se asume que un estudiante no puede modificar su cédula una vez registrado.
- Un estudiante puede no tener instancias de seguimiento al momento de su creación.
- Los roles de usuario están predefinidos y no pueden ser modificados por los propios usuarios.
- Las fechas y horas se modelan utilizando `LocalDate`, `LocalTime` y `LocalDateTime` según corresponda.
- Se considera que un estudiante puede tener múltiples incidencias asociadas y varias instancias de seguimiento, cada una con sus respectivos recordatorios.

---

## 👥 Participantes

| Nombre completo    | Usuario GitLab       | Usuario GitHub     | Aporte principal             |
|--------------------|----------------------|--------------------|------------------------------|
| Nestor Vargas      | @nestor.vargas       |                    | Clases Reporte / Incidencia  |
| Lucas Scognamiglio |                      | @ignacioScognamiglio | Clases Usuario / Rol         |
| Cecilia Dean       | @cecilia.dean        | @cecilia-dean      | Clase Estudiante / Instancia |
| Sebastián Álvarez  | @sebastian.alvarez.f |                    | Clase Auditoria              |
| Santiago López     | @santiago.lopez.s.sa |                    | Clase Recordatorio           |

> Se puede verificar la participación individual a través del historial de commits en este repositorio.

---

## 🛠️ Requisitos técnicos

- Proyecto desarrollado en Java (versión 17).
- Código estructurado de forma clara y coherente.
- Comentarios explicativos agregados donde se considera necesario.

---

📌 **Este repositorio fue creado como parte de la Etapa 4 del Caso de Estudio 2025 de UTEC.** Cada integrante es responsable de mantener actualizado su código y subir sus contribuciones a través de Git, siguiendo buenas prácticas de control de versiones.
