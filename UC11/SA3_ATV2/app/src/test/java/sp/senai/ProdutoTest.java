package sp.senai;

import junit.framework.TestCase;

public class ProdutoTest extends TestCase {

    public void testSetNome(){
        Produto p = new Produto();
        boolean resultado = p.setNome("Joao");
        assertEquals(true,resultado);
    }

    public void testSetQuantidade(){
        Produto p = new Produto();
        boolean resultado = p.setQuantidade(-1);
        assertEquals(true,resultado);
    }

    public void testSetPreco(){
        Produto p = new Produto();
        boolean resultado = p.setPreco(1);
        assertEquals(true,resultado);
    }
}
