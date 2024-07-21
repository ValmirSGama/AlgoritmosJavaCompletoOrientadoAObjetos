package application;

import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 

import db.DB; 

public class Program { 

    public static void main(String[] args) { 

        Connection conn = null; // Declara um objeto Connection para a conexão com o banco de dados
        Statement st = null; // Declara um objeto Statement para executar instruções SQL
        ResultSet rs = null; // Declara um objeto ResultSet para armazenar os resultados de uma consulta SQL
        
        try {
            conn = DB.getConnection(); // Obtém uma conexão com o banco de dados

            st = conn.createStatement(); // Cria um Statement para executar instruções SQL
            
            rs = st.executeQuery("select * from department"); // Executa uma consulta SQL e armazena os resultados em rs
            
            while (rs.next()) { // Loop enquanto houver resultados na consulta
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name")); // Imprime o ID e o nome do departamento
            }
        } 
        catch (SQLException e) { // Captura exceções de SQL
            e.printStackTrace(); // Imprime o stack trace da exceção
        } 
        finally {
            DB.closeResultSet(rs); // Fecha o ResultSet
            DB.closeStatement(st); // Fecha o Statement
            DB.closeConnection(); // Fecha a conexão com o banco de dados
        }
    }
}
