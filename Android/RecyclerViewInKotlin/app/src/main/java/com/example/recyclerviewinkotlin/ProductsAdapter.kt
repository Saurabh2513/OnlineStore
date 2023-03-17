package com.example.recyclerviewinkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter(
    private var products:ArrayList<Product>,
    private var advertisements: ArrayList<Product>
        ) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    val VIEW_TYPE_PRODUCT = 1
    val VIEW_TYPE_ADVERTISEMENT = 2

    private lateinit var product: Product
    private lateinit var imgProduct: ImageView
    private lateinit var txtProductTitle : TextView
    private lateinit var txtProductPrice : TextView

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgProduct : ImageView
        var txtProductTitle : TextView
        var txtProductPrice : TextView
        init {
            imgProduct = itemView.findViewById(R.id.imgProduct)
            txtProductPrice = itemView.findViewById(R.id.txtProductPrice)
            txtProductTitle = itemView.findViewById(R.id.txtProductTitle)
        }
    }

    class AdvertisementViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtAdvertisementTitle : TextView
        init {
            txtAdvertisementTitle = itemView.findViewById(R.id.txtAdvertisementTitle)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder {
        var layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)

        if(viewType == VIEW_TYPE_PRODUCT){
            var productView : View = layoutInflater.inflate(R.layout.product_view,null)
            return ProductViewHolder(productView)
        }

        var advertisementView = layoutInflater.inflate(R.layout.advertisement_view,null)
        return AdvertisementViewHolder(advertisementView)

    }
    override fun getItemViewType(position: Int): Int {
        if((position+1)%3 == 0){
            return VIEW_TYPE_ADVERTISEMENT
        }
        return VIEW_TYPE_PRODUCT
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ProductViewHolder){
            var product = products[position - position/3]
            holder.txtProductTitle.text = product.title
            holder.txtProductPrice.text = "Rs. ${product.price}"
        }

        if(holder is AdvertisementViewHolder){
            var advertisementPosition = (position+1)/3 - 1
            if(advertisementPosition >= advertisements.size){
                advertisementPosition = advertisementPosition % 5
            }

            var advertisement = advertisements[advertisementPosition]

            holder.txtAdvertisementTitle.text = advertisement.title
        }
    }

    override fun getItemCount(): Int {
        return products.size + advertisements.size
    }

}

