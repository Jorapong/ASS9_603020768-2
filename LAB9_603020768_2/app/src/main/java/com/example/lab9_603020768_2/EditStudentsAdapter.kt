package com.example.lab9_603020768_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.edit_delete_item_layout.view.*
import java.security.AccessControlContext

class EditStudentsAdapter (val item : List<Student>,val context: Context) :
    RecyclerView.Adapter<EditStudentsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EditStudentsAdapter.ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.edit_delete_item_layout,parent,false)
        return ViewHolder(view_item)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: EditStudentsAdapter.ViewHolder, position: Int) {
        holder.tvID?.text=item[position].std_id
        holder.tvName?.text=item[position].std_name
    }
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val tvID = view.tvID
        val tvName = view.tvName
    }
}