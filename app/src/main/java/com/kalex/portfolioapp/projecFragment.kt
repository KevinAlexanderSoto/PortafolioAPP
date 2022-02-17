package com.kalex.portfolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kalex.portfolioapp.recycleProyec.ProjecAdapter
import com.kalex.portfolioapp.recycleProyec.ProjecData
import com.kalex.portfolioapp.recycleTecno.TecnoAdapter
import com.kalex.portfolioapp.recycleTecno.TecnoData

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [proyecFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class proyecFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    private lateinit var layoutManager : RecyclerView.LayoutManager

    private lateinit var adapter : ProjecAdapter

    val projetList = ArrayList<ProjecData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        createData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_proyec, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewTecno = view.findViewById<RecyclerView>(R.id.recycleViewProyec)
        layoutManager = LinearLayoutManager(view.context , LinearLayoutManager.VERTICAL , false)
        viewTecno.layoutManager = layoutManager

        adapter = ProjecAdapter(ProjectList = projetList)

        viewTecno.adapter = adapter

    }
    private fun createData(){
        projetList.add(ProjecData(id =1,title="TODID APP",R.drawable.github_icon,"Apliaciòn de consola"))
        projetList.add(ProjecData(id =2,title="SP-APLICATION",R.drawable.github_icon,"APP nativa Android, con Kotlin y Jetpack Compose"))
        projetList.add(ProjecData(id =4,title="REST APP",R.drawable.github_icon,"API administrador de citas para Gim"))
        projetList.add(ProjecData(id =3,title="PORTAFOLIO",R.drawable.github_icon,"Landing page con bootstrap y Scss"))

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment proyecFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            proyecFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}