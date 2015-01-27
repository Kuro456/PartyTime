package com.pt.hz.partytime;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ListView;

import com.pt.hz.partytime.Fragment.FragmentPagerSupport;
import com.pt.hz.partytime.Fragment.FriendListFragment;
import com.pt.hz.partytime.Fragment.GroupListFragment;
import com.pt.hz.partytime.Fragment.HomeFragment;
import com.pt.hz.partytime.Fragment.NewPartyFragment;
import com.pt.hz.partytime.Fragment.PartyListeFragment;
import com.pt.hz.partytime.Fragment.ProfileFragment;
import com.pt.hz.partytime.Navigation.NavigationDrawerFragment;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks,
                   FriendListFragment.OnFragmentInteractionListener,
                   GroupListFragment.OnFragmentInteractionListener{

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction;
        switch (position){
            case 0:
//                fragmentManager.beginTransaction()
//                        .replace(R.id.container, HomeFragment.newInstance())
//                        .commit();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, HomeFragment.newInstance());
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case 1:
//                fragmentManager.beginTransaction()
//                        .replace(R.id.container, PartyListeFragment.newInstance())
//                        .commit();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, PartyListeFragment.newInstance());
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case 2:
//                fragmentManager.beginTransaction()
//                        .replace(R.id.container, FragmentPagerSupport.newInstance())
//                        .commit();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, FragmentPagerSupport.newInstance());
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case 3:
//                fragmentManager.beginTransaction()
//                        .replace(R.id.container, ProfileFragment.newInstance())
//                        .commit();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, ProfileFragment.newInstance());
                transaction.addToBackStack(null);
                transaction.commit();
                break;
        }
    }

    //Get the title of current fragment
    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
        }
    }

    //Change the title of page to current fragments title
    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_new_party) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.container, NewPartyFragment.newInstance());
            transaction.addToBackStack(null);
            transaction.commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onFragmentInteraction(String id) {

    }
}
