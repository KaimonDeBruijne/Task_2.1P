package kaimon.myapp.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button convertButton;
    Spinner fromSpinner, toSpinner;
    EditText input;
    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fromSpinner = findViewById(R.id.fromSpinner);
        toSpinner = findViewById(R.id.toSpinner);
        input = findViewById(R.id.numberInput);
        convertButton = findViewById(R.id.convertButton);
        outputText = findViewById(R.id.outputDisplay);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Units, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String from = fromSpinner.getSelectedItem().toString();
                String to = toSpinner.getSelectedItem().toString();
                double out;
                try {
                    String numberOfUnits = input.getText().toString();
                    double in = Double.parseDouble(numberOfUnits);

                    if (from.equals(to)) {
                        outputText.setText("Units are the same");
                    }
                    //Centimeter Bloc
                    if (from.equals("Centimeter")) {
                        if (to.equals("Kilometer")) {
                            out = in / 100000;
                            outputText.setText(String.format("%.5f", out) + " kilometers");
                        }
                        if (to.equals("Inch")) {
                            out = in / 2.54;
                            outputText.setText(String.format("%.5f", out) + " Inches");
                        }
                        if (to.equals("Foot")) {
                            out = in / 30.48;
                            outputText.setText(String.format("%.5f", out) + " Feet");
                        }
                        if (to.equals("Yard")) {
                            out = in / 91.44;
                            outputText.setText(String.format("%.5f", out) + " Yards");
                        }
                        if (to.equals("Mile")) {
                            out = in / 160934;
                            outputText.setText(String.format("%.5f", out) + " Miles");
                        }
                    }
                    //Kilometer Block
                    if (from.equals("Kilometer")) {
                        if (to.equals("Centimeter")) {
                            out = in * 100000;
                            outputText.setText(String.format("%.5f", out) + " Centimeters");
                        }
                        if (to.equals("Inch")) {
                            out = in * 3937;
                            outputText.setText(String.format("%.5f", out) + " Inches");
                        }
                        if (to.equals("Foot")) {
                            out = in * 3281;
                            outputText.setText(String.format("%.5f", out) + " Feet");
                        }
                        if (to.equals("Yard")) {
                            out = in * 1094;
                            outputText.setText(String.format("%.5f", out) + " Yards");
                        }
                        if (to.equals("Mile")) {
                            out = in / 1.852;
                            outputText.setText(String.format("%.5f", out) + " Miles");
                        }
                    }
                    //Inch Block
                    if (from.equals("Inch")) {
                        if (to.equals("Kilometer")) {
                            out = in / 39370;
                            outputText.setText(String.format("%.5f", out) + " kilometers");
                        }
                        if (to.equals("Centimeters")) {
                            out = in / 2.54;
                            outputText.setText(String.format("%.5f", out) + " Centimeters");
                        }
                        if (to.equals("Foot")) {
                            out = in / 12;
                            outputText.setText(String.format("%.5f", out) + " Feet");
                        }
                        if (to.equals("Yard")) {
                            out = in / 36;
                            outputText.setText(String.format("%.5f", out) + " Yards");
                        }
                        if (to.equals("Mile")) {
                            out = in / 63360;
                            outputText.setText(String.format("%.5f", out) + " Miles");
                        }
                    }
                    //Foot Block
                    if (from.equals("Foot")) {
                        if (to.equals("Kilometer")) {
                            out = in / 3281;
                            outputText.setText(String.format("%.5f", out) + " kilometers");
                        }
                        if (to.equals("Inch")) {
                            out = in*12;
                            outputText.setText(String.format("%.5f", out) + " Inches");
                        }
                        if (to.equals("Centimeter")) {
                            out = in * 30.48;
                            outputText.setText(String.format("%.5f", out) + " Centimeters");
                        }
                        if (to.equals("Yard")) {
                            out = in / 3;
                            outputText.setText(String.format("%.5f", out) + " Yards");
                        }
                        if (to.equals("Mile")) {
                            out = in / 5280;
                            outputText.setText(String.format("%.5f", out) + " Miles");
                        }
                    }
                    //Yard Block
                    if (from.equals("Yard")) {
                        if (to.equals("Kilometer")) {
                            out = in / 1094;
                            outputText.setText(String.format("%.5f", out) + " kilometers");
                        }
                        if (to.equals("Inch")) {
                            out = in * 36;
                            outputText.setText(String.format("%.5f", out) + " Inches");
                        }
                        if (to.equals("Foot")) {
                            out = in * 3;
                            outputText.setText(String.format("%.5f", out) + " Feet");
                        }
                        if (to.equals("Centimeter")) {
                            out = in * 91.44;
                            outputText.setText(String.format("%.5f", out) + " Centimeters");
                        }
                        if (to.equals("Mile")) {
                            out = in / 1760;
                            outputText.setText(String.format("%.5f", out) + " Miles");
                        }
                    }
                    //Mile Block
                    if (from.equals("Mile")) {
                        if (to.equals("Kilometer")) {
                            out = in * 1.609;
                            outputText.setText(String.format("%.5f", out) + " kilometers");
                        }
                        if (to.equals("Inch")) {
                            out = in * 63360;
                            outputText.setText(String.format("%.5f", out) + " Inches");
                        }
                        if (to.equals("Foot")) {
                            out = in * 5280;
                            outputText.setText(String.format("%.5f", out) + " Feet");
                        }
                        if (to.equals("Yard")) {
                            out = in * 1760;
                            outputText.setText(String.format("%.5f", out) + " Yards");
                        }
                        if (to.equals("Centimeter")) {
                            out = in * 160934;
                            outputText.setText(String.format("%.5f", out) + " Centimeters");
                        }
                    }

                    //Kilogram Block
                    if (from.equals("Kilogram")) {
                        if (to.equals("Pound")) {
                            out = in * 2.205;
                            outputText.setText(String.format("%.5f", out) + " Pounds");
                        }
                        if (to.equals("Ounce")) {
                            out = in * 35.274;
                            outputText.setText(String.format("%.5f", out) + " Ounces");
                        }
                        if (to.equals("Ton")) {
                            out = in / 907.2;
                            outputText.setText(String.format("%.5f", out) + " Tons");
                        }
                    }
                    //Pound Block
                    if (from.equals("Pound")) {
                        if (to.equals("Kilogram")) {
                            out = in / 2.205;
                            outputText.setText(String.format("%.5f", out) + " Kilograms");
                        }
                        if (to.equals("Ounce")) {
                            out = in * 16;
                            outputText.setText(String.format("%.5f", out) + " Ounces");
                        }
                        if (to.equals("Ton")) {
                            out = in / 2000;
                            outputText.setText(String.format("%.5f", out) + " Tons");
                        }
                    }
                    //Ounce Block
                    if (from.equals("Ounce")) {
                        if (to.equals("Pound")) {
                            out = in / 16;
                            outputText.setText(String.format("%.5f", out) + " Pounds");
                        }
                        if (to.equals("Kilogram")) {
                            out = in / 35.274;
                            outputText.setText(String.format("%.5f", out) + " Kilograms");
                        }
                        if (to.equals("Ton")) {
                            out = in / 32000;
                            outputText.setText(String.format("%.5f", out) + " Tons");
                        }
                    }
                    //Ton Block
                    if (from.equals("Ton")) {
                        if (to.equals("Pound")) {
                            out = in * 2000;
                            outputText.setText(String.format("%.5f", out) + " Pounds");
                        }
                        if (to.equals("Ounce")) {
                            out = in * 32000;
                            outputText.setText(String.format("%.5f", out) + " Ounces");
                        }
                        if (to.equals("Kilogram")) {
                            out = in * 907.2;
                            outputText.setText(String.format("%.5f", out) + " Kilogram");
                        }
                    }

                    //Celsius Block
                    if (from.equals("Celsius")) {
                        if (to.equals("Kelvin")) {
                            out = in + 273.15;
                            outputText.setText(String.format("%.5f", out) + " Kelvin");
                        }
                        if (to.equals("Fahrenheit")) {
                            out = (in * 1.8) + 32;
                            outputText.setText(String.format("%.5f", out) + " Fahrenheit");
                        }
                    }
                    //Fahrenheit Block
                    if (from.equals("Fahrenheit")) {
                        if (to.equals("Celsius")) {
                            out = (in - 32) / 1.8;
                            outputText.setText(String.format("%.5f", out) + " Celsius");
                        }
                        if (to.equals("Kelvin")) {
                            out = ((in - 32) / 1.8) + 273.15;
                            outputText.setText(String.format("%.5f", out) + " Kelvin");
                        }
                    }
                    //Kelvin Block
                    if (from.equals("Kelvin")) {
                        if (to.equals("Celsius")) {
                            out = in - 273.15;
                            outputText.setText(String.format("%.5f", out) + " Celsius");
                        }
                        if (to.equals("Fahrenheit")) {
                            out = ((in - 32) / 1.8) + 273.15;
                            outputText.setText(String.format("%.5f", out) + " Fahrenheit");
                        }
                    }
                } catch (Exception e) {
                    outputText.setText("Please enter the amount you wish to convert");
                }
            }
        });
    }
}