package tema8.RepasoSQL;

public class RepasoSQL {
    /*

1. 
    SELECT nombre, apellido
    FROM Profesor;

2.
    SELECT nombre, apellido
    FROM Estudiante
    WHERE fecha_nacimiento > '1980-01-01';

3.
    SELECT nombre, apellido
    FROM Estudiante
    ORDER BY fecha_nacimiento ASC;

4.
    SELECT c.nombre_casa, COUNT(e.id_estudiante) AS num_estudiantes
    FROM Casa c
    LEFT JOIN Estudiante e ON c.id_casa = e.id_casa
    GROUP BY c.nombre_casa;

5.
    SELECT AVG(ea.calificacion) AS media, MAX(ea.calificacion) AS maxima
    FROM Estudiante_Asignatura ea
    JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura
    WHERE a.nombre_asignatura = 'Pociones';

6.
    SELECT DISTINCT año_curso
    FROM Estudiante;

7.
    SELECT nombre, apellido
    FROM Estudiante
    WHERE apellido LIKE 'P%';

8.
    SELECT nombre, apellido
    FROM Estudiante
    WHERE año_curso IN (4, 5);

9.
    SELECT e.nombre, e.apellido
    FROM Estudiante e
    JOIN Casa c ON e.id_casa = c.id_casa
    WHERE e.año_curso = 5
    AND (c.nombre_casa = 'Gryffindor' OR c.nombre_casa = 'Slytherin');

10.
    SELECT nombre, apellido, fecha_nacimiento
    FROM Estudiante
    ORDER BY fecha_nacimiento ASC
    LIMIT 5;
    Consultas Avanzadas

11.
    SELECT e.nombre, e.apellido
    FROM Estudiante e
    JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante
    JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura
    WHERE a.nombre_asignatura = 'Vuelo' AND ea.calificacion >= 8;

12.
    INSERT INTO Estudiante (nombre, apellido, id_casa, año_curso, fecha_nacimiento)
    VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25');

13.
    UPDATE Casa
    SET id_jefe = (SELECT id_profesor FROM Profesor WHERE nombre = 'Pomona' AND apellido = 'Sprout')
    WHERE nombre_casa = 'Hufflepuff';

14.
    DELETE FROM Estudiante
    WHERE nombre = 'Tom' AND apellido = 'Riddle';

15.
    SELECT e.nombre, e.apellido, c.nombre_casa
    FROM Estudiante e
    JOIN Casa c ON e.id_casa = c.id_casa;

16.
    SELECT e.nombre AS estudiante, m.nombre_mascota, a.nombre_asignatura
    FROM Estudiante e
    LEFT JOIN Mascota m ON e.id_estudiante = m.id_estudiante
    LEFT JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante
    LEFT JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura;

17.
    SELECT e.nombre, e.apellido
    FROM Estudiante e
    JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante
    JOIN Asignatura a ON ea.id_asignatura = a.id_asignatura
    WHERE a.nombre_asignatura = 'Encantamientos'
    AND ea.calificacion > (
    SELECT AVG(calificacion)
    FROM Estudiante_Asignatura
    JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura
    WHERE Asignatura.nombre_asignatura = 'Encantamientos'
            );

18.
    SELECT c.nombre_casa
    FROM Casa c
    JOIN Estudiante e ON c.id_casa = e.id_casa
    JOIN Estudiante_Asignatura ea ON e.id_estudiante = ea.id_estudiante
    GROUP BY c.nombre_casa
    HAVING AVG(ea.calificacion) > 7;

*/
}
