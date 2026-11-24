public class Jornada {
	public static void main(String[] args) {
		int minutosTrabajados = 485;
		int ticketsAtendidos = 7;
		int dias = 2;

		System.out.println("Minutos Trabajados = " + minutosTrabajados);
		System.out.println("Tickets Atendidos = " + ticketsAtendidos);
		System.out.println("Dias Trabajados = " + dias);
		
		System.out.println("Numero de horas trabajadas = " + ((minutosTrabajados / 60) + " Horas " + (minutosTrabajados % 60) + " Minutos"));
		System.out.println("Promedio de Tickets por dia = " + ((double)ticketsAtendidos  / dias));
	}
}
