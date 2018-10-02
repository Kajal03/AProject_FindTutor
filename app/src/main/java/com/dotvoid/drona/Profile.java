Skip to content


  
Pull requests 
Issues 
Marketplace 
Explore 
 


Sign out 


 Watch 
0 
 Star 
0 
 Fork 
3 

anuragjoshi3519/AProject_FindTutor 
 Code 
 Issues 0 
 Pull requests 0 
 Projects 0 
 Wiki 
 Insights 
Branch: master 
Find file 
Copy path 
AProject_FindTutor/app/src/main/java/com/dotvoid/drona/Profile.java 
120d39d on Oct 27 2017 
 anuragjoshi3519 Initial commit 
1 contributor 
 
Raw
Blame
History
   
99 lines (81 sloc) 3.35 KB 

package com.dotvoid.drona;



import android.content.Intent;

import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;

import android.support.design.widget.Snackbar;

import android.view.View;

import android.support.design.widget.NavigationView;

import android.support.v4.view.GravityCompat;

import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;

import android.view.Menu;

import android.view.MenuItem;



public class Profile extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)

                        .setAction("Action", null).show();

            }

        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(

                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.setDrawerListener(toggle);

        toggle.syncState();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

    }



    @Override

    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);

        } else {

            super.onBackPressed();

        }

    }



    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.profile, menu);

        return true;

    }



    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will

        // automatically handle clicks on the Home/Up button, so long

        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();



        //noinspection SimplifiableIfStatement

        if (id == R.id.action_notification) {

            return true;

        }



        return super.onOptionsItemSelected(item);

    }



    @SuppressWarnings("StatementWithEmptyBody")

    @Override

    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.

        int id = item.getItemId();



        if (id == R.id.editskills) {

            // Handle the camera action

        } else if (id == R.id.learn) {



        } else if (id == R.id.message) {



        } else if (identity == R.identity.feedback) {



        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.identity.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);

        return true;

    }

}

© 2018 GitHub, Inc.
Terms
Privacy
Security
Status
Help
 
Contact GitHub
Pricing
API
Training
Blog
About

Press h to open a hovercard with more details. Skip to content


  
Pull requests 
Issues 
Marketplace 
Explore 
 


Sign out 


 Watch 
0 
 Star 
0 
 Fork 
3 

anuragjoshi3519/AProject_FindTutor 
 Code 
 Issues 0 
 Pull requests 0 
 Projects 0 
 Wiki 
 Insights 
Branch: master 
Find file 
Copy path 
AProject_FindTutor/app/src/main/java/com/dotvoid/drona/Profile.java 
120d39d on Oct 27 2017 
 anuragjoshi3519 Initial commit 
1 contributor 
 
Raw
Blame
History
   
99 lines (81 sloc) 3.35 KB 

package com.dotvoid.drona;



import android.content.Intent;

import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;

import android.support.design.widget.Snackbar;

import android.view.View;

import android.support.design.widget.NavigationView;

import android.support.v4.view.GravityCompat;

import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;

import android.view.Menu;

import android.view.MenuItem;



public class Profile extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)

                        .setAction("Action", null).show();

            }

        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(

                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.setDrawerListener(toggle);

        toggle.syncState();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

    }



    @Override

    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);

        } else {

            super.onBackPressed();

        }

    }



    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.profile, menu);

        return true;

    }



    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will

        // automatically handle clicks on the Home/Up button, so long

        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();



        //noinspection SimplifiableIfStatement

        if (id == R.id.action_notification) {

            return true;

        }



        return super.onOptionsItemSelected(item);

    }



    @SuppressWarnings("StatementWithEmptyBody")

    @Override

    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.

        int id = item.getItemId();



        if (id == R.id.editskills) {

            // Handle the camera action

        } else if (id == R.id.learn) {



        } else if (id == R.id.message) {



        } else if (identity == R.identity.feedback) {



        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.identity.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);

        return true;

    }

}

© 2018 GitHub, Inc.
Terms
Privacy
Security
Status
Help
 
Contact GitHub
Pricing
API
Training
Blog
About

Press h to open a hovercard with more details. 
