package tech.akam.thefortyrulesoflove2.adapters;

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
import tech.akam.thefortyrulesoflove2.app.Application;
import tech.akam.thefortyrulesoflove2.app.app;
import tech.akam.thefortyrulesoflove2.interfaces.RulesNumberClickListener;
import tech.akam.thefortyrulesoflove2.objects.sumBookObjects;

public class sumBookAdapter extends RecyclerView.Adapter<sumBookAdapter.myViewHolder>{

     private List<sumBookObjects> objects;
     private RulesNumberClickListener clickListener;
//    private Context myContext;


    public sumBookAdapter(List<sumBookObjects> list , RulesNumberClickListener clickListener /*, Context myContext*/){
        this.objects = list;
        this.clickListener = clickListener;
//        this.myContext = myContext;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from ( Application.getContext () ).inflate ( R.layout.list_item , parent , false);
        return new myViewHolder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, final int position) {

//        final sumBookObjects objects = objects.get ( position );

        holder.rulesNumber.setText ( objects.get ( position ).getRulesNumber () );
//        holder.rulesDescription.setText ( objects.get ( position ).getRulesDescription () );



    /*    holder.relativeLayout.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                Toast.makeText ( myContext, "ITEM " + position + " Clicked" , Toast.LENGTH_SHORT).show ();
                app.t ( objects.get ( position ).getRulesNumber ());
            }
        } );*/

    }

    @Override
    public int getItemCount() {
        return objects.size ();
    }

    public  class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

         TextView rulesNumber , rulesDescription;
         RelativeLayout parent;
         ShimmerLayout shimmerLayout;



        private myViewHolder(@NonNull View itemView) {
            super ( itemView );

            rulesNumber = itemView.findViewById ( R.id.rulesNumber );
//            rulesDescription = itemView.findViewById ( R.id.rulesDescription );

            shimmerLayout = itemView.findViewById ( R.id.shimmerLayout);
            shimmerLayout.startShimmerAnimation ();
            parent = itemView.findViewById ( R.id.parent );
            parent.setOnClickListener ( this );


        }

        @Override
        public void onClick(View v) {
           clickListener.onClick ( objects.get ( getAdapterPosition () ) );
        }
    }
}
