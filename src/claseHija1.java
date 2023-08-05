public class claseHija1 extends clasePadre{
    private int x;

    public claseHija1(String fig_color, int fig_lados, int dato){
        super(fig_color, fig_lados);
        this.x = dato;
    }

    public void tomaPaTiX(int x){
        this.x = x;
    }

    public int sacarX(){
        return x;
    }

    public int x_aerea(){
        return x * x;
    }

    public void paTodos(){
        System.out.println(x_aerea() + "-" + super.fig_color + "-" + super.agarrarfig_lados());
    }

}
