package com.example.caramel.ui.buns

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.caramel.R

class BunsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is buns Fragment"
    }
    val text: LiveData<String> = _text

    var itemsBunsList: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.cinbuns, "Булочка с корицей - булочка из мягчайщего теста с приятным ароматом корицы, также нежности булочке придает шапка из творожного сыры", "50 рублей"),
        Triple(R.drawable.krusas, "Круасан - традиционная французкая булочка из слоеного теста. В ассортименте как классические круассаны, так и с различными начинками", "100 рублей"),
        Triple(R.drawable.buns, "Классические булочки - всем знакомые булочки из свежего, мягкого теста. В ассортименте булочки с начинками из яблок, клубники, персиков и шоколада", "30 рублей")
    )

    fun getBunsList() : List<Triple<Int, String, String>> {
        return itemsBunsList
    }
}