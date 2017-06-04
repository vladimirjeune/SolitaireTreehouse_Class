/**
 * Created by vladimirjeune on 6/4/17.
 */
class GamePresenter {
    // Note we do not have access to model.  So will make GameModel a Singleton, since ONLY 1 game/time.
    fun onDeckTap() {
        GameModel.onDeckTap()
    }
}