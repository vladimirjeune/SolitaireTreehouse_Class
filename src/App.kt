/**
 * Created by vladimirjeune on 5/28/17.
 */
fun main(args: Array<String>) {
    GameModel.resetGames()
    GamePresenter.onDeckTap()
    GameModel.debugPrint()
}