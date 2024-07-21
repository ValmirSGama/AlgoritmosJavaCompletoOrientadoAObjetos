package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException; 

public class Program { 

    public static void main(String[] args) { 

        Connection conn = null; // Declara um objeto Connection para a conexão com o banco de dados
        PreparedStatement st = null;
        try {
            conn = DB.getConnection(); // Obtém uma conexão com o banco de dados

            st = conn.prepareStatement(
            		"DELETE FROM department " // Comando SQL para deletar dados na tabela 'department'
            		+ "WHERE "
            		+ "Id = ?");
            
            // Atribui o código do departamento para deletar
            st.setInt(1,  2);
            
            int rowsAffected = st.executeUpdate();
            
            System.out.println("Done! Rows affected: " + rowsAffected);    
        } 
        catch (SQLException e) { // Captura exceções de SQL 
            throw new DbIntegrityException(e.getMessage()); // Imprime a exceção personalizada
        } 
        finally {
            DB.closeStatement(st); // Fecha o Statement
            DB.closeConnection(); // Fecha a conexão com o banco de dados
        }
    }
}
