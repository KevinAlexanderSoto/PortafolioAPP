package com.kalex.portfolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kalex.portfolioapp.recycleTecno.TecnoAdapter
import com.kalex.portfolioapp.recycleTecno.TecnoData

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [tecnoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class tecnoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    //para el recycleview
    private var layoutManager : RecyclerView.LayoutManager? = null

    //declaramos el adapter que hemos creado
    private lateinit var adapter : TecnoAdapter


    //array de TecnoData para mostrar

    val tecnoList = ArrayList<TecnoData>()

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
        return inflater.inflate(R.layout.fragment_tecno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerVViewTecno = view.findViewById<RecyclerView>(R.id.recycleViewTecno)

        layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)

        recyclerVViewTecno.layoutManager = layoutManager

        adapter = TecnoAdapter(newList = tecnoList)

        recyclerVViewTecno.adapter = adapter

    }

private fun createData(){
    tecnoList.add(TecnoData(1,R.drawable.ic_launcher_background))
    tecnoList.add(TecnoData(2,R.drawable.ic_launcher_background))
    tecnoList.add(TecnoData(3,R.drawable.ic_launcher_background))
    tecnoList.add(TecnoData(4,R.drawable.ic_launcher_background))
    tecnoList.add(TecnoData(5,R.drawable.ic_launcher_background))
    tecnoList.add(TecnoData(6,R.drawable.ic_launcher_background))
    tecnoList.add(TecnoData(7,R.drawable.ic_launcher_background))
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