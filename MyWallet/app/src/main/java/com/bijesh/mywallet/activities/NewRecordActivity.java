package com.bijesh.mywallet.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.bijesh.mywallet.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bijesh on 12-02-2015.
 */
public class NewRecordActivity extends ActionBarActivity {

    private Spinner mSpnAccounttype;
    private Spinner mSpnCurrencyType;
    private Spinner mspnExpenseIncomeType;
    private Spinner mSpnExpenseMode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("New Record");
        setContentView(R.layout.activity_newrecord);

        initComponents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_record,menu);
        return true;
    }

    private void initComponents(){
        mSpnAccounttype = (Spinner)findViewById(R.id.accountTypeSpinner);
        mSpnCurrencyType = (Spinner) findViewById(R.id.spinnerCurrency);
        mspnExpenseIncomeType = (Spinner) findViewById(R.id.spinnerExpenseIncomeType);
        mSpnExpenseMode = (Spinner) findViewById(R.id.spinnerExpenseMode);

        loadComponents();
    }

    private void loadComponents(){
//        loading data for spinner account types
        List<String> lstAccountTypes = new ArrayList<>();
        lstAccountTypes = getAccountTypes(lstAccountTypes);
        mSpnAccounttype.setAdapter(getSpinnerAdapter(android.R.layout.simple_spinner_item,android.R.layout.simple_spinner_dropdown_item,
                lstAccountTypes));


//        loading data for spinner currency type
        List<String> lstCurrencyTypes = new ArrayList<>();
        lstCurrencyTypes = getCurrencyTypes(lstCurrencyTypes);
        mSpnCurrencyType.setAdapter(getSpinnerAdapter(android.R.layout.simple_spinner_item,android.R.layout.simple_spinner_dropdown_item,
                lstCurrencyTypes));

//        loading data for spinner expense income type
        List<String> lstExpenseIncome = new ArrayList<>();
        lstExpenseIncome  = getExpenseincometypes(lstExpenseIncome);
        mspnExpenseIncomeType.setAdapter(getSpinnerAdapter(android.R.layout.simple_spinner_item, android.R.layout.simple_spinner_dropdown_item,
                lstExpenseIncome));

//        loading data for spinner expense mode
        List<String> lstExpenseMode = new ArrayList<>();
        lstExpenseMode = getExpenseModes(lstExpenseMode);
        mSpnExpenseMode.setAdapter(getSpinnerAdapter(android.R.layout.simple_spinner_item, android.R.layout.simple_spinner_dropdown_item,
                lstExpenseMode));

    }

    private List<String> getExpenseModes(List<String> types){
        types.add("Cash");
        types.add("Debit Card");
        types.add("Credit Card");
        return types;
    }

    private List<String> getExpenseincometypes(List<String> types){
        types.add("Health Care");
        types.add("Pets");
        types.add("Transport");
        types.add("Car");
        return types;
    }

    private List<String> getAccountTypes(List<String> types){
        types.add("My Account");
        types.add("Add new account");
        return types;
    }

    private List<String> getCurrencyTypes(List<String> types){
        types.add("INR");
        types.add("British Pounds");
        types.add("US Dollars");
        return types;
    }

    /**
     *
     * @param layoutForSpinner (layout resource for Spinner )
     * @param layoutForDropDown (layout resource for Spinner's drop down)
     * @param items (String items)
     * @return
     */
    private ArrayAdapter<String> getSpinnerAdapter(int layoutForSpinner,int layoutForDropDown,List<String> items){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,layoutForSpinner,items);
        adapter.setDropDownViewResource(layoutForDropDown);
        return adapter;
    }

}
