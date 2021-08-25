package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConteinerDao {
	
	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
	private String user = "postgres";
	private String password = "@Bryan123";
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void inserirConteiner(ConteinerJavaBeans conteiner) {
		String create = "insert into conteiner (nome_cliente, numero_conteiner, tipo_conteiner, status_conteiner, categoria_conteiner) values (?, ?, ?, ?, ?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, conteiner.getNome_cliente());
			pst.setString(2, conteiner.getNumero_conteiner());
			pst.setString(3, conteiner.getTipo_conteiner());
			pst.setString(4, conteiner.getStatus_conteiner());
			pst.setString(5, conteiner.getCategoria_conteiner());
			pst.executeQuery();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<ConteinerJavaBeans> listarConteineres() {
		ArrayList<ConteinerJavaBeans> conteineres = new ArrayList<>();
		String read = "select * from conteiner order by id_conteiner";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int id_conteiner = rs.getInt(1);
				String nome_cliente = rs.getString(2);
				String numero_conteiner = rs.getString(3);
				String tipo_conteiner = rs.getString(4);
				String status_conteiner = rs.getString(5);
				String categoria_conteiner = rs.getString(6);
				conteineres.add(new ConteinerJavaBeans(id_conteiner, nome_cliente, numero_conteiner, tipo_conteiner, status_conteiner, categoria_conteiner));
			}
			con.close();
			return conteineres;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void selecionarConteiner(ConteinerJavaBeans conteiner) {
		String read2 = "select * from conteiner where id_conteiner=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, conteiner.getId_conteiner());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				conteiner.setId_conteiner(rs.getInt(1));
				conteiner.setNome_cliente(rs.getString(2));
				conteiner.setNumero_conteiner(rs.getString(3));
				conteiner.setTipo_conteiner(rs.getString(4));
				conteiner.setStatus_conteiner(rs.getString(5));
				conteiner.setCategoria_conteiner(rs.getString(6));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
