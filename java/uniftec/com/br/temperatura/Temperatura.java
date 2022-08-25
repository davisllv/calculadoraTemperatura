package uniftec.com.br.temperatura;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Temperatura extends AppCompatActivity
{
    private EditText edtCelsius;
    private Button btnCalcular,btnLimpar;
    private TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
        edtCelsius=(EditText)findViewById(R.id.edtCelsius);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        btnLimpar=(Button) findViewById(R.id.btnLimpar);
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                float celsius,fahrenheit;
                try
                {
                    celsius=Float.parseFloat(edtCelsius.getText().toString());
                    fahrenheit=(float)((9 * celsius + 160) / 5);
                    txtResultado.setText("Resultado: " + fahrenheit + " Fahrenheit");
                }catch (Exception erro)
                {
                    Toast.makeText(Temperatura.this,"Você digitou um valor inválido",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtCelsius.setText("");
                txtResultado.setText("Resultado: ");
                edtCelsius.requestFocus();
            }
        });
    }
}
