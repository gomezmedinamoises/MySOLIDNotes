package com.mgomezm.mysolidnotes.framework

import com.mgomezm.core.usecases.AddNoteUseCase
import com.mgomezm.core.usecases.GetAllNotesUseCase
import com.mgomezm.core.usecases.GetNoteUseCase
import com.mgomezm.core.usecases.RemoveNoteUseCase

data class UseCases(
    val addNoteUseCase: AddNoteUseCase,
    val getAllNotesUseCase: GetAllNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val removeNoteUseCase: RemoveNoteUseCase
)