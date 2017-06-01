/**
 * Created by vladimirjeune on 6/1/17.
 */
class TableauPile(var cards: MutableList<Card>) {

    init {
        cards.last().faceUp = true  // The last card in deck is to be face up
    }

    fun addCard(newCards: MutableList<Card>) :Boolean {
        if (cards.size > 0) {  // Tableau Pile is not empty
            if ((newCards.first().value == cards.last().value - 1)
                    && (suitCheck(newCards.first(), cards.last()))) {
                cards.addAll(newCards)
                return true
            }
        } else if (newCards.first().value == 12) {  // Tableau Pile is mt, and the 1st new card is KING
            cards.addAll(newCards)
            return true
        }
        return false
    }

    /**
     * Will check to see if params are different suit colors
     *
     */
    private fun  suitCheck(c1: Card, c2: Card): Boolean {
        if ((redSuits.contains(c1.suit) && blackSuits.contains(c2.suit))
                || (blackSuits.contains(c1.suit) && redSuits.contains(c2.suit))) {
            return true
        }
        return false
    }
}