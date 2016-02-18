package com.example.advantal.listviewcustom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by advantal on 2/17/2016.
 */
public class CustomListView extends ArrayAdapter<String> {
    private String[] names;
    private Integer[] imageId;
    private Activity context;
    public CustomListView(Activity context,String[] names, Integer[] imageId) {
        super(context,R.layout.list_layout,names);
        this.context=context;
        this.names=names;
        this.imageId=imageId;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.list_layout, null, true);
        TextView name=(TextView)listViewItem.findViewById(R.id.textView1);
        ImageView image=(ImageView)listViewItem.findViewById(R.id.imageView);
        name.setText(names[position]);
        image.setImageResource(imageId[position]);
        return listViewItem;
    }
}
