package com.tcreative.addons

import com.tcreative.addons.soldier.soldierMelee
import com.tcreative.addons.soldier.soldierRange
import com.tcreative.addons.soldier.soldierSpawnRules
import com.tcreative.devtools.tranclate.builder.addon
import com.tcreative.devtools.tranclate.builder.getPackIconResource
import com.tcreative.devtools.tranclate.builder.getWorldResource
import com.tcreative.devtools.tranclate.builder.zipper.zipProject
import com.tcreative.devtools.tranclate.systemaddon.packageing.packageAddon

fun main() {
    addon(
        projectName = "Odyssey Demo",
        projectShort = "od",
        world = getWorldResource("odyssey"),
        version = arrayListOf(1,1,0),
        packIcon = getPackIconResource("pack.png")
    ) {
        soldierRange(this)
        soldierMelee(this)
        soldierSpawnRules()
    }

    //create a usable mcaddon or mcworld file
    zipProject("1.1", getWorldResource("odyssey"))
    //package
    packageAddon(getWorldResource("odyssey"), null)
}