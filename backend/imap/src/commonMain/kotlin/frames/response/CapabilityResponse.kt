package dev.sitar.kmail.imap.frames.response

import dev.sitar.kio.async.writers.AsyncWriter
import dev.sitar.kmail.utils.io.writeLineEnd
import dev.sitar.kmail.utils.io.writeStringUtf8

data class CapabilityResponse(val capabilities: List<String>): ImapResponse {
    override suspend fun serialize(output: AsyncWriter) {
        output.writeStringUtf8("CAPABILITY ${capabilities.joinToString(" ")}")
    }
}
