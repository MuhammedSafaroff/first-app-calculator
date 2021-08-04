package com.muhammedsafaroff.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    double ex=Math.E,pii=Math.PI;
    double firstnum;
    double secondnum;
    double result;
    String operations;
    Button sil,siltek,bol,yeddi,sekkiz,doqquz,vur,dord,bes,alti,cix,bir,iki,uc,topla,sifir,noqte,beraber,faktorial,kokalti,faiz,modul,e,pi,minplus;
    TextView ekran,ekranyuxari;
    // reqem tiklamaq ucun
    private  void reqemler(final Button reqem, final TextView ekran1){
        reqem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ekran1.getText().equals(getString(R.string.xeta))){
                    ekran1.setText("");
                    String EnterNum = ekran1.getText().toString()+reqem.getText().toString();
                    ekran1.setText(EnterNum);
                }else{
                    String EnterNum = ekran1.getText().toString()+reqem.getText().toString();
                    ekran1.setText(EnterNum);
                }

            }
        });
    }
    //riyazi emeller
    private  void emeller(final Button emel, final TextView ekran2, final TextView ekran3, final String op, final String ekop) {
        emel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String yaz = ekran2.getText().toString();
                    firstnum = Double.parseDouble(yaz);
                    ekran2.setText("");
                    ekran3.setText((firstnum + ekop));
                    operations = op;
                }catch (Exception e){
                    ekran2.setText(getString(R.string.xeta));


                }

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sil = findViewById(R.id.sil);
        Button siltek =  findViewById(R.id.siltek);
        Button bol =  findViewById(R.id.bol);
        final Button yeddi =  findViewById(R.id.yeddi);
        yeddi.setText("7");
        final Button sekkiz =  findViewById(R.id.sekkiz);
        sekkiz.setText("8");
        final Button doqquz =  findViewById(R.id.doqquz);
        doqquz.setText("9");
        Button vur =  findViewById(R.id.vur);
        final Button dord =  findViewById(R.id.dord);
        dord.setText("4");
        final Button bes =  findViewById(R.id.bes);
        bes.setText("5");
        final Button alti =  findViewById(R.id.alti);
        alti.setText("6");
        Button cix =  findViewById(R.id.cix);
        final Button bir =  findViewById(R.id.bir);
        bir.setText("1");
        final Button iki =  findViewById(R.id.iki);
        iki.setText("2");
        final Button uc =  findViewById(R.id.uc);
        uc.setText("3");
        Button topla =  findViewById(R.id.topla);
        final Button sifir =  findViewById(R.id.sifir);
        sifir.setText("0");
        final Button noqte =  findViewById(R.id.noqte);
        noqte.setText(".");
        Button beraber =  findViewById(R.id.beraber);
        final TextView ekran = findViewById(R.id.ekran);
        ekran.setText("");
        final TextView ekranyuxari = findViewById(R.id.ekranyuxari);
        //teze
        Button faktorial =  findViewById(R.id.faktorial);
        Button kokalti =  findViewById(R.id.kokalti);
        Button faiz =  findViewById(R.id.faiz);
        Button modul =  findViewById(R.id.modul);
        Button e =  findViewById(R.id.e);
        Button pi=  findViewById(R.id.pi);
        Button minplus = findViewById(R.id.minplus);
        faktorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String yaz = ekran.getText().toString();
                    firstnum = Double.parseDouble(yaz);
                    ekran.setText("");
                    ekranyuxari.setText((firstnum+"!"));
                    int a=1;
                    for(int i=1;i<=firstnum;i++){
                        a=a*i;
                    }
                    ekran.setText(String.valueOf(a));
                }catch (Exception e){
                    ekran.setText(getString(R.string.xeta));


                }


            }
        });
        kokalti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String yaz = ekran.getText().toString();
                    firstnum = Double.parseDouble(yaz);
                    ekran.setText("");
                    ekranyuxari.setText(("√"+firstnum));
                    ekran.setText(String.valueOf(Math.sqrt(firstnum)));
                }catch (Exception e){
                    ekran.setText(getString(R.string.xeta));


                }



            }
        });
        faiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String yaz = ekran.getText().toString();
                    firstnum = Double.parseDouble(yaz);
                    ekran.setText("");
                    ekranyuxari.setText((firstnum+"%"));
                    ekran.setText(String.valueOf((firstnum/100)));
                }catch (Exception e){
                    ekran.setText(getString(R.string.xeta));


                }


            }
        });
        modul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String yaz = ekran.getText().toString();
                    firstnum = Double.parseDouble(yaz);
                    ekran.setText("");
                    ekranyuxari.setText(("| "+firstnum+" |"));
                    ekran.setText(String.valueOf(Math.abs(firstnum)));
                }catch (Exception e){
                    ekran.setText(getString(R.string.xeta));


                }


            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EnterNum = Double.toString(ex);
                ekran.setText(EnterNum);
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EnterNum = Double.toString(pii);
                ekran.setText(EnterNum);
            }
        });
        minplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String yaz = ekran.getText().toString();
                    firstnum = Double.parseDouble(yaz);

                    if(firstnum>0) firstnum = -firstnum;
                    else if(firstnum<0) firstnum = -firstnum;
                    ekran.setText(String.valueOf(firstnum));
                }catch (Exception e){
                    ekran.setText(getString(R.string.xeta));


                }

            }
        });
//asagi
        reqemler(bir,ekran);
        reqemler(iki,ekran);
        reqemler(uc,ekran);
        reqemler(dord,ekran);
        reqemler(bes,ekran);
        reqemler(alti,ekran);
        reqemler(yeddi,ekran);
        reqemler(sekkiz,ekran);
        reqemler(doqquz,ekran);
        reqemler(sifir,ekran);
        reqemler(noqte,ekran);
        //sil
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ekran.setText("");
                ekranyuxari.setText("");
            }
        });
        //tek sil
        siltek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = ekran.getText().length();
                int number = ekran.getText().length()-1;
                String store;

                if (length>0){
                    StringBuilder back = new StringBuilder(ekran.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    ekran.setText(store);
                }
            }
        });
        emeller(topla,ekran,ekranyuxari,"+","+");
        emeller(cix,ekran,ekranyuxari,"-","-");
        emeller(vur,ekran,ekranyuxari,"*","x");
        emeller(bol,ekran,ekranyuxari,"/","÷");
        //beraber
        beraber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String answer;
                    secondnum = Double.parseDouble(ekran.getText().toString());
                    switch (operations) {
                        case "+": {
                            result =firstnum + secondnum;
                            answer = String.valueOf(result);
                            ekran.setText(answer);
                            ekranyuxari.setText("");
                            break;
                        }
                        case "-": {
                            result =firstnum - secondnum;
                            answer = String.valueOf(result);
                            ekran.setText(answer);
                            ekranyuxari.setText("");
                            break;
                        }
                        case "*": {
                            result =firstnum * secondnum;
                            answer = String.valueOf(result);
                            ekran.setText(answer);
                            ekranyuxari.setText("");
                            break;
                        }
                        case "/":{
                            result = firstnum / secondnum;
                            answer = String.valueOf(result);
                            ekran.setText(answer);
                            ekranyuxari.setText("");
                            break;
                        }
                    }
                }catch (Exception e){
                    ekran.setText(getString(R.string.xeta));


            }}
        });
    }
}