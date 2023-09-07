package com.navercorp.scavenger.dto

import java.time.Instant

data class EnvironmentDetailDto(
    val id: Long,
    val name: String,
    val jvmCount: Long,
    val invocationCount: Long,
    val snapshotCount: Long,
    val createdAt: Instant,
)
