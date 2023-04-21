package com.mgomezm.mysolidnotes.framework

import android.content.Context
import com.mgomezm.core.data.Note
import com.mgomezm.core.repository.NoteDataSource
import com.mgomezm.mysolidnotes.framework.database.DatabaseService
import com.mgomezm.mysolidnotes.framework.database.NoteEntity

class RoomNoteDataSource(context: Context) : NoteDataSource {

    private val noteDao = DatabaseService.getInstance(context).noteDao()

    override suspend fun add(note: Note) {
        return noteDao.addNoteEntity(NoteEntity.fromNoteToNoteEntity(note))
    }

    override suspend fun get(id: Long): Note? {
        return noteDao.getNoteEntity(id)?.fromNoteEntityToNote()
    }

    override suspend fun getAll(): List<Note> {
        return noteDao.getAllNotesEntities().map { it.fromNoteEntityToNote() }
    }

    override suspend fun remove(note: Note) {
        return noteDao.deleteNoteEntity(NoteEntity.fromNoteToNoteEntity(note))
    }
}