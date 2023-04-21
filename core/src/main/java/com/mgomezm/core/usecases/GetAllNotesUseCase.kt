package com.mgomezm.core.usecases

import com.mgomezm.core.repository.NoteRepository

class GetAllNotesUseCase(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}