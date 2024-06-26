package com.example.praktikum.adisyahputra.app.shrine.staggeredgridlayout

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.android.volley.toolbox.NetworkImageView
import com.example.praktikum.adisyahputra.app.shrine.R

class StaggeredProductCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var productImage: NetworkImageView = itemView.findViewById(R.id.product_image)
    var productTitle: TextView = itemView.findViewById(R.id.product_title)
    var productPrice: TextView = itemView.findViewById(R.id.product_price)
}
