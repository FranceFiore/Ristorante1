package com.example.ristorante


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_menu.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        primi.setOnClickListener {
            textView.setText("Primi piatti")
        }
        secondi.setOnClickListener {
            textView.setText("Secondi piatti")
        }
        pizze.setOnClickListener {
            textView.setText("Pizze")
        }
        dolci.setOnClickListener {
            textView.setText("Dolci")
        }
        bibite.setOnClickListener {
            textView.setText("Bibite")
        }
        aiuto.setOnClickListener {
            textView.setText("Chiama aiuto")
        }
        paga.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_pagaFragment)
        }
        invia.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_inviaFragment)
        }

    }

}

