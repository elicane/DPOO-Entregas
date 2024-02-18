package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;


/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copiaArregloEnteros;
    	copiaArregloEnteros = this.arregloEnteros;
        return copiaArregloEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] copiaArregloCadenas;
    	copiaArregloCadenas = this.arregloCadenas;
        return copiaArregloCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int tamaño = (this.arregloEnteros.length);
    	int[] nuevaL;
    	nuevaL = new int[tamaño+1];
    	for (int posicion = 0; posicion < tamaño+1; posicion++)
    	{
    		if (posicion < tamaño)
    		{
    			nuevaL[posicion] = this.arregloEnteros[posicion];
    		}
    		else 
    		{
    			nuevaL[posicion] = entero;
    		}
    	}
    	this.arregloEnteros = nuevaL;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int tamaño = (this.arregloCadenas.length);
    	String[] nuevaL;
    	nuevaL = new String[tamaño+1];
    	for (int posicion = 0; posicion < tamaño+1; posicion++)
    	{
    		if (posicion < tamaño)
    		{
    			nuevaL[posicion] = this.arregloCadenas[posicion];
    		}
    		else 
    		{
    			nuevaL[posicion] = cadena;
    		}
    	}
    	this.arregloCadenas = nuevaL;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int tamaño = (this.arregloEnteros.length);
    	int[] nuevaL;
    	nuevaL = new int[tamaño];
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		int elemento = this.arregloEnteros[posicion];
    		if (elemento != valor)
    		{
    			nuevaL[posicion] = elemento;
    		}
    	}
    	this.arregloEnteros = nuevaL;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int tamaño = (this.arregloCadenas.length);
    	String[] nuevaL;
    	nuevaL = new String[tamaño];
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		String elemento = this.arregloCadenas[posicion];
    		if (elemento != cadena)
    		{
    			nuevaL[posicion] = elemento;
    		}
    	}
    	this.arregloCadenas = nuevaL;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int tamaño = (this.arregloEnteros.length);
    	if (posicion < 0) 
    	{
    		int[] nuevaL;
        	nuevaL = new int[tamaño+1];
        	for (int lugar = 0; lugar < tamaño+1; lugar++)
        	{
        		if (lugar == 0)
        		{
        			nuevaL[lugar] = entero;
        		}
        		else 
        		{
        			nuevaL[lugar] = this.arregloEnteros[lugar-1];
        		}
        	}
        	this.arregloEnteros = nuevaL;
    	}
    	else if (posicion > (tamaño-1)) 
    	{
    		int[] nuevaL;
        	nuevaL = new int[tamaño+1];
        	for (int lugar = 0; lugar < tamaño+1; lugar++)
        	{
        		if (lugar == tamaño)
        		{
        			nuevaL[lugar] = entero;
        		}
        		else 
        		{
        			nuevaL[lugar] = this.arregloEnteros[lugar];
        		}
        	}
        	this.arregloEnteros = nuevaL;
    	}
    	else 
    	{
        	int[] nuevaL;
        	nuevaL = new int[tamaño+1];
        	for (int lugar = 0; lugar < tamaño+1; lugar++)
        	{
        		if (lugar < posicion)
        		{
        			nuevaL[lugar] = this.arregloEnteros[lugar];
        		}
        		else if (lugar == posicion)
        		{
        			nuevaL[lugar] = entero;
        		}
        		else 
        		{
        			nuevaL[lugar] = this.arregloEnteros[lugar-1];
        		}
        	}
        	this.arregloEnteros = nuevaL;
    	}
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int tamaño = this.arregloEnteros.length;
    	if (!(posicion < 0 || posicion >= tamaño)) 
    	{
    		this.arregloEnteros[posicion] = 0;
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int tamaño = (valores.length);
    	int[] nuevaL;
    	nuevaL = new int[tamaño];
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		int añadir = (int)valores[posicion];
    		nuevaL[posicion] = añadir;
    	}
    	this.arregloEnteros = nuevaL;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int tamaño = (objetos.length);
    	String[] nuevaL;
    	nuevaL = new String[tamaño];
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		String añadir = String.valueOf(objetos[posicion]);
    		nuevaL[posicion] = añadir;
    	}
    	this.arregloCadenas = nuevaL;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int tamaño = this.arregloEnteros.length;
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		if (this.arregloEnteros[posicion] < 0) 
    		{
    			this.arregloEnteros[posicion] *= -1;
    		}
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(this.arregloEnteros);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(this.arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int tamaño = this.arregloEnteros.length;
    	int conteo = 0;
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		if (this.arregloEnteros[posicion] == valor) 
    		{
    			conteo++;
    		}
    	}
        return conteo;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int tamaño = this.arregloCadenas.length;
    	int conteo = 0;
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		if (this.arregloCadenas[posicion] == cadena) 
    		{
    			conteo++;
    		}
    	}
        return conteo;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int tamaño = this.arregloEnteros.length;
    	int[] posiciones;
    	posiciones = new int[] {};
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		if (this.arregloEnteros[posicion] == valor) 
    		{
    			int size = posiciones.length;
    	    	int[] nuevaL;
    	    	nuevaL = new int[size+1];
    	    	for (int a = 0; a < size+1; a++)
    	    	{
    	    		if (a < size)
    	    		{
    	    			nuevaL[a] = posiciones[a];
    	    		}
    	    		else 
    	    		{
    	    			nuevaL[a] = posicion;
    	    		}
    	    	}
    	    	posiciones = nuevaL;
    		}
    	}
        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int[] minMax;
    	if (this.arregloEnteros.length==0)
    	{
    		minMax = new int[] {};
    	}
    	else 
    	{
    		minMax = new int[2];
    		int mayor = this.arregloEnteros[0];
    		int menor = this.arregloEnteros[0];
    		for (int i = 1; i < this.arregloEnteros.length; i++) 
            {
    			if (this.arregloEnteros[i] > mayor) 
                {
    				mayor = this.arregloEnteros[i];
                }
    			if (this.arregloEnteros[i] < menor) 
                {
    				menor = this.arregloEnteros[i];
                }
            }
    		minMax[0] = menor;
    		minMax[1] = mayor;
    	}
        return minMax;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        return null;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int tamaño = this.arregloEnteros.length;
    	int conteo = 0;
    	for (int p = 0; p < tamaño; p++) 
    	{
    		int comparar = this.arregloEnteros[p];
    		for (int r = p+1; r < tamaño; r++) 
    		{
    			if (this.arregloEnteros[r]==comparar) 
    			{
    				conteo++;
    			}
    		}
    	}
        return conteo;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	int tamaño1 = this.arregloEnteros.length;
    	int tamaño2 = otroArreglo.length;
    	if (tamaño1 != tamaño2) 
    	{
    		return false;
    	}
    	else 
    	{
    		for (int posicion = 0; posicion < tamaño1; posicion++) 
    		{
    			if (this.arregloEnteros[posicion] != otroArreglo[posicion]) 
    			{
    				return false;
    			}
    		}
    		return true;
    	}
        
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	int tamaño1 = this.arregloEnteros.length;
    	int tamaño2 = otroArreglo.length;
    	if (tamaño1 != tamaño2) 
    	{
    		return false;
    	}
    	else 
    	{	
    		for (int p1 = 0; p1 < tamaño1; p1++) 
    		{
    			boolean sentinela = false;
    			int comparar = this.arregloEnteros[p1];
    			for (int p2 = 0; p2 < tamaño1; p2++) 
    			{
    				if (p1 != p2)
    				{
    					
    					if (otroArreglo[p2] == comparar) 
    					{
    						sentinela = true;
    					}
    				}
    			}
    			if (sentinela == false) 
    			{
    				return false;
    			}
    		}
    		return true;
    	}
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] nuevoA;
    	nuevoA = new int[cantidad];
    	for (int posicion = 0; posicion < cantidad; posicion++) 
    	{
    		int añadir = (int)Math.random()*(maximo-minimo+1)+minimo;
    		nuevoA[posicion] = añadir;
    	}
    	this.arregloEnteros = nuevoA;
    }

}
