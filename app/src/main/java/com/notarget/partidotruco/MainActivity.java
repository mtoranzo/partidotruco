package com.notarget.partidotruco;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreNos = 0;
    int scoreEll = 0;

    Button btNosPlus;
    Button btNosMinus;
    TextView tvNosScore;
    Button btNosEnvido;
    Button btNosRealEnvido;
    Button btNosFaltaEnvido;
    Button btNosTruco;
    Button btNosReTruco;
    Button btNosValeCuatro;
    Button btNosPunto;

    Button btEllPlus;
    Button btEllMinus;
    TextView tvEllScore;
    Button btEllEnvido;
    Button btEllRealEnvido;
    Button btEllFaltaEnvido;
    Button btEllTruco;
    Button btEllReTruco;
    Button btEllValeCuatro;
    Button btEllPunto;

    Button btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNosPlus = (Button) findViewById(R.id.bt_nos_plus);
        btNosMinus = (Button) findViewById(R.id.bt_nos_minus);
        tvNosScore = (TextView) findViewById(R.id.tv_nos_score);
        btNosEnvido = (Button) findViewById(R.id.bt_nos_envido);
        btNosRealEnvido = (Button) findViewById(R.id.bt_nos_real_envido);
        btNosFaltaEnvido = (Button) findViewById(R.id.bt_nos_falta_envido);
        btNosTruco = (Button) findViewById(R.id.bt_nos_truco);
        btNosReTruco = (Button) findViewById(R.id.bt_nos_re_truco);
        btNosValeCuatro = (Button) findViewById(R.id.bt_nos_vale_cuatro);
        btNosPunto = (Button) findViewById(R.id.bt_nos_punto);

        btEllPlus = (Button) findViewById(R.id.bt_ell_plus);
        btEllMinus = (Button) findViewById(R.id.bt_ell_minus);
        tvEllScore = (TextView) findViewById(R.id.tv_ell_score);
        btEllEnvido = (Button) findViewById(R.id.bt_ell_envido);
        btEllRealEnvido = (Button) findViewById(R.id.bt_ell_real_envido);
        btEllFaltaEnvido = (Button) findViewById(R.id.bt_ell_falta_envido);
        btEllTruco = (Button) findViewById(R.id.bt_ell_truco);
        btEllReTruco = (Button) findViewById(R.id.bt_ell_re_truco);
        btEllValeCuatro = (Button) findViewById(R.id.bt_ell_vale_cuatro);
        btEllPunto = (Button) findViewById(R.id.bt_ell_punto);

        btReset = (Button) findViewById(R.id.bt_reset);

        //region Funciones "Nosot@as"
        btNosPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(1);
            }
        });

        btNosMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(-1);
            }
        });

        btNosEnvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(2);
            }
        });

        btNosRealEnvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(3);
            }
        });

        btNosFaltaEnvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(30);
            }
        });

        btNosTruco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(2);
                ;
            }
        });

        btNosReTruco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(3);
            }
        });

        btNosValeCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(4);
            }
        });

        btNosPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNosScore(1);
            }
        });
        //endregion

        //region Funciones "Ell@s"
        btEllPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(1);
            }
        });

        btEllMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(-1);
            }
        });

        btEllEnvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(2);
            }
        });

        btEllRealEnvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(3);
            }
        });

        btEllFaltaEnvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(30);
            }
        });

        btEllTruco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(2);
                ;
            }
        });

        btEllReTruco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(3);
            }
        });

        btEllValeCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(4);
            }
        });

        btEllPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEllScore(1);
            }
        });
        //endregion

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validReset();
            }
        });
    }

    protected void setNosScore(int value) {
        scoreNos += value;
        if (scoreNos < 0)
            scoreNos = 0;

        if (scoreNos >= 30) {
            doAlert("Nosotr@s ganamos!");
            doReset();
            return;
        }

        tvNosScore.setText(Integer.toString(scoreNos));
    }

    protected void setEllScore(int value) {
        scoreEll += value;
        if (scoreEll < 0)
            scoreEll = 0;

        if (scoreEll >= 30) {
            doAlert("Ell@s ganaron!");
            doReset();
            return;
        }

        tvEllScore.setText(Integer.toString(scoreEll));
    }

    protected void validReset() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("Confirma reiniciar la partida?")
                .setPositiveButton("SI", dialogClickListener)
                .setNegativeButton("NO", dialogClickListener)
                .show();
    }

    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                case DialogInterface.BUTTON_POSITIVE:
                    doReset();
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    break;
            }
        }
    };

    protected void doReset() {
        scoreNos = 0;
        tvNosScore.setText(Integer.toString(scoreNos));

        scoreEll = 0;
        tvEllScore.setText(Integer.toString(scoreEll));
    }

    private void doAlert(String pMessage) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage(pMessage);
        alertDialog.show();
    }
}
