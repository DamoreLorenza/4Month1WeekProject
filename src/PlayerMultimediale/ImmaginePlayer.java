package PlayerMultimediale;

class ImmaginePlayer extends PlayerMultimediale{
        int luminosita;
        public ImmaginePlayer(String titolo, int luminosita) {
            super(titolo);
            this.luminosita = luminosita;
        }
        public void show() {
            System.out.println(titolo);
        }

    public void setLuminosita(int luminosita) {
            this.luminosita = luminosita;
        }
    @Override
    public void riproduci() {}

}
