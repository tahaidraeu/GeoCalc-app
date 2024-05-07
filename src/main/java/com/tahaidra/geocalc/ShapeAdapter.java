package com.tahaidra.geocalc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ShapeAdapter extends RecyclerView.Adapter<ShapeAdapter.ShapeViewHolder> {
    private List<String> shapesList;

    public ShapeAdapter(List<String> shapesList) {
        this.shapesList = shapesList;
    }

    @NonNull
    @Override
    public ShapeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_shape, parent, false);
        return new ShapeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ShapeViewHolder holder, int position) {
        holder.bind(shapesList.get(position));
    }

    @Override
    public int getItemCount() {
        return shapesList.size();
    }

    static class ShapeViewHolder extends RecyclerView.ViewHolder {
        private TextView shapeTextView;

        public ShapeViewHolder(@NonNull View itemView) {
            super(itemView);
            shapeTextView = itemView.findViewById(R.id.main);
        }

        public void bind(String shape) {
            shapeTextView.setText(shape);
        }
    }
}
