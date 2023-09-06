package com.codechartruex.mysms.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.codechartruex.mysms.R;
import com.codechartruex.mysms.model.SmsData;

import java.util.List;

public class SmsAdapter extends RecyclerView.Adapter<SmsAdapter.ViewHolder> {
    private List<SmsData> smsList;

    public SmsAdapter(List<SmsData> smsList) {
        this.smsList = smsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sms_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SmsData sms = smsList.get(position);
        holder.senderTextView.setText("From: " + sms.getSender());
        holder.messageTextView.setText("Message: " + sms.getMessage());
    }

    @Override
    public int getItemCount() {
        return smsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView senderTextView;
        public TextView messageTextView;

        public ViewHolder(View view) {
            super(view);
            senderTextView = view.findViewById(R.id.smsSender);
            messageTextView = view.findViewById(R.id.smsMessage);
        }
    }
}
