package inicioProgramacionGenerica;

public class ClasesGenericas<T> {
	private T objeto;
	public ClasesGenericas()
	{
		objeto=null;
	}
	public void setObjeto(T nuevoValor)
	{
		objeto=nuevoValor;
	}
	public T getObjeto()
	{
		return objeto;
	}
}