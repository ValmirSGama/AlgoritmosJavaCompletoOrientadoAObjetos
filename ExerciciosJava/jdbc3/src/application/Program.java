package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB; 

public class Program { 

    public static void main(String[] args) { 

    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null; // Declara um objeto Connection para a conexão com o banco de dados
        PreparedStatement st = null;
        try {
            conn = DB.getConnection(); // Obtém uma conexão com o banco de dados

            st = conn.prepareStatement(
            		"INSERT INTO seller " // Comando SQL para inserir dados na tabela 'seller'
            		+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
            		+ "VALUES "
            		+ "(?, ?, ?, ?, ?)",
            		Statement.RETURN_GENERATED_KEYS);
            
            // Define os valores dos parâmetros correspondentes
            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);
            
            /**
             * st = conn.prepareStatement(
             * "insert into department (Name) values ('D1'),('D2')", // Comando SQL para inserir dados na tabela 'department'
             * Statement.RETURN_GENERATED_KEYS); // Configura o PreparedStatement para retornar chaves geradas automaticamente
             */
            
            int rowsAffected = st.executeUpdate(); // Execulta a atualização retornado o número de linhas que foram afetadas
            
           if(rowsAffected > 0) { // Verifica se alguma linha foi afetada
        	   ResultSet rs = st.getGeneratedKeys(); // Obtém as chaves geradas automaticamente
        	   while(rs.next()) { // Percorre os resultados
        		   int id = rs.getInt(1); // Obtém o ID gerado
        		   System.out.println("Done! Id = " + id);
        	   }
           }
           else {
        	   System.out.println("No rows affected!");
           }
        } 
        catch (SQLException | ParseException e) { // Captura exceções de SQL e ParseException
            e.printStackTrace(); // Imprime o stack trace da exceção
        } 
        finally {
            DB.closeStatement(st); // Fecha o Statement
            DB.closeConnection(); // Fecha a conexão com o banco de dados
        }
    }
}
