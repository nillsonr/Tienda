package com.DAO.TiendaLicores;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class Conexion {
	
	//Parametros de Conexión
	String bd = "db_tiendalicores";
	String Login = "root";
	String password = "Admin_2021";
	String url = "jdbc:mysql://localhost/"+bd;
	
	Connection con = null;
		
	//Constructor de conexión
	public Conexion()
	{
		try
		{
			//Obtener el driver para mysql
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Obtener la conexion
			con = (Connection) DriverManager.getConnection(url,Login,password);
			if(con != null)
				System.out.println("Conexión a la Base de datos: " +bd + "Exitosa");
		}
		catch(SQLException e)
		{
			System.out.println("Error de Conexión: "+ e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error de Conexión: "+ e);
		}
		catch(Exception e)
		{
			System.out.println("Error de Conexión: "+ e);
		}
	}
	//Metodo para retornar la conexión
	public Connection getCon()
	{
		return con;
	}
	
	//Metodo para desconectar
	public void desconectar()
	{
		con = null;
	}

}
