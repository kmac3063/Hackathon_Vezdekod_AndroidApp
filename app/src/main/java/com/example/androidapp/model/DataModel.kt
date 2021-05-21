package com.example.androidapp.model

object DataModel {
    private var userList: MutableList<User> = ArrayList()

    fun getUsers(): List<User> {
        return userList
    }
}

class User {
    var name: String = ""
}