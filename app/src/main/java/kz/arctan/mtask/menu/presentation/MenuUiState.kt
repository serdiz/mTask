package kz.arctan.mtask.menu.presentation

import androidx.compose.ui.graphics.painter.Painter
import kz.arctan.mtask.common.domain.entity.Board
import kz.arctan.mtask.common.domain.entity.Task
import kz.arctan.mtask.common.domain.entity.TaskGroup
import java.time.LocalDateTime

data class MenuUiState(
    val username: String = "Username",
    val boards: List<Board> = listOf(
        Board(
            title = "Board Name",
            description = "Long long long description written by me",
            date = LocalDateTime.now(),
            taskGroups = listOf(
                TaskGroup(
                    title = "Task Group1",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                ),
                TaskGroup(
                    title = "Task group 2",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                )
            )
        ),
        Board(
            title = "Board Name",
            description = "Long long long description written by me",
            date = LocalDateTime.now(),
            taskGroups = listOf(
                TaskGroup(
                    title = "Task Group1",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                ),
                TaskGroup(
                    title = "Task group 2",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                )
            )
        ),Board(
            title = "Board Name",
            description = "Long long long description written by me",
            date = LocalDateTime.now(),
            taskGroups = listOf(
                TaskGroup(
                    title = "Task Group1",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                ),
                TaskGroup(
                    title = "Task group 2",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                )
            )
        ),
        Board(
            title = "Board Name",
            description = "Long long long description written by me",
            date = LocalDateTime.now(),
            taskGroups = listOf(
                TaskGroup(
                    title = "Task Group1",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                ),
                TaskGroup(
                    title = "Task group 2",
                    tasks = listOf(
                        Task(
                            name = "An incomplete task",
                            isCompleted = false
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        ),
                        Task(
                            name = "A completed task",
                            isCompleted = true
                        )
                    )
                )
            )
        ),
    ),
)
