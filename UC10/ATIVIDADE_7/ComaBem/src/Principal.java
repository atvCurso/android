public class Principal {
    /*classe principal para executar as demais classes do projeto*/
    public static void main(String[] args) {//método principal do projeto
        DAO_Unidades obj_unidades = new DAO_Unidades();//instancia da classe DAO_Unidades
        DAO_Produtos obj_produtos = new DAO_Produtos();//instancia da classe DAO_Produtos
        /*CONSULTAR UNIDADES
        obj_unidades.consultar();//chamada ao método consultar
        */
        /*INSERIR UNIDADES
        Unidade novaUnidade = new Unidade(6,"unidade nova"); //instancia da classe Unidade passando parâmetros
        obj_unidades.inserir(novaUnidade); //chamada ao método inserir
        */
        /*ALTERAR UNIDADES
        Unidade unidadeAlterada = new Unidade(6,"unidade alterada");//instancia da classe Unidade passando parâmetros
        obj_unidades.alterar(unidadeAlterada);//chamada ao metodo alterar
        */
        /*EXCLUIR UNIDADES
        obj_unidades.excluir(6);//chamada ao método excluir
        */
        /*CONSULTAR PRODUTOS
        obj_produtos.consultar();//chamada ao método consultar
        */
        /*INSERIR PRODUTOS
        Produto novoProduto = new Produto(6,"Pera", 30.00, 10.0,2);//instancia da classe Produto passando parâmetros
        obj_produtos.inserir(novoProduto);//chamada ao método inserir
        */
        /*ALTERAR PRODUTOS
        Produto produtoAlterado = new Produto(6,"Pera alterada", 25.00, 5.0,3);//instancia da classe Produto passando parâmetros
        obj_produtos.alterar(produtoAlterado);//chamada ao método alterar
        */
        /*EXCLUIR PRODUTOS
        obj_produtos.excluir(6);//chamada ao método excluir
        */
    }
}