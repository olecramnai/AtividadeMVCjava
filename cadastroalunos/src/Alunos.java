import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Alunos {
    private int id;
    private String nome;
    private int idade;
    private String ano_escolar;

    public Alunos(String nome, int idade, String ano_escolar){
        this.nome = nome;
        this.idade = idade;
        this.ano_escolar = ano_escolar;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getAno_escolar(){
        return ano_escolar;
    }

    public static void salvarAluno(Alunos alunos) {
        String url = "jdbc:mysql://localhost:3306/cadastroalunos"; 
        String user = "root"; 
        String password = ""; 

        String sql = "INSERT INTO alunos (nome, idade, ano_escolar) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, alunos.getNome());
            pstmt.setInt(2, alunos.getIdade());
            pstmt.setString(3, alunos.getAno_escolar());
            pstmt.executeUpdate();
            System.out.println("Aluno inserido com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Aluno: " + e.getMessage());
        }
    }

    public static void listarAlunos() {
        String url = "jdbc:mysql://localhost:3306/cadastroalunos";
        String user = "root";
        String password = "";

        String sql = "SELECT * FROM alunos";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Idade: " + rs.getInt("idade"));
                System.out.println("Ano escolar: " + rs.getString("ano_escolar"));
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar Alunos: " + e.getMessage());
        }
    }

    public static void atualizarAluno(int id, String nome, int idade, String ano_escolar) {
        String url = "jdbc:mysql://localhost:3306/cadastroalunos";
        String user = "root";
        String password = "";

        String sql = " UPDATE alunos SET nome = ?, idade = ?, ano_escolar = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);
            pstmt.setString(3, ano_escolar);
            pstmt.setInt(4, id);

            System.out.println("Aluno atualizado com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar aluno" + e.getMessage());
        }
    }

    public static void deletarAluno(int id) {
        String url = "jdbc:mysql://localhost:3306/cadastroalunos";  
        String user = "root";
        String password = "";

        String sql = "DELETE FROM alunos WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Aluno deletado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar aluno" + e.getMessage());
        }
    }
}
