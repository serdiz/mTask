package kz.arctan.mtask.common.domain.entity

import java.time.LocalDateTime

data class Board(
    val title: String,
    val description: String,
    val date: LocalDateTime,
    val taskGroups: List<TaskGroup>
)
