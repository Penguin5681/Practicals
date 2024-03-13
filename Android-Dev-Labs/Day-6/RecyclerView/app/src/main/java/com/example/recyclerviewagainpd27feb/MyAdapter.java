package com.example.recyclerviewagainpd27feb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Inner> {
    ArrayList<DataModel> data;
    Context context;
    public MyAdapter(ArrayList<DataModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.Inner onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new Inner(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.Inner holder, int position) {
        holder.title.setText(data.get(position).getTitle());
        holder.desc.setText(data.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class Inner extends RecyclerView.ViewHolder {
        TextView title, desc;
        public Inner(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_textView);
            desc = itemView.findViewById(R.id.desc_textView);
        }
    }
}
