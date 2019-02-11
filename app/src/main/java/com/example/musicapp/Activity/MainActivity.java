package com.example.musicapp.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.musicapp.Adapter.MyAdapter;
import com.example.musicapp.Model.PlayList;
import com.example.musicapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private DrawerLayout mDrawerLayout;
    private RecyclerView mPopularRecycler;
    private MyAdapter mPopularAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(MainActivity.this, PlayingActivity.class);
//        startActivity(intent);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();

                //Update UI here
                return true;
            }
        });

        initToolbar("Library");
        if(getSupportActionBar() != null)
        {
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_home);
        }


        mPopularRecycler = findViewById(R.id.list_popular);
        List<PlayList> listPopular = new ArrayList<>();
        listPopular.add(new PlayList("0", "Radwimps","Sparkle", ""));
        listPopular.add(new PlayList("1", "Dewa 19","Kangen", ""));
        listPopular.add(new PlayList("2", "Uut Sely","Kopi susu", ""));
        listPopular.add(new PlayList("2", "Uut Sely","Kopi susu", ""));
        listPopular.add(new PlayList("2", "Uut Sely","Kopi susu", ""));
        listPopular.add(new PlayList("2", "Uut Sely","Kopi susu", ""));
        mPopularAdapter = new MyAdapter(listPopular);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        mPopularRecycler.setLayoutManager(mLayoutManager);
        mPopularRecycler.setItemAnimator(new DefaultItemAnimator());
        mPopularRecycler.setAdapter(mPopularAdapter);

        mPopularAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home : {
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
