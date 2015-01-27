package com.pt.hz.partytime.Fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pt.hz.partytime.MainActivity;
import com.pt.hz.partytime.R;

/**
 * Created by hzaraba on 22/12/2014.
 */
public class FragmentPagerSupport extends Fragment{

    public static FragmentPagerSupport newInstance() {
        FragmentPagerSupport fragment = new FragmentPagerSupport();
        return fragment;
    }

    public FragmentPagerSupport(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Resources res = getResources();
        FragmentTabHost tabHost = new FragmentTabHost(getActivity());
        tabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_pager);

        Bundle arg1 = new Bundle();
        arg1.putInt("Arg for Frag1", 1);
        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator(null, res.getDrawable(R.drawable.ic_action_person_holo_light)),
                FriendListFragment.class, arg1);
        //tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator(null,res.getDrawable(R.drawable.ic_action_person_holo_light)),
        //        FriendsFragment.class, arg1);

        Bundle arg2 = new Bundle();
        arg2.putInt("Arg for Frag2", 2);
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator(null,res.getDrawable(R.drawable.ic_action_group_holo_light)),
                GroupListFragment.class, arg2);
        //tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator(null,res.getDrawable(R.drawable.ic_action_group_holo_light)),
        //        GroupsFragment.class, arg2);

        return tabHost;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(5);
    }
}
