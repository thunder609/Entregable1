public class tabladeMultiplicar35 {
    public static void main(String[] args) {
        //generar tabla de multiplicar del 1 -10 en una matriz
        int tabla[][]=new int[11][11];

        for(int i=1;i<11;i++){
            for(int k=1;k<11;k++){
                tabla[i][k]=i*k;
                System.out.println("tabla" +i+ "X"+k+"="+tabla[i][k]);
            }

        }

    }
}
