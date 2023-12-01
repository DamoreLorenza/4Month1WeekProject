package PlayerMultimediale;

abstract class AudioPlayer extends PlayerMultimediale {
        protected int durata;
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
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print("!");
        }
        System.out.println(titolo);
    }

}
