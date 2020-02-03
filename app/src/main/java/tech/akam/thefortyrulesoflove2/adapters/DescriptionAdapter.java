package tech.akam.thefortyrulesoflove2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tech.akam.thefortyrulesoflove2.R;
import tech.akam.thefortyrulesoflove2.app.Application;
import tech.akam.thefortyrulesoflove2.interfaces.RulesDescriptionClickListener;
import tech.akam.thefortyrulesoflove2.objects.DescriptionObjects;

public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.myViewHolder> {

    private List<DescriptionObjects> objects;
    private RulesDescriptionClickListener clickListener;

    public DescriptionAdapter(List<DescriptionObjects> listDec , RulesDescriptionClickListener clickListener){
        this.objects = listDec;
        this.clickListener = clickListener;
    }

//    public DescriptionAdapter(List<DescriptionObjects> listDec, MainActivity mainActivity) {
//    }

//    public DescriptionAdapter(List<DescriptionObjects> listDec, MainActivity mainActivity) {
//    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from ( Application.getContext () ).inflate ( R.layout.rules_description , parent , false );

        return new myViewHolder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.rulesDescription.setText ( objects.get ( position ).getRulesDescription () );
    }

    @Override
    public int getItemCount() {
        return objects.size ();
    }


    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView rulesDescription;
        RelativeLayout decParentId;

        public myViewHolder(@NonNull View itemView) {
            super ( itemView );

            rulesDescription = itemView.findViewById ( R.id.rulesDescription );
            decParentId = itemView.findViewById ( R.id.decParentId );
            decParentId.setOnClickListener ( this );

        }

        @Override
        public void onClick(View v) {
            clickListener.onClick ( objects.get ( getAdapterPosition () ) );
        }
    }

}
