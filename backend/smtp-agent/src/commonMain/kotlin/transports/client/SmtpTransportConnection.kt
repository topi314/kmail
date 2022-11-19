package dev.sitar.kmail.smtp.agent.transports.client

import dev.sitar.kmail.smtp.io.AsyncByteReadChannelReader
import dev.sitar.kmail.smtp.io.AsyncByteWriteChannelWriter

interface SmtpTransportConnection {
    val remote: String

    val isImplicitlyEncrypted: Boolean
        get() = false

    suspend fun upgradeToTls()

    val reader: AsyncByteReadChannelReader
    val writer: AsyncByteWriteChannelWriter

    fun close()
}