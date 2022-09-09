package cn.galasp.recyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class SimpleRecyclerViewAdapter : RecyclerView.Adapter<SimpleRecyclerViewAdapter.MyViewHolder>() {
    private var arrayList: ArrayList<String> = arrayListOf()

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.title.text = arrayList[position]
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    public fun addData(text:String){
        arrayList.add(text)
        notifyDataSetChanged()
    }

}