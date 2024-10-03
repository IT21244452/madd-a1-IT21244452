package com.example.harmonicheaven.models

data class categoryModel(
    val name : String,
    val coverUrl : String,
    val songs : List<String>
){
    constructor() : this("","", listOf())
}
