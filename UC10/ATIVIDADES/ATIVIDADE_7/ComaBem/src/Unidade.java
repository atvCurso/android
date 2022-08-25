public class Unidade {
    private int cd_unidade;
    private String ds_unidade;

    /*Método construtor que recebe o código da unidade e descrição da unidade como argumento e realiza a
    inserção de seus valores através dos respectivos métodos sets*/
    public Unidade(int cd_unidade, String ds_unidade) {
        this.setCd_unidade(cd_unidade);
        this.setDs_unidade(ds_unidade);
    }

    /*Método construtor vazio, criado para permitir que a classe seja instanciada sem a passagem de argumentos*/
    public Unidade(){

    }

    /*método get para permitir o acesso ao atributo de código da unidade*/
    public int getCd_unidade() {
        return cd_unidade;
    }

    /*método set para permitir a inserção de valores no atributo de código da unidade*/
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }

    /*método get para permitir o acesso ao atributo de descrição da unidade*/
    public String getDs_unidade() {
        return ds_unidade;
    }

    /*método set para permitir a inserção de valores no atributo de inserção da unidade*/
    public void setDs_unidade(String ds_unidade) {
        this.ds_unidade = ds_unidade;
    }
}
