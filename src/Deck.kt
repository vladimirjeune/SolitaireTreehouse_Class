/**
 * Created by vladimirjeune on 5/30/17.
 */

// You can define either whole function here, or anon fn, or lambda in Array ctor
val cards: Array<Card> = Array(52,
         { i->
             Card(i % 13, getSuit(i))
        }  // RM'd fun decl and return, then added back param by saying i-> inside {}
)

fun getSuit(i: Int): String = when(i / 13) {  // Function was just one expr so just used '='. Now Anon
        0 -> "Clubs"
        1 -> "Diamonds"
        2 -> "Hearts"
        else -> "Spades"
    }
