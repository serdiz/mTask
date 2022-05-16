package kz.arctan.mtask.common.domain.entity

data class TaskGroup(
    val title: String,
    val tasks: List<Task>
)
