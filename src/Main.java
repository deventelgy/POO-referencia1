public class Main {
    public static void main(String[] args)
    {
        //Definimos un array con 10 posiciones
        int array1[]=new int [10];
        array1[0]=3;

        //El array no esta creado, con null indicamos que no apunta a nada.
        int array2[]=null;

        //copiamos la referencia, array1 y array2 apuntan al mismo array
        array2=array1;

        //Comparamos referencias
        if (array1==array2){
            System.out.println("Los arrays apuntan a la misma dirección");
        }

        //Creamos una nueva referencia, array apunta a un array diferente no al que hemos creado al principio
        array1=new int[20];

        //Comparamos referencias
        if(array1!=array2){
            System.out.println("Los arrays apuntan a distintas direcciones");
        }
    }
}