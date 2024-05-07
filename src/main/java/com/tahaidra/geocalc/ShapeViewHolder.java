package com.tahaidra.geocalc;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShapeViewHolder extends RecyclerView.ViewHolder {
    private TextView shapeTextView;

    public ShapeViewHolder(@NonNull View itemView) {
        super(itemView);
        shapeTextView = itemView.findViewById(R.id.main);
    }

    public void bind(String shape) {
        shapeTextView.setText(shape);
    }
}
