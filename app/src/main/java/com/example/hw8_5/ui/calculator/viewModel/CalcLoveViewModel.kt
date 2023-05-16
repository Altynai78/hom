package com.example.hw8_5.ui.calculator.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hw8_5.db.remote.LoveModel
import com.example.hw8_5.mvvm.Repository

@HiltViewModel
class CalcLoveViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    fun liveLove(fName: String, sName: String): LiveData<LoveModel> {
        return repository.getLove(fName, sName)
    }


}