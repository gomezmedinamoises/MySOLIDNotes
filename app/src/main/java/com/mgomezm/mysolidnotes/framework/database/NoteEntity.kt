package com.mgomezm.mysolidnotes.framework.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mgomezm.core.data.Note

@Entity(tableName = "note")
data class NoteEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val title: String,
    val content: String,

    @ColumnInfo(name = "creation_date")
    val creationTime: Long,

    @ColumnInfo(name = "update_time")
    val updateTime: Long
) {
    companion object {
        fun fromNoteToNoteEntity(note: Note) : NoteEntity {
            return NoteEntity(
                title = note.title,
                content = note.content,
                creationTime = note.creationTime,
                updateTime = note.updateTime
            )
        }
    }

    fun fromNoteEntityToNote() : Note = Note(title, content, creationTime, updateTime, id)
}