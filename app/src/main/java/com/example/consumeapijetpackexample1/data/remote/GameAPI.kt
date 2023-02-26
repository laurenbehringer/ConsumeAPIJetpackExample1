package com.example.consumeapijetpackexample1.data.remote

import com.example.consumeapijetpackexample1.data.remote.model.GamesModel
import com.example.consumeapijetpackexample1.util.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GameAPI {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GamesModel>>

}