-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2023 a las 02:36:54
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos`
--

CREATE TABLE `datos` (
  `codigo` int(100) UNSIGNED NOT NULL COMMENT 'código unico',
  `nombre` varchar(100) NOT NULL COMMENT 'puede repetirse',
  `direccion` text NOT NULL COMMENT 'no debe exceder los 300 carácteres',
  `telefono` varchar(15) DEFAULT NULL COMMENT 'puede ser null'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `datos`
--

INSERT INTO `datos` (`codigo`, `nombre`, `direccion`, `telefono`) VALUES
(1, 'Josue Letrán', '20 calle \"A\" zona 2', NULL),
(2, 'Julio Lopez', '30 calle c 4-44 zona 12', '40404040'),
(3, 'Julia Perez', 'apto z avenida guadalupana', '50505050'),
(4, 'Andrea Lucia', '4ta calle barrio el gallito', '60606060'),
(5, 'Julio Samuel', '6ta. avenida zona 1 5-66', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos`
--
ALTER TABLE `datos`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `datos`
--
ALTER TABLE `datos`
  MODIFY `codigo` int(100) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'código unico', AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
