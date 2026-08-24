package encapsulamento;

public class conversao {
	public static double min_para_seg(double min) {
		return min*60;
	}
	public static double h_para_min(double h) {
		return h*60;
	}
	public static double dia_para_h(double dia) {
		return dia*24;
	}
	public static double sem_para_dia(double sem) {
		return sem*7;
	}
	public static double mes_para_sem(double mes) {
		return mes*30;
	}
	public static double ano_para_mes(double ano) {
		return ano*365.25;
	}
	
	public static void main(String[] args) {
		System.out.println(min_para_seg(100));
	}
	
}
