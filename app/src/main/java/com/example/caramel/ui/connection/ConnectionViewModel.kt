package com.example.caramel.ui.connection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConnectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is cake Fragment"
    }
    val text: LiveData<String> = _text

    private val _inf = MutableLiveData<String>().apply {
        value = "Информация о приложении"
    }
    val inf: LiveData<String> = _inf

    private val _infCafe = MutableLiveData<String>().apply {
        value = "Данное приложение было написано для перкрасной кондитерской Caramel, которая предоставляет ассортимент свежайших сладостей"
    }
    val infCafe: LiveData<String> = _infCafe

    private val _atFoto = MutableLiveData<String>().apply {
        value = "На фотографии ниже вы можете увидеть саму кондитерскую"
    }
    val atFoto: LiveData<String> = _atFoto

    private val _aboutCafe = MutableLiveData<String>().apply {
        value = "Кондитерская небольшая, но очень уютная, свежий аромат выпечки так и манит зайти, и взять вкусное дополнение к чаю"
    }
    val aboutCafe: LiveData<String> = _aboutCafe

    private val _inApp = MutableLiveData<String>().apply {
        value = "В приложении вы сможете узнать ассортимент кондитерской из любой точки, и заранее решить, что вы хотите приобрести"
    }
    val inApp: LiveData<String> = _inApp

    private val _dev = MutableLiveData<String>().apply {
        value = "Автором приложения является разработчик по имени Татьяна"
    }
    val dev: LiveData<String> = _dev

    private val _dev2 = MutableLiveData<String>().apply {
        value = "Если вы найдете какие-то недостатки в приложении, то связаться с разработчиком можно через https://vk.com/taki_fox"
    }
    val dev2: LiveData<String> = _dev2
}