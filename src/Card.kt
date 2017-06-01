/**
 * Created by vladimirjeune on 5/29/17.
 */
class Card (val value: Int, val suit: String, var faceUp: Boolean = false) {

    companion object {  // In Java these would be static.  There is ONLY 1 per class
        // Properties
        val clubs = "Clubs"
        val diamonds = "Diamonds"
        val hearts = "Hearts"
        val spades = "Spades"
    }
}