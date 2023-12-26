package com.bignerdranch.android.photogallery.database


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.bignerdranch.android.photogallery.GalleryItem

@Dao

interface GalleryDao {
    @Query("SELECT * FROM gallery")
    fun getphotos(): LiveData<List<GalleryItem>>
    @Query("SELECT * FROM gallery WHERE url = :photoUrl")
    fun getPhotoByUrl(photoUrl: String): GalleryItem?
    @Insert
    fun addphoto(galleryItem: GalleryItem)

    @Query("DELETE FROM gallery")
    fun deletephotos(): LiveData<List<GalleryItem>>
}