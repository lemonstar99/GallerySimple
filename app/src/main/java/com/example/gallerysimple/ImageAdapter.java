package com.example.gallerysimple;

import android.content.Context;
import android.database.DataSetObserver;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private List<Integer> mThumbIds;
    private Context mContext;

    public ImageAdapter(List<Integer> mThumbIds, Context mContext) {
        this.mThumbIds = mThumbIds;
        this.mContext = mContext;
    }

    public int getCount() {
        return mThumbIds.size();
    }

    public Object getItem(int position) { return null;}
    public long getItemId(int position) { return mThumbIds.get(position);}
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = (ImageView) convertView;

        if(imageView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 450));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }

        imageView.setImageResource(mThumbIds.get(position));

        return imageView;

    }

    @Override
    public boolean hasStableIds() {
        return super.hasStableIds();
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
        super.registerDataSetObserver(observer);
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {
        super.unregisterDataSetObserver(observer);
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
    }

    @Override
    public boolean areAllItemsEnabled() {
        return super.areAllItemsEnabled();
    }

    @Override
    public boolean isEnabled(int position) {
        return super.isEnabled(position);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return super.getAutofillOptions();
    }

    @Override
    public void setAutofillOptions(CharSequence... options) {
        super.setAutofillOptions(options);
    }

    public ImageAdapter() {
        super();
    }


}
