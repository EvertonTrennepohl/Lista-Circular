package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular<String> listaCircular = new ListaCircular<String>();
		
		listaCircular.add("00");
		System.out.println(listaCircular);
		
		listaCircular.remove(0);
		System.out.println(listaCircular);
		
		listaCircular.add("01");
		listaCircular.add("02");
		listaCircular.add("03");
		listaCircular.add("04");
		System.out.println(listaCircular);
		System.out.println(listaCircular.size());
	}

}
