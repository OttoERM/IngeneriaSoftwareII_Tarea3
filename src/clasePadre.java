public abstract class clasePadre {
    public String fig_color;
    private final int fig_lados;

    public clasePadre(String fig_color, int fig_lados){
        this.fig_color = fig_color;
        this.fig_lados = fig_lados;
    }
    public abstract void paTodos();

    public int agarrarfig_lados(){
        return fig_lados;
    }

}
