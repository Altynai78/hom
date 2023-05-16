package com.example.hw8_5.db.remote

class LoveModel ( @SerializedName("fname")
var firstName: String,
    @SerializedName("sname")
    var secondName: String,
    var percentage: String,
    var result: String?= null

)