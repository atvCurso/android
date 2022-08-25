import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*classe que realiza a conexao com o banco de dados*/
public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/comabem";//endereço do banco de dados
    private String usuario = "root"; //usuario do banco de dados
    private String senha = "vip12345"; //senha do usuario do banco de dados
    public Connection conn; //atributo para conexão


    public void conexao() //método para abrir a conexão com o banco de dados
    {
        try//bloco para realização caso não ocorram erros.
        {
            conn=DriverManager.getConnection(caminho,usuario,senha);
            System.out.println("CONECTADO COM SUCESSO!!!");
        }
        catch (SQLException ex)//bloco para realização caso ocorram erros.
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO DE CONEXAO!!!");
        }
    }

    public void desconecta() //método para fechar a conexão com o banco de dados
    {
        try //bloco para realização caso não ocorram erros.
        {
            conn.close();
            System.out.println("DESCONECTADO COM SUCESSO!!!");
        }
        catch (SQLException ex) //bloco para realização caso ocorram erros.
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO AO FECHAR CONEXAO!!!");
        }

    }

    //método main apenas para executar a classe isoladamente e testar a conexao.
    public static void main(String[] args) {
        Conexao obj_conexao = new Conexao();
        obj_conexao.conexao();

    }
}
