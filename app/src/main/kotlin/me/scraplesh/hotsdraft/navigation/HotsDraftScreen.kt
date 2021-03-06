package me.scraplesh.hotsdraft.navigation

import androidx.fragment.app.Fragment
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.InternalCoroutinesApi
import me.scraplesh.hotsdraft.domain.Battleground
import me.scraplesh.hotsdraft.domain.draft.Team
import me.scraplesh.hotsdraft.features.draft.DraftFragment
import me.scraplesh.hotsdraft.features.heroes.HeroesFragment
import me.scraplesh.hotsdraft.features.lot.LotFragment
import me.scraplesh.hotsdraft.features.selectbattleground.SelectBattlegroundFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

sealed class HotsDraftScreen : SupportAppScreen() {
  object SelectBattleground : HotsDraftScreen() {
    override fun getFragment(): Fragment? = SelectBattlegroundFragment()
  }

  class Lot(private val battleground: Battleground) : HotsDraftScreen() {
    override fun getFragment(): Fragment? = LotFragment.newInstance(battleground)
  }

  @FlowPreview
  @ExperimentalCoroutinesApi
  @InternalCoroutinesApi
  class Draft(private val battleground: Battleground, private val team: Team) : HotsDraftScreen() {
      override fun getFragment(): Fragment? = DraftFragment.newInstance(battleground, team)
  }

  @FlowPreview
  @ExperimentalCoroutinesApi
  @InternalCoroutinesApi
  object Heroes : HotsDraftScreen() {
      override fun getFragment(): Fragment? = HeroesFragment()
  }
}
