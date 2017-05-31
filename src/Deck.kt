/**
 * Created by vladimirjeune on 5/30/17.
 */

// You can define either whole function here, or anon fn, or lambda in Array ctor
val cards: Array<Card> = Array(52, fun (i : Int) : Card {
    val value = i % 13
    val suit = when(i / 13) {
        0 -> "Clubs"
        1 -> "Diamonds"
        2 -> "Hearts"
        else -> "Spades"
    }

    return Card(value, suit)
})