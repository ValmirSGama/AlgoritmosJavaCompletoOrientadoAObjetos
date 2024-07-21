package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB; 

public class Program { 

    public static void main(String[] args) { 

        Connection conn = null; // Declara um objeto Connection para a conexão com o banco de dados
        PreparedStatement st = null;
        try {
            conn = DB.getConnection(); // Obtém uma conexão com o banco de dados

            st = conn.prepareStatement(
            		"UPDATE seller " // Comando SQL para atualizar dados na tabela 'seller'
            		+ "SET BaseSalary = BaseSalary + ? "
            		+ "WHERE "
            		+ "(DepartmentId = ?)");
            
            // Atribui valores pro valor do aumento e o código do departamento
            st.setDouble(1, 200.0);
            st.setInt(2, 2);
            
            int rowsAffected = st.executeUpdate();
            
            System.out.println("Done! Rows affected: " + rowsAffected);    
        } 
        catch (SQLException e) { // Captura exceções de SQL 
            e.printStackTrace(); // Imprime o stack trace da exceção
        } 
        finally {
            DB.closeStatement(st); // Fecha o Statement
            DB.closeConnection(); // Fecha a conexão com o banco de dados
        }
    }
}
