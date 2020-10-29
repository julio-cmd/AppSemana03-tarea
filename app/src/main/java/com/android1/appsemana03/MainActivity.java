package com.android1.appsemana03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mBuscar:
                Toast.makeText(this,"Pantalla Buscar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mAcercade:
                Toast.makeText(this,"Pantalla Acerca de", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mSalir:
                finish();
                return true;
            case R.id.mCompartir:
                Intent paramView;
                paramView = new Intent("android.intent.action.SEND");
                paramView.setType("text/plain");
                paramView.putExtra("android.intent.extra.TEXT", "Descarga nuestra app de la PlayStore" +
                        " \n" + "https://play.google.com/store/apps/details?id=app.miempresa.ecommerce");
                startActivity(Intent.createChooser(paramView, "Comparte Nuestro aplicativo"));
                return true;
            case R.id.mFormulario:
                startActivity(new Intent(this, Formulario.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
