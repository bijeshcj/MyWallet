package com.bijesh.mywallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.bijesh.mywallet.R;
import com.bijesh.mywallet.activities.NewRecordActivity;
import com.bijesh.mywallet.utils.BaseUtils;

/**
 * Created by bijesh on 12/18/2014.
 */
public class AmountEntryDialog extends Dialog {

    private static final String TAG = AmountEntryDialog.class.getCanonicalName();
    private TextView txtViewInsert;
    private Context mContext;

    public AmountEntryDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_amount_entry);
        this.mContext = context;
        initComponents();
    }

    private void initComponents(){
        txtViewInsert = (TextView)findViewById(R.id.txtInsert);

        setClickListeners();
    }

    private void setClickListeners(){
        txtViewInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"Data insertion operation");
                addNewRecord();
            }
        });
    }

    private void addNewRecord(){
        BaseUtils.launchActivity(mContext, NewRecordActivity.class);
        AmountEntryDialog.this.dismiss();
    }

    public AmountEntryDialog(Context context, int theme) {
        super(context, theme);
    }

    protected AmountEntryDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


}
