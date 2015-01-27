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
import com.pt.hz.partytime.Data.ObjectDrawerItem;
import com.pt.hz.partytime.R;

/**
 * Created by hzaraba on 22/12/2014.
 */
public class FriendListCustomAdapter extends ArrayAdapter<Friend> {

    Context mContext;
    int layoutResourceId;
    Friend data[] = null;

    public FriendListCustomAdapter(Context mContext, int layoutResourceId, Friend[] data){
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

        ImageView avatar            = (ImageView) listItem.findViewById(R.id.avatar);
        TextView textViewFirstname  = (TextView) listItem.findViewById(R.id.firstname);
        TextView textViewLastname   = (TextView) listItem.findViewById(R.id.lastname);

        Friend folder = data[position];


        avatar.setImageResource(folder.getAvatar());
        textViewFirstname.setText(folder.getFirstname());
        textViewLastname.setText(folder.getLastname());

        return listItem;
    }
}
