import java.sql.*;

public class DAO_Produtos {

    Conexao obj_conexao = new Conexao();//instância da classe de conexão

    /*método responsavel por realizar a consulta de dados no banco na tabela de produtos*/
    public void consultar(){
        obj_conexao.conexao();//abertura da conexao com o banco.
        Statement stm = null;//interface para executar instruções SQL
        ResultSet rs = null;//Classe da API java para percorrer um datatable
        try {//bloco para realização caso não ocorram erros.
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from produtos");
            while (rs.next())//enquanto o ResultSet tiver dados ele realiza a impressão dos dados da tabela produtos.
                System.out.println(rs.getInt(1) +
                        "  " + rs.getString(2) +
                        "  " + rs.getDouble(3) +
                        "  " + rs.getDouble(4) +
                        "  " + rs.getInt(5));
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }

    public void inserir(Produto p){
        obj_conexao.conexao();//abertura da conexao com o banco
        PreparedStatement pst = null;//interface para executar instruções SQL
        String sql = "INSERT INTO Produtos (cd_produto, ds_produto, vl_produto, qt_produto, cd_unidade) VALUES (?,?,?,?,?)";
        try {//bloco para realização caso não ocorram erros.
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1, p.getCd_produto());
            pst.setString(2, p.getDs_produto());
            pst.setDouble(3, p.getVl_produto());
            pst.setDouble(4, p.getQt_produto());
            pst.setInt(5, p.getCd_unidade());
            pst.execute();
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }

    public void alterar(Produto p){
        obj_conexao.conexao();//abertura da conexao com o banco
        PreparedStatement pst = null;//interface para executar instruções SQL
        ResultSet rs = null;//Classe da API java para percorrer um datatable
        String sql = "UPDATE Produtos set ds_produto=?, vl_produto=?, qt_produto=?, cd_unidade=? WHERE cd_produto=?";

        try {//bloco para realização caso não ocorram erros.
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setString(1, p.getDs_produto());
            pst.setDouble(2, p.getVl_produto());
            pst.setDouble(3, p.getQt_produto());
            pst.setInt(4, p.getCd_unidade());
            pst.setInt(5, p.getCd_produto());
            pst.execute();
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }

    public void excluir(int id){
        obj_conexao.conexao();//abertura da conexao com o banco
        PreparedStatement pst = null;//interface para executar instruções SQL
        String sql = "DELETE from Produtos  WHERE cd_produto=?";

        try {//bloco para realização caso não ocorram erros.
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }
}