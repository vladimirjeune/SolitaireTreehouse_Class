/**
 * Created by vladimirjeune on 6/4/17.
 */
class GamePresenter {
    // Cannot set to null in Kotlin.  You need to add a ? after datatype.  GameView? = null, OK
    // We have to wait for Activity.onCreate b4 we can make view, so mk proprty
    var view: GameView? = null  // Once view created we'll call a function in GamePresenter for proper population of view

    // Function for eventual View population
    fun setGameView(gameView: GameView) {
        view = gameView
    }

    // Note we do not have access to model.  So will make GameModel a Singleton, since ONLY 1 game/time.
    fun onDeckTap() {
        GameModel.onDeckTap()
        view?.update()  // Kotlin needs to remind you about view could be null.  Add ?. to nullable var
    }

    fun onWasteTap() {
        GameModel.onWasteTap()
        view?.update()
    }

    fun onFoundationTap(foundationIndex: Int) {
        GameModel.onFoundationTap(foundationIndex)
        view?.update()
    }

    fun onTableauTap(tableauIndex: Int, cardIndex: Int) {
        GameModel.onTableauTap(tableauIndex, cardIndex)
        view?.update()
    }


}