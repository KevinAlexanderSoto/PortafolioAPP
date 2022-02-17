package com.kalex.portfolioapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class mainFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//aqui se coloca el codigo para interactuar con la UI

        val perfil_img = view.findViewById<ImageView>(R.id.perfil_img)

        Picasso.get().load(R.drawable.mia1_2)
            .transform(CropCircleTransformation())
            .into(perfil_img)

        val btn_github = view.findViewById<FloatingActionButton>(R.id.github)
        val btn_web = view.findViewById<FloatingActionButton>(R.id.web)
        val btn_linked = view.findViewById<FloatingActionButton>(R.id.linked)
        val btn_youtube = view.findViewById<FloatingActionButton>(R.id.youtube)

        btn_github.setOnClickListener {
            val url : Uri =  Uri.parse(getString(R.string.github_page))
            val intent = Intent(Intent.ACTION_VIEW,url)
            startActivity(intent)
        }

        btn_web.setOnClickListener {
            val url : Uri =  Uri.parse(getString(R.string.web_page))
            val intent = Intent(Intent.ACTION_VIEW,url)
            startActivity(intent)
        }

        btn_linked.setOnClickListener {
            val url : Uri =  Uri.parse(getString(R.string.linked_page))
            val intent = Intent(Intent.ACTION_VIEW,url)
            startActivity(intent)
        }

        btn_youtube.setOnClickListener {
            val url : Uri =  Uri.parse(getString(R.string.youtube_page))
            val intent = Intent(Intent.ACTION_VIEW,url)
            startActivity(intent)
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment tecnoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            tecnoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}