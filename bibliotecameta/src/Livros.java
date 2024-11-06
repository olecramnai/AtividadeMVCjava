import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Livros {
    private int id;
    private String autor;
    private String titulo;
    private int ano_publicacao;

    public Livros(String titulo, String autor, int ano_publicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano_publicacao = ano_publicacao;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public static void salvarLivro(Livros livros) {
        String url = "jdbc:mysql://localhost:3306/bibliotecameta"; 
        String user = "root"; 
        String password = ""; 

        String sql = "INSERT INTO livros (autor, titulo, ano_publicacao) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, livros.getAutor());
            pstmt.setString(2, livros.getTitulo());
            pstmt.setInt(3, livros.getAno_publicacao());
            pstmt.executeUpdate();
            System.out.println("Livro inserido com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir Livro: " + e.getMessage());
        }
    }

    public static void listarlivros() {
        String url = "jdbc:mysql://localhost:3306/bibliotecameta";
        String user = "root";
        String password = "";

        String sql = "SELECT * FROM livros";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Autor: " + rs.getString("autor"));
                System.out.println("TÍtulo: " + rs.getString("titulo"));
                System.out.println("Ano publicação: " + rs.getInt("ano_publicacao"));
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar livros: " + e.getMessage());
        }
    }

    public static void atualizarLivro(int id, String autor, String titulo, int ano_publicacao) {
        String url = "jdbc:mysql://localhost:3306/bibliotecameta";
        String user = "root";
        String password = "";

        String sql = " UPDATE livros SET titulo = ?, autor = ?, ano_publicacao = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, titulo);
            pstmt.setString(2, autor);
            pstmt.setInt(3, ano_publicacao);
            pstmt.setInt(4, id);

            //System.out.println("Livro atualizado com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar livro" + e.getMessage());
        }
    }

    public static void deletarLivro(int id) {
        String url = "jdbc:mysql://localhost:3306/bibliotecameta";
        String user = "root";
        String password = "";

        String sql = "DELETE FROM livros WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Livro deletada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar livro" + e.getMessage());
        }
    }
}
