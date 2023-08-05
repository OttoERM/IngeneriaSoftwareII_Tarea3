public class claseHija2 extends clasePadre{
    private int d;
    private boolean conRadiador;
    public claseHija2(String fig_color, int fig_lados, int dato, boolean conRadiador){
        super(fig_color, fig_lados);
        this.d = dato;
        this.conRadiador = conRadiador;
    }

    public void dia_variableDeArriba(int d){
        this.d = d;
    }

    public void paTodos(){
        if (conRadiador)
            System.out.println(d + "-" + ((double)d)/2 + "-" + super.fig_color + "-" + super.agarrarfig_lados());
        else
            System.out.println(d + "-" + super.fig_color + "-" + super.agarrarfig_lados());
    }
}
