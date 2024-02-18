package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    public List<Integer> getCopiaEnteros( )
    {	
    	List<Integer> copiaListaEnteros; 
    	copiaListaEnteros = this.listaEnteros;
        return copiaListaEnteros;
    }

    /**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */
    public List<String> getCopiaCadenas( )
    {
    	List<String> copiaListaCadenas; 
    	copiaListaCadenas = this.listaCadenas;
        return copiaListaCadenas;
    }

    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaño que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */
    public int[] getEnterosComoArreglo( )
    {
    	int size = this.listaEnteros.size();
    	int[] enterosArray;
    	enterosArray = new int[size];
    	for (int posicion = 0; posicion < size; posicion++)
    	{
    		int elemento = this.listaEnteros.get(posicion);
    		enterosArray[posicion] = elemento;
    	}
    	
    	return enterosArray;
    }

    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.listaEnteros.size();
    }

    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return this.listaCadenas.size();
    }

    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este método siempre debería aumentar en 1 el tamaño de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	this.listaEnteros.addLast(entero);
    }

    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este método siempre debería aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	this.listaCadenas.addLast(cadena);
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	List<Integer> lista;
    	lista = new ArrayList<Integer>();
    	lista.add(valor);
    	this.listaEnteros.removeAll(lista);
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	List<String> lista;
    	lista = new LinkedList<String>();
    	lista.add(cadena);
    	this.listaCadenas.removeAll(lista);
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en la lista aumentada. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño de la lista, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int size = this.listaEnteros.size();
    	if (posicion < 0) 
    	{
    		this.listaEnteros.addFirst(entero);;
    	}
    	else if(posicion > size) 
    	{
    		this.listaEnteros.addLast(entero);
    	}
    	else 
    	{
    		this.listaEnteros.add(posicion, entero);
    	}
    }

    /**
     * Elimina un valor de la lista de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición de la lista de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (!(posicion < 0 || posicion >= this.listaEnteros.size()))
    	{
    		this.listaEnteros.remove(posicion);
    	}
    }

    /**
     * Reinicia la lista de enteros con los valores contenidos en el parámetro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	this.listaEnteros.clear();
    	int tamaño = valores.length;
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		double valor = valores[posicion];
    		int añadir = Integer.parseInt(Double.toString(valor));
    		this.listaEnteros.addLast(añadir);
    	}
    	
    }

    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarArregloCadenas( List<Object> objetos )
    {
    	this.listaCadenas.clear();
    	int tamaño = objetos.size();
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		Object objeto = objetos.get(posicion);
    		String añadir = objeto.toString();
    		this.listaCadenas.addLast(añadir);	
    	}
    }

    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int tamaño = this.listaEnteros.size();
    	for (int posicion = 0; posicion < tamaño; posicion++)
    	{
    		int elemento = this.listaEnteros.get(posicion);
    		if (elemento < 0)
    		{
    			elemento *= -1;
    			this.listaEnteros.set(posicion, elemento);
    		}
    	}
    }

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {
    	Collections.sort(this.listaEnteros);
    }

    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Collections.sort(this.listaCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int contador = 0;
    	int size = this.listaEnteros.size();
    	for (int posicion = 0; posicion < size; posicion++)
    	{
    		if (this.listaEnteros.get(posicion) == valor)
    		{
    			contador++;
    		}
    	}
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en la lista de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int contador = 0;
    	int size = this.listaCadenas.size();
    	for (int posicion = 0; posicion < size; posicion++)
    	{
    		if (cadena.equalsIgnoreCase(this.listaCadenas.get(posicion)))
    		{
    			contador++;
    		}
    	}
        return contador;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int conteo  = 0;
    	int tamaño = this.listaEnteros.size();
    	for (int p = 0; p < tamaño; p++) 
    	{
    		int comparar = this.listaEnteros.get(p);
    		if (this.listaEnteros.contains(comparar)) 
    		{
    			conteo++;
    		}
    	}
        return conteo;
    }

    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	int tamaño1 = this.listaEnteros.size();
    	int tamaño2 = otroArreglo.length;
    	if (tamaño1 != tamaño2) 
    	{
    		return false;
    	}
    	else 
    	{
    		for (int p = 0; p < tamaño1; p++) 
    		{
    			if (this.listaEnteros.get(p) != otroArreglo[p]) 
    			{
    				return false;
    			}
    		}
    		return true;
    	} 
        
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	double min = minimo;
    	double max = maximo;
    	this.listaEnteros.clear();
    	for(int contador = 0; contador == cantidad; contador++)
    	{
    		double numero = min + (Math.random() * ((max - min+1) + min));
    		int añadir = Integer.parseInt(Double.toString(numero));
    		this.listaEnteros.add(añadir);
    	}
    }

}
