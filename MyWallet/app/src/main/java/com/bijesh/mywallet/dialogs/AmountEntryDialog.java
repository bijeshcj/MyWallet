package com.bijesh.mywallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

import com.bijesh.mywallet.R;

/**
 * Created by bijesh on 12/18/2014.
 */
public class AmountEntryDialog extends Dialog {


    public AmountEntryDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_amount_entry);
    }

    public AmountEntryDialog(Context context, int theme) {
        super(context, theme);
    }

    protected AmountEntryDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


}
