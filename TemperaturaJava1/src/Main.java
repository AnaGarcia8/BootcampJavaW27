//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declaración e inicializacion de los datos
        String[] ciudades = {"Londres", "Madrid", "New York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santigo de chile", "Lisboa", "Tokio"};
        int[][] temperaturas = new int[2][10];
        temperaturas[0][0] = -2;
        temperaturas[0][1] = -3;
        temperaturas[0][2] = -8;
        temperaturas[0][3] = 4;
        temperaturas[0][4] = 6;
        temperaturas[0][5] = 5;
        temperaturas[0][6] = 0;
        temperaturas[0][7] = -7;
        temperaturas[0][8] = -1;
        temperaturas[0][9] = -10;
        temperaturas[1][0] = 33;
        temperaturas[1][1] = 32;
        temperaturas[1][2] = 27;
        temperaturas[1][3] = 37;
        temperaturas[1][4] = 42;
        temperaturas[1][5] = 43;
        temperaturas[1][6] = 39;
        temperaturas[1][7] = 26;
        temperaturas[1][8] = 31;
        temperaturas[1][9] = 35;
        //Declaracion de variables de control
        int max = 0 , min = 0, posMin =0, posMax=0;
        for (int i = 0; i < 10; i++) {
            //comprobacion menor
            if (temperaturas[0][i] < min){
                min = temperaturas[0][i];
                posMin = i;
            }
            //comprobacion mayor
            if (temperaturas[1][i] > max){
                max = temperaturas[1][i];
                posMax = i;
            }
        }
        System.out.println("La ciudad con la menor temperatura es: " + ciudades[posMin]);
        System.out.println("La ciudad con la mayor temperatura es: " + ciudades[posMax]);

    }
}