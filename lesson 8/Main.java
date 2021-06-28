public class Main {
    public static void main(String[] args) {
        Tir tir = new Tir();
        tir.setTipMarfa("gaz inflamabil");
        tir.setMarca("Volvo");
        tir.setNumeSofer("Marin");

        boolean statistica = checkTirProperties(tir.getTipMarfa());
        if (statistica){
            System.out.println("Nume sofer: " + tir.getNumeSofer()+", " + "Marca:"+tir.getMarca()+","+ " tip marfa: "+tir.getTipMarfa());

        } else {
            System.out.println("Nici un tir nu a fost gasit");
        }
    }

    public static boolean checkTirProperties(String tipMarfa) {
        if (tipMarfa.equals("gaz inflamabil")) {
            return true;
        } else return false;

    }

}
