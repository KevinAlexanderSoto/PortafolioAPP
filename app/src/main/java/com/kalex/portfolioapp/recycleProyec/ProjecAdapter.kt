package com.kalex.portfolioapp.recycleProyec

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.kalex.portfolioapp.R
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ProjecAdapter(val ProjectList : ArrayList<ProjecData>) : RecyclerView.Adapter<ProjecAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun binItems(project : ProjecData){

            val title = itemView.findViewById<TextView>(R.id.title_proyec_id)
            val img = itemView.findViewById<ImageView>(R.id.img_proyec_id)
            val desc = itemView.findViewById<TextView>(R.id.desc_proyec_id)
            val ver_btn = itemView.findViewById<Button>(R.id.project_btn)

            title.text = project.title

            fun drawPicasso(link : String){
                Picasso.get().load(link)
                    .into(img)

            }
            project.img?.let {
                when(project.id ){
                    1->{
                        drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1632522439/proyecto1_inwrxo.jpg")
                    }
                    2->{
                        drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1641430289/SP-APLICATION_wvebz9.png")

                    }
                    3->{
                        drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1641429054/portfolio-img_rttb6w.png")

                    }
                    4->{

                        drawPicasso("https://res.cloudinary.com/drx0n5wmw/image/upload/v1634767531/fondo_citas_gim_ehevrn.png")
                    }

                }

            }
            desc.text = project.description


            // set link para cada botton
            ver_btn.setOnClickListener {
                fun action ( dirrecion : String){
                    val option :Bundle? = null
                    val url : Uri =  Uri.parse(dirrecion)
                    val intent = Intent(Intent.ACTION_VIEW,url)
                    startActivity(itemView.context,intent,option)

                }
                when (project.id ){
                    1 -> {
                        action("https://github.com/KevinAlexanderSoto/Did_Aplication")

                    }
                    2 ->{
                        action("https://github.com/KevinAlexanderSoto/SP_Android_APP")

                    }
                    3 ->{
                        action("https://github.com/KevinAlexanderSoto/Portafolio")

                    }
                    4 ->{
                        action("https://github.com/KevinAlexanderSoto/APP_citas_gim")

                    }
                    else->{
                        action("https://kevinalexandersoto.com")

                    }
                }



            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder((LayoutInflater.from(parent.context).inflate(
            R.layout.projec_item,
            parent,
            false
        )))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binItems(ProjectList[position])
    }

    override fun getItemCount(): Int {
        return ProjectList.size
    }

}