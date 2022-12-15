package com.example.eventhub.commons.use_cases

import com.example.eventhub.commons.data.User
import com.example.eventhub.commons.data.UserRepository

class AddUserUseCase(private val userRepository: UserRepository) {
    suspend fun execute(user: User){
        userRepository.addUser(user)
    }
}