package com.example.learnfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.learnfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager   // this is responsible for performing tasks on the fragment, this is a class
                                                           // Like replacing, adding or removing a fragment

    private lateinit var binding: ActivityMainBinding  // Acivity"Main"Binding is called because of declaring it in the MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // fetch the layout
        setContentView(binding.root) // fetch the root layout, this has every element present inside it

       binding.fragmentButton1.setOnClickListener {
           goToFragment(Fragment1())
       }

        binding.fragmentButton2.setOnClickListener {
            goToFragment(Fragment2())
        }
    }

    private fun goToFragment(fragment: Fragment)
    {
        fragmentManager = supportFragmentManager // returns the fragment manager

        /* beingTransaction - is the function of change( like adding, removing or replacing)
         * Replaces the fragment container with a new fragment
         * commit - made the changes
         */
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}