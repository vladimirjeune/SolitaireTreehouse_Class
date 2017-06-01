import org.junit.Test

import org.junit.Assert.*

/**
 * Created by vladimirjeune on 6/1/17.
 */
class TableauPileTest {
    @Test
    fun addCards() {
        // arrange: objects you need
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))  // Only has King of Spades
        val cards = mutableListOf(Card(11, hearts))


        // act: on those objects
        tableauPile.addCards(cards)

        // assert: you got what you expected
        assertEquals(2, tableauPile.cards.size)  // Since the order matches the rules we should have 2 cards.
    }

    @Test
    fun removeCards() {
    }

}