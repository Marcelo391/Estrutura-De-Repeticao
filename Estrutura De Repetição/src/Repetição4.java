import java.util.Scanner;

public class Repeti��o4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int x,y=1,val=0;
		
		do {
			System.out.printf("Digite um n�mero: ",y);
			x=entrada.nextInt();
			y++;
			
		if(x>val) {
			val=0;
			val+=x;}
		}while(y<16);
		System.out.print("Maior valor fornecido: "+val+"");
	}

}