package br.edu.ifms.carros.util;

import java.util.ArrayList;

import br.edu.ifms.carros.R;

public class Carros extends ArrayList<Carro> {

    public Carros() {
        Carro carro;

        carro = new Carro(1, "Fiat", "Uno", 1999,
                R.drawable.uno,
                "https://img1.icarros.com/dbimg/galeriaimgmodelo/2/1812_1.png");
        add(carro);

        carro = new Carro(2, "Volkswagen", "Fusca", 1966,
                R.drawable.fusca,
                "https://img0.icarros.com/dbimg/imgmodelo/4/479_12.png");
        add(carro);

        carro = new Carro(3, "Volkswagen", "Brasilia", 1989,
                R.drawable.brasilia,
                "https://img0.icarros.com/dbimg/imgmodelo/4/793_9.png");
        add(carro);

        carro = new Carro(4, "Chevrolet", "Corsa", 1996,
                R.drawable.corsa,
                "https://img0.icarros.com/dbimg/imgmodelo/4/134_4.png");
        add(carro);

        carro = new Carro(5, "Ford", "Chevete", 1997,
                R.drawable.chevette,
                "https://www.webclassicos.com.br/wp-content/uploads/2018/01/Sem-t%C3%ADtulo-3-1024x645.png");
        add(carro);
    }

    public Carro getById(int id) {
        for (Carro carro : this) {
            if (carro.getId() == id) {
                return carro;
            }
        }

        return null;
    }
}



