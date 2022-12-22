package eu.kanade.tachiyomi.animesource.model

import eu.kanade.tachiyomi.source.model.UpdateStrategy

class SAnimeImpl : SAnime {

    override lateinit var url: String

    override lateinit var title: String

    override var artist: String? = null

    override var author: String? = null

    override var description: String? = null

    override var genre: String? = null

    override var status: Int = 0

    override var thumbnail_url: String? = null

    override var initialized: Boolean = false

    override var update_strategy: UpdateStrategy = UpdateStrategy.ALWAYS_UPDATE
}