package solutions.theta.tablayoutexample.activities;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import solutions.theta.tablayoutexample.Adapter.Pager;
import solutions.theta.tablayoutexample.Fragments.Tab1Fragment;
import solutions.theta.tablayoutexample.R;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener,Tab1Fragment.OnFragmentInteractionListener{

    //This is our tablayout
    private TabLayout mTabLayout;

    //This is our viewPager
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mTloolBar =findViewById(R.id.toolbar);
        setSupportActionBar(mTloolBar);
        //Initializing the tablayout
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        //Now we have to set the Tabs in the TabLayout
        mTabLayout.addTab(mTabLayout.newTab().setText("TAB1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("TAB2"));
        //mTabLayout.addTab(mTabLayout.newTab().setText("TAB3"));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initialize the ViewPager
        mViewPager=findViewById(R.id.pager);
        Pager pagerAdapter=new Pager(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
