package ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class ContarPalabrasMap {

	public static void main(String args[]) {
		
		String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in consequat quam. Proin iaculis tortor nibh, porta dapibus metus tempus nec. Praesent nec nunc interdum, posuere mauris et, ornare diam. Donec ultrices dictum metus. Vivamus vitae faucibus mauris. Morbi sed magna ultricies, accumsan felis at, commodo lectus. Phasellus rhoncus sapien nibh, vel maximus ante vehicula at. Suspendisse fringilla egestas elit. Integer fringilla aliquam quam, vel ultricies massa rhoncus et. Ut feugiat leo ac felis vestibulum aliquet euismod eu diam. Vivamus tincidunt non urna id elementum. Integer arcu neque, elementum nec malesuada nec, rhoncus vel enim. Sed at interdum lorem."  
				+ "Quisque justo tellus, auctor quis nunc at, euismod ornare enim. Nam nec sapien sem. Aenean dignissim est a euismod pharetra. Maecenas commodo diam vel dui rutrum, semper blandit nisl tristique. Duis a viverra felis. Duis egestas orci a ipsum imperdiet interdum. Cras lobortis varius velit, quis sagittis felis porta ut. Etiam tincidunt pharetra purus et dignissim. Praesent non pulvinar neque. Mauris nec tortor feugiat, consequat urna ut, pellentesque arcu. Curabitur vel auctor eros, eu accumsan tellus. Phasellus iaculis risus ut mauris imperdiet interdum. Suspendisse potenti."
				+ "Nam mi mi, rutrum sed turpis vel, viverra congue nibh. Donec tincidunt vel quam mollis condimentum. Mauris sodales arcu dapibus posuere vestibulum. Duis pellentesque leo purus. Aenean in finibus urna. Nulla quis vestibulum enim, sed tempor magna. Nulla dictum eget leo vel iaculis. Nam ullamcorper molestie nunc, ac feugiat tortor efficitur at. Donec ullamcorper eros turpis, non condimentum dolor finibus tincidunt. Mauris nunc sapien, suscipit id venenatis a, vestibulum at dolor."
				+ "Nulla quis vehicula nisi, non commodo justo. Etiam ultricies enim id lacus blandit interdum. Sed efficitur consectetur magna in varius. Vivamus auctor risus a magna ornare, sit amet egestas ex venenatis. Duis a fringilla elit. Quisque vitae rhoncus lorem. Integer elementum est a leo posuere dictum quis non orci. Etiam tristique velit cursus elementum facilisis. Aliquam mollis, ipsum ut tempus euismod, libero nunc semper nibh, nec maximus elit urna at nunc. Aliquam elementum arcu lectus, iaculis commodo odio semper a." 
				+ "Morbi finibus fermentum elit. Phasellus sed dapibus arcu, quis pulvinar ipsum. In hendrerit dolor vitae ultricies egestas. Nulla facilisi. Morbi ultricies malesuada ultrices. Aenean hendrerit, mauris ac egestas tincidunt, est lectus sollicitudin metus, tristique scelerisque lectus purus a ex. Proin turpis eros, placerat id urna et, posuere tempus diam. Sed ac orci aliquam, pellentesque risus a, tincidunt felis.";
		
		String textoFinal = texto.toUpperCase();
		textoFinal = textoFinal.replace(",", "");
		textoFinal = textoFinal.replace(".", "");
		
		Map<String, Integer> cantPalabras = new HashMap<>();
		
		int pos1 = textoFinal.indexOf(" ");
		int pos2 = 0;
		String subCadena = "";
		
		int contadorPalabra = 1;
		
		cantPalabras.put(textoFinal.substring(pos2, pos1), contadorPalabra);
		
		while(textoFinal.indexOf(" ", pos1 + 1) > 0) {
			
			pos2 = textoFinal.indexOf(" ", pos1 + 1);
			
			subCadena = textoFinal.substring(pos1 + 1, pos2);
			
			boolean equality = cantPalabras.containsKey(subCadena);
			
			if(equality) {
				int value = cantPalabras.get(subCadena);
				value++;
				cantPalabras.put(subCadena, value);
			}else {
				cantPalabras.put(subCadena, contadorPalabra);
			}
			
			pos1 = pos2;
			
		}
	
		subCadena = textoFinal.substring(pos1 + 1);

		boolean equality = cantPalabras.containsKey(subCadena);
		
		if(equality) {
			
			
			cantPalabras.put(subCadena, (cantPalabras.get(subCadena).intValue())+1);
		}else {
			cantPalabras.put(subCadena, contadorPalabra);
		}
		
		System.out.println(": > " + cantPalabras.toString());
		
	}
}
