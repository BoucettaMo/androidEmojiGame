package com.example.emojigamesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] L = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] I = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    String[] A = {"🐍", "🐭", "🐽", "🐒", "🐗", "🦅", "🐞", "🐸", "🐬", "🦁", "🐯", "🦄",
            "🐍", "🐭", "🐽", "🐒", "🐗", "🦅", "🐞", "🐸", "🐬", "🦁", "🐯", "🦄"};
    String[] S = {"💻", "🖨", "⏰", "🔌", "💿", "💎", "☎️", "📸", "🛢", "⏱", "📷", "🔦", "💻",
            "🖨", "⏰", "🔌", "💿", "💎", "☎️", "📸", "🛢", "⏱", "📷", "🔦"};
    String[] F = {"🇦🇱", "🇦🇩", "🇧🇬", "🇦🇶", "🇧🇿", "🏁", "🇧🇶", "🇨🇨", "🇦🇷", "🇨🇰", "🇨🇦", "🇨🇮", "🇦🇱", "🇦🇩",
            "🇧🇬", "🇦🇶", "🇧🇿", "🏁", "🇧🇶", "🇨🇨", "🇦🇷", "🇨🇰", "🇨🇦", "🇨🇮"};
    private Button btnone;
    private Button btntwo;
    private Button btnthree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;
    private Button btnseven;
    private Button btneight;
    private Button btnnine;
    private Button btnten;
    private Button btneleven;
    private Button btntwelve;
    private Button btnthirten;
    private Button btnfourten;
    private Button btnfiften;
    private Button btnsixten;
    private Button btnseventen;
    private Button btneighten;
    private Button btnnineten;
    private Button btntwenty;
    private Button btntwentyone;
    private Button btntwentytwo;
    private Button btntwentythree;
    private Button btntwentyfour;
    private Button btnnewgame;
    private RadioButton animals;
    private RadioButton symbols;
    private RadioButton flags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnone = findViewById(R.id.one);
        btntwo = findViewById(R.id.two);
        btnthree = findViewById(R.id.three);
        btnfour = findViewById(R.id.four);
        btnfive = findViewById(R.id.five);
        btnsix = findViewById(R.id.six);
        btnseven = findViewById(R.id.seven);
        btneight = findViewById(R.id.eight);
        btnnine = findViewById(R.id.nine);
        btnten = findViewById(R.id.ten);
        btneleven = findViewById(R.id.eleven);
        btntwelve = findViewById(R.id.twelve);
        btnthirten = findViewById(R.id.thirten);
        btnfourten = findViewById(R.id.fourten);
        btnfiften = findViewById(R.id.fiften);
        btnsixten = findViewById(R.id.sixten);
        btnseventen = findViewById(R.id.seventen);
        btneighten = findViewById(R.id.eighten);
        btnnineten = findViewById(R.id.nineten);
        btntwenty = findViewById(R.id.twenty);
        btntwentyone = findViewById(R.id.twentyone);
        btntwentytwo = findViewById(R.id.twentytwo);
        btntwentythree = findViewById(R.id.twentythree);
        btntwentyfour = findViewById(R.id.twentyfour);
        btnnewgame = findViewById(R.id.newgame);
        animals = findViewById(R.id.animals);
        symbols = findViewById(R.id.symbols);
        flags = findViewById(R.id.flags);


        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);
        btnthree.setOnClickListener(this);
        btnfour.setOnClickListener(this);
        btnfive.setOnClickListener(this);
        btnsix.setOnClickListener(this);
        btnseven.setOnClickListener(this);
        btneight.setOnClickListener(this);
        btnnine.setOnClickListener(this);
        btnten.setOnClickListener(this);
        btneleven.setOnClickListener(this);
        btntwelve.setOnClickListener(this);
        btnthirten.setOnClickListener(this);
        btnfourten.setOnClickListener(this);
        btnfiften.setOnClickListener(this);
        btnsixten.setOnClickListener(this);
        btnseventen.setOnClickListener(this);
        btneighten.setOnClickListener(this);
        btnnineten.setOnClickListener(this);
        btntwenty.setOnClickListener(this);
        btntwentyone.setOnClickListener(this);
        btntwentytwo.setOnClickListener(this);
        btntwentythree.setOnClickListener(this);
        btntwentyfour.setOnClickListener(this);
        btnnewgame.setOnClickListener(this);

        CompoundButton.OnCheckedChangeListener myhandler = new RadioButton.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                switch (buttonView.getId()) {

                    case R.id.animals:

                        if (isChecked) {
                            Collections.shuffle(Arrays.asList(A));
                            L = A;
                        } else {
                            L = I;

                        }
                        break;
                    case R.id.symbols:

                        if (isChecked) {
                            Collections.shuffle(Arrays.asList(A));
                            L = S;
                        } else {
                            L = I;

                        }
                        break;
                    case R.id.flags:

                        if (isChecked) {
                            Collections.shuffle(Arrays.asList(A));
                            L = F;
                        } else {
                            L = I;

                        }
                        break;
                }
            }
        };


        animals.setOnCheckedChangeListener(myhandler);
        symbols.setOnCheckedChangeListener(myhandler);
        flags.setOnCheckedChangeListener(myhandler);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.one:

                if (btnone.getText().toString().equals("")) {
                    btnone.setText(L[0]);
                } else {
                    btnone.setText("");
                }
                break;
            case R.id.two:

                if (btntwo.getText().toString().equals("")) {
                    btntwo.setText(L[1]);
                } else {
                    btntwo.setText("");
                }
                break;
            case R.id.three:

                if (btnthree.getText().toString().equals("")) {
                    btnthree.setText(L[2]);
                } else {
                    btnthree.setText("");
                }
                break;
            case R.id.four:

                if (btnfour.getText().toString().equals("")) {
                    btnfour.setText(L[3]);
                } else {
                    btnfour.setText("");
                }
                break;
            case R.id.five:

                if (btnfive.getText().toString().equals("")) {
                    btnfive.setText(L[4]);
                } else {
                    btnfive.setText("");
                }
                break;
            case R.id.six:

                if (btnsix.getText().toString().equals("")) {
                    btnsix.setText(L[5]);
                } else {
                    btnsix.setText("");
                }
                break;
            case R.id.seven:

                if (btnseven.getText().toString().equals("")) {
                    btnseven.setText(L[6]);
                } else {
                    btnseven.setText("");
                }
                break;
            case R.id.eight:

                if (btneight.getText().toString().equals("")) {
                    btneight.setText(L[7]);
                } else {
                    btneight.setText("");
                }
                break;
            case R.id.nine:

                if (btnnine.getText().toString().equals("")) {
                    btnnine.setText(L[8]);
                } else {
                    btnnine.setText("");
                }
                break;
            case R.id.ten:

                if (btnten.getText().toString().equals("")) {
                    btnten.setText(L[9]);
                } else {
                    btnten.setText("");
                }
                break;
            case R.id.eleven:

                if (btneleven.getText().toString().equals("")) {
                    btneleven.setText(L[10]);
                } else {
                    btneleven.setText("");
                }
                break;
            case R.id.twelve:

                if (btntwelve.getText().toString().equals("")) {
                    btntwelve.setText(L[11]);
                } else {
                    btntwelve.setText("");
                }
                break;
            case R.id.thirten:

                if (btnthirten.getText().toString().equals("")) {
                    btnthirten.setText(L[12]);
                } else {
                    btnthirten.setText("");
                }
                break;
            case R.id.fourten:

                if (btnfourten.getText().toString().equals("")) {
                    btnfourten.setText(L[13]);
                } else {
                    btnfourten.setText("");
                }
                break;
            case R.id.fiften:

                if (btnfiften.getText().toString().equals("")) {
                    btnfiften.setText(L[14]);
                } else {
                    btnfiften.setText("");
                }
                break;

            case R.id.sixten:

                if (btnsixten.getText().toString().equals("")) {
                    btnsixten.setText(L[15]);
                } else {
                    btnsixten.setText("");
                }
                break;
            case R.id.seventen:

                if (btnseventen.getText().toString().equals("")) {
                    btnseventen.setText(L[16]);
                } else {
                    btnseventen.setText("");
                }
                break;
            case R.id.eighten:

                if (btneighten.getText().toString().equals("")) {
                    btneighten.setText(L[17]);
                } else {
                    btneighten.setText("");
                }
                break;
            case R.id.nineten:

                if (btnnineten.getText().toString().equals("")) {
                    btnnineten.setText(L[18]);
                } else {
                    btnnineten.setText("");
                }
                break;
            case R.id.twenty:

                if (btntwenty.getText().toString().equals("")) {
                    btntwenty.setText(L[19]);
                } else {
                    btntwenty.setText("");
                }
                break;
            case R.id.twentyone:

                if (btntwentyone.getText().toString().equals("")) {
                    btntwentyone.setText(L[20]);
                } else {
                    btntwentyone.setText("");
                }
                break;
            case R.id.twentytwo:

                if (btntwentytwo.getText().toString().equals("")) {
                    btntwentytwo.setText(L[21]);
                } else {
                    btntwentytwo.setText("");
                }
                break;
            case R.id.twentythree:

                if (btntwentythree.getText().toString().equals("")) {
                    btntwentythree.setText(L[22]);
                } else {
                    btntwentythree.setText("");
                }
                break;
            case R.id.twentyfour:

                if (btntwentyfour.getText().toString().equals("")) {
                    btntwentyfour.setText(L[23]);
                } else {
                    btntwentyfour.setText("");
                }
                break;
            case R.id.newgame:
                animals.setChecked(false);
                flags.setChecked(false);
                symbols.setChecked(false);
                // Collections.shuffle(Arrays.asList(L));
                btnone.setText("");
                btntwo.setText("");
                btnthree.setText("");
                btnfour.setText("");
                btnfive.setText("");
                btnsix.setText("");
                btnseven.setText("");
                btneight.setText("");
                btnnine.setText("");
                btnten.setText("");
                btntwelve.setText("");
                btneleven.setText("");
                btnthirten.setText("");
                btnfourten.setText("");
                btnfiften.setText("");
                btnsixten.setText("");
                btnseventen.setText("");
                btneighten.setText("");
                btnnineten.setText("");
                btntwenty.setText("");
                btntwentyone.setText("");
                btntwentytwo.setText("");
                btntwentythree.setText("");
                btntwentyfour.setText("");
                break;


        }
    }

}