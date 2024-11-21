# SisTeval
 
SISTEVAL: Sistema Integral de Evaluaciones Académica


1.	ANTECEDENTES


Actualmente en el ámbito educativo, uno de los mayores desafíos es mejorar el rendimiento académico de los estudiantes, y más específicamente en las preparaciones para exámenes de mayor importancia como los que serias, de medio y final del semestre. La falta de evaluaciones constantes y realimentación inmediata limita el desarrollo de habilidades de estudio y afecta el desempeño en estos exámenes. Las evaluaciones tradicionales realizadas de forma manual o en plataformas no específicas, no permiten un correcto seguimiento continuo y control personalizado del progreso académico, lo que impide a los estudiantes tener un control claro sobre su avance y de esta manera ellos poderpreparase en los puntos específicos que necesiten.

Para poder superar estas limitaciones, se desarrolló “SISTEVAL” Sistema Integral de Evaluaciones Académicas, una herramienta innovadora que trata de automatizar y centraliza las evaluaciones académicas. Esta misma facilita la toma de exámenes frecuentesy ofrece un sistema de seguimiento continuo en el rendimiento, brindando asi a los estudiantes oportunidades de practica y retroalimentación que de esta manera fomentan constantemente el aprendizaje efectico. De esta manera estamos buscando mejorar las calificaciones y el aprendizaje, contribuyendo asi al éxito de los estudiantes.


2.	OBJETIVO GENERAL


Incrementar el rendimiento académico y las calificaciones de los estudiantes de la Universidad Central del Ecuador en al menos un 20% mediante la implementación del Sistema Integral de Evaluaciones Académicas SistEval, proporcionando evaluaciones periódicas y retroalimentación constante, para fomentar una preparación continua y efectiva en un plazo de 4 meses.
 
3.	OBJETIVOS FUNCIONALES
1.	Fomentar el seguimiento académico mediante evaluaciones continuas: Crear un módulo que permita la realización de exámenes regulares con retroalimentación inmediata, asegurando un monitoreo constante del progreso y adaptando estrategias pedagógicas de acuerdo a los resultados.

2.	Proporcionar informes de desempeño claros y específicos: Generar informes detallados, tanto individuales como grupales, que permitan a los docentes identificar áreas de mejora y adaptar sus métodos de enseñanza de manera más efectiva.

3.	Preparar a los estudiantes para evaluaciones clave a través de simulacros: Implementar simulacros de exámenes y pruebas prácticas bajo condiciones reales, brindando a los estudiantes oportunidades de practicar.

4.	Mejorar el compromiso estudiantil con retroalimentación personalizada: Ofrecer un sistema que proporciona comentarios específicos, reconocimiento de logros y recomendaciones, creando un entorno de aprendizaje motivador y centrado en el avance constante.

5.	Garantizar el acceso seguro y continuo a las evaluaciones: Implementar una plataforma en línea que permita a estudiantes y docentes consultar calificaciones y resultados en cualquier momento, desde cualquier dispositivo compatible, asegurando accesibilidad y seguridad.

6.	Proteger la privacidad y autenticidad de las sesiones: Desarrollar un sistema seguro para gestionar el acceso de usuarios y controlar la autenticidad de las evaluaciones, con supervisión y permisos específicos.

7.	Simplificar la creación y gestión de evaluaciones: Diseñar una interfaz intuitiva para que los docentes puedan crear y modificar preguntas de manera eficiente, categorizando por dificultad y tema, mejorando la experiencia de gestión de exámenes.
 
4.	ESPECIFICACION DE REQUERIMIENTOS (SRS)


1	Gestión de Exámenes: Permitir a los docentes crear y administrar exámenes, con funcionalidades para agregar preguntas y configurar opciones como tiempo límite y modalidad (práctica o calificada).

2	Realización de Exámenes: Proporcionar a los estudiantes una interfaz sencilla e intuitiva para realizar exámenes, garantizando un entorno controlado y seguro que prevenga intentos de trampa.
a.	Visualización de Calificaciones: Permitir que tanto los estudiantes como los docentes puedan visualizar las calificaciones obtenidas en los exámenes, con detalles segmentados por asignatura y tipo de evaluación.
b.	Búsqueda de Exámenes: Contar con una función de búsqueda que permita localizar exámenes usando filtros como fecha, asignatura o nivel de dificultad.
c.	Visualización de Resultados: ofrecer una opción para que los usuarios vean los resultados de los exámenes con un análisis de rendimiento y retroalimentación detallada sobre las respuestas correctas e incorrectas.
d.	Gestión de Perfiles de Estudiantes: Administrar los perfiles de los estudiantes, registrando información personal, historial de exámenes y resultados obtenidos.
e.	Administración de Sesiones: Permitir a los administradores gestionar las sesiones de examen, controlando el acceso de los estudiantes y coordinando la logística de la evaluación.
 

1.	ESPECIFICACIÓN DE REQUERIMIENTOS

4.1.	Diagramas de caso de uso Nivel 0 (Requerimientos)
![image](https://github.com/user-attachments/assets/a8496b5d-0924-43ac-8f33-90a195d6eaa1)


 
4.2 Diagramas de caso de uso Nivel 1

![image](https://github.com/user-attachments/assets/58da921d-2dcd-4de1-9341-e414fa21118c)

 
NOMBRE: [H1.1 – Crear perfil]

Descripción Permitir la creación de un perfil de usuario ingresando datos personales básicos y guardándolos en el sistema.


Como: Administrador, Estudiante
Quiero: Crear un perfil en el sistema
Para: Tener acceso a mis datos personales y al historial académico

Actores
Nombre	Descripción
Administrador	Supervisa la creación de perfiles para
verificar datos ingresados
Estudiantes	Crea su perfil para tener acceso a las funciones de SISTEVAL
Alcance

Campos	Obligatorio	Origen
ID	S	Ingresado por el usuario
Nombre	S	Ingresado por el usuario
Correo electrónico	S	Ingresado por el usuario
Usuario	S	Ingresado por el usuario
Contraseña	S	Ingresado por el usuario

Criterios de Aceptación

Dado que	Cuando	Entonces
Quiero crear un perfil	Completo todos los campos obligatorios	y	guardo	el
perfil	El sistema guarda el perfil y muestra	un	mensaje	de
confirmación

Excepciones

Dado que	Cuando	Entonces
Falta un campo obligatorio	Intento guardar el perfil	Un mensaje de error: Campo obligatorio
Formato
nombre	inválido	en	el	Intento guardar el perfil	Un	mensaje	de
Nombre no permitido	error:
 
NOMBRE: [H1.2 – Editar perfil]

Descripción Permitir la edición de los datos personales de un perfil ya creado en el sistema.
 

Como: Administrador, Estudiante
Quiero: Editar los datos de mi perfil
Para: Actualizar mi información personal en el sistema

Actores
Nombre	Descripción
Administrador	Supervisa las ediciones de perfil y
verifica datos críticos
Estudiantes	Edita su perfil para actualizar datos
Alcance

Campos	Obligatorio	Origen
Nombre	S	Ingresado por el usuario
Contraseña	S	Ingresado por el usuario
Correo electrónico	S	Ingresado por el usuario
Usuario	S	Ingresado por el usuario

Criterios de Aceptación

Dado que	Cuando	Entonces
Quiero editar mi perfil	Completo los campos modificados y guardo los cambios	El sistema guarda la actualización y muestra un mensaje de confirmación

Excepciones

Dado que	Cuando	Entonces
Un campo obligatorio queda vacío	Intento guardar el perfil	Un mensaje de error: Campo obligatorio
El	nombre	tiene	formato
inválido	Intento guardar el perfil	Un	mensaje	de	error:
Nombre no permitido
 
NOMBRE: [H1.3 – consultar perfil]

Descripción Permitir a un usuario visualizar la información de su perfil en el sistema.


Como: Administrador, Estudiante
Quiero: Consultar mi perfil
Para: Visualizar la información personal registrada en el sistema
Actores	 	
Nombre	Descripción
Administrador	Proporciona la visualización de la
información del perfil
Estudiantes	Consulta los datos personales de su perfil
Alcance

Campos	Obligatorio	Origen
ID	S	Ingresado por el usuario
Nombre	S	Ingresado por el usuario
Correo electrónico	S	Ingresado por el usuario
Usuario	S	Ingresado por el usuario

Criterios de Aceptación

Dado que	Cuando	Entonces
Quiero consultar mi perfil	Selecciono	la	opción	de "Consultar perfil"	Se	muestra	un	mensaje: Información registrada

Excepciones

Dado que	Cuando	Entonces
Ingrese el nombre incorrecto	Intento consultar el perfil	Un	mensaje	de	error:
Nombre no encontrado
 
NOMBRE: [H1.4 – Eliminar perfil]

Descripción Permitir la eliminación de un perfil de usuario en el sistema, eliminando los datos personales asociados.
 


Como: Administrador, Estudiante
Quiero: Eliminar mi perfil
Para: Borrar mis datos personales del sistema

Actores
Nombre	Descripción
Administrador	Puede eliminar perfiles de usuarios
inactivos o duplicados
Estudiantes	Elimina su perfil para borrar sus datos
Alcance

Campos	Obligatorio	Origen
ID	S	Ingresado por el usuario
Nombre	S	Ingresado por el usuario
Usuario	S	Ingresado por el usuario
Confirmación de clave	S	Confirmación solicitada al usuario


Criterios de Aceptación

Dado que	Cuando	Entonces
Quiero eliminar mi perfil	Confirmo la eliminación del perfil	El sistema elimina el perfil y muestra un mensaje de éxito

Excepciones

Dado que	Cuando	Entonces
El usuario no confirma	No	se	confirma	la eliminación	No se elimina el perfil y se reinicia la pagina
 
NOMBRE: [H2.1 – Crear examen]

Descripción Permite al docente crear un nuevo instrumento de evaluación (examen), estableciendo su contenido.
 
Como: Administrador
Quiero: Crear elementos de evaluación (exámenes)
Para: Permitir que los estudiantes los realicen y así mejoren su rendimiento académico

Actores

Nombre	Descripción
Administrador	Encargado	de	generar
y gestionar exámenes

Alcance
Campos	Obliga torio	Origen
Id del examen	S	Autogenerado, Se mostrará al guardar
Título examen	S	Ingresado por teclado
Fecha de aplicación	S	Ingresado por teclado
Descripción	N	Ingresado por teclado
Duración	S	Ingresado por teclado
Preguntas	S	Seleccionado del
banco de preguntas
Calificación	S	Autogenerado
Puntaje máximo y mínimo	S	Ingresado por teclado
Clave de examen	S	Ingresado por teclado
 
Criterios de aceptación

Dado que	Cuando	Entonces
Quiero crear un examen	•	Selecciono la opción "Crear Examen" en el menú principal.
•	El sistema muestra un formulario donde el docente completa los campos:	El sistema guarda el examen y presenta el mensaje “Examen	creado exitosamente”
	Título, Descripción, Fecha de Aplicación, y Duración.	
	•	Confirma y continúa.
•	Establezco el Puntaje Máximo y mínimo para el examen.
•	Agrego preguntas al examen
•	Reviso el resumen del examen,		realizo ajustes si es necesario y	selecciono “Guardar”	

Excepciones

Dado que	Cuando	Entonces
Quiero crear un examen	No	completo	los	campos obligatorios del formulario	El sistema no me permite guardar la información y presenta el mensaje: Los campos obligatorios no pueden estar vacíos
Quiero crear un examen	Ingreso la información en un formato equivocado o los puntajes fuera del rango de calificación permitida	El sistema no me permite guardar la información y presenta el mensaje: Formato inválido o calificación fuera
del rango permitido
Quiero crear un examen	No añado preguntas	El sistema no me permite guardar la información y presenta el mensaje: El examen no puede contener 0 preguntas, agregue preguntas
para poder continuar.
 
NOMBRE: [H2.2 – Editar examen]

Descripción Permite al docente realizar modificaciones en un examen previamente creado, ya sea para actualizar el contenido, ajustar la calificación, cambiar el tiempo límite, o corregir errores.

Como: Administrador
Quiero: Editar los elementos de un examen ya creado
Para: Asegurar que el contenido sea adecuado y actualizado para la evaluación de los estudiantes.

Actores

Nombre	Descripción
Administrador	Encargado de gestionar exámenes

Alcance
Campos	Obligatorio	Origen
Id del examen	S	Ingresado por teclado
Título		del examen	S	Ingresado por teclado
Fecha	de aplicación	S	Ingresado por teclado
Descripción	N	Ingresado por teclado
Clave	de
examen	S	Ingresado por teclado
Duración	S	Ingresado por teclado
Calificación	S	Autogenerado
Preguntas	S	Seleccionado
del banco de preguntas
 
Criterios de aceptación

Dado que	Cuando	Entonces
Quiero editar un examen	Selecciono la opción "Editar Examen" en el menú de exámenes.
Busco el examen con su Id o título.
El sistema despliega la información actual del examen, incluyendo:	El sistema actualiza el examen con la nueva información y presenta el mensaje: Examen editado con éxito.
	•	Título, descripción, fecha de aplicación, duración,	y
descripción.
•	Preguntas incluidas en el examen.	
	Realizo	las	modificaciones necesarias:	
	•	Cambia los detalles generales (título, descripción, duración, fecha).
•	Modifico, elimino o agrego preguntas.	
	Guardo los cambios.	

Excepciones

Dado que	Cuando	Entonces
Quiero editar un examen	No ingreso la información de	El sistema no me permite
	los campos obligatorios	actualizar la información y
		presenta	el	mensaje:	Los
		campos obligatorios   deben
		ser	llenados,	no	se	ha
		actualizado el examen.
 
NOMBRE: [H2.3 – Consultar examen]

Descripción Permite al estudiante o docente consultar los detalles de un examen específico.

Como: Administrador, Estudiante
Quiero: Consultar los detalles de un examen en SistEval
Para: Entender la estructura del examen, conocer la información y especificaciones de la evaluación.

Actores

Nombre	Descripción
Administrador	Encargado	de	generar y gestionar exámenes
Estudiante	Usuario	que	realiza	las	evaluaciones,
miembro de la comunidad estudiantil de la UCE

Alcance
Campos	Obligator io	Origen
Id del examen (para el H2.3.1)	N	Ingresado por teclado
Título del Examen
(para el H2.3.2)	N	Ingresado por teclado
Fecha de aplicación	S	Ingresado por teclado
 
Criterios de aceptación


Dado que	Cuando	Entonces
Quiero examen	consultar	un	•	Inicio sesión y selecciono "Consultar Examen."
•	Busco el examen por su título o id,	•	El sistema muestra los detalles básicos del examen:

Título, Descripción, Fecha de aplicación, y Duración.
			•	Elijo	el	examen	a consultar.	
•	Si el examen aún no ha sido tomado, el estudiante ve los detalles básicos y puede iniciar el examen cuando esté disponible.
•	Si el examen fue completado,	el estudiante puede ver:
				Calificación Obtenida


Excepciones

Dado que	Cuando	Entonces
Quiero consultar un examen	No ingreso el título ni el id del examen	El sistema muestra el mensaje: No se han ingresado los datos del examen, no se puede realizar una búsqueda,
ingrese el título y/o id del examen
 
NOMBRE: [H2.4 – Realizar examen]

Descripción Permite al estudiante tomar el examen en línea en el tiempo estipulado y enviar sus respuestas para ser evaluadas.

Como: Estudiante
Quiero: Completar el examen asignado en la plataforma
Para: Demostrar mis conocimientos y obtener una calificación que refleje mi desempeño académico

Actores

Nombre	Descripción
Estudiante	Usuario	que	realiza	las	evaluaciones,
miembro de la comunidad estudiantil de la UCE

Alcance


Campos	Obligatorio	Origen
Título		del examen	S	Ingresado por teclado
Clave	de examen	S	Ingresado por teclado

Criterios de aceptación


Dado que	Cuando	Entonces
Quiero realizar un examen	Ingreso al sistema, busco el examen por su título, selecciono el examen disponible y hago clic en “Iniciar Examen.

Reviso las instrucciones y confirmo para comenzar el examen.	El sistema confirma la entrega y guarda el examen para ser evaluado y muestra un mensaje de confirmación de que el examen fue enviado exitosamente.
 
	
Selecciono la opción "Enviar Examen" al finalizar.

El sistema confirma la entrega y guarda el examen para ser evaluado.	

NOMBRE: [H2.5 – Eliminar examen]

Descripción Permite al docente eliminar un examen previamente creado para que no esté disponible para los estudiantes y se retire de la lista de exámenes activos.


Como: Administrador
Quiero: Eliminar un examen creado
Para: Evitar que los estudiantes vean o accedan a un examen que ya no es relevante o fue creado por error.

Actores

Nombre	Descripción
Administrador	Encargado	de	generar y gestionar exámenes

Alcance
Campos	Obligatorio	Origen
Id del exámen	S	Ingresado por teclado
Clave de confirmación	S	Ingresado por teclado
 
Criterios de Aceptación
Dado que	Cuando	Entonces
Quiero eliminar un examen	Selecciono la opción "Eliminar Examen" en el menú de exámenes.
Busco el examen con su Id y título.
El sistema muestra un mensaje de confirmación para asegurar que deseo eliminar el examen de forma permanente.	El sistema elimina el examen de la base de datos y lo retira de la lista de exámenes visibles para	los
estudiantes.
	El docente confirma la eliminación.
(Happy path)	


Excepciones


Dado que	Cuando	Entonces
Quiero	No	ingreso	El	sistema	no
eliminar	correctamente	borra	ningún
un	el título y el id	examen y muestra
examen	del examen	el	mensaje:	El
		título	o	id	no
		pertenece a ningún
		examen existente,
		no se ha podido
		completar	la
		acción
 
NOMBRE: [H3.1 – Crear simulador]

Descripción Permitir que el usuario crea un simulacro en el sistema, definiendo las preguntas, duración y configuraciones específicas para evaluar su preparación.





Como: Usuario
Quiero: Crear un simulacro
Para: Evaluar y mejorar mis conocimientos y preparación en un contexto similar al de un examen real

Actores

Nombre	Descripción
Usuario	Persona que tiene permiso para crear y gestionar simulacros en el sistema


Alcance

Campos	Obligatorio	Origen
ID de simulacro	S	Identificador único del simulacro
Nombre del simulacro	S	Título o nombre del simulacro

Preguntas	S	Conjunto de preguntas a incluir en el simulacro

Duración	S	Tiempo total asignado para completar el simulacro

Número de intentos	N	Límite de intentos permitidos por estudiante (si aplica)

Fecha de inicio	S	Fecha en la que se puede realizar el simulacro

Criterios de Aceptación

Dado que	Cuando	Entonces
El usuario configura todos los parámetros del simulacro.	Confirma la creación del simulacro.	El sistema crea el simulacro
y muestra un mensaje de éxito.
Excepciones
 
Dado que	Cuando	Entonces
El	usuario	no	completa campos obligatorios	Intenta crear el simulacro	El sistema muestra un mensaje de error indicando los datos faltantes
Ocurre un error en el sistema	Intenta crear el simulacro	Se muestra un mensaje de error y el simulacro no es
creado.

NOMBRE: [H3.2 – Editar simulador]

Descripción Permitir que el usuario edite un simulador previamente creado, modificando preguntas, configuraciones de duración, y otros parámetros para mejorar la utilidad del simulador.



Como: Usuario
Quiero: Editar un simulador
Para: Actualizar o mejorar el contenido y la configuración de la experiencia de práctica

Actores

Nombre	Descripción
Usuario	Persona que tiene permiso para crear, editar y gestionar simuladores en el
sistema

Alcance

Campos	Obligatorio	Origen
ID de Simulador	S	Identificador único del simulador a editar

Título	S	Nombre o título del simulador

Preguntas	S	Conjunto de preguntas a modificar o añadir

Duración	N	Tiempo asignado para completar el
simulador

Fecha de inicio	S	Modificación de la fecha de disponibilidad del simulador
 
Criterios de Aceptación

Dado que	Cuando	Entonces
El usuario selecciona el
simulador a editar y realiza cambios	Confirma los cambios	El sistema guarda las modificaciones y muestra un mensaje de éxito

Excepciones

Dado que	Cuando	Entonces
El usuario no completa campos obligatorios	Intenta guardar los cambios	El sistema muestra un mensaje de error indicando los datos faltantes
Ocurre un error en el sistema	Intenta guardar las modificaciones	Se muestra un mensaje de error y los cambios no se guardan

NOMBRE: [H3.3 – Consultar simulador]

Descripción Permitir que el usuario consulte un simulador existente para revisar su contenido, configuración y detalles relacionados, sin realizar cambios.





Como: Usuario
Quiero: Consultar un simulador
Para: Revisar el contenido y configuraciones del simulador para prepararme o verificar detalles relevantes

Actores

Nombre	Descripción
Usuario	Persona que tiene acceso para visualizar simuladores en el sistema
 
Alcance

Campos	Obligatorio	Origen
ID de Simulador	S	Identificador único del simulador a consultar

Título	S	Nombre o título del simulador

Preguntas	S	Conjunto de preguntas a modificar o añadir

Duración	N	Tiempo asignado para completar el simulador

Fecha de inicio	S	Modificación de la fecha de disponibilidad
del simulador

Criterios de Aceptación

Dado que	Cuando	Entonces
El usuario selecciona el simulador que desea consultar.	Acceda a la vista de detalles	El sistema muestra el contenido y configuraciones del simulador.

Excepciones

Dado que	Cuando	Entonces
No existe un simulador con el ID especificado	Intenta consultar el simulador	El sistema muestra un mensaje indicando que no se encontró el simulador
Ocurre un error en el sistema	Intenta consultar el simulador	Se muestra un mensaje de error y el contenido no se
carga

NOMBRE: [H3.4 – Eliminar simulador]
Descripción Permitir que el usuario elimine un simulador existente de la plataforma, retirando su contenido y configuración de manera definitiva.




Como: Usuario
Quiero: Eliminar un simulador
Para: Retirar simuladores innecesarios o que ya no sean útiles para mis propósitos

Actores

 
Usuario	Persona que tiene permiso para eliminar simuladores en el sistema
Alcance

Campos	Obligatorio	Origen
ID del simulador	S	Identificador único del simulador a eliminar
Confirmación de eliminación	S	Confirmación por parte del usuario para
proceder con la eliminación

Criterios de Aceptación

Dado que	Cuando	Entonces
El	usuario	selecciona	el simulador a eliminar.	Se confirmar la eliminación	El sistema elimina el simulador y muestra un mensaje de éxito.

Excepciones

Dado que	Cuando	Entonces
El usuario no confirma la eliminación	Intenta eliminar el simulador	El sistema no elimina el
simulador	y	mantiene	el estado actual.
Ocurre un error en el sistema	Intenta eliminar el simulador	Se muestra un mensaje de error y el simulador no se elimina.

NOMBRE: [H4.1 – Subir material de estudio]

Descripción Permitir que el usuario subir el material de estudio previamente creado, para mejorar el desempeño de los demás usuarios.



Como: Usuario
Quiero: Subir el material de estudio
Para: Que los demás usuarios puedan revisarlo cuando lo necesiten

Actores
 
Nombre	Descripción
Usuario	Persona	que	tiene	permiso	subir material de estudio en el sistema

Alcance

Campos	Obligatorio	Origen
ID de Material	S	Identificador Material

Título	S	Nombre o título del Material de estudio

Preguntas	S	Conjunto de preguntas a modificar o cambiarlas

Respuesta	N	Respuesta correcta dad del material de
estudio

Fecha de publicación	S	Modificación de la fecha de disponibilidad
del Material de estudio



Criterios de Aceptación

Dado que	Cuando	Entonces
El usuario selecciona el
material de estudio lo podrá publicar y modificar	Confirma los cambios	El sistema guarda las modificaciones y muestra un mensaje de éxito

Excepciones

Dado que	Cuando	Entonces
El usuario no completa campos obligatorios	Intenta guardar los cambios	El sistema muestra un mensaje de error indicando los datos faltantes
Ocurre un error en el sistema	Intenta guardar las modificaciones	Se muestra un mensaje de error y los cambios no se guardan
 
NOMBRE: [H4.2 – Editar material de estudio]

Descripción Permitir que el usuario editar el material de estudio previamente creado, para mejorar el desempeño de los demás usuarios.



Como: Usuario
Quiero: Editar el material de estudio
Para: Que los demás usuarios puedan revisarlo cuando lo necesiten

Actores

Nombre	Descripción
Usuario	Persona	que	tiene	permiso	editar material de estudio en el sistema

Alcance

Campos	Obligatorio	Origen
ID de Material	S	Identificador Material

Título	S	Nombre o título del Material de estudio

Preguntas	S	Conjunto de preguntas a modificar o cambiarlas

Respuesta	N	Respuesta correcta dada del material de
estudio

Fecha de publicación	S	Modificación de la fecha de disponibilidad del Material de estudio



Criterios de Aceptación

Dado que	Cuando	Entonces
El usuario selecciona el material de estudio lo podrá editar y modificar	Confirma los cambios	El sistema guarda las modificaciones y muestra un mensaje de éxito
 
Excepciones

Dado que	Cuando	Entonces
El usuario no completa campos obligatorios	Intenta guardar los cambios	El sistema muestra un mensaje de error indicando los datos faltantes
Ocurre un error en el sistema	Intenta guardar las modificaciones	Se muestra un mensaje de error y los cambios no se guardan


NOMBRE: [H4.3 – Consultar material de estudio]

Descripción Permitir que el usuario consuktar el material de estudio previamente creado, para mejorar el desempeño de los demás usuarios.


Como: Usuario
Quiero: consultar el material de estudio
Para: Que los demás usuarios puedan revisarlo cuando lo necesiten

Actores

Nombre	Descripción
Usuario	Persona que tiene permiso consultar material de estudio en el sistema

Alcance

Campos	Obligatorio	Origen
ID de Material	S	Identificador Material

Título	S	Nombre o título del Material de estudio

Preguntas	S	Conjunto de preguntas a modificar o cambiarlas

Respuesta	N	Respuesta correcta dad del material de
estudio

Fecha de publicación	S	Modificación de la fecha de disponibilidad del Material de estudio
 

Criterios de Aceptación

Dado que	Cuando	Entonces
El usuario selecciona el
material de estudio que desea consultar.	Acceda a la vista de detalles	El sistema muestra el
contenido y configuraciones del simulador.

Excepciones

Dado que	Cuando	Entonces
No existe un simulador con el ID especificado	Intenta consultar el material de estudio	El	sistema	muestra	un mensaje indicando que no se
encontró	el	material	de estudio
Ocurre un error en el sistema	Intenta consultar el material de estudio	Se muestra un mensaje de error y el contenido no se
carga



NOMBRE: [H4.4 – Eliminar simulador]
Descripción Permitir que el usuario elimine un material de estudio existente de la plataforma, retirando su contenido y configuración de manera definitiva.



Como: Usuario
Quiero: Eliminar un material de estudio
Para: Retirar materiales de estudios innecesarios o que ya no sean útiles para mis propósitos

Actores

Nombre	Descripción
Usuario	Persona que tiene permiso para eliminar materiales de uso en el sistema
Alcance

Campos	Obligatorio	Origen
 
ID del material de estudio	S	Identificador único del material de estudio a eliminar
Confirmación de eliminación	S	Confirmación por parte del usuario para
proceder con la eliminación

Criterios de Aceptación

Dado que	Cuando	Entonces
El	usuario	selecciona	el Material	de		estudio		a
eliminar.	Se confirmar la eliminación	El sistema elimina el material de estudio y muestra un mensaje de éxito.

Excepciones

Dado que	Cuando	Entonces
El usuario no confirma la eliminación	Intenta eliminar el material de estudio	El sistema no elimina el
material	de	estudio	y mantiene el estado actual.
Ocurre un error en el sistema	Intenta eliminar el material de estudio	Se muestra un mensaje de error y el material de estudio no se elimina.


NOMBRE: [H5.1 – Crear roles y permisos]
Descripción Permitir que el administrador cree roles y asigne permisos específicos a los mismos, con el fin de gestionar el acceso y las capacidades de los usuarios en el sistema.




Como: Administrador
Quiero: Crear roles y permisos
Para: Controlar el acceso y las acciones que pueden realizar los usuarios en el sistema

Actores

Nombre	Descripción
Administrador	Usuario responsable de la creación y
gestión de roles y permisos en el sistema.
Alcance

Campos	Obligatorio	Origen
 
ID del Rol	S	Identificador único del rol creado
Nombre del rol	S	Nombre que describe el rol creado
Descripción del rol	N	Breve descripción del rol creado
Permisos asignados	S	Lista de permisos que definen las capacidades del rol

Criterios de Aceptación

Dado que	Cuando	Entonces
El administrador crea un nuevo rol y define permisos.	Completa la asignación de permisos	El sistema guarda el nuevo rol y muestra un mensaje de
éxito.

Excepciones

Dado que	Cuando	Entonces
El administrador no completa los campos obligatorios	Intenta guardar el nuevo rol y permisos	El	sistema	muestra	un mensaje de error indicando
los campos faltantes
Ocurre un error en el sistema	Intenta guardar el rol	Se muestra un mensaje de error y no se guarda el rol

NOMBRE: [H5.2 – Modificar roles y permisos]
Descripción Permitir que el administrador modifique los roles existentes y sus permisos asignados, ajustando los niveles de acceso y capacidades de los usuarios según sea necesario.





Como: Administrador
Quiero: Modificar roles y permisos
Para: Ajustar los accesos y acciones permitidas para los usuarios en el sistema de acuerdo con nuevas políticas o necesidades

Actores

Nombre	Descripción
Administrador	Usuario responsable de modificar los roles y permisos en el sistema
 
Alcance

Campos	Obligatorio	Origen
ID del Rol	S	Identificador único del rol a modificar
Nombre del rol	S	Nombre actualizado que describe el rol
Descripción del rol	N	Breve descripción del rol creado
Permisos asignados	S	Lista de permisos actualizados para el rol

Criterios de Aceptación

Dado que	Cuando	Entonces
El administrador selecciona un rol y realiza modificaciones.	Completa la modificación de permisos o datos del rol	El sistema guarda los cambios y muestra un mensaje de éxito.

Excepciones

Dado que	Cuando	Entonces
El administrador no completa los campos obligatorios	Intenta guardar las modificaciones.	El	sistema	muestra	un mensaje de error indicando
los campos faltantes
El rol a modificar no existe	Intenta acceder a un rol que no está registrado	Se muestra un mensaje de error y no se realiza la modificación.
Ocurre un error en el sistema	Intenta guardar las modificaciones.	Se muestra un mensaje de
error y los cambios no se guardan


NOMBRE: [H5.3 – Asignar roles y permisos]
Descripción Permitir que el administrador asigne roles y sus respectivos permisos a los usuarios, definiendo el nivel de acceso y las capacidades que cada usuario tiene en el sistema.





Como: Administrador
Quiero: Asignar roles y permisos
Para: Determinar el nivel de acceso y las acciones que los usuarios pueden realizar dentro del sistema
 
Actores

Nombre	Descripción
Administrador	Usuario responsable de asignar roles y permisos a los usuarios del sistema




Alcance

Campos	Obligatorio	Origen
ID del Usuario	S	Identificador del usuario al que se le asigna
el rol
ID del rol	S	Identificador del rol que se asignará al
usuario
Fecha de asignación	N	Fecha en que se asigna el rol al usuario

Criterios de Aceptación

Dado que	Cuando	Entonces
El administrador selecciona un usuario y un rol para
asignar	Confirma la asignación de rol	El sistema asigna el rol y muestra un mensaje de éxito.

Excepciones

Dado que	Cuando	Entonces
El usuario o rol no existe	Intenta guardar las modificaciones.	El sistema muestra un mensaje de error y no se realiza la asignación
Ocurre un error en el sistema	Intenta guardar las modificaciones.	Se muestra un mensaje de error y no se guarda la
asignación

NOMBRE: [H5.4 – Consultar roles y permisos]
Descripción Permitir que el administrador consulte los roles existentes y sus respectivos permisos asignados en el sistema, así como los usuarios asociados a cada rol.



Como: Administrador
 
Quiero: Consultar roles y permisos
Para: Visualizar y revisar los accesos y capacidades asignadas a los usuarios, y realizar análisis o verificaciones necesarias

Actores

Nombre	Descripción
Administrador	Usuario responsable de visualizar y
gestionar los roles y permisos asignados en el sistema




Alcance

Campos	Obligatorio	Origen
ID del rol	S	Identificador único del rol consultado
Nombre del rol	S	Nombre del rol
Descripción del rol	N	Descripción detallada del rol
Permisos asociados	S	Lista de permisos asignados al rol
Usuarios asociados	N	Lista de usuarios que tienen asignado el rol

Criterios de Aceptación

Dado que	Cuando	Entonces
El administrador consulta un rol específico	Selecciona el rol en la interfaz	El sistema muestra todos los detalles del rol, incluyendo permisos y usuarios asociados.

Excepciones

Dado que	Cuando	Entonces
El rol no existe	Intenta consultar un rol	El	sistema	muestra	un mensaje de error indicando
que el rol no fue encontrado
Ocurre un error en el sistema	Intenta realizar la consulta	Se muestra un mensaje de error y no se muestra la
información
 
NOMBRE: [H5.5 – Eliminar roles y permisos]
Descripción Permitir que el administrador elimine roles existentes y sus respectivos permisos del sistema, desasignando dichos roles de los usuarios asociados y asegurando el control del acceso al sistema.



Como: Administrador
Quiero: Eliminar roles y permisos
Para: Gestionar de manera adecuada los accesos y capacidades de los usuarios, eliminando roles obsoletos o no necesarios



Actores

Nombre	Descripción
Administrador	Usuario responsable de eliminar roles y permisos del sistema

Alcance

Campos	Obligatorio	Origen
ID del rol	S	Identificador del rol que se eliminará
Confirmación de eliminación	S	Confirmación para proceder con la
eliminación

Criterios de Aceptación

Dado que	Cuando	Entonces
El administrador selecciona un rol para eliminar	Confirma la eliminación del rol	El sistema elimina el rol, desasigna los usuarios asociados y muestra un mensaje de éxito.

Excepciones

Dado que	Cuando	Entonces
El administrador no confirma la eliminación	Intenta eliminar un rol	El sistema no elimina el rol y se mantiene el estado actual.
 
El rol a eliminar no existe	Intenta seleccionar un rol que no esté registrado	El sistema muestra un mensaje de error indicando que el rol no fue encontrado
Ocurre un error en el sistema	Intenta eliminar el rol	Se muestra un mensaje de error y no se realiza la
eliminación

NOMBRE: [H6.1 – Configuración sesión de examen]
Descripción Permitir que el administrador configure una sesión de examen en el sistema, estableciendo detalles como fecha, duración, restricciones y parámetros específicos para la realización de solicitudes.



Como: Administrador
Quiero: Configurar una sesión de examen
Para: Definir los detalles y restricciones de la sesión para asegurar su correcta ejecución
Actores

Nombre	Descripción
Administrador	Usuario responsable de la configuración de sesiones de examen en el sistema
Alcance

Campos	Obligatorio	Origen
ID de sesión	S	Identificador único de la sesión de examen
Título del examen	S	Nombre o título de la sesión de examen
Fecha de inicio	S	Fecha y hora en la que se inicia la sesión
Duración	S	Tiempo total asignado para completar el
examen
Restricción de acceso	N	Restricciones como IP permitidas o ubicación geográfica
Número máximo de intentos	N	Límite de intentos permitidos para el examen

Criterios de Aceptación

Dado que	Cuando	Entonces
El administrador establece los parámetros de la sesión.	Confirma la configuración de la sesión	El sistema guarda la configuración y muestra un mensaje de éxito.
 
Excepciones

Dado que	Cuando	Entonces
No se completan los campos obligatorios	Intenta guardar la configuración	El sistema muestra un mensaje de error indicando los campos faltantes
Ocurre un error en el sistema	Intenta guardar la configuración	Se muestra un mensaje de error y la sesión no se
configura


NOMBRE: [H6.2 – Controlar acceso al examen]
Descripción Permitir que el administrador controle el acceso a una sesión de examen, estableciendo restricciones, habilitando o deshabilitando el acceso a usuarios específicos y supervisando los accesos durante la duración del examen.




Como: Administrador
Quiero: Controlar el acceso al examen
Para: Asegurar que los estudiantes cumplan con las restricciones y políticas establecidas para la sesión de examen

Actores

Nombre	Descripción
Administrador	Usuario responsable de controlar y supervisar el acceso de los usuarios a la sesión de examen

Alcance

Campos	Obligatorio	Origen
ID de Sesión	S	Identificador único de la sesión de examen
Usuario	S	Usuario cuyo acceso será controlado
Estado de acceso	S	Estado de acceso (habilitado/deshabilitado)
Restricciones aplicadas	N	Restricciones adicionales como IP o ubicación
Hora de acceso	N	Fecha y hora en la que el usuario intenta
acceder
 


Criterios de Aceptación

Dado que	Cuando	Entonces
El	administrador	quiere
habilitar o deshabilitar un usuario	Realiza la acción correspondiente	El sistema aplica el cambio y muestra un mensaje de confirmación.

Excepciones

Dado que	Cuando	Entonces
El usuario no existe o no tiene permisos.	El administrador intenta controlarlo	El	sistema	muestra	un
mensaje de error y no realiza la acción.
Ocurre un error en el sistema	Intenta modificar el estado de acceso	Se muestra un mensaje de error y no se aplica el cambio

NOMBRE: [H6.3 – Finalizar acceso al examen]
Descripción Permitir que el administrador finalice el acceso a una sesión de examen, bloqueando el ingreso o participación de nuevos usuarios y cerrando la sesión de manera segura.



Como: Administrador
Quiero: Finalizar el acceso al examen
Para: Garantizar que la sesión se cierre de manera segura y evitar accesos fuera del tiempo establecido

Actores

Nombre	Descripción
Administrador	Usuario encargado de finalizar el acceso a una sesión de examen y controlar el cierre

Alcance

Campos	Obligatorio	Origen
ID de Sesión	S	Identificador único de la sesión de examen
Estado de sesión	S	Estado de la sesión (abierta/cerrada)
 
Hora de finalización	N	Fecha y hora en que se cierra la sesión de examen

Criterios de Aceptación

Dado que	Cuando	Entonces
El	administrador	decide finalizar la sesión	Ejecuta el comando de cierre de sesión.	El sistema finaliza el acceso y muestra un mensaje de confirmación.

Excepciones

Dado que	Cuando	Entonces
El sistema no puede finalizar la sesión	El administrador intenta cerrarla	El sistema muestra un mensaje de error y mantiene la sesión abierta



NOMBRE: [H6.4 – Asignar calificación]
Descripción: Permitir que el administrador asigne calificaciones a los exámenes realizados por los usuarios, evaluando sus respuestas y registrando sus resultados.



Como: Administrador
Quiero: Asignar calificaciones
Para: Evaluar el desempeño de los estudiantes en un examen y registrar sus resultados.

Actores

Nombre	Descripción
Administrador	Usuario responsable de asignar calificaciones a los exámenes realizados por los usuarios

Alcance

Campos	Obligatorio	Origen
ID de Examen	S	Identificador único del examen
Usuario	S	Usuario al que se le asignará la calificación
 
Calificación	S	Calificación obtenida por el usuario
Comentarios	N	Comentarios adicionales sobre el desempeño del usuario

Criterios de Aceptación

Dado que	Cuando	Entonces
El	administrador	quiere asignar una calificación	Ingresa los datos de calificación	El sistema registra la calificación y muestra un mensaje de éxito.

Excepciones

Dado que	Cuando	Entonces
El sistema presenta un error al asignar la calificación	Intenta registrar la calificación	Se muestra un mensaje de error y la calificación no se asigna
 
5.	Diagrama conceptual

![image](https://github.com/user-attachments/assets/6fdb3378-06ea-4a19-88f3-87f45aac3c41)

 
6.	Diagrama de clases

![image](https://github.com/user-attachments/assets/6ee853de-e29c-48ad-b691-92fa0622905f)
