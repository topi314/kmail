package dev.sitar.kmail.imap.frames.command

import dev.sitar.kio.async.readers.AsyncReader
import dev.sitar.kmail.utils.io.readUtf8UntilLineEnd

object StartTlsCommand : ImapCommand, ImapCommandSerializer<StartTlsCommand> {
    override val identifier = ImapCommand.Identifier.StartTls

    override suspend fun deserialize(input: AsyncReader): StartTlsCommand {
        return StartTlsCommand
    }
}