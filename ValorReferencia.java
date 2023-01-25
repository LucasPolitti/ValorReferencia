public class ValorReferencia {

    public static void main(String[] args) {
        

        int[] notas={65,10,78,81,96,98,100,88,91,100};
        int[] resultado={0,0};

        // int ap,rp;
        // ap=rp=0;

        conferirNotas(notas, resultado);

        System.out.printf("Aprovados.:%d%n", resultado[0]);
        System.out.printf("Reprovados:%d%n", resultado[1]);


    }

    public static void conferirNotas(int[] nt, int[] r){ //passagem por referência, aparecem os valores no main
                                                         
        for(int n:nt){
            if(n>60){
                r[0]++;
            }else{
                r[1]++;
            }
        }
        /*public static void conferirNotas(int[] nt, int a, int r){ //passagem por valores, não aparecem os valores
                                                                      quando chamamos no main
        for(int n:nt){       
            if(n>60){
                a++;
            }else{
                r++;
            }
        } */
        //System.out.printf("Aprovados.:%d%n", a);
        //System.out.printf("Reprovados:%d%n", r);




    }
}