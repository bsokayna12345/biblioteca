package clases;

import java.util.Collections;
import java.util.Comparator;

public  class Libro implements Comparable<Libro>,Comparator<Libro> {
	
	
	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;
	
	public Libro() {
		
	}

	/**
	 * @param titulo
	 * @param isbn
	 * @param genero
	 * @param autor
	 * @param paginas
	 */
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	@Override
	public boolean equals(Object obj) {
    	 boolean ig= false;
        if (this == obj)
            ig =true;
        
        else {
        Libro a= (Libro)obj;
        
        if(this.isbn.equalsIgnoreCase(a.isbn))
        		
        	ig= true;
        }
        
        return ig;
    
    }

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the paginas
	 */
	public Integer getPaginas() {
		return paginas;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return  titulo + "," + isbn + "," + genero + "," + autor + ","
				+ paginas+ "\n";
		
	}


	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(o.titulo);
		
	}
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getPaginas().compareTo(o2.getPaginas());
	}

	
	

	

}
