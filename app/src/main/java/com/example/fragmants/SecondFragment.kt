package com.example.fragmants

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("OnAttach has been called for 2nd Fragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("OnCreate has been called for 2nd Fragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("OnCreateView has been called for 2nd Fragment")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        println("OnActivityCreated has been called for 2nd Fragment")
    }

    override fun onResume() {
        super.onResume()
        println("OnResume has been called for 2nd Fragment")
    }
    override fun onStart() {
        super.onStart()
        println("OnStart has been called for 2nd Fragment")
    }

    override fun onPause() {
        super.onPause()
        println("OnPause has been called for 2nd Fragment")
    }

    override fun onStop() {
        super.onStop()
        println("OnStop has been called for 2nd Fragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("OnDestroy has been called for 2nd Fragment")

    }
}