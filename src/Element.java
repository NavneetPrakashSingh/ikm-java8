public enum Element {
    helium("He","Gas");
//    magnesium("Mg","Solid");
    private String chemicalSymbol;
    private String nature;
    Element(String he, String gas) {
        this.chemicalSymbol = he;
        this.nature = gas;
    }

    public String chemicalSymbol(){return this.chemicalSymbol;}
    public String nature(){return this.nature;}
}
