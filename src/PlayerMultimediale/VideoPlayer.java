package PlayerMultimediale;

public abstract class VideoPlayer extends PlayerMultimediale {
    int luminosita;
    protected int durata;
    int volume;

    public VideoPlayer(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getDurata() {
        return durata;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    @Override
    public void riproduci() {
    }

    @Override
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita) + " " + "!".repeat(volume));
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "*".repeat(luminosita) + " " + "!".repeat(volume));
        }
    }
}
