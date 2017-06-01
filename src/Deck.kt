import java.util.*

/**
 * Created by vladimirjeune on 5/30/17.
 */
class Deck {
    // You can define either whole function here, or anon fn, or lambda in Array ctor
    val cards: Array<Card> = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCards(): Card = cardsInDeck.removeAt(0)

    /**
     * Obtains a full deck of cards and shuffles them
     */
    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }

    /**
     * Takes in an Int and returns the appropriate suit for our deck of cards
     * @property i Int between 0 and 52
     */
    fun getSuit(i: Int): String = when (i / 13) {  // Function was just one expr so just used '='. Now Anon
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }
}