package id.ac.umn.assigment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView display1;
    boolean tambah, kurang, kali, bagi;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonTambah, buttonKurang,
            buttonKali, buttonBagi, buttonCal, buttonBack, buttonCE, buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonTambah = (Button) findViewById(R.id.buttonPlus);
        buttonKurang = (Button) findViewById(R.id.buttonMinus);
        buttonKali = (Button) findViewById(R.id.buttonMultiple);
        buttonBagi = (Button) findViewById(R.id.buttonDiv);
        buttonBack = (Button) findViewById(R.id.buttonBACK);
        buttonCE = (Button) findViewById(R.id.buttonCE);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonCal = (Button) findViewById(R.id.buttonCal);
        display1 = (TextView) findViewById(R.id.display);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(display1.getText() + "0");
            }
        });

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display1.getText().length() != 0) {
                    input1 = Float.parseFloat(display1.getText() + "");
                    tambah = true;
                    display1.setText(null);
                }
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display1.getText().length() != 0) {
                    input1 = Float.parseFloat(display1.getText() + "");
                    kurang = true;
                    display1.setText(null);
                }
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display1.getText().length() != 0) {
                    input1 = Float.parseFloat(display1.getText() + "");
                    kali = true;
                    display1.setText(null);
                }
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display1.getText().length() != 0) {
                    input1 = Float.parseFloat(display1.getText() + "");
                    bagi = true;
                    display1.setText(null);
                }
            }
        });

        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tambah || kurang || kali || bagi) {
                    input2 = Float.parseFloat(display1.getText() + "");
                }

                if (tambah) {

                    display1.setText(input1 + input2 + "");
                    tambah = false;
                }

                if (kurang) {

                    display1.setText(input1 - input2 + "");
                    kurang = false;
                }

                if (kali) {
                    display1.setText(input1 * input2 + "");
                    kali = false;
                }

                if (bagi) {
                    display1.setText(input1 / input2 + "");
                    bagi = false;
                }
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });
    }
}