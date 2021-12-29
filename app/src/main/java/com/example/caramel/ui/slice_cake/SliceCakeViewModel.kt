package com.example.caramel.ui.slice_cake

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.caramel.R

class SliceCakeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text

    var sliceCakeList: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.cheesecake, "Чизкейк - один из самых популярных тортов в мире продается у нас в кондитерской в виде кусочков", "200 рублей"),
        Triple(R.drawable.beze, "Безе - очень нежное и легкое пирожное, хруст которого не оставит вас равнодушными", "150 рублей за коробочку"),
        Triple(R.drawable.ecler, "Эклеры сделаны из легкого теста, начинкой которого являетя нежный крем, и в конце все украшается глазурью", "300 рублей")
    )

    fun getSliceList() : List<Triple<Int, String, String>> {
        return sliceCakeList
    }
}