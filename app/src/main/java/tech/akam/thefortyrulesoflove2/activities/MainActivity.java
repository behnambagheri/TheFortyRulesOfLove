package tech.akam.thefortyrulesoflove2.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import tech.akam.thefortyrulesoflove2.R;
import tech.akam.thefortyrulesoflove2.adapters.sumBookAdapter;
import tech.akam.thefortyrulesoflove2.app.app;
import tech.akam.thefortyrulesoflove2.objects.sumBookObjects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    RecyclerView recyclerView;

    List<sumBookObjects> list ;

    sumBookAdapter adapter;

    MaterialToolbar toolbar;
    FloatingActionButton fab;

    public static final int LAYOUT_MANAGER_LINEAR = 1;
    public static final int LAYOUT_MANAGER_GRID = 2;

    int layoutManager = LAYOUT_MANAGER_LINEAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


    init();

    setData ();

    }

    private void init(){

        recyclerView   = findViewById ( R.id.recyclerView );

        fab = findViewById ( R.id.fab );
        fab.setOnClickListener ( this );

        list = setData ();

        adapter = new sumBookAdapter ( list , this );

        recyclerView.setAdapter ( adapter );

        setLayoutManager (  );

        Animation animation = AnimationUtils.loadAnimation ( this , android.R.anim.slide_in_left );
        LayoutAnimationController animationController = new LayoutAnimationController ( animation );

        recyclerView.setLayoutAnimation ( animationController );



        toolbar        = findViewById ( R.id.toolbar );

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration ( this , DividerItemDecoration.VERTICAL );
        recyclerView.addItemDecoration ( itemDecoration );

        toolbar.setTitle ( R.string.app_name_Fa );
        toolbar.setTitleTextAppearance ( this , R.style.toolbarAppearance );
        setSupportActionBar ( toolbar );

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
            app.t ( getString ( R.string.about ) + " " + getString ( R.string.clicked ) );
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


    private void setLayoutManager(){

        if (layoutManager == LAYOUT_MANAGER_LINEAR){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager ( this );
            fab.setImageResource ( R.drawable.ic_grid_on_black_24dp );
            recyclerView.setLayoutManager ( linearLayoutManager );
        }
        else if (layoutManager == LAYOUT_MANAGER_GRID){
            GridLayoutManager gridLayoutManager = new GridLayoutManager ( this , 2 );
            fab.setImageResource ( R.drawable.ic_menu_black_24dp );
            recyclerView.setLayoutManager ( gridLayoutManager );
        }
    }


    private List<sumBookObjects> setData(){



        List<sumBookObjects> list = new ArrayList<> (  );

        sumBookObjects object = new sumBookObjects (  );

        object.setRulesNumber ( getString ( R.string.introduction ) );
        object.setRulesDescription ( getString ( R.string.introductionDescription ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law01 ) );
        object.setRulesDescription ( getString ( R.string.law01Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law02 ) );
        object.setRulesDescription ( getString ( R.string.law02Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law03 ) );
        object.setRulesDescription ( getString ( R.string.law03Text ) );


        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law04 ) );
        object.setRulesDescription ( getString ( R.string.law04Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law05 ) );
        object.setRulesDescription ( getString ( R.string.law05Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law06 ) );
        object.setRulesDescription ( getString ( R.string.law06Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law07 ) );
        object.setRulesDescription ( getString ( R.string.law07Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law08 ) );
        object.setRulesDescription ( getString ( R.string.law08Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law09 ) );
        object.setRulesDescription ( getString ( R.string.law09Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law10 ) );
        object.setRulesDescription ( getString ( R.string.law10Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law11 ) );
        object.setRulesDescription ( getString ( R.string.law11Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law12 ) );
        object.setRulesDescription ( getString ( R.string.law12Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law13 ) );
        object.setRulesDescription ( getString ( R.string.law13Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law14 ) );
        object.setRulesDescription ( getString ( R.string.law14Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law15 ) );
        object.setRulesDescription ( getString ( R.string.law25Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law16 ) );
        object.setRulesDescription ( getString ( R.string.law16Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law17 ) );
        object.setRulesDescription ( getString ( R.string.law17Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law18 ) );
        object.setRulesDescription ( getString ( R.string.law18Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law19 ) );
        object.setRulesDescription ( getString ( R.string.law19Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law20 ) );
        object.setRulesDescription ( getString ( R.string.law20Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law21 ) );
        object.setRulesDescription ( getString ( R.string.law21Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law22 ) );
        object.setRulesDescription ( getString ( R.string.law22Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law23 ) );
        object.setRulesDescription ( getString ( R.string.law23Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law24 ) );
        object.setRulesDescription ( getString ( R.string.law24Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law25 ) );
        object.setRulesDescription ( getString ( R.string.law25Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law26 ) );
        object.setRulesDescription ( getString ( R.string.law26Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law27 ) );
        object.setRulesDescription ( getString ( R.string.law27Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law28 ) );
        object.setRulesDescription ( getString ( R.string.law28Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law29 ) );
        object.setRulesDescription ( getString ( R.string.law29Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law30 ) );
        object.setRulesDescription ( getString ( R.string.law30Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law31 ) );
        object.setRulesDescription ( getString ( R.string.law31Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law32 ) );
        object.setRulesDescription ( getString ( R.string.law32Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law33 ) );
        object.setRulesDescription ( getString ( R.string.law33Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law34 ) );
        object.setRulesDescription ( getString ( R.string.law34Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law35 ) );
        object.setRulesDescription ( getString ( R.string.law35Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law36 ) );
        object.setRulesDescription ( getString ( R.string.law36Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law37 ) );
        object.setRulesDescription ( getString ( R.string.law37Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law38 ) );
        object.setRulesDescription ( getString ( R.string.law38Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law39 ) );
        object.setRulesDescription ( getString ( R.string.law39Text ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law40 ) );
        object.setRulesDescription ( getString ( R.string.law40Text ) );

        list.add ( object );

        return list;

    }




    @Override
    public void onClick(View v) {
        if ( v.getId () == R.id.fab){
            if (layoutManager == LAYOUT_MANAGER_LINEAR){
                layoutManager = LAYOUT_MANAGER_GRID;
            }
            else layoutManager = LAYOUT_MANAGER_LINEAR;
            setLayoutManager (  );
        }
    }


}
