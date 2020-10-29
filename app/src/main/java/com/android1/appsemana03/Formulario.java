package com.android1.appsemana03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    EditText txtNom, txtApe, txtDni, txtCiu,txtDir,txtCel;
    Button btnIngresar;
    Toast tstAlerta;
    String nom="",ape="",dni="", ciu="",dir="",cel="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        txtNom = findViewById(R.id.txtNom);
        txtApe = findViewById(R.id.txtApe);
        txtDni = findViewById(R.id.txtDni);
        txtCiu = findViewById(R.id.txtCiu);
        txtDir = findViewById(R.id.txtDir);
        txtCel = findViewById(R.id.txtCel);
        btnIngresar = findViewById(R.id.btnRegistrar);
        txtNom.setEnabled(true);
        txtApe.setEnabled(true);
        txtDni.setEnabled(true);
        txtCiu.setEnabled(true);
        txtDir.setEnabled(true);
        txtCel.setEnabled(true);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (!validarNombre() || !validarApellido() || !validarDni() || !validarCelular() || !validarDireccion() || !validarCiudad())
                {
                    tstAlerta=Toast.makeText(getApplicationContext(),"Datos incompletos",Toast.LENGTH_SHORT);
                    tstAlerta.show();
                }
                else
                {
                    tstAlerta=Toast.makeText(getApplicationContext(),"Datos enviados correctamente",Toast.LENGTH_SHORT);
                    tstAlerta.show();
                }
            }
        });

    }
    public boolean validarNombre() {
        nom = txtNom.getText().toString();
        if (nom.isEmpty())
        {
            txtNom.setError("El campo no debe estar vacio");
            return false;
        }
        else
        {
            txtNom.setError(null);
            return true;
        }
    }
    public boolean validarApellido() {
        ape = txtApe.getText().toString();
        if (ape.isEmpty())
        {
            txtApe.setError("El campo no debe estar vacio");
            return false;
        }
        else
        {
            txtApe.setError(null);
            return true;
        }
    }
    public boolean validarDni() {
        dni = txtDni.getText().toString();
        if (dni.isEmpty())
        {
            txtDni.setError("El campo no debe estar vacio");
            return false;
        }
        else
        {
            txtDni.setError(null);
            return true;
        }
    }
    public boolean validarCelular() {
        cel = txtCel.getText().toString();
        if (cel.isEmpty())
        {
            txtCel.setError("El campo no debe estar vacio");
            return false;
        }
        else
        {
            txtCel.setError(null);
            return true;
        }
    }
    public boolean validarDireccion() {
        dir = txtDir.getText().toString();
        if (dir.isEmpty())
        {
            txtDir.setError("El campo no debe estar vacio");
            return false;
        }
        else
        {
            txtDir.setError(null);
            return true;
        }
    }
    public boolean validarCiudad() {
        ciu = txtCiu.getText().toString();
        if (ciu.isEmpty())
        {
            txtCiu.setError("El campo no debe estar vacio");
            return false;
        }
        else
        {
            txtCiu.setError(null);
            return true;
        }
    }
}