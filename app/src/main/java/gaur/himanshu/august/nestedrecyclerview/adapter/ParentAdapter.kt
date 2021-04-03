package gaur.himanshu.august.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import gaur.himanshu.august.nestedrecyclerview.databinding.ParentRecyclerViewBinding
import gaur.himanshu.august.nestedrecyclerview.model.Parent

class ParentAdapter(val list: List<Parent>) : RecyclerView.Adapter<ParentAdapter.MyViewHolder>() {

    inner class MyViewHolder(val viewDataBinding: ParentRecyclerViewBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentAdapter.MyViewHolder {
        val binding =
            ParentRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParentAdapter.MyViewHolder, position: Int) {
       holder.viewDataBinding.section.text= list[position].section


        holder.viewDataBinding.childRecyclerView.apply {
            adapter= ChildAdapter(list[position].list)
        }

    }

    override fun getItemCount(): Int {
       return list.size
    }
}