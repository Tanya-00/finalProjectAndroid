package com.example.caramel.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.caramel.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _nameCon = MutableLiveData<String>().apply {
        value = "Confectionery Caramel"
    }
    val nameCon: LiveData<String> = _nameCon

    var items: List<String> = listOf(
        "Торты",
        "Пирожные",
        "Булочки",
        "Десерты"
    )

    var itemsHomeList: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.ic_cake, "Торт - прекрасное дополнение к любому празднику. Им можно порадовать себя и своих близких", "от 450 до 1000 рублей"),
        Triple(R.drawable.ic_slice_cake, "Пирожное может быть прекрасным дополнением после обеда или ужина, а также может служить завтраком", "от 150 до 500 рублей"),
        Triple(R.drawable.ic_buns, "Булочки прекрасно могут служить как самостоятельным блюдом, так и дополнением к чаепитию", "от 25 до 150 рублей"),
        Triple(R.drawable.ic_desert, "Десерт - прекрасный способ себя пабаловать после насыщенного дня или просто в выходной день", "от 200 до 750 рублей")
    )

    fun getItemsList() : List<String> {
        return items
    }

    fun getHomeList() : List<Triple<Int, String, String>> {
        return itemsHomeList
    }
}