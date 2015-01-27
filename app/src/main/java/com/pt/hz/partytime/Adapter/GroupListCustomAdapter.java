package com.pt.hz.partytime.Adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pt.hz.partytime.Data.Friend;
import com.pt.hz.partytime.Data.Group;
import com.pt.hz.partytime.R;

/**
 * Created by hzaraba on 22/12/2014.
 */
public class GroupListCustomAdapter extends ArrayAdapter<Group> {

    Context mContext;
    int layoutResourceId;
    Group data[] = null;

    public GroupListCustomAdapter(Context mContext, int layoutResourceId, Group[] data){
        super(mContext, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;

        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        listItem = inflater.inflate(layoutResourceId, parent, false);

        ImageView image            = (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView textViewName  = (TextView) listItem.findViewById(R.id.textViewName);

        Group folder = data[position];

        image.setImageResource(folder.getAvatar());
        textViewName.setText(folder.getName());

        return listItem;
    }
}
