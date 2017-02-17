package np.com.arts.digitalletterhead;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);

        nagarikWadapatra = (CardView) findViewById(R.id.nagarikWadapatra);
        karDasturShulka = (CardView) findViewById(R.id.karDasturShulka);
        budgetNitiTathaKaryakram = (CardView) findViewById(R.id.budgetNitiTathaKaryakram);
        suchana = (CardView) findViewById(R.id.suchana);
        nibedanPeshGarne= (CardView) findViewById(R.id.nibedanPeshGarne);
        sujhabPeshGarne = (CardView) findViewById(R.id.sujhabPeshGarne);
        sahayog = (CardView) findViewById(R.id.sahayog);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Digital Letter Head");

        nagarikWadapatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NagarikWadapatra.class));
            }
        });

        karDasturShulka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),KarDasturShulka.class));
            }
        });

        budgetNitiTathaKaryakram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),BudgetNitiTathaKaryakram.class));
            }
        });

        suchana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Suchana.class));
            }
        });

        nibedanPeshGarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NibedanPeshGarne.class));
            }
        });

        sujhabPeshGarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SujhabPeshGarne.class));
            }
        });

        sahayog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Sahayog.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.popup_menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.popupmenu_setting){
            Toast.makeText(MainActivity.this, "Setting has been saved.", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
