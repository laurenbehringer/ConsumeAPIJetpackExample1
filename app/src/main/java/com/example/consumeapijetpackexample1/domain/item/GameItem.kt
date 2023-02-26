package com.example.consumeapijetpackexample1.domain.item

import com.example.consumeapijetpackexample1.data.remote.model.GamesModel

data class GameItem(
    val developer: String,
    val freetogame_profile_url: String,
    val game_url: String,
    val genre: String,
    val id: Int,
    val platform: String,
    val publisher: String,
    val release_date: String,
    val short_description: String,
    val thumbnail: String,
    val title: String
)

fun GamesModel.toGameItem() = GameItem(developer, freetogame_profile_url, game_url, genre, id, platform, publisher, release_date, short_description, thumbnail, title)