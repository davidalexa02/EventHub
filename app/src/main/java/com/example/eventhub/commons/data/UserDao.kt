package com.example.eventhub.commons.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getUser(): Flow<List<User>>

    @Insert
    suspend fun addUser(user: User)
}