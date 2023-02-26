package com.example.consumeapijetpackexample1.domain

import com.example.consumeapijetpackexample1.domain.item.GameItem
import com.example.consumeapijetpackexample1.repo.GameRepository
import javax.inject.Inject

class GetGameUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(): List<GameItem>{
        return gameRepository.getGames().shuffled()
    }

}