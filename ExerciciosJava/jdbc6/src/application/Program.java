package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException; 

public class Program { 

    public static void main(String[] args) { 

        Connection conn = null; // Declara um objeto Connection para a conexão com o banco de dados
        Statement st = null;
        try {
            conn = DB.getConnection(); // Obtém uma conexão com o banco de dados

            conn.setAutoCommit(false); // Protege a transação, exceculta completamente ou nada
            
            st = conn.createStatement(); 
            
            // Comandos SQL para atualizar os salários nos departamentos referênciados
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            
            /**
             * int x = 1;
             * if(x < 2) { // Força uma exceção no meio do caminho
             * throw new SQLException("Fake error");
             * }
             */

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
            
            conn.commit(); // Confirma que a transação terminou
            
            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2); 
        } 
        catch (SQLException e) { // Captura exceções de SQL 
            try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1);
			} 
        } 
        finally {
            DB.closeStatement(st); // Fecha o Statement
            DB.closeConnection(); // Fecha a conexão com o banco de dados
        }
    }
}
