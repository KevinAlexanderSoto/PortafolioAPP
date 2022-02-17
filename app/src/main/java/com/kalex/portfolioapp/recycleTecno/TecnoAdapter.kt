package com.kalex.portfolioapp.recycleTecno

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kalex.portfolioapp.R
import com.squareup.picasso.Picasso

class TecnoAdapter(val newList : ArrayList<TecnoData>): RecyclerView.Adapter<TecnoAdapter.ViewHolder> (){

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun binItems(tecno : TecnoData){
            val img = itemView.findViewById<ImageView>(R.id.img_card)
            fun drawPicasso(link : String){
                Picasso.get().load(link)
                    .into(img)

            }
            when(tecno.id){
                1->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1641436461/kotlin_lojw6n.jpg")

                }
                2->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1635082562/gitgiuhb_getelm.jpg")

                }
                3->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1631657360/mysql_hm0cld.png")


                }
                4->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1635082145/html_bootstrap_jvmzhx.png")


                }
                5->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1631657360/lenguaje-javascript_vckrin.png")


                }
                6->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1631657360/node-js-_rdnhbw.png")


                }
                7->{
                    drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1631657911/express-_jmyn8p.png")


                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.tecno_item,
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.binItems(newList[position])
    }

    override fun getItemCount(): Int {
    return newList.size
    }

}