package estudos;

import java.util.Calendar;

public class Estudos {

	public static void main(String[] args) {
			
	Calendar calendario = Calendar.getInstance();
	int dia = calendario.get(Calendar.MONTH);
	
	
	switch(dia) {
	case 0:{System.out.println("Janeiro");
		break;	}
	case 1:{System.out.println("Fevereiro");
		break;	}
	case 2:{System.out.println("Mar�o");
		break;	}
	case 3:{System.out.println("Abril");
		break;	}
	default: {System.out.println("INVALIDO");}
	
	}
		
		
	}

}



