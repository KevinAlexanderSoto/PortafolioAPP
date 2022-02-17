package com.kalex.portfolioapp.recycleProyec

import androidx.annotation.DrawableRes

data class ProjecData(
    val id :Int ,
    val title : String,
    @DrawableRes
    val img : Int?,
    val description : String

)
