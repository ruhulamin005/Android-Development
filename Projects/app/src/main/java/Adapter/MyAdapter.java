package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.placesofbangladesh.R;

import java.util.List;

import Model.ListItem;

//to get the view we have to extend recycler view adapter with my view; Also have to
//implement viewholder
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //We have to create context and <listItems>

    private Context context;
    private List<ListItem> listItems;

    public  MyAdapter(Context context, List listitem) //Adapter method
    {
        this.context = context;
        this.listItems = listitem;


    }



    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return null;

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {


        ListItem item = listItems.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        //will be back




    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public TextView name;
        public  TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);

        }

        public void onClick(View view) {

            int position = getAdapterPosition();
            ListItem item = listItems.get(position);
            //Will be back for intent

        }
    }
}
