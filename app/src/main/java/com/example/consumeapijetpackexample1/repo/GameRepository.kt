package com.example.consumeapijetpackexample1.repo

import com.example.consumeapijetpackexample1.data.remote.GameService
import com.example.consumeapijetpackexample1.domain.item.GameItem
import com.example.consumeapijetpackexample1.domain.item.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService   ) {
    suspend fun getGames(): List<GameItem>{
        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}