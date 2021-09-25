package com.Controlador.TiendaLicores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DAO.TiendaLicores.Conexion;

@SpringBootApplication
public class TiendaLicoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaLicoresApplication.class, args);
		
		Conexion conn = new Conexion();
		conn.getCon();
		
	}

}
