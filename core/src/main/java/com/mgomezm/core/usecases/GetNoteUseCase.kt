package com.mgomezm.core.usecases

import com.mgomezm.core.repository.NoteRepository

class GetNoteUseCase(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(id: Long) = noteRepository.getNote(id)
}