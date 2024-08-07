PRAGMA journal_mode = MEMORY;
PRAGMA synchronous = OFF;
PRAGMA foreign_keys = OFF;
PRAGMA ignore_check_constraints = OFF;
PRAGMA auto_vacuum = NONE;
PRAGMA secure_delete = OFF;

DROP TABLE IF EXISTS `trabajadores`;

CREATE TABLE `trabajadores` (
`DNI` TEXT NOT NULL,
`cargoOcupado` TEXT DEFAULT NULL,
`codigoVerificacion` char(5) DEFAULT NULL,
`nombres` TEXT DEFAULT NULL,
`firstLastName` TEXT DEFAULT NULL,
`secondLastName` TEXT DEFAULT NULL,
`sueldoBasico` decimal(10,2) DEFAULT NULL,
`username` TEXT NOT NULL,
`password` TEXT NOT NULL,
`correo` TEXT DEFAULT NULL,
`telefono` TEXT DEFAULT NULL,
PRIMARY KEY (`DNI`)
);

INSERT INTO `trabajadores` VALUES 
('72818198', 'Administrador', '1', 'CARMEN', 'FARFAN', 'SOSA', 3200.00, 'userlucia', 'passlucia', 'akakamdakw', NULL),
('74389393', 'Almacenero', '5', 'EDINSON', 'FERNANDEZ', 'FLORES', 4500.00, 'anotherez23', 'darkness', 'akagakagami@gmail.com', '923283822'),
('81929190', 'Vendedor', '2', 'MAX', 'CHAPILLIQUEN', 'CASTILLO', 4000.00, 'usermax', 'passmax', 'kso1kmsq', NULL);

CREATE UNIQUE INDEX `trabajadores_username` ON `trabajadores` (`username`);

PRAGMA ignore_check_constraints = ON;
PRAGMA foreign_keys = ON;
PRAGMA journal_mode = WAL;
PRAGMA synchronous = NORMAL;
