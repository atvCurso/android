package pck_principal;

public class Principal {
    public static void main(String[] args) {
        DAO_Unidades obj_unidades = new DAO_Unidades();
        DAO_Produtos obj_produtos = new DAO_Produtos();
        /*CONSULTAR UNIDADES
        obj_unidades.consultar();
        */
        /*INSERIR UNIDADES
        Unidade novaUnidade = new Unidade(6,"unidade");
        obj_unidades.inserir(novaUnidade);
        */
        /*ALTERAR UNIDADES
        Unidade unidadeAlterada = new Unidade(6,"unidade alterada");
        obj_unidades.alterar(unidadeAlterada); 
        */
        /*EXCLUIR UNIDADES
        obj_unidades.excluir(6);
        */
        /*CONSULTAR PRODUTOS
        obj_produtos.consultar();
        */
        /*INSERIR PRODUTOS
        Produto novoProduto = new Produto(6,"Pera", 30.00, 10.0,2);
        obj_produtos.inserir(novoProduto);
        */
        /*ALTERAR PRODUTOS
        Produto produtoAlterado = new Produto(6,"Pera alterada", 25.00, 5.0,3);
        obj_produtos.alterar(produtoAlterado); 
        */
        /*EXCLUIR PRODUTOS
        obj_produtos.excluir(6);
        */  
    }
}
