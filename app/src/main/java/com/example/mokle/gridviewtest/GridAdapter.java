package com.example.mokle.gridviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mokle on 4/22/2017.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    private int[] images;
    private  String[] letters;
    private LayoutInflater inflater;

    public GridAdapter(Context context, int[] images, String[] letters) {
        this.context = context;
        this.images = images;
        this.letters = letters;
    }

    @Override
    public int getCount() {
        return letters.length;
    }

    @Override
    public Object getItem(int position) {
        return letters[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;
        if( convertView == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_layout,null);
        }
        ImageView image = (ImageView) gridView.findViewById(R.id.letterImageView);
        TextView letter = (TextView) gridView.findViewById(R.id.letterTextView);

        image.setImageResource(images[position]);
        letter.setText(letters[position]);

        return gridView;
    }
}
