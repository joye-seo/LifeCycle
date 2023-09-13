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
        Toast.makeText(requireContext(), "fragment-onAttach", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(requireContext(), "fragment-onCreate", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(requireContext(), "fragment-onCreateView", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onCreateView")

        _binding = FragmentBlankBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(), "fragment-onViewCreated", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onViewCreated")
        binding.btnBack.setOnClickListener {
            navigateToFirstActivity()
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Toast.makeText(requireContext(), "fragment-onViewStateRestored", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(requireContext(), "fragment-onStart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(requireContext(), "fragment-onResume", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(requireContext(), "fragment-onPause", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(requireContext(), "fragment-onStop", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Toast.makeText(requireContext(), "fragment-onSaveInstanceState", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(requireContext(), "fragment-onDestroyView", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onDestroyView")
    }


    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(requireContext(), "fragment-onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_fragment", "fragment-onDestroy")
        _binding = null
    }

    private fun navigateToFirstActivity() {

        val intent = Intent(activity, FirstActivity::class.java)
        startActivity(intent)
    }

}