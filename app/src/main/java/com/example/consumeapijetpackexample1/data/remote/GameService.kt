package com.example.consumeapijetpackexample1.data.remote

import com.example.consumeapijetpackexample1.data.remote.model.GamesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GameService @Inject constructor(private val gameAPI: GameAPI) {

    suspend fun getGames(): List<GamesModel>{
        return withContext(Dispatchers.IO){
            val games = gameAPI.getGames()
            games.body() ?: emptyList()
        }
    }

}