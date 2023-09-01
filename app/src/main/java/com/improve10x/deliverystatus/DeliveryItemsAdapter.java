package com.improve10x.deliverystatus;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.deliverystatus.databinding.DeliveryItemsBinding;

public class DeliveryItemsAdapter extends RecyclerView.Adapter<DeliveryItemViewHolder> {
    private DeliveryItems[] items;

    public DeliveryItemsAdapter(DeliveryItems[] deliveryItems){
        items = deliveryItems;
    }
    @NonNull
    @Override
    public DeliveryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        DeliveryItemsBinding binding = DeliveryItemsBinding.inflate(inflater,parent,false);
        DeliveryItemViewHolder viewHolder = new DeliveryItemViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryItemViewHolder holder, int position) {
        DeliveryItems item = items[position];
        holder.binding.estimateTxt.setText(item.estimate);
        holder.binding.vinnoTxt.setText(item.vinNo);
        holder.binding.regnumTxt.setText(item.regNum);
        holder.binding.requestedtimeTxt.setText(item.requestTime);
        holder.binding.estimatedateTxt.setText(item.estimateDate);
        holder.binding.requestnoTxt.setText(item.requestNo);
        holder.binding.costTxt.setText(item.cost);
        holder.binding.mrpTxt.setText(item.mrp);
        holder.binding.discountTxt.setText(item.discount);
        holder.binding.viewrequestBtn.setText(item.viewRequest);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
