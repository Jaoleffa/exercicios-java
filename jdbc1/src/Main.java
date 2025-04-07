import models.db.DB;
import models.db.DbException;
import models.db.DbIntegrityException;
import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Como pegar os dados
        /*
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection(); //Iniciando conexão
            st = conn.createStatement(); //Instanciando statemnet
            rs = st.executeQuery("select * from department"); //Executando comando do sql na variavel resultset
            //Result set é a tabela criada baseado no statement que instanciamos, então é criado no st.executequery um tabela com todos os dados de deparment

            while (rs.next()) { //Enquanto tem uma proxima linha de dados no resultset, o programa imprimirá o loop
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        } catch (SQLException e) {
            System.out.println("Error + " + e.getMessage());
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }

         */
        //Inserindo dados
        /*
        PreparedStatement ps = null;
        try {
            conn = DB.getConnection();

            ps = conn.prepareStatement(
                    "INSERT INTO seller " //Pegando departamento
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " //Campos que precisamos preencher (ID não precisa)
                    + "VALUES "
                    + "(?,?,?,?,?)", //Valores em interrogação pois não sabemos ainda o que vamos preencher
                    Statement.RETURN_GENERATED_KEYS //Retornando ID do objeto criado
            );

            ps.setString(1, "Carl Purple"); //Preenchendo os dados
            ps.setString(2, "carl@gmail.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1955").getTime()));
            ps.setDouble(4, 3000);
            ps.setInt(5,3);

            int rowsAffected = ps.executeUpdate(); //Metodo executeUpdate retorna um int, aqui vemos se deu certo ou não

            if(rowsAffected > 0 ) {
                ResultSet rs = ps.getGeneratedKeys(); //Instanciamso RS pois assim que poderemos pegar dado da tabela
                while (rs.next()) {
                    int id = rs.getInt(1); //Numero 1 indicando que será pego o valor apenas da primeira coluna
                    System.out.println("Done, ID = " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }

            System.out.println("Done! Linhas criadas: " + rowsAffected);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }

         */
        //Atualizando Dados
        /*
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?)");

            st.setDouble(1, 200);
            st.setInt(2,2);

            int rowsAffected = st.executeUpdate();
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

         */
        //Deletando dados
        /*
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?"
            );
            st.setInt(1,4);
            int rowsAffected = st.executeUpdate();
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }

         */
        //Transações (métodos de proteção de manipulações
        /*
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int x = 1;

            if (x < 0) {
                throw new SQLException("Fake error");
            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println(rows);
            System.out.println(rows2);
        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Causa: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused by " + e1.getMessage());
            }
        }

         */


    }
}