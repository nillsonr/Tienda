package com.DAO.TiendaLicores;

import java.sql.*;
import java.util.ArrayList;

import com.DTO.TiendaLicores.UsuarioVO;
//Esta clase permite el acceso a la Base de Datos

public class UsuarioDAO {
	
	//Metodo para consultar los usuarios
	
	public ArrayList<UsuarioVO> listaUsuarios()
	{
		ArrayList<UsuarioVO> miLista = new ArrayList<UsuarioVO>();
		Conexion con = new Conexion();
		
		try
		{
			PreparedStatement consulta = ((Object) con.getCon()).prepareStatement("SELECT * FORM T_Usuarios");
			ResultSet rs = consulta.executeQuery();
			while(rs.next())
			{
				UsuarioVO persona = new usuarioVO();
				persona.setCedula(Integer.parseInt(rs.getString("Cedula_Usu")));
				persona.setNombre(rs.getString("Nombre_Usu"));
				persona.setCorreo(rs.getString("Nombre_Usu"));
				persona.set(rs.getString("Nombre_Usu"));
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Error No se pudo Conectar "+ e);
		}
		
		return miLista;
		
	}

}
