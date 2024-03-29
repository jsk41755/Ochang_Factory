package com.example.ochangfactory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Menu_1_3Adapter extends RecyclerView.Adapter<Menu_1_3Adapter.Menu_1_3Holder> {

    String data1[], data2[];
    String data3[];
    Context context;

    public Menu_1_3Adapter(Context ct, String[] s1, String[] s2, String[] s3){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
    }

    @NonNull
    @Override
    public Menu_1_3Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.samsung_1_3_row, parent, false);
        return new Menu_1_3Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Menu_1_3Holder holder, int position) {
        holder.using.setText(data1[position]);
        holder.note.setText(data2[position]);
        holder.num.setText(data3[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class Menu_1_3Holder extends RecyclerView.ViewHolder {

        TextView using, note, num;

        public Menu_1_3Holder(@NonNull View itemView) {
            super(itemView);
            using = itemView.findViewById(R.id.using);
            note = itemView.findViewById(R.id.note);
            num = itemView.findViewById(R.id.samsung_1_3_num);
        }
    }
}
