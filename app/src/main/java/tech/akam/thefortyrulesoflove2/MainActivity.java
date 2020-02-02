package tech.akam.thefortyrulesoflove2;

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

import tech.akam.thefortyrulesoflove2.adapters.DescriptionAdapter;
import tech.akam.thefortyrulesoflove2.adapters.sumBookAdapter;
import tech.akam.thefortyrulesoflove2.app.app;
import tech.akam.thefortyrulesoflove2.interfaces.RulesNumberClickListener;
import tech.akam.thefortyrulesoflove2.objects.DescriptionObjects;
import tech.akam.thefortyrulesoflove2.objects.sumBookObjects;
import tech.akam.thefortyrulesoflove2.activities.rulesDescription;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , RulesNumberClickListener {

    RecyclerView recyclerView;

    List<sumBookObjects> list ;
//    List<DescriptionObjects> listDec;

    sumBookAdapter adapter;
//    DescriptionAdapter adapterDec;

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
//        listDec = setDataDec ();

        adapter = new sumBookAdapter ( list , this );
//        adapterDec = new DescriptionAdapter ( listDec , this );

        recyclerView.setAdapter ( adapter );

       setLayoutManager (  );

        Animation animation = AnimationUtils.loadAnimation ( this , android.R.anim.slide_in_left );
        LayoutAnimationController animationController = new LayoutAnimationController ( animation );

        recyclerView.setLayoutAnimation ( animationController );


        toolbar        = findViewById ( R.id.toolbar );

//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager ( getApplicationContext () );

//      RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager ( this , LinearLayoutManager.VERTICAL , false);
//      RecyclerView.LayoutManager gLayoutManager = new GridLayoutManager ( this , 2 );


//        recyclerView.setLayoutManager ( mLayoutManager );
//        recyclerView.setLayoutManager ( gLayoutManager );

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration ( this , DividerItemDecoration.VERTICAL );
        recyclerView.addItemDecoration ( itemDecoration );
//        recyclerView.setItemAnimator(new DefaultItemAnimator ());
//        recyclerView.setHasFixedSize(true);

        toolbar.setTitle ( R.string.app_name_Fa );
        setSupportActionBar ( toolbar );

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbar.setTitle ( R.string.app_name_Fa );
//        toolbar.setTitleTextColor ( Color.WHITE );
//        getWindow ().getDecorView ().setLayoutDirection ( View.LAYOUT_DIRECTION_RTL );




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
            finish ();
        }
       /* else if ( menuItemsId == android.R.id.home){
            onBackPressed ();
        }*/

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

    @Override
    public void onClick(sumBookObjects objects) {






        Intent intent = new Intent ( this , rulesDescription.class );
        intent.putExtra ( "objects" , objects );
        startActivity ( intent );

//        app.t ( objects.getRulesDescription () );
    }





    private List<sumBookObjects> setData(){



        List<sumBookObjects> list = new ArrayList<> (  );

        sumBookObjects object = new sumBookObjects (  );

        object.setRulesNumber ( getString ( R.string.introduction ) );


//        object.setRulesDescription ( getString ( R.string.introductionDescription ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law01 ) );

//        object.setRulesDescription ( getString ( R.string.introductionDescription ) );
        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law02 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law03 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law04 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law05 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law06 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law07 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law08 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law09 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law10 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law11 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law12 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law13 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law14 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law15 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law16 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law17 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law18 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law19 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law20 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law21 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law22 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law23 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law24 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law25 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law26 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law27 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law28 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law29 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law30 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law31 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law32 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law33 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law34 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law35 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law36 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law37 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law38 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law39 ) );

        list.add ( object );

        object = new sumBookObjects (  );
        object.setRulesNumber ( getString ( R.string.law40 ) );

        list.add ( object );




      /*  list.add ( new sumBookObjects ( getString ( R.string.introduction )) );
        list.add ( new sumBookObjects ( getString ( R.string.law01 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law02 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law03 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law04 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law05 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law06 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law07 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law08 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law09 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law10 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law11 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law12 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law13 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law14 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law15 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law16 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law17 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law18 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law19 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law20 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law21 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law22 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law23 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law24 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law25 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law26 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law27 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law28 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law29 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law30 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law31 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law32 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law33 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law34 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law35 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law36 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law37 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law38 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law39 ) ) );
        list.add ( new sumBookObjects ( getString ( R.string.law40 ) ) );
*/
//        adapter.notifyDataSetChanged ();

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
