package tech.akam.thefortyrulesoflove2.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

import tech.akam.thefortyrulesoflove2.R;
import tech.akam.thefortyrulesoflove2.app.app;

public class rulesDescription extends AppCompatActivity {

    TextView rulesDescription;
    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_rules_description );

        init();
    }


    private void init() {

        toolbar        = findViewById ( R.id.toolbar );
        rulesDescription = findViewById ( R.id.rulesDescription );

        Bundle bundle = getIntent ().getExtras ();


        toolbar.setTitle ( String.valueOf ( bundle.getString ( "rulesNumber" ) ) );
        toolbar.setTitleTextAppearance ( this , R.style.toolbarAppearance );
        setSupportActionBar ( toolbar );

        rulesDescription.setText (  bundle.getString ( "rulesDescription" )  );


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
            Intent intent = new Intent ( this , Settings.class );
            startActivity ( intent );
        }
        else if ( menuItemsId == R.id.about) {
            app.t ( getString ( R.string.about ) + " " + getString ( R.string.about ) );
            Intent intent = new Intent ( this , AboutUs.class );
            startActivity ( intent );
        }
        else if (menuItemsId == R.id.search){
            app.t ( getString ( R.string.search ) + " " + getString ( R.string.clicked ) );
        }
        else if ( menuItemsId == R.id.exit){
            finish ();
        }
        return super.onOptionsItemSelected ( item );
    }
}
