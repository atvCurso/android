package pck_principal;

public class Produto {
    private int cd_produto;
    private String ds_produto;
    private double vl_produto;
    private double qt_produto;
    private int cd_unidade;

    public Produto(int cd_produto, String ds_produto, double vl_produto, double qt_produto, int cd_unidade) {
        this.setCd_produto(cd_produto);
        this.setDs_produto(ds_produto);
        this.setVl_produto(vl_produto);
        this.setQt_produto(qt_produto);
        this.setCd_unidade(cd_unidade);
    }
    
    public Produto(){
        
    }
    

    public int getCd_produto() {
        return cd_produto;
    }

    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

    public String getDs_produto() {
        return ds_produto;
    }

    public void setDs_produto(String ds_produto) {
        this.ds_produto = ds_produto;
    }

    public double getVl_produto() {
        return vl_produto;
    }

    public void setVl_produto(double vl_produto) {
        this.vl_produto = vl_produto;
    }

    public double getQt_produto() {
        return qt_produto;
    }

    public void setQt_produto(double qt_produto) {
        this.qt_produto = qt_produto;
    }

    public int getCd_unidade() {
        return cd_unidade;
    }

    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }
    
    public String toString(){
        return "Código: " + this.getCd_produto() +
               "\nProduto: "+ this.getDs_produto()+
               "\nValor: "+ this.getVl_produto() +
               "\nQuantidade: "+ this.getQt_produto()+
               "\nUnidade: "+ this.getCd_unidade();
    }
}
