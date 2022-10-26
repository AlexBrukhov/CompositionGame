package alexbrukhov.compositiongame.domain.repository

import alexbrukhov.compositiongame.domain.entity.GameSettings
import alexbrukhov.compositiongame.domain.entity.Level
import alexbrukhov.compositiongame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
