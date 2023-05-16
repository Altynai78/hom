package com.example.hw8_5.ui.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw8_5.R
import com.example.hw8_5.preference.Pref
import com.example.hw8_5.ui.onboard.adapter.OnBoardAdapter

@AndroidEntryPoint
@WithFragmentBindings
class OnBoardFragment : Fragment() {
    @Inject
    lateinit var prefH: Pref
    private lateinit var binding: FragmentOnBoardBinding
    private val adapter = OnBoardAdapter(this::onStartClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = adapter
    }

    private fun onStartClick() {
        prefH.saveSeen()
        findNavController().navigate(R.id.calculatorFragment)
    }
}