package tech.akam.thefortyrulesoflove2.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

import io.supercharge.shimmerlayout.ShimmerLayout;
import tech.akam.thefortyrulesoflove2.MainActivity;
import tech.akam.thefortyrulesoflove2.R;
import tech.akam.thefortyrulesoflove2.app.app;
import tech.akam.thefortyrulesoflove2.objects.sumBookObjects;

public class rulesDescription extends AppCompatActivity {

    TextView rulesNumber , rulesDescription;
    RelativeLayout parent;
    ShimmerLayout shimmerLayout;
    sumBookObjects objects;
    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rules_description );

         objects = (sumBookObjects) getIntent ().getSerializableExtra ( "objects" );

//        setTitle ( objects.getRulesNumber () );

        init();



    }

    private void init() {

        toolbar        = findViewById ( R.id.toolbar );
        toolbar.setTitle ( objects.getRulesNumber () );
        setSupportActionBar ( toolbar );



//        rulesNumber = findViewById ( R.id.rulesNumber );
//        rulesDescription = findViewById ( R.id.rulesDescription );

//        shimmerLayout = findViewById ( R.id.shimmerLayout);
//        shimmerLayout.startShimmerAnimation ();
//        parent = findViewById ( R.id.parent );



//        rulesNumber.setText ( objects.getRulesNumber () );
//        rulesDescription.setText ( objects.getRulesDescription () );




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater ().inflate ( R.menu.toolbar_menu , menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int menuItemsId = item.getItemId ();

        if (menuItemsId == R.id.settings){
            app.t (getString ( R.string.settings ) + " " + getString ( R.string.clicked ) );
            Intent intent = new Intent ( item.getClass ().getName () );
        }
        else if ( menuItemsId == R.id.about) {
            app.t ( getString ( R.string.about ) + " " + getString ( R.string.about ) );
        }
        else if (menuItemsId == R.id.search){
            app.t ( getString ( R.string.search ) + " " + getString ( R.string.clicked ) );
        }
        else if ( menuItemsId == R.id.exit){
//            Intent intent = new Intent ( this , MainActivity.class );
//            startActivity ( intent );
//            finishActivity ( this , );
            finish ();
        }
       /* else if ( menuItemsId == android.R.id.home){
            onBackPressed ();
        }*/

        return super.onOptionsItemSelected ( item );
    }
}
