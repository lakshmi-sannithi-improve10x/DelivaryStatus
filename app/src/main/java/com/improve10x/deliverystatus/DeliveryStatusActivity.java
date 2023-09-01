package com.improve10x.deliverystatus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.improve10x.deliverystatus.databinding.ActivityDeliveryStatusBinding;

public class DeliveryStatusActivity extends AppCompatActivity {
    private ActivityDeliveryStatusBinding binding;
    private DeliveryItems[] deliveryItems;
    private DeliveryItemsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeliveryStatusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        createData();
        setupAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        binding.deliveryRv.setLayoutManager(new LinearLayoutManager(this));
        binding.deliveryRv.setAdapter(adapter);
    }

    private void setupAdapter() {
      adapter = new DeliveryItemsAdapter(deliveryItems);
    }

    private void createData() {
        deliveryItems = new DeliveryItems[4];
        deliveryItems[0] = new DeliveryItems();
        deliveryItems[0].estimate = "Waiting for Estimate";
        deliveryItems[0].vinNo = "xxxxxxxxx,";
        deliveryItems[0].regNum = "xxxxxxxxx";
        deliveryItems[0].requestTime = "27 Mar 2023,4.08PM";
        deliveryItems[0].estimateDate = "28 Mar 2023,5.12PM";
        deliveryItems[0].requestNo = "AZ214752";
        deliveryItems[0].cost = "58,609.46";
        deliveryItems[0].mrp = "MRP $76074.73";
        deliveryItems[0].discount = "45% OFF";
        deliveryItems[0].viewRequest = "View Request";

        deliveryItems[1] = new DeliveryItems();
        deliveryItems[1].estimate = "Waiting for Estimate";
        deliveryItems[1].vinNo = "xxxxxxxxx,";
        deliveryItems[1].regNum = "xxxxxxxxx";
        deliveryItems[1].requestTime = "27 Mar 2023,4.08PM";
        deliveryItems[1].estimateDate = "28 Mar 2023,5.12PM";
        deliveryItems[1].requestNo = "AZ214752";
        deliveryItems[1].cost = "58,609.46";
        deliveryItems[1].mrp = "MRP $76074.73";
        deliveryItems[1].discount = "45% OFF";
        deliveryItems[1].viewRequest = "Order Now";

        deliveryItems[2] = new DeliveryItems();
        deliveryItems[2].estimate = "Waiting for Estimate";
        deliveryItems[2].vinNo = "xxxxxxxxx,";
        deliveryItems[2].regNum = "xxxxxxxxx";
        deliveryItems[2].requestTime = "27 Mar 2023,4.08PM";
        deliveryItems[2].estimateDate = "28 Mar 2023,5.12PM";
        deliveryItems[2].requestNo = "AZ214752";
        deliveryItems[2].cost = "58,609.46";
        deliveryItems[2].mrp = "MRP $76074.73";
        deliveryItems[2].discount = "45% OFF";
        deliveryItems[2].viewRequest = "View Request";

        deliveryItems[3] = new DeliveryItems();
        deliveryItems[3].estimate = "Waiting for Estimate";
        deliveryItems[3].vinNo = "xxxxxxxxx,";
        deliveryItems[3].regNum = "xxxxxxxxx";
        deliveryItems[3].requestTime = "27 Mar 2023,4.08PM";
        deliveryItems[3].estimateDate = "28 Mar 2023,5.12PM";
        deliveryItems[3].requestNo = "AZ214752";
        deliveryItems[3].cost = "58,609.46";
        deliveryItems[3].mrp = "MRP $76074.73";
        deliveryItems[3].discount = "45% OFF";
        deliveryItems[3].viewRequest = "Order now";
    }
}