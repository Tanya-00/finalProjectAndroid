package com.example.caramel.ui.cake

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.caramel.R

class CakeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is cake Fragment"
    }
    val text: LiveData<String> = _text

    var cakeList: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.lemoncake, "Лимонный торт. Нежный ванильно-лимонный бисквит прекрасно дополняется лимонным кремом, кислинку которого сглаживает творожный крем", "500 рублей"),
        Triple(R.drawable.tropiccake, "Тропический торт. Основой служит кокосовый бисквит, слои которого разделяет манговый мусс и фруктовый топпинг", "750 рублей"),
        Triple(R.drawable.mforestcake, "Мистический лес. Бисквит из темного шокола в соченании с сочными и ярким вкусом лесных ягод", "800 рублей")
    )

    fun getCakesList() : List<Triple<Int, String, String>> {
        return cakeList
    }
}