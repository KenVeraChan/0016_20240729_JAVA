package inicioProgramacionGenerica;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombresPersonas[]= {"Rasselin","Vitrea","Emiliam","Verduliz"};
		System.out.println(ExaminaArrays.getElementos(nombresPersonas));
	}

}

class ExaminaArrays
{
	public static <T> String getElementos(T[]elArray)
	{
		return "El array tiene "+elArray.length+" elementos.";
	}
}