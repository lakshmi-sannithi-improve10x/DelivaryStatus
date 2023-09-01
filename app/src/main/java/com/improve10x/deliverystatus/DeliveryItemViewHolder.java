package com.improve10x.deliverystatus;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.deliverystatus.databinding.DeliveryItemsBinding;

public class DeliveryItemViewHolder extends RecyclerView.ViewHolder {
    DeliveryItemsBinding binding;

    public DeliveryItemViewHolder(DeliveryItemsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
