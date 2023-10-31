package com.example.calendiarioavvento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public class ShowElement extends AppCompatActivity {

    private int day_clicked;
    private ImageView hidden_img;
    private TextView hidden_text, number_day;
    ImageButton back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_element);
        getSupportActionBar().hide();

        // Receiving activity
        Bundle extras = getIntent().getExtras();
        day_clicked = extras.getInt("key");

        hidden_img = findViewById(R.id.hidden_img);
        hidden_text = findViewById(R.id.hidden_text);
        back_arrow = findViewById(R.id.back_arrow);
        number_day = findViewById(R.id.number_day);
        number_day.setText(day_clicked+"");

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowElement.this, CalendarComplete.class));
            }
        });

        switch (day_clicked) {
            case 1:
                hidden_img.setImageResource(R.drawable.hidden_img1);
                hidden_text.setText(R.string.d_1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    CalendarComplete.calendar_img1.setImageResource(R.drawable.hidden_img1);}
                }, 1000);
                break;
            case 2:
                hidden_img.setImageResource(R.drawable.f_1);
                hidden_text.setText("Io che ti abbraccio");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img2.setImageResource(R.drawable.f_1);}
                }, 1000);
                break;
            case 3:
                hidden_img.setImageResource(R.drawable.s_1);
                hidden_text.setText("Guarda che carini, roumd");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img3.setImageResource(R.drawable.s_1);}
                }, 1000);
                break;
            case 4:
                hidden_img.setImageResource(R.drawable.mb_1);
                hidden_text.setText("BANANACHI");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img4.setImageResource(R.drawable.mb_1);}
                }, 1000);
                break;
            case 5:
                hidden_img.setImageResource(R.drawable.p_f1);
                hidden_text.setText("Sono carini \n comunque ti amo tanto");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img5.setImageResource(R.drawable.p_f1);}
                }, 1000);
                break;
            case 6:
                hidden_img.setImageResource(R.drawable.t_3);
                hidden_text.setText("TREEKO");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img6.setImageResource(R.drawable.t_3);}
                }, 1000);
                break;
            case 7:
                hidden_img.setImageResource(R.drawable.s_2);
                hidden_text.setText("Noi in futuro, quindi vedi di essere felice");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img7.setImageResource(R.drawable.s_2);}
                }, 1000);
                break;
            case 8:
                ViewSwitcher hidden_img_switcher = findViewById(R.id.hidden_img_switcher);
                hidden_img_switcher.showNext();
                hidden_img.setImageResource(R.drawable.mb_2);
                hidden_text.setText("Party (sono riuscire a far funzionare una gif, incredibile)");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img8.setImageResource(R.drawable.mb_2);}
                }, 1000);
                break;
            case 9:
                hidden_img.setImageResource(R.drawable.gen_2);
                hidden_text.setText("Noi pt2");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img9.setImageResource(R.drawable.gen_2);}
                }, 1000);
                break;
            case 10:
                hidden_img.setImageResource(R.drawable.t_2);
                hidden_text.setText("TREEKO, Il ritorno, \n in tutti i cinema dal 20 aprile 2023");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img10.setImageResource(R.drawable.t_2);}
                }, 1000);
                break;
            case 11:
                hidden_img.setImageResource(R.drawable.f_3);
                hidden_text.setText("Mpfh, non potevo non aggiungere edy un giorno");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img11.setImageResource(R.drawable.f_3);}
                }, 1000);
                break;
            case 12:
                hidden_img.setImageResource(R.drawable.gen_4);
                hidden_text.setText("Se questi non siamo noi allora non so chi siamo");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img12.setImageResource(R.drawable.gen_4);}
                }, 1000);
                break;
            case 13:
                hidden_img.setImageResource(R.drawable.mb_meme_1);
                hidden_text.setText("Advent's meme");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img13.setImageResource(R.drawable.mb_meme_1);}
                }, 1000);
                break;
            case 14:
                hidden_img.setImageResource(R.drawable.t_1);
                hidden_text.setText("TREEKO Rovina il natale \n in tutti i migliori cinema dal 2025");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img14.setImageResource(R.drawable.t_1);}
                }, 1000);
                break;
            case 15:
                hidden_img.setImageResource(R.drawable.gen_5);
                hidden_text.setText("Noi pt3");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img15.setImageResource(R.drawable.gen_5);}
                }, 1000);
                break;
            case 16:
                hidden_img.setImageResource(R.drawable.f_2);
                hidden_text.setText("Volevo inserire un'altra immagine di fe ma non trovavo nulla, poi ho visto questa immagina ed ho detto: sei tu");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img16.setImageResource(R.drawable.f_2);}
                }, 1000);
                break;
            case 17:
                hidden_img.setImageResource(R.drawable.gen_3);
                hidden_text.setText("Troppe immagini nostre scusa");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img17.setImageResource(R.drawable.gen_3);}
                }, 1000);
                break;
            case 18:
                hidden_img.setImageResource(R.drawable.t_4);
                hidden_text.setText("TREEKO felice al parco");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img18.setImageResource(R.drawable.t_4);}
                }, 1000);
                break;
            case 19:
                hidden_img.setImageResource(R.drawable.min_1);
                hidden_text.setText("Non sapevo se metterla però sono molto carini, spero ti piaccia");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img19.setImageResource(R.drawable.min_1);}
                }, 1000);
                break;
            case 20:
                hidden_img.setImageResource(R.drawable.gen_1);
                hidden_text.setText("Noi pt5 (Si avevo finito le immagini)");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img20.setImageResource(R.drawable.gen_1);}
                }, 1000);
                break;
            case 21:
                hidden_img.setImageResource(R.drawable.cb_1);
                hidden_text.setText("Per spezzare ho messo un cybercute");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img21.setImageResource(R.drawable.cb_1);}
                }, 1000);
                break;
            case 22:
                hidden_img.setImageResource(R.drawable.p_2);
                hidden_text.setText("Questa l'ho fatta io prendendo le varie immagini, sono troppo carini");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {


                CalendarComplete.calendar_img22.setImageResource(R.drawable.p_2);}
                }, 1000);
                break;
            case 23:
                hidden_img.setImageResource(R.drawable.n_1);
                hidden_text.setText("La nostra famiglia");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                CalendarComplete.calendar_img23.setImageResource(R.drawable.n_1);}
                }, 1000);
                break;
            case 24:
                hidden_img.setImageResource(R.drawable.last_photo);
                hidden_text.setText("Ultimo giorno, spero che ti sia piaciuta questa mini sorpresa");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        CalendarComplete.calendar_img24.setImageResource(R.drawable.last_photo);
                    }
                }, 1000);
                break;
        }
    }
}