public class MetodosOrdenamiento {
    public int[] seleccion(int[] arreglo,boolean asen) {
        int tamano = arreglo.length;
        for (int i = 0; i < tamano - 1; i++) {
            int indice = i;
            if(asen==true){
            for (int j = i + 1; j < tamano; j++) {
                if (arreglo[j] < arreglo[indice]) {  
                    indice = j;
                }
            }
        }
        else{
        for (int j = i + 1; j < tamano; j++) {
            if (arreglo[j] > arreglo[indice]) {  
                indice = j;
            }
        }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
    }
        
        return arreglo;
}

    // Method to print the array
    public void printarreglo(int[] arreglos) {
        for (int elem : arreglos) {
            System.out.print(" "+elem);
        }
    }
}
