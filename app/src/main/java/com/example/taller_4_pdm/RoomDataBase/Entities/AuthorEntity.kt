package com.example.taller_4_pdm.RoomDataBase.Entities

import androidx.room.*

@Entity(tableName = "AuthorTable")
data class AuthorEntity (
    @ColumnInfo(name = "a_name")
    val name:String,
    @ColumnInfo(name = "a_books_written")
    val books_written: String

)
{
    @PrimaryKey(autoGenerate = true)
    var id_author : Long = 0
}/*
@Entity(foreignKeys = arrayOf(
    ForeignKey(entity = AuthorEntity::class,
    parentColumns = arrayOf("id_author"),
    childColumns = arrayOf("id_author_book"),
    onDelete = ForeignKey.CASCADE)
))*/

