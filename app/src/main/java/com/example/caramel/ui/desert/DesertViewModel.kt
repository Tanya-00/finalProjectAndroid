package com.example.caramel.ui.desert

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.caramel.R

class DesertViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is desert Fragment"
    }
    val text: LiveData<String> = _text

    var desertList: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.macaron, "Макарон - ранцузское кондитерское изделие из яичных белков, сахара и молотого миндаля, между двумя слоями кладут крем или варенье", "500 рублей"),
        Triple(R.drawable.pahlava, "Пахлава - восточный десерт виде пропитанного маслом и сиропом слоёного пирога с начинкой из растёртых орехов, сахара и кардамона", "600 рублей"),
        Triple(R.drawable.panakota, "Панакота - североитальянский десерт из сливок, сахара, желатина и ванили. Родиной десерта является итальянский Пьемонт", "300 рублей")
        )

    fun getDesertsList() : List<Triple<Int, String, String>> {
        return desertList
    }
}