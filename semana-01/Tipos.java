public class Tipos {
	public static void main (String[] args) {
		int equipos = 120;
		long bytesDisco = 512_000_000_000L;
		double precio = 1899.99;
		char letra = 'A';
		String sede = "Calle 100";
		boolean enGarantia = true;

		System.out.println("Equipos: " + equipos);
		System.out.println("Discos en bytes: " + bytesDisco);
		System.out.println("Precio: " + precio);
		System.out.println("Letra: " + letra + ", Sede: " + sede);
		System.out.println("En Garantia: " + enGarantia);

		System.out.println("7 / 2 = " + (7 / 2));
		System.out.println("7 / 2.0 = " + (7 / 2.0));
		System.out.println("7 % 2 = " + (7 % 2)); 
		System.out.println("(int) 3.9 = " + (int) 3.9);
		System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
		System.out.println("1 + 2 + \"3\" = " + (1 + 2 + "3"));
		System.out.println("\"1\" + 2 + 3 = " + ("1" + 2 + 3));
	}
}
