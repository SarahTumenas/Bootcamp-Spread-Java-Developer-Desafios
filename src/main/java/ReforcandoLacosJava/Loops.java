package ReforcandoLacosJava;

public class Loops {

    public static void main(String[] args) {

        int [] idades = new int[10];
        idades[0]= 27;
        idades[1]=31;
        System.out.println("Idade 0: " + idades [0]);
        System.out.println("Idade 1: " + idades [1]);
        System.out.println("Idade 2: " + idades [2]);


        int [] i = {10,25};
        System.out.println("i 0: " + i[0]);
        System.out.println("i 1: " + i[1]);

        idades = new int[] {12,35,45,22,9,37,51,61};

        for(int idade: idades){
            System.out.println("Idades: " + idade);
        }

        for(int a = 0; a < idades.length; a++){

            int idade = idades[a];
            System.out.println("idade: " + idade);
        }

        for(int idade : idades){
            if (idade >  18){

                System.out.println("Idade: " + idade + " maior que 18 anos");
            }
        }

        for ( int a = 0; a < idades.length; a++){
            int idade = idades[a];
            if (idade > 18){

                System.out.println("Idade: " + idade + " maior que 18 anos");

            }
        }

        long [][] M = new long [3][3];

        char[][] jogo = new char[2][2];
        jogo[0][0] = 'X';
        jogo[1][1] = 'O';
        System.out.println("Posição 0:" + jogo[0][0]);
        System.out.println("Posição 1:" + jogo[1][1]);

        int [][] ages = new int[][] {{12,35}, {45,25}};

        for (int [] id1: ages){
            for ( int id2: id1){
                System.out.println(id2);
            }
        }

        for (int c = 0 ; c < ages.length; c++){
            int [] id = ages[c];
            for (int d = 0; d < id.length; d++){
                System.out.println(ages[c][d]);
            }
        }

        byte [] bytes = new byte[2];
        bytes [1] = 100;

        float [] floats = new float[2];
        floats [1] = 10.98f;

        for (byte byte_ : bytes){
            System.out.println("Byte: " + byte_);
        }

        for (float float_ : floats){
            System.out.println("Float: " + float_);
        }





    }
}
