package com.mgomezm.core.usecases

import com.mgomezm.core.data.Note
import com.mgomezm.core.repository.NoteRepository

class RemoveNoteUseCase(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}