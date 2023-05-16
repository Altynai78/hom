package com.example.hw8_5.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Love(
                @PrimaryKey(autoGenerate = true)
var id: Int? = null,
var firstName: String?= null,
var secondName: String?= null,
var percentage: String?= null
): java.io.Serializable

