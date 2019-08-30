package com;

import implementaciones.ConexionMySQL;
import implementaciones.ConexionOracle;
import implementaciones.ConexionPostgreSQL;
import implementaciones.ConexionSQLServer;
import implementaciones.ConexionVacia;

import interfaz.IConexion;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return  new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}