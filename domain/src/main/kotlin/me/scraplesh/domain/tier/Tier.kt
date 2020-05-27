package me.scraplesh.domain.tier

import me.scraplesh.domain.Hero

enum class Tier { S, A, B, C, D }

val Hero.tier: Tier
  get() = when (this) {
    Hero.Abathur -> Tier.B
    Hero.Alarak -> Tier.B
    Hero.Alexstrasza -> Tier.B
    Hero.Ana -> Tier.A
    Hero.Anduin -> Tier.A
    Hero.Anubarak -> Tier.B
    Hero.Artanis -> Tier.C
    Hero.Arthas -> Tier.B
    Hero.Auriel -> Tier.B
    Hero.Azmodan -> Tier.C
    Hero.Blaze -> Tier.A
    Hero.Brightwing -> Tier.C
    Hero.Cassia -> Tier.B
    Hero.Chen -> Tier.A
    Hero.Cho -> Tier.D
    Hero.Chromie -> Tier.C
    Hero.Deathwing -> Tier.S
    Hero.Deckard -> Tier.B
    Hero.Dehaka -> Tier.A
    Hero.Diablo -> Tier.B
    Hero.DiVa -> Tier.C
    Hero.ETC -> Tier.A
    Hero.Falstad -> Tier.B
    Hero.Fenix -> Tier.A
    Hero.Gall -> Tier.D
    Hero.Garrosh -> Tier.A
    Hero.Gazlowe -> Tier.D
    Hero.Genji -> Tier.B
    Hero.Greymane -> Tier.B
    Hero.Guldan -> Tier.A
    Hero.Hanzo -> Tier.A
    Hero.Illidan -> Tier.C
    Hero.Imperius -> Tier.A
    Hero.Jaina -> Tier.B
    Hero.Johanna -> Tier.A
    Hero.Junkrat -> Tier.B
    Hero.Kaelthas -> Tier.S
    Hero.KelThuzad -> Tier.C
    Hero.Kerrigan -> Tier.B
    Hero.Kharazim -> Tier.C
    Hero.Leoric -> Tier.A
    Hero.LiLi -> Tier.B
    Hero.LiMing -> Tier.B
    Hero.LtMorales -> Tier.C
    Hero.Lucio -> Tier.B
    Hero.Lunara -> Tier.A
    Hero.Maiev -> Tier.B
    Hero.Malfurion -> Tier.A
    Hero.MalGanis -> Tier.B
    Hero.Malthael -> Tier.B
    Hero.Medivh -> Tier.C
    Hero.Mephisto -> Tier.B
    Hero.Muradin -> Tier.A
    Hero.Murky -> Tier.D
    Hero.Nazeebo -> Tier.C
    Hero.Nova -> Tier.C
    Hero.Orphea -> Tier.B
    Hero.Probius -> Tier.D
    Hero.Qhira -> Tier.B
    Hero.Ragnaros -> Tier.B
    Hero.Raynor -> Tier.A
    Hero.Rehgar -> Tier.B
    Hero.Rexxar -> Tier.B
    Hero.Samuro -> Tier.C
    Hero.SgtHammer -> Tier.C
    Hero.Sonya -> Tier.B
    Hero.Stitches -> Tier.B
    Hero.Stukov -> Tier.B
    Hero.Sylvanas -> Tier.B
    Hero.Tassadar -> Tier.A
    Hero.TheButcher -> Tier.D
    Hero.TheLostVikings -> Tier.C
    Hero.Thrall -> Tier.B
    Hero.Tracer -> Tier.C
    Hero.Tychus -> Tier.A
    Hero.Tyrael -> Tier.C
    Hero.Tyrande -> Tier.C
    Hero.Uther -> Tier.B
    Hero.Valeera -> Tier.C
    Hero.Valla -> Tier.C
    Hero.Varian -> Tier.C
    Hero.Whitemane -> Tier.B
    Hero.Xul -> Tier.C
    Hero.Yrel -> Tier.B
    Hero.Zagara -> Tier.C
    Hero.Zarya -> Tier.B
    Hero.Zeratul -> Tier.B
    Hero.Zuljin -> Tier.B
  }
