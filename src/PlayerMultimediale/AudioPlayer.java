package PlayerMultimediale;

abstract class AudioPlayer extends PlayerMultimediale {
        private int durata;
        int volume;
        public AudioPlayer(String titolo, int durata, int volume) {
            super(titolo);
            this.durata = durata;
            this.volume = volume;
        }
        public int getDurata() {
            return durata;
        }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }


}
