package coleccionesInicio;

public class objetosLibros {

	private String autor;
	private String titulo;
	private int ISBN;
	
	public objetosLibros(String autor, String titulo, int ISBN)
	{
		this.autor=autor;
		this.titulo=titulo;
		this.ISBN=ISBN;
	}
	public void setAutor(String autor)
	{
		this.autor=autor;
	}
	public String getAutor()
	{
		return this.autor;
	}
	public void setTitulo(String titulo)
	{
		this.titulo=titulo;
	}
	public String getTitulo()
	{
		return this.titulo;
	}
	public void setISBN(int ISBN)
	{
		this.ISBN=ISBN;
	}
	public int getISBN()
	{
		return this.ISBN;
	}
	public boolean equals(Object obj)
	{
		objetosLibros otro= (objetosLibros)obj;   //Se hace un casting a obj para que sea de tipo objetosLibros
		if(obj instanceof objetosLibros)   //Comprueba con instanceof, si es una instancia de un objeto definido
		{
		  	if(this.ISBN==otro.ISBN) return true;
		  	else return false;
		}
		else
		{
			return false;
		}
	}
}
