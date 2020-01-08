package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.List;

import Model.ListItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private Context context;
    private  List<ListItem> listItems;

    public MyAdapter(Context context, List listitem){


        //

        this.context=context;
        this.listItems=listitem;
    }


    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating a View where the xml layout will be visible. This will show list_row.xml
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);


        return new ViewHolder(view); //returning new viewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        // to show recycler view
        //bind view to data source to recycler view
        //getting item from data sources

        ListItem item = listItems.get(position);

        holder.name.setText(item.getName()); // getting from listItem.java by getter setter
        holder.description.setText(item.getDescription());
        holder.rating.setText(item.getRating());




    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {

        //Adding variables in order to get data from design section

        public TextView name;
        public  TextView description;
        public  TextView rating;

        public ViewHolder(@NonNull View itemView) {   //this view holder class takes a view and passing view what we get from list_row.xml
            super(itemView);

            itemView.setOnClickListener(this); // enabling all itemview clickable

            name = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            rating =  (TextView) itemView.findViewById(R.id.rating);

        }

        @Override
        public void onClick(View view) {
            //Get the position of the view clicked

            int position = getAdapterPosition();
            ListItem item = listItems.get(position);

            //Showing a Toast messange

            Toast.makeText(context, item.getName(),Toast.LENGTH_SHORT).show();



        }
    }
}
