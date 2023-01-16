package packed;

class ClassItem {

    public void onLevelPurchase(int PlayerId, int LevelId) {
        //TODO
    }

    public void method(int PlayerId, int itemId, int sum) {
        //TODO
    }

    private class Player {
        int playerId;
        int LevelId;

        public int getPlayerId() {
            return playerId;
        }

        public void setPlayerId(int playerId) {
            this.playerId = playerId;
        }

        public int getLevelId() {
            return LevelId;
        }

        public void setLevelId(int levelId) {
            LevelId = levelId;
        }
    }
}