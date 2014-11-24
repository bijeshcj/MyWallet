package com.bijesh.mywallet.adapters.baseadpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bijesh.mywallet.R;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Bijesh on 23-11-2014.
 */
public class NavigationDrawerAdapter extends BaseAdapter {

    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SEPARATOR = 1;

    private ArrayList<String> mData = new ArrayList<String>();
    private TreeSet<Integer> sectionHeader = new TreeSet<Integer>();

    private LayoutInflater mLayoutInflater;

    public NavigationDrawerAdapter(Context context){
        mLayoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(final String item){
        mData.add(item);
        notifyDataSetChanged();
    }

    public void addSectionHeaderItem(final String item){
        mData.add(item);
        sectionHeader.add(mData.size()-1);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return sectionHeader.contains(position) ? TYPE_SEPARATOR : TYPE_ITEM;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;
        int rowType = getItemViewType(i);

        if(view == null){
            viewHolder = new ViewHolder();
            switch (rowType){
                case TYPE_ITEM:
                    view = mLayoutInflater.inflate(R.layout.listview_navigation_drawer_options,null);
                    viewHolder.textView = (TextView)view.findViewById(R.id.lstView_options);
                    break;
                case TYPE_SEPARATOR: //lstViewHeaderId
                    view = mLayoutInflater.inflate(R.layout.listview_navigation_drawer_header,null);
                    viewHolder.textView = (TextView)view.findViewById(R.id.lstViewHeaderId);
                    break;
            }
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.textView.setText(mData.get(i));

        return view;
    }
    public static class ViewHolder{
        public TextView textView;
    }
}
