package com.raywenderlich.android.creaturemon.model

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CreateGeneratorTest {
    private lateinit var creatureGenerator: CreatureGenerator

    @Before
    fun setup(){
        creatureGenerator = CreatureGenerator()
    }

    @Test
    fun testGeneratorHitPoints(){

        val attributes = CreatureAttributes(
                intelligence =7,
                strength = 3,
                endurance = 10
        )

        val name = "Pixachu"
        val expectedCreature = Creature(attributes, 84, name)

        assertEquals(
                expectedCreature, creatureGenerator.generateCreatures(attributes, name)
        )

    }


}