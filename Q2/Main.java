import java.util.*;
public class Main{
	public static void main(String[] args){
		String valor = "Eu tenho um carro vermelho e eu tenho um barco azul";
		String[] splited = valor.split(" ");
		Arrays.sort(splited);
		for(String s : splited){
			System.out.println(s);
		}
	}
}
