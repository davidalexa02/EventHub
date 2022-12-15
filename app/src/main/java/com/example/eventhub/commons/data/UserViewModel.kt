package com.example.eventhub.commons.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UserViewModel(private val userDao: UserDao):ViewModel() {
//    fun fullUsers(email:String,password:String): List<User> = userDao.getUser(email,password)
}

class UserViewModelFactory(
    private val userDao: UserDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UserViewModel(userDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}