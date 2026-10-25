
CREATE DATABASE avatar_db;

CREATE TABLE IF NOT EXISTS artes_control (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    elemento_origen VARCHAR(50) NOT NULL,
    descripcion TEXT NOT NULL,
    nivel_dificultad INT NOT NULL
);

INSERT INTO artes_control (nombre, elemento_origen, descripcion, nivel_dificultad) VALUES
('Sangre Control', 'Agua', 'Subtecnica avanzada y prohibida que manipula los fluidos corporales', 10),
('Metal Control', 'Tierra', 'Subtecnica creada por Toph Beifong manipulando las impurezas del metal', 8),
('Rayo Control', 'Fuego', 'Conocido como el fuego de sangre fria, requiere alta concentracion emocional', 9),
('Vuelo Control', 'Aire', 'Subtecnica legendaria de Aire control que requiere desapego terrenal absoluto', 10),
('Combustion Control', 'Fuego', 'Capacidad de canalizar energia a traves del tercer ojo para generar explosiones', 9);