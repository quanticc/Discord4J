package discord4j.core.event.domain.guild

import discord4j.core.`object`.entity.Guild
import discord4j.core.event.domain.guild.BanEvent
import discord4j.core.await


suspend fun BanEvent.guild(): Guild = guild.await()