package com.example.jeh.irhamfakhri_1202150070_modul6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jeh on 4/1/2018.
 */

public class AdapterKomen extends RecyclerView.Adapter<AdapterKomen.CommentHolder>{
    Context con;
    List<DatabaseKomen> list;

    public AdapterKomen(Context con, List<DatabaseKomen> list) {
        this.con = con;
        this.list = list;
    }
    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CommentHolder(LayoutInflater.from(con).inflate(R.layout.cv_comment, parent, false));
    }

    @Override
    public void onBindViewHolder(CommentHolder holder, int position) {
        DatabaseKomen cur = list.get(position);
        holder.sikomen.setText(cur.getSikomen());
        holder.komen.setText(cur.getKomen());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CommentHolder extends RecyclerView.ViewHolder {
        TextView sikomen, komen;
        public CommentHolder(View itemView) {
            super(itemView);
            sikomen = itemView.findViewById(R.id.yangkomen);
            komen = itemView.findViewById(R.id.komen);
        }
    }
}
