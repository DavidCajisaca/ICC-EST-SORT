public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de seleccion");
        MetodosOrdenamiento m=new MetodosOrdenamiento();
        int [] arreglosd={9, 5, 30, 10, 24};
        int[] arregloorde=m.seleccion(arreglosd);
        m.printarreglo(arregloorde);
        System.out.println(" ");
    }
}
