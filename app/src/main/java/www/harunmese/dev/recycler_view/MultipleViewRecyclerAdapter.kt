package www.harunmese.dev.recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import www.harunmese.dev.recycler_view.databinding.RecyclerviewAnotherItemBinding
import www.harunmese.dev.recycler_view.databinding.RecylerviewItemBinding

class MultipleViewRecyclerAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val VIEW_TYPE_1 = 1
    private val VIEW_TYPE_2 = 2



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            VIEW_TYPE_2 -> {
                val view = RecyclerviewAnotherItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                AnotherViewViewHolder(view)
            }
            VIEW_TYPE_1 -> {
                // Diğer view tipleri için gerekli view holder'lar burada oluşturulabilir
                // Örnek olarak: val view = LayoutInflater.from(parent.context).inflate(R.layout.other_layout, parent, false)
                // OtherViewHolder(view)
                val view = RecylerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                DefaultViewHolder(view)
            }
            else -> {

                val view = RecylerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                DefaultViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder.itemViewType) {
            VIEW_TYPE_2 -> {


            }
            VIEW_TYPE_1 -> {


            }
            else -> {


            }
        }
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun getItemViewType(position: Int): Int {
        // Her bir pozisyona göre view tipinin belirlenmesi
        return when (position) {
            0 -> VIEW_TYPE_2
            else -> VIEW_TYPE_1
        }
    }


    class AnotherViewViewHolder(itemView: RecyclerviewAnotherItemBinding) : RecyclerView.ViewHolder(itemView.root) {


    }

    class DefaultViewHolder(itemView: RecylerviewItemBinding) : RecyclerView.ViewHolder(itemView.root) {

    }


}