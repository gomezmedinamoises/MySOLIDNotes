package com.mgomezm.core.usecases

import com.mgomezm.core.data.Note
import com.mgomezm.core.repository.NoteRepository

class AddNoteUseCase(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}