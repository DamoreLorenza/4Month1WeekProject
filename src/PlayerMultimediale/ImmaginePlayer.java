package PlayerMultimediale;

class ImmaginePlayer extends PlayerMultimediale{
        int luminosita;
        public ImmaginePlayer(String titolo, int luminosita) {
            super(titolo);
            this.luminosita = luminosita;
        }
        public void show() {
            System.out.println(titolo + " " + "*".repeat(luminosita));
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
    public void riproduci() {}

}
