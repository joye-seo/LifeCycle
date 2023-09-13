package com.example.lifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lifecycle.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)

        requireContext().toast("fragment-onAttach")
        Log.d("lifecycle_fragment", "fragment-onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requireContext().toast("fragment-onCreate")
        Log.d("lifecycle_fragment", "fragment-onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        requireContext().toast("fragment-onCreateView")
        Log.d("lifecycle_fragment", "fragment-onCreateView")

        _binding = FragmentBlankBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireContext().toast("fragment-onViewCreated")
        Log.d("lifecycle_fragment", "fragment-onViewCreated")
        binding.btnBack.setOnClickListener {
            navigateToFirstActivity()
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        requireContext().toast("fragment-onViewStateRestored")
        Log.d("lifecycle_fragment", "fragment-onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()

        requireContext().toast("fragment-onStart")
        Log.d("lifecycle_fragment", "fragment-onStart")
    }

    override fun onResume() {
        super.onResume()

        requireContext().toast("fragment-onResume")
        Log.d("lifecycle_fragment", "fragment-onResume")
    }

    override fun onPause() {
        super.onPause()

        requireContext().toast("fragment-onPause")
        Log.d("lifecycle_fragment", "fragment-onPause")
    }

    override fun onStop() {
        super.onStop()

        requireContext().toast("fragment-onStop")
        Log.d("lifecycle_fragment", "fragment-onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        requireContext().toast("fragment-onSaveInstanceState")
        Log.d("lifecycle_fragment", "fragment-onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        requireContext().toast("fragment-onDestroyView")
        Log.d("lifecycle_fragment", "fragment-onDestroyView")
    }


    override fun onDestroy() {
        super.onDestroy()

        requireContext().toast("fragment-onDestroy")
        Log.d("lifecycle_fragment", "fragment-onDestroy")
        _binding = null
    }

    private fun navigateToFirstActivity() {

        val intent = Intent(activity, FirstActivity::class.java)
        startActivity(intent)
    }

}