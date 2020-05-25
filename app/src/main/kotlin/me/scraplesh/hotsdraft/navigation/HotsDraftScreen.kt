package me.scraplesh.hotsdraft.navigation

import me.scraplesh.features.selectbattleground.SelectBattlegroundFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

sealed class HotsDraftScreen : SupportAppScreen() {
    object SelectBattleground : HotsDraftScreen() {
        override fun getFragment() = SelectBattlegroundFragment()
    }
}
