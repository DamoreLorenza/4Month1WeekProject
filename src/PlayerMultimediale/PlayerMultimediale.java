package PlayerMultimediale;

abstract class PlayerMultimediale {
    protected String titolo;
    public PlayerMultimediale(String titolo) {

        this.titolo = titolo;
        }
        public abstract void show();
    public abstract void riproduci();

}
