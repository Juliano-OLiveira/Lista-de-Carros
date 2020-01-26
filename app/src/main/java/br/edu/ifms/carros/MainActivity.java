package br.edu.ifms.carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.edu.ifms.carros.util.CarroAdapter;
import br.edu.ifms.carros.util.Carros;

public class MainActivity extends AppCompatActivity {

    final public static String STATE_CARROS = "STATE_CARROS";

    ListView listView;
    Carros carros;
    Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.savedInstanceState = savedInstanceState;

        iniciarLista();
    }

    private void iniciarLista() {
        listView = findViewById(R.id.lista);

        iniciarDados();

        /* final ArrayAdapter arrayAdapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                carros
        ); */

        final CarroAdapter arrayAdapter = new CarroAdapter(this, carros);

        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("ItemClick",
                        String.format("%d-%s", i, carros.get(i)));
            }
        };
        listView.setOnItemClickListener(itemClickListener);

        AdapterView.OnItemLongClickListener itemLongClickListener = new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                carros.remove(i);
                arrayAdapter.notifyDataSetChanged();

                return true;
            }
        };
        listView.setOnItemLongClickListener(itemLongClickListener);
    }

    private void iniciarDados() {
        if (savedInstanceState == null) {
            carros = new Carros();
        } else {
            // carros = (Carros) savedInstanceState.getStringArrayList(STATE_CARROS);
            carros = (Carros) savedInstanceState.getSerializable(STATE_CARROS);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // outState.putStringArrayList(STATE_CARROS, carros);
        outState.putSerializable(STATE_CARROS, carros);
    }
}
