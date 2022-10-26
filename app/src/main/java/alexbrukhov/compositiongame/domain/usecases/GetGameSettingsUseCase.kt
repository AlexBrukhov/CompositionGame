package alexbrukhov.compositiongame.domain.usecases

import alexbrukhov.compositiongame.domain.entity.GameSettings
import alexbrukhov.compositiongame.domain.entity.Level
import alexbrukhov.compositiongame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}