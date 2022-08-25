package sp.senai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private Button btnListar;
    ImageView imageViewFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        btnListar = findViewById(R.id.btnListar);

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroActivity.this, Listagem.class);
                startActivity(intent);
            }
        });

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA},0);
        }

        imageViewFoto = (ImageView) findViewById(R.id.imageViewProduto);
        findViewById(R.id.btnCamera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tirarFoto();
            }
        });
    }

    public void tirarFoto(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 1 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imagem = (Bitmap) extras.get("data");
            imageViewFoto.setImageBitmap(imagem);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void inserir(View view){
        EditText etNome = findViewById(R.id.editTextNome);
        String nome = etNome.getText().toString();
        EditText etQuantidade = findViewById(R.id.editTextQtde);
        int quantidade = Integer.parseInt(etQuantidade.getText().toString());
        EditText etPreco = findViewById(R.id.editTextPreco);
        double preco = Double.parseDouble(etPreco.getText().toString());
        Produto produto = new Produto(nome,quantidade,preco);
        ProdutoDAO dao;
        dao = new ProdutoDAO(this);
        long id = dao.inserir(produto);
        Toast.makeText(this,"Produto inserido com ID: "+id, Toast.LENGTH_SHORT).show();
    }

}