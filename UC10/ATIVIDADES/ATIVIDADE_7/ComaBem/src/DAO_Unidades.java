import java.sql.*;

public class DAO_Unidades {

    Conexao obj_conexao = new Conexao(); //instância da classe de conexão

    /*método responsavel por realizar a consulta de dados no banco na tabela de unidades*/
    public void consultar(){
        obj_conexao.conexao();//abertura da conexao com o banco.
        Statement stm = null; //interface para executar instruções SQL
        ResultSet rs = null; //Classe da API java para percorrer um datatable
        try { //bloco para realização caso não ocorram erros.
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from unidades");
            while (rs.next())//enquanto o ResultSet tiver dados ele realiza a impressão do codigo e descrição
                System.out.println(rs.getInt(1) +
                        "  " + rs.getString(2));
            obj_conexao.desconecta();
        } catch (SQLException se) { //bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }

    /*método responsavel por realizar a inserção de dados no banco na tabela de unidades*/
    public void inserir(Unidade u){
        obj_conexao.conexao();//abertura da conexao com o banco
        PreparedStatement pst = null; //interface para executar instruções SQL
        String sql = "INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (?,?)";
        try {//bloco para realização caso não ocorram erros.
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1, u.getCd_unidade());//passagem do primeiro parâmetro vinculado ao ? do SQL
            pst.setString(2, u.getDs_unidade());//passagem do segundo parâmetro vinculado ao ? do SQL
            pst.execute();
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }

    /*método responsavel por realizar a alteração de dados no banco na tabela de unidades*/
    public void alterar(Unidade u){
        obj_conexao.conexao();//abertura da conexao com o banco
        PreparedStatement pst = null;//interface para executar instruções SQL
        ResultSet rs = null;
        String sql = "UPDATE Unidades set ds_unidade=? WHERE cd_unidade=?";

        try {//bloco para realização caso não ocorram erros.
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setString(1, u.getDs_unidade());//passagem do primeiro parâmetro vinculado ao ? do SQL
            pst.setInt(2, u.getCd_unidade());//passagem do segundo parâmetro vinculado ao ? do SQL
            pst.execute();
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }

    /*método responsavel por realizar a exclusão de dados no banco na tabela de unidades*/
    public void excluir(int id){
        obj_conexao.conexao();//abertura da conexao com o banco
        PreparedStatement pst = null;//interface para executar instruções SQL
        String sql = "DELETE from Unidades  WHERE cd_unidade=?";

        try {//bloco para realização caso não ocorram erros.
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1, id);//passagem do primeiro parâmetro vinculado ao ? do SQL
            pst.execute();
            obj_conexao.desconecta();
        } catch (SQLException se) {//bloco para realização caso ocorram erros.
            se.printStackTrace();
        }
    }
}
