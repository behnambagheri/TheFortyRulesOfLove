package tech.akam.thefortyrulesoflove2.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.opengl.EGLObjectHandle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.supercharge.shimmerlayout.ShimmerLayout;
import tech.akam.thefortyrulesoflove2.R;
import tech.akam.thefortyrulesoflove2.activities.rulesDescription;
import tech.akam.thefortyrulesoflove2.app.Application;
import tech.akam.thefortyrulesoflove2.app.app;
import tech.akam.thefortyrulesoflove2.interfaces.RulesNumberClickListener;
import tech.akam.thefortyrulesoflove2.objects.sumBookObjects;

import static tech.akam.thefortyrulesoflove2.app.Application.getContext;

public class sumBookAdapter extends RecyclerView.Adapter<sumBookAdapter.myViewHolder>{

     private List<sumBookObjects> objects;
     private Context context;


    public sumBookAdapter(List<sumBookObjects> list , Context context){
        this.objects = list;
        this.context = context;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from ( getContext () ).inflate ( R.layout.list_item , parent , false);
        return new myViewHolder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {

        final sumBookObjects sumBookObjects = objects.get ( position );
//        final sumBookObjects objects = objects.get ( position );

        AssetManager assetManager = getContext().getApplicationContext().getAssets();
        Typeface typeface = Typeface.createFromAsset(assetManager, "fonts/vazir.ttf");
        holder.rulesNumber.setTypeface ( typeface );
        holder.rulesDescription.setTypeface ( typeface );
        holder.rulesNumber.setText ( objects.get ( position ).getRulesNumber () );
        holder.rulesDescription.setText ( objects.get ( position ).getRulesDescription () );


        holder.parent.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( context , rulesDescription.class );
                intent.putExtra ( "rulesNumber" , sumBookObjects.getRulesNumber () );
                intent.putExtra ( "rulesDescription" , sumBookObjects.getRulesDescription () );

                context.startActivity ( intent );

            }
        } );

    }

    @Override
    public int getItemCount() {
        return objects.size ();
    }

    public  class myViewHolder extends RecyclerView.ViewHolder  {

         TextView rulesNumber , rulesDescription;
         RelativeLayout parent;
         ShimmerLayout shimmerLayout;



        private myViewHolder(@NonNull View itemView) {
            super ( itemView );

            rulesNumber = itemView.findViewById ( R.id.rulesNumber );
            rulesDescription = itemView.findViewById ( R.id.rulesDescription );

            shimmerLayout = itemView.findViewById ( R.id.shimmerLayout);
            shimmerLayout.startShimmerAnimation ();
            parent = itemView.findViewById ( R.id.parent );


        }

    }
}
