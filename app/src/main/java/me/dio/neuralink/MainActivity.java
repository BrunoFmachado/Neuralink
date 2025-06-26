package me.dio.neuralink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import me.dio.frasesdodia.R;

public class MainActivity extends AppCompatActivity {

    private final String[] frases = {
            "A vida é 10% o que acontece com você e 90% como você reage.",
            "Comece onde você está. Use o que você tem. Faça o que puder.",
            "A persistência realiza o impossível.",
            "Você é mais forte do que imagina. Acredite.",
            "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
            "Grandes coisas nunca vêm da zona de conforto.",
            "A felicidade não é algo pronto. Ela vem das suas próprias ações.",
            "Nunca é tarde demais para recomeçar.",
            "Não coloque limites nos seus sonhos, coloque fé.",
            "Acredite em você e tudo será possível.",
            "Seja a mudança que você quer ver no mundo.",
            "O sucesso é a soma de pequenos esforços repetidos todos os dias.",
            "Sorria, respire fundo e vá com fé.",
            "Confie no tempo de Deus.",
            "Cada dia é uma nova chance para recomeçar.",
            "Desistir não é uma opção para quem quer vencer.",
            "Você não precisa ser perfeito, apenas constante.",
            "Transforme suas dores em sabedoria.",
            "A jornada é tão importante quanto o destino.",
            "Foque no que te faz bem."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GerarNovaFrase(View view) {
        int numero = new Random().nextInt(frases.length);
        TextView texto = findViewById(R.id.textresultado);
        texto.setText(frases[numero]);
    }
}
