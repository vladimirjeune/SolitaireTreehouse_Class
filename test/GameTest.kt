import org.junit.Test

/**
 * Created by vladimirjeune on 6/4/17.
 */
class GameTest {
    @Test
    fun kingInFirstFoundationPile() {
        // arrange
        var numGames = 0
        var maxGames = 10000

        // act
        for (i in 1..maxGames) {
            numGames++
            GameModel.resetGames()
            for (j in 1..100) {
                GamePresenter.onDeckTap()
                GamePresenter.onWasteTap()
                GameModel.tableauPiles.forEachIndexed { index, tableauPile ->
                    GamePresenter.onTableauTap(index, tableauPile.cards.lastIndex)
                }
            }
            if (GameModel.foundationPiles[0].cards.size == 13) {  // If it is 13 there must be a K
                break  // So break
            }
        }

        // assert
        GameModel.debugPrint()
        println("# Games: $numGames")
        assert(numGames < maxGames)  // In < 1000 will get a K in foundationPile
    }
}