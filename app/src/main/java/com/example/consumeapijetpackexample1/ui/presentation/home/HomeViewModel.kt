package com.example.consumeapijetpackexample1.ui.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.consumeapijetpackexample1.domain.GetGameUseCase
import com.example.consumeapijetpackexample1.domain.item.GameItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val getGameUseCase: GetGameUseCase) : ViewModel(){
    private val _games = MutableStateFlow(emptyList<GameItem>())
    val games: StateFlow<List<GameItem>> get() = _games

    init {
       getGames()
    }

    private fun getGames(){

        viewModelScope.launch {

            try{

                val games = getGameUseCase()
                _games.value = games

            } catch (_: Exception ){

            }

        }

    }

}