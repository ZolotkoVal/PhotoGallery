package com.bignerdranch.android.photogallery.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.bignerdranch.android.photogallery.GalleryItem
import kotlinx.coroutines.flow.Flow

@Dao
interface PhotoDao {
    @Query("SELECT * FROM galleryitem")
    fun getPhotos(): Flow<List<GalleryItem>>

    @Insert
    suspend fun addPhoto(photo: GalleryItem)

    @Query("DELETE FROM galleryitem")
    suspend fun deletePhotos()
}