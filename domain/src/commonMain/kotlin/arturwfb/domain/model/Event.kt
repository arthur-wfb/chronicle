package arturwfb.domain.model

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable
import kotlin.time.Instant

@Serializable
data class Event(
    val id: String,
    val title: String,
    val description: String?,
    val tags: List<Tag>,
    val photos: List<String>,
    val place: String?,
    val priority: Priority,
    val repeatInterval: RepeatInterval,
    val startDate: LocalDate,
    val endDate: LocalDate?,
    val createdAt: Instant,
    val updatedAt: Instant,
    val syncStatus: SyncStatus,
)

@Serializable
enum class RepeatInterval {
    NONE,
    DAILY,
    WEEKLY,
    MONTHLY,
    YEARLY,
}

@Serializable
enum class SyncStatus {
    SYNCED,
    PENDING_CREATE,
    PENDING_UPDATE,
    PENDING_DELETE,
}

@Serializable
enum class Priority {
    LOW,
    MEDIUM,
    HIGH,
}