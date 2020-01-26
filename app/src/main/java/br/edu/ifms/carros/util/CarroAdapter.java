package br.edu.ifms.carros.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import br.edu.ifms.carros.R;

public class CarroAdapter extends BaseAdapter {

    private Activity activity;
    private Carros carros;

    public CarroAdapter(Activity activity, Carros carros) {
        this.activity = activity;
        this.carros = carros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int i) {
        return carros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Carro carro = (Carro) getItem(i);

        View v = activity.getLayoutInflater()
                .inflate(R.layout.carro, viewGroup, false);

        TextView tvModelo = v.findViewById(R.id.tvModelo);
        tvModelo.setText(carro.getModelo());

        TextView tvMarca = v.findViewById(R.id.tvMarca);
        tvMarca.setText(carro.getMarca());

        TextView tvAno = v.findViewById(R.id.tvAno);
        tvAno.setText(String.valueOf(carro.getAno()));

        ImageView ivFoto = v.findViewById(R.id.ivFoto);

        // Imagem local
        // ivFoto.setImageResource(carro.getFoto());

        // Imagem da internet
        new ImageAsyncTask(ivFoto).execute(carro.getUrlFoto());

        return v;
    }
}
