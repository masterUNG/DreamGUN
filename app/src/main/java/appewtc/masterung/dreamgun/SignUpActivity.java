package appewtc.masterung.dreamgun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText, passwordEditText,
            nameEditText, emailEditText;
    private DatePicker birthDatePicker;
    private Spinner countrySpinner;
    private String userString, passwordString, nameString, emailString,
            birthString, countryString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();

    }   // Main Method

    private void bindWidget() {

        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);
        nameEditText = (EditText) findViewById(R.id.editText5);
        emailEditText = (EditText) findViewById(R.id.editText6);

    }   // bindWidget

    public void clickSaveData(View view) {

        //Get Value From Editext
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        nameString = nameEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();

        //Check Complete
        if (checkSpace()) {
            //Have Space
            MyAlertDialog myAlertDialog = new MyAlertDialog();
            myAlertDialog.myDialog(SignUpActivity.this, "Have Space", "Please Fill Every Blank");

        } else {
            //No Space


        }   // if



    }   // clickSaveData

    private boolean checkSpace() {

        boolean bolSpace = true; //Have Space

        bolSpace = userString.equals("") || passwordString.equals("") ||
                nameString.equals("") || emailString.equals("");

        return bolSpace;
    }

}   // Main Class
