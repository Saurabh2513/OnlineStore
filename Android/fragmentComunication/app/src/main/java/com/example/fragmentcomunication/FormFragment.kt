package com.example.fragmentcomunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentcomunication.databinding.FormFragmentBinding


class FormFragment : Fragment() {
    private lateinit var binding: FormFragmentBinding

    var updateData : String = ""
        set(value) {
            field = value
            binding.edtData.setText(value)
        }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FormFragmentBinding.inflate(inflater)

        binding.btnSendData.setOnClickListener {
            (parentFragmentManager.findFragmentById(R.id.dataFragment)
                    as DataFragment).data = binding.edtData.text.toString()
        }
        return binding.root
    }
}