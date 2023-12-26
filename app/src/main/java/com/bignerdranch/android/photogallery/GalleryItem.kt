package com.bignerdranch.android.photogallery

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class GalleryItem(
    var title: String = "",
    @PrimaryKey val id: String,
    @SerializedName("url_s") var url: String = ""
)
