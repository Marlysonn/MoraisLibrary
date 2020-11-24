package database;

import java.sql.*;

public class DataBase {    
    
    String url = "jdbc:sqlite:banco_de_dados/DataBase.db";
    
    private Connection connect() {
        String url = "jdbc:sqlite:banco_de_dados/DataBase.db";
        Connection conn = null;
        try{conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
           
    public void criaT_Aluno() {        
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:banco_de_dados/DataBase.db")) {
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS ALUNO( ID INTEGER not null, NOME VARCHAR not null, CPF INTEGER not null PRIMARY KEY, MATRICULA STRING not null UNIQUE, CURSO STRING not null)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void criaT_Acervo(){
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco_de_dados/DataBase.db")) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS ACERVO( ID INTEGER not null, TITULO STRING not null, AUTOR STRING not null, ANO INTEGER not null, SETOR STRING not null, PRATELEIRA CHAR not null, STATUS BOOLEAN not null)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void criaT_Funcionarios(){
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco_de_dados/DataBase.db")) {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS FUNCIONARIO( ID INTEGER not null, NOME STRING not null, CPF STRING not null, SENHA INT not null, SETOR STRING not null, TIPO INT not null)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void criaT_Setores(){
        try(Connection connection = DriverManager.getConnection(this.url)){
        Statement statemant = connection.createStatement();
        statemant.execute("CREATE TABLE IF NOT EXISTS SETORES(ID INTEGER PRIMARY KEY not null, SETOR STRING not null)");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void updateT_Aluno(int ID, String NOME, float CPF, int MATRICULA, String CURSO) {
        String sql = "UPDATE ALUNO SET NOME = ?," + "CURSO = ?" + "WHERE ID = ?";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, NOME);
            pstmt.setFloat(2, CPF);
            pstmt.setInt(3, ID);
            //pstmt.setInt(4, MATRICULA);
            //pstmt.setString(5, CURSO);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertT_Aluno(int ID, String NOME, String CPF, float MATRICULA, String CURSO ) {
        String sql = "INSERT INTO ALUNO(ID, NOME, CPF, MATRICULA, CURSO) VALUES (?,?,?,?,?)";
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, ID);
            pstmt.setString(2, NOME);
            pstmt.setString(3, CPF);
            pstmt.setFloat(4, MATRICULA);
            pstmt.setString(5, CURSO);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /*public static void insertT_Pessoa() {        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco_de_dados/DataBase.db")) {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO PESSOAS( ID, NOME, CPF) VALUES (1, 'Marlyson', 05967762418)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    */
    
    
    public static void main(String[] args) {
        DataBase app = new DataBase();
        //app.criaT_Aluno();
        //app.criaT_Acervo();
        //app.criaT_Funcionarios();
        //app.criaT_Setores();
        //app.updateT_Aluno(1, "Marlyson", 123123123, 9999,"ADM");
        //app.insertT_Aluno(1,"Marlyson T Xavier", "05967762418",20191022,"TI");
        //app.criaT_Acervo();
    }
}
