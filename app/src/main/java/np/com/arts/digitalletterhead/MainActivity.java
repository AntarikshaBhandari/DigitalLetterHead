package np.com.arts.digitalletterhead;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView nagarikWadapatra, karDasturShulka, budgetNitiTathaKaryakram, suchana, nibedanPeshGarne, sujhabPeshGarne, sahayog;
    Toolbar toolbar;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);

        nagarikWadapatra = (CardView) findViewById(R.id.nagarikWadapatra);
        karDasturShulka = (CardView) findViewById(R.id.karDasturShulka);
        budgetNitiTathaKaryakram = (CardView) findViewById(R.id.budgetNitiTathaKaryakram);
        suchana = (CardView) findViewById(R.id.suchana);
        nibedanPeshGarne = (CardView) findViewById(R.id.nibedanPeshGarne);
        sujhabPeshGarne = (CardView) findViewById(R.id.sujhabPeshGarne);
        sahayog = (CardView) findViewById(R.id.sahayog);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Digital Letter Head");


        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.draweropen, R.string.drawerclose);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_menu:
                        getSupportActionBar().setTitle(R.string.app_name);
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.introduction_menu:
                        getSupportActionBar().setTitle("नगर परिचय");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.contact_menu:
                        getSupportActionBar().setTitle("सम्पर्क ठेगाना");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                }
                return true;
            }
        });

        nagarikWadapatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NagarikWadapatraContent.class));
            }
        });

        karDasturShulka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), KarDasturShulka.class));
            }
        });

        budgetNitiTathaKaryakram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BudgetNitiTathaKaryakram.class));
            }
        });

        suchana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Suchana.class));
            }
        });

        nibedanPeshGarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NibedanPeshGarne.class));
            }
        });

        sujhabPeshGarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SujhabPeshGarne.class));
            }
        });

        sahayog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Sahayog.class));
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.popup_menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.popupmenu_setting) {
            Toast.makeText(MainActivity.this, "Setting has been saved.", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "एप क्लोज गर्न फेरी ब्याक थिच्नुहोस्", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
