public class Produto {
    private int cd_produto;
    private String ds_produto;
    private double vl_produto;
    private double qt_produto;
    private int cd_unidade;

    /*Método construtor que recebe o código do produto, descrição do produto, valor do produto e código da
    * unidade como argumento e realiza a inserção de seus valores através dos respectivos métodos sets*/
    public Produto(int cd_produto, String ds_produto, double vl_produto, double qt_produto, int cd_unidade) {
        this.setCd_produto(cd_produto);
        this.setDs_produto(ds_produto);
        this.setVl_produto(vl_produto);
        this.setQt_produto(qt_produto);
        this.setCd_unidade(cd_unidade);
    }

    /*Método construtor vazio, criado para permitir que a classe seja instanciada sem a passagem de argumentos*/
    public Produto(){

    }

    /*método get para permitir o acesso ao atributo de código do produto*/
    public int getCd_produto() {
        return cd_produto;
    }

    /*método set para permitir a inserção de valores no atributo de código do produto*/
    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

    /*método get para permitir o acesso ao atributo de descrição do produto*/
    public String getDs_produto() {
        return ds_produto;
    }

    /*método set para permitir a inserção de valores no atributo de descrição do produto*/
    public void setDs_produto(String ds_produto) {
        this.ds_produto = ds_produto;
    }

    /*método get para permitir o acesso ao atributo de valor do produto*/
    public double getVl_produto() {
        return vl_produto;
    }

    /*método set para permitir a inserção de valores no atributo de valor do produto*/
    public void setVl_produto(double vl_produto) {
        this.vl_produto = vl_produto;
    }

    /*método get para permitir o acesso ao atributo de quantidade do produto*/
    public double getQt_produto() {
        return qt_produto;
    }

    /*método set para permitir a inserção de valores no atributo de quantidade do produto*/
    public void setQt_produto(double qt_produto) {
        this.qt_produto = qt_produto;
    }

    /*método get para permitir o acesso ao atributo de código da unidade*/
    public int getCd_unidade() {
        return cd_unidade;
    }

    /*método set para permitir a inserção de valores no atributo de código da unidade*/
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }
}
