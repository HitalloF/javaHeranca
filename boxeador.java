public class boxeador extends  Pessoa {

    private String marcaLuva = "Adidas";

    public String getMarcaLuva() {
        return marcaLuva;
    }

    public void setMarcaLuva(String marcaLuva) {
        this.marcaLuva = marcaLuva;
    }
    public void socar(){
        System.out.println("[boxeador]: Socou.");
    }
}
